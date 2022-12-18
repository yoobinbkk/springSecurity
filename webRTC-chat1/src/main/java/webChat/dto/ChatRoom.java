package webChat.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ChatRoom {
	
	private String roomId;		// 채팅방 아이디
	private String name;		// 채팅방 이름
	private Set <WebSocketSession> sessions = new HashSet<>();
	
	@Builder
	public ChatRoom(String roomId, String name) {
		this.roomId = roomId;
		this.name = name;
	}
	
	public void handleAction(WebSocketSession session, ChatDTO message, ChatService service) {
		// message 에 담긴 타입을 확인한다.
	}
	
}

package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatJoinRequest extends StObject {
  
  var bio: js.UndefOr[String] = js.undefined
  
  var chat: Chat
  
  var date: Double
  
  var from: User
  
  var invite_link: js.UndefOr[ChatInviteLink] = js.undefined
  
  var user_chat_id: Double
}
object ChatJoinRequest {
  
  inline def apply(chat: Chat, date: Double, from: User, user_chat_id: Double): ChatJoinRequest = {
    val __obj = js.Dynamic.literal(chat = chat.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], user_chat_id = user_chat_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatJoinRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatJoinRequest] (val x: Self) extends AnyVal {
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setChat(value: Chat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setInvite_link(value: ChatInviteLink): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setInvite_linkUndefined: Self = StObject.set(x, "invite_link", js.undefined)
    
    inline def setUser_chat_id(value: Double): Self = StObject.set(x, "user_chat_id", value.asInstanceOf[js.Any])
  }
}

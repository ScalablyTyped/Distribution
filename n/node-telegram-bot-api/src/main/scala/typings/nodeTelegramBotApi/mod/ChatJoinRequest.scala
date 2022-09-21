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
}
object ChatJoinRequest {
  
  inline def apply(chat: Chat, date: Double, from: User): ChatJoinRequest = {
    val __obj = js.Dynamic.literal(chat = chat.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatJoinRequest]
  }
  
  extension [Self <: ChatJoinRequest](x: Self) {
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
    
    inline def setChat(value: Chat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setInvite_link(value: ChatInviteLink): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setInvite_linkUndefined: Self = StObject.set(x, "invite_link", js.undefined)
  }
}

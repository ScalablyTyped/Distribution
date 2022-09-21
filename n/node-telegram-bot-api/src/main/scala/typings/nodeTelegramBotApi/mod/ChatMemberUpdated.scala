package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMemberUpdated extends StObject {
  
  var chat: Chat
  
  var date: Double
  
  var from: User
  
  var invite_link: js.UndefOr[ChatInviteLink] = js.undefined
  
  var new_chat_member: ChatMember
  
  var old_chat_member: ChatMember
}
object ChatMemberUpdated {
  
  inline def apply(chat: Chat, date: Double, from: User, new_chat_member: ChatMember, old_chat_member: ChatMember): ChatMemberUpdated = {
    val __obj = js.Dynamic.literal(chat = chat.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], new_chat_member = new_chat_member.asInstanceOf[js.Any], old_chat_member = old_chat_member.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMemberUpdated]
  }
  
  extension [Self <: ChatMemberUpdated](x: Self) {
    
    inline def setChat(value: Chat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setInvite_link(value: ChatInviteLink): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setInvite_linkUndefined: Self = StObject.set(x, "invite_link", js.undefined)
    
    inline def setNew_chat_member(value: ChatMember): Self = StObject.set(x, "new_chat_member", value.asInstanceOf[js.Any])
    
    inline def setOld_chat_member(value: ChatMember): Self = StObject.set(x, "old_chat_member", value.asInstanceOf[js.Any])
  }
}

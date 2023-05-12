package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardButtonRequestChat extends StObject {
  
  var bot_administrator_rights: js.UndefOr[Boolean] = js.undefined
  
  var bot_is_member: js.UndefOr[Boolean] = js.undefined
  
  var chat_has_username: js.UndefOr[Boolean] = js.undefined
  
  var chat_is_channel: Boolean
  
  var chat_is_created: js.UndefOr[Boolean] = js.undefined
  
  var chat_is_forum: js.UndefOr[Boolean] = js.undefined
  
  var request_id: Double
  
  var user_administrator_rights: js.UndefOr[Boolean] = js.undefined
}
object KeyboardButtonRequestChat {
  
  inline def apply(chat_is_channel: Boolean, request_id: Double): KeyboardButtonRequestChat = {
    val __obj = js.Dynamic.literal(chat_is_channel = chat_is_channel.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButtonRequestChat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardButtonRequestChat] (val x: Self) extends AnyVal {
    
    inline def setBot_administrator_rights(value: Boolean): Self = StObject.set(x, "bot_administrator_rights", value.asInstanceOf[js.Any])
    
    inline def setBot_administrator_rightsUndefined: Self = StObject.set(x, "bot_administrator_rights", js.undefined)
    
    inline def setBot_is_member(value: Boolean): Self = StObject.set(x, "bot_is_member", value.asInstanceOf[js.Any])
    
    inline def setBot_is_memberUndefined: Self = StObject.set(x, "bot_is_member", js.undefined)
    
    inline def setChat_has_username(value: Boolean): Self = StObject.set(x, "chat_has_username", value.asInstanceOf[js.Any])
    
    inline def setChat_has_usernameUndefined: Self = StObject.set(x, "chat_has_username", js.undefined)
    
    inline def setChat_is_channel(value: Boolean): Self = StObject.set(x, "chat_is_channel", value.asInstanceOf[js.Any])
    
    inline def setChat_is_created(value: Boolean): Self = StObject.set(x, "chat_is_created", value.asInstanceOf[js.Any])
    
    inline def setChat_is_createdUndefined: Self = StObject.set(x, "chat_is_created", js.undefined)
    
    inline def setChat_is_forum(value: Boolean): Self = StObject.set(x, "chat_is_forum", value.asInstanceOf[js.Any])
    
    inline def setChat_is_forumUndefined: Self = StObject.set(x, "chat_is_forum", js.undefined)
    
    inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setUser_administrator_rights(value: Boolean): Self = StObject.set(x, "user_administrator_rights", value.asInstanceOf[js.Any])
    
    inline def setUser_administrator_rightsUndefined: Self = StObject.set(x, "user_administrator_rights", js.undefined)
  }
}

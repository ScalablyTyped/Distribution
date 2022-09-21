package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chat_member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeChatMember
  extends StObject
     with BotCommandScope {
  
  var chat_id: ChatId
  
  var `type`: chat_member
  
  var user_id: Double
}
object BotCommandScopeChatMember {
  
  inline def apply(chat_id: ChatId, user_id: Double): BotCommandScopeChatMember = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_member")
    __obj.asInstanceOf[BotCommandScopeChatMember]
  }
  
  extension [Self <: BotCommandScopeChatMember](x: Self) {
    
    inline def setChat_id(value: ChatId): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: chat_member): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}

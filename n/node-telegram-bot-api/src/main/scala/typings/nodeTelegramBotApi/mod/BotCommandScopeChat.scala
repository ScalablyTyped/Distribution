package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeChat
  extends StObject
     with BotCommandScope {
  
  var chat_id: ChatId
  
  var `type`: chat
}
object BotCommandScopeChat {
  
  inline def apply(chat_id: ChatId): BotCommandScopeChat = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat")
    __obj.asInstanceOf[BotCommandScopeChat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotCommandScopeChat] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: ChatId): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: chat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

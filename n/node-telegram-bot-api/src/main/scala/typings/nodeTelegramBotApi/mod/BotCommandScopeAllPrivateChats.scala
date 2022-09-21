package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.all_private_chats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeAllPrivateChats
  extends StObject
     with BotCommandScope {
  
  var `type`: all_private_chats
}
object BotCommandScopeAllPrivateChats {
  
  inline def apply(): BotCommandScopeAllPrivateChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_private_chats")
    __obj.asInstanceOf[BotCommandScopeAllPrivateChats]
  }
  
  extension [Self <: BotCommandScopeAllPrivateChats](x: Self) {
    
    inline def setType(value: all_private_chats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

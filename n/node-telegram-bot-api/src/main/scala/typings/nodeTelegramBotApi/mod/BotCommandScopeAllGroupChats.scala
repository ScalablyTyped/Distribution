package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.all_group_chats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeAllGroupChats
  extends StObject
     with BotCommandScope {
  
  var `type`: all_group_chats
}
object BotCommandScopeAllGroupChats {
  
  inline def apply(): BotCommandScopeAllGroupChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_group_chats")
    __obj.asInstanceOf[BotCommandScopeAllGroupChats]
  }
  
  extension [Self <: BotCommandScopeAllGroupChats](x: Self) {
    
    inline def setType(value: all_group_chats): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

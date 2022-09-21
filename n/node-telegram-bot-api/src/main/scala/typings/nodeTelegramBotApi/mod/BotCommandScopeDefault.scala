package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotCommandScopeDefault
  extends StObject
     with BotCommandScope {
  
  var `type`: default
}
object BotCommandScopeDefault {
  
  inline def apply(): BotCommandScopeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[BotCommandScopeDefault]
  }
  
  extension [Self <: BotCommandScopeDefault](x: Self) {
    
    inline def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

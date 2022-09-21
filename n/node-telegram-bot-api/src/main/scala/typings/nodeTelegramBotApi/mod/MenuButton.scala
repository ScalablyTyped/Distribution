package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.MenuButtonCommands
  - typings.nodeTelegramBotApi.mod.MenuButtonWebApp
  - typings.nodeTelegramBotApi.mod.MenuButtonDefault
*/
trait MenuButton extends StObject
object MenuButton {
  
  inline def MenuButtonCommands(): typings.nodeTelegramBotApi.mod.MenuButtonCommands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commands")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.MenuButtonCommands]
  }
  
  inline def MenuButtonDefault(): typings.nodeTelegramBotApi.mod.MenuButtonDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.MenuButtonDefault]
  }
  
  inline def MenuButtonWebApp(text: String, web_app: WebAppInfo): typings.nodeTelegramBotApi.mod.MenuButtonWebApp = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], web_app = web_app.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("web_app")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.MenuButtonWebApp]
  }
}

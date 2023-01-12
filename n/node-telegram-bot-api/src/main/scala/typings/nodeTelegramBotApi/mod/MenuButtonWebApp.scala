package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.web_app
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuButtonWebApp
  extends StObject
     with MenuButton {
  
  var text: String
  
  var `type`: web_app
  
  var web_app: WebAppInfo
}
object MenuButtonWebApp {
  
  inline def apply(text: String, web_app: WebAppInfo): MenuButtonWebApp = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], web_app = web_app.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("web_app")
    __obj.asInstanceOf[MenuButtonWebApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuButtonWebApp] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: web_app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeb_app(value: WebAppInfo): Self = StObject.set(x, "web_app", value.asInstanceOf[js.Any])
  }
}

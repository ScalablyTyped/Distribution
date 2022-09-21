package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAppData extends StObject {
  
  var button_text: String
  
  var data: String
}
object WebAppData {
  
  inline def apply(button_text: String, data: String): WebAppData = {
    val __obj = js.Dynamic.literal(button_text = button_text.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAppData]
  }
  
  extension [Self <: WebAppData](x: Self) {
    
    inline def setButton_text(value: String): Self = StObject.set(x, "button_text", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

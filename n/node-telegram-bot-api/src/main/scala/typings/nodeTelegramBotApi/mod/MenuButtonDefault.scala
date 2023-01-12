package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuButtonDefault
  extends StObject
     with MenuButton {
  
  var `type`: default
}
object MenuButtonDefault {
  
  inline def apply(): MenuButtonDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[MenuButtonDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuButtonDefault] (val x: Self) extends AnyVal {
    
    inline def setType(value: default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

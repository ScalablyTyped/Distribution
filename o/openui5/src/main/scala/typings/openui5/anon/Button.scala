package typings.openui5.anon

import typings.openui5.sapMButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  /**
    * Reference to the button that has been pressed
    */
  var button: js.UndefOr[default] = js.undefined
}
object Button {
  
  inline def apply(): Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setButton(value: default): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
  }
}

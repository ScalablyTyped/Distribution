package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutThemes extends StObject {
  
  var elementsColor: js.UndefOr[String] = js.undefined
  
  var headerColor: js.UndefOr[String] = js.undefined
}
object CheckoutThemes {
  
  inline def apply(): CheckoutThemes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutThemes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutThemes] (val x: Self) extends AnyVal {
    
    inline def setElementsColor(value: String): Self = StObject.set(x, "elementsColor", value.asInstanceOf[js.Any])
    
    inline def setElementsColorUndefined: Self = StObject.set(x, "elementsColor", js.undefined)
    
    inline def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
  }
}

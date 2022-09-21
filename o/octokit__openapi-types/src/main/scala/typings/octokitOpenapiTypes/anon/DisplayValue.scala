package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayValue extends StObject {
  
  var display: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object DisplayValue {
  
  inline def apply(): DisplayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayValue]
  }
  
  extension [Self <: DisplayValue](x: Self) {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

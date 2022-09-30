package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICRLBag extends StObject {
  
  var certValue: js.UndefOr[Any] = js.undefined
  
  var crlId: String
  
  var crlValue: Any
  
  var parsedValue: js.UndefOr[Any] = js.undefined
}
object ICRLBag {
  
  inline def apply(crlId: String, crlValue: Any): ICRLBag = {
    val __obj = js.Dynamic.literal(crlId = crlId.asInstanceOf[js.Any], crlValue = crlValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICRLBag]
  }
  
  extension [Self <: ICRLBag](x: Self) {
    
    inline def setCertValue(value: Any): Self = StObject.set(x, "certValue", value.asInstanceOf[js.Any])
    
    inline def setCertValueUndefined: Self = StObject.set(x, "certValue", js.undefined)
    
    inline def setCrlId(value: String): Self = StObject.set(x, "crlId", value.asInstanceOf[js.Any])
    
    inline def setCrlValue(value: Any): Self = StObject.set(x, "crlValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
  }
}

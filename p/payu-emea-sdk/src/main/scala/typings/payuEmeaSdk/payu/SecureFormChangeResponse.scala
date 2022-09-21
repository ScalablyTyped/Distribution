package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.payuEmeaSdkBooleans.`false`
import typings.payuEmeaSdk.payuEmeaSdkStrings.maestro
import typings.payuEmeaSdk.payuEmeaSdkStrings.mastercard
import typings.payuEmeaSdk.payuEmeaSdkStrings.visa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFormChangeResponse extends StObject {
  
  var brand: js.UndefOr[visa | mastercard | maestro] = js.undefined
  
  var empty: Boolean
  
  var error: `false` | js.Array[SecureFormErrorMessage]
  
  var length: js.UndefOr[Double] = js.undefined
}
object SecureFormChangeResponse {
  
  inline def apply(empty: Boolean, error: `false` | js.Array[SecureFormErrorMessage]): SecureFormChangeResponse = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureFormChangeResponse]
  }
  
  extension [Self <: SecureFormChangeResponse](x: Self) {
    
    inline def setBrand(value: visa | mastercard | maestro): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setError(value: `false` | js.Array[SecureFormErrorMessage]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorVarargs(value: SecureFormErrorMessage*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}

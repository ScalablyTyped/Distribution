package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeStampRespVerifyParams extends StObject {
  
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var signer: js.UndefOr[Double] = js.undefined
  
  var trustedCerts: js.UndefOr[js.Array[Certificate]] = js.undefined
}
object TimeStampRespVerifyParams {
  
  inline def apply(): TimeStampRespVerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeStampRespVerifyParams]
  }
  
  extension [Self <: TimeStampRespVerifyParams](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSigner(value: Double): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setTrustedCerts(value: js.Array[Certificate]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
    
    inline def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
    
    inline def setTrustedCertsVarargs(value: Certificate*): Self = StObject.set(x, "trustedCerts", js.Array(value*))
  }
}

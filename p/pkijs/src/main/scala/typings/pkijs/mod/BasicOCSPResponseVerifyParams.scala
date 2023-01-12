package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicOCSPResponseVerifyParams extends StObject {
  
  var trustedCerts: js.UndefOr[js.Array[Certificate]] = js.undefined
}
object BasicOCSPResponseVerifyParams {
  
  inline def apply(): BasicOCSPResponseVerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOCSPResponseVerifyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicOCSPResponseVerifyParams] (val x: Self) extends AnyVal {
    
    inline def setTrustedCerts(value: js.Array[Certificate]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
    
    inline def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
    
    inline def setTrustedCertsVarargs(value: Certificate*): Self = StObject.set(x, "trustedCerts", js.Array(value*))
  }
}

package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertBagJson
  extends StObject
     with _BagTypeJson {
  
  var certId: String
  
  var certValue: Any
}
object CertBagJson {
  
  inline def apply(certId: String, certValue: Any): CertBagJson = {
    val __obj = js.Dynamic.literal(certId = certId.asInstanceOf[js.Any], certValue = certValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertBagJson]
  }
  
  extension [Self <: CertBagJson](x: Self) {
    
    inline def setCertId(value: String): Self = StObject.set(x, "certId", value.asInstanceOf[js.Any])
    
    inline def setCertValue(value: Any): Self = StObject.set(x, "certValue", value.asInstanceOf[js.Any])
  }
}

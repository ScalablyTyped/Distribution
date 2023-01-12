package typings.pkijs.anon

import typings.pkijs.mod.CertificationRequestInfoParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificationRequestInfo extends StObject {
  
  var certificationRequestInfo: js.UndefOr[CertificationRequestInfoParameters] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  
  var signatureValue: js.UndefOr[String] = js.undefined
}
object CertificationRequestInfo {
  
  inline def apply(): CertificationRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationRequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificationRequestInfo] (val x: Self) extends AnyVal {
    
    inline def setCertificationRequestInfo(value: CertificationRequestInfoParameters): Self = StObject.set(x, "certificationRequestInfo", value.asInstanceOf[js.Any])
    
    inline def setCertificationRequestInfoUndefined: Self = StObject.set(x, "certificationRequestInfo", js.undefined)
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: String): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
  }
}

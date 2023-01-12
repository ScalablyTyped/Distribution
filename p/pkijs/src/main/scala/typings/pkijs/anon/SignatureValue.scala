package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.TBSCertificateSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureValue extends StObject {
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signatureValue: js.UndefOr[String] = js.undefined
  
  var tbsCertificate: js.UndefOr[TBSCertificateSchema] = js.undefined
}
object SignatureValue {
  
  inline def apply(): SignatureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureValue] (val x: Self) extends AnyVal {
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: String): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
    
    inline def setTbsCertificate(value: TBSCertificateSchema): Self = StObject.set(x, "tbsCertificate", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateUndefined: Self = StObject.set(x, "tbsCertificate", js.undefined)
  }
}

package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.AttributeCertificateInfoV2Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureAlgorithm extends StObject {
  
  var acinfo: js.UndefOr[AttributeCertificateInfoV2Schema] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signatureValue: js.UndefOr[String] = js.undefined
}
object SignatureAlgorithm {
  
  inline def apply(): SignatureAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureAlgorithm]
  }
  
  extension [Self <: SignatureAlgorithm](x: Self) {
    
    inline def setAcinfo(value: AttributeCertificateInfoV2Schema): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setAcinfoUndefined: Self = StObject.set(x, "acinfo", js.undefined)
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: String): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
  }
}

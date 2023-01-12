package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeCertificateV1Json
  extends StObject
     with CertificateSetItemJson {
  
  var acinfo: AttributeCertificateInfoV1Json
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signatureValue: BitStringJson
}
object AttributeCertificateV1Json {
  
  inline def apply(
    acinfo: AttributeCertificateInfoV1Json,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson
  ): AttributeCertificateV1Json = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeCertificateV1Json]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeCertificateV1Json] (val x: Self) extends AnyVal {
    
    inline def setAcinfo(value: AttributeCertificateInfoV1Json): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitStringJson): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
  }
}

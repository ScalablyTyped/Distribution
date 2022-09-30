package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeCertificateV2Json
  extends StObject
     with CertificateSetItemJson {
  
  var acinfo: AttributeCertificateInfoV2Json
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signatureValue: BitStringJson
}
object AttributeCertificateV2Json {
  
  inline def apply(
    acinfo: AttributeCertificateInfoV2Json,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson
  ): AttributeCertificateV2Json = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeCertificateV2Json]
  }
  
  extension [Self <: AttributeCertificateV2Json](x: Self) {
    
    inline def setAcinfo(value: AttributeCertificateInfoV2Json): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitStringJson): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
  }
}

package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.IntegerJson
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pkijs.mod.CertificateJson
  - typings.pkijs.mod.AttributeCertificateV1Json
  - typings.pkijs.mod.AttributeCertificateV2Json
  - typings.pkijs.mod.OtherCertificateFormatJson
*/
trait CertificateSetItemJson extends StObject
object CertificateSetItemJson {
  
  inline def AttributeCertificateV1Json(
    acinfo: AttributeCertificateInfoV1Json,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson
  ): typings.pkijs.mod.AttributeCertificateV1Json = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.AttributeCertificateV1Json]
  }
  
  inline def AttributeCertificateV2Json(
    acinfo: AttributeCertificateInfoV2Json,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson
  ): typings.pkijs.mod.AttributeCertificateV2Json = {
    val __obj = js.Dynamic.literal(acinfo = acinfo.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.AttributeCertificateV2Json]
  }
  
  inline def CertificateJson(
    issuer: RelativeDistinguishedNamesJson,
    notAfter: TimeJson,
    notBefore: TimeJson,
    serialNumber: IntegerJson,
    signature: AlgorithmIdentifierJson,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson,
    subject: RelativeDistinguishedNamesJson,
    subjectPublicKeyInfo: PublicKeyInfoJson | JsonWebKey,
    tbs: String,
    version: Double
  ): typings.pkijs.mod.CertificateJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfo = subjectPublicKeyInfo.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.CertificateJson]
  }
  
  inline def OtherCertificateFormatJson(otherCertFormat: String): typings.pkijs.mod.OtherCertificateFormatJson = {
    val __obj = js.Dynamic.literal(otherCertFormat = otherCertFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pkijs.mod.OtherCertificateFormatJson]
  }
}

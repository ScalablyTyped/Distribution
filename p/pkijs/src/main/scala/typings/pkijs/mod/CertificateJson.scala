package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.IntegerJson
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateJson
  extends StObject
     with CertificateSetItemJson {
  
  var extensions: js.UndefOr[js.Array[ExtensionJson]] = js.undefined
  
  var issuer: RelativeDistinguishedNamesJson
  
  var issuerUniqueID: js.UndefOr[String] = js.undefined
  
  var notAfter: TimeJson
  
  var notBefore: TimeJson
  
  var serialNumber: IntegerJson
  
  var signature: AlgorithmIdentifierJson
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signatureValue: BitStringJson
  
  var subject: RelativeDistinguishedNamesJson
  
  var subjectPublicKeyInfo: PublicKeyInfoJson | JsonWebKey
  
  var subjectUniqueID: js.UndefOr[String] = js.undefined
  
  var tbs: String
  
  var version: Double
}
object CertificateJson {
  
  inline def apply(
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
  ): CertificateJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfo = subjectPublicKeyInfo.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateJson] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: js.Array[ExtensionJson]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ExtensionJson*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIssuer(value: RelativeDistinguishedNamesJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueID(value: String): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setNotAfter(value: TimeJson): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: TimeJson): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: IntegerJson): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitStringJson): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: RelativeDistinguishedNamesJson): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfoJson | JsonWebKey): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueID(value: String): Self = StObject.set(x, "subjectUniqueID", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueIDUndefined: Self = StObject.set(x, "subjectUniqueID", js.undefined)
    
    inline def setTbs(value: String): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

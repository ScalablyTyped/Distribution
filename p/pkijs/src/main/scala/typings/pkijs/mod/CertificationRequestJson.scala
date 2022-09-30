package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON representation of {@link CertificationRequest}
  */
trait CertificationRequestJson extends StObject {
  
  var attributes: js.UndefOr[js.Array[AttributeJson]] = js.undefined
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signatureValue: BitStringJson
  
  var subject: RelativeDistinguishedNamesJson
  
  var subjectPublicKeyInfo: PublicKeyInfoJson | JsonWebKey
  
  var tbs: String
  
  var version: Double
}
object CertificationRequestJson {
  
  inline def apply(
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson,
    subject: RelativeDistinguishedNamesJson,
    subjectPublicKeyInfo: PublicKeyInfoJson | JsonWebKey,
    tbs: String,
    version: Double
  ): CertificationRequestJson = {
    val __obj = js.Dynamic.literal(signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfo = subjectPublicKeyInfo.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationRequestJson]
  }
  
  extension [Self <: CertificationRequestJson](x: Self) {
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitStringJson): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: RelativeDistinguishedNamesJson): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfoJson | JsonWebKey): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setTbs(value: String): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

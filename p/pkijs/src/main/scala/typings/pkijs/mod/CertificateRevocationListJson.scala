package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateRevocationListJson
  extends StObject
     with SignedDataCRLJson {
  
  var crlExtensions: js.UndefOr[ExtensionsJson] = js.undefined
  
  var issuer: RelativeDistinguishedNamesJson
  
  var nextUpdate: js.UndefOr[TimeJson] = js.undefined
  
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificateJson]] = js.undefined
  
  var signature: AlgorithmIdentifierJson
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signatureValue: BitStringJson
  
  var tbs: String
  
  var thisUpdate: TimeJson
  
  var version: Double
}
object CertificateRevocationListJson {
  
  inline def apply(
    issuer: RelativeDistinguishedNamesJson,
    signature: AlgorithmIdentifierJson,
    signatureAlgorithm: AlgorithmIdentifierJson,
    signatureValue: BitStringJson,
    tbs: String,
    thisUpdate: TimeJson,
    version: Double
  ): CertificateRevocationListJson = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRevocationListJson]
  }
  
  extension [Self <: CertificateRevocationListJson](x: Self) {
    
    inline def setCrlExtensions(value: ExtensionsJson): Self = StObject.set(x, "crlExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlExtensionsUndefined: Self = StObject.set(x, "crlExtensions", js.undefined)
    
    inline def setIssuer(value: RelativeDistinguishedNamesJson): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNextUpdate(value: TimeJson): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setRevokedCertificates(value: js.Array[RevokedCertificateJson]): Self = StObject.set(x, "revokedCertificates", value.asInstanceOf[js.Any])
    
    inline def setRevokedCertificatesUndefined: Self = StObject.set(x, "revokedCertificates", js.undefined)
    
    inline def setRevokedCertificatesVarargs(value: RevokedCertificateJson*): Self = StObject.set(x, "revokedCertificates", js.Array(value*))
    
    inline def setSignature(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitStringJson): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setTbs(value: String): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setThisUpdate(value: TimeJson): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificateRevocationList extends StObject {
  
  var crlExtensions: js.UndefOr[Extensions] = js.undefined
  
  var issuer: RelativeDistinguishedNames
  
  var nextUpdate: js.UndefOr[Time] = js.undefined
  
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  var signature: AlgorithmIdentifier
  
  var signatureAlgorithm: AlgorithmIdentifier
  
  var signatureValue: BitString
  
  var tbs: js.typedarray.ArrayBuffer
  
  var thisUpdate: Time
  
  var version: Double
}
object ICertificateRevocationList {
  
  inline def apply(
    issuer: RelativeDistinguishedNames,
    signature: AlgorithmIdentifier,
    signatureAlgorithm: AlgorithmIdentifier,
    signatureValue: BitString,
    tbs: js.typedarray.ArrayBuffer,
    thisUpdate: Time,
    version: Double
  ): ICertificateRevocationList = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], signatureValue = signatureValue.asInstanceOf[js.Any], tbs = tbs.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateRevocationList]
  }
  
  extension [Self <: ICertificateRevocationList](x: Self) {
    
    inline def setCrlExtensions(value: Extensions): Self = StObject.set(x, "crlExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlExtensionsUndefined: Self = StObject.set(x, "crlExtensions", js.undefined)
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNextUpdate(value: Time): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setRevokedCertificates(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "revokedCertificates", value.asInstanceOf[js.Any])
    
    inline def setRevokedCertificatesUndefined: Self = StObject.set(x, "revokedCertificates", js.undefined)
    
    inline def setRevokedCertificatesVarargs(value: RevokedCertificate*): Self = StObject.set(x, "revokedCertificates", js.Array(value*))
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setThisUpdate(value: Time): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

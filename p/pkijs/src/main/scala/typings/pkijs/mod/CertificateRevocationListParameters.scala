package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificateRevocationList> */
trait CertificateRevocationListParameters extends StObject {
  
  var crlExtensions: js.UndefOr[Extensions] = js.undefined
  
  var issuer: js.UndefOr[RelativeDistinguishedNames] = js.undefined
  
  var nextUpdate: js.UndefOr[Time] = js.undefined
  
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureValue: js.UndefOr[BitString] = js.undefined
  
  var tbs: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var thisUpdate: js.UndefOr[Time] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object CertificateRevocationListParameters {
  
  inline def apply(): CertificateRevocationListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationListParameters]
  }
  
  extension [Self <: CertificateRevocationListParameters](x: Self) {
    
    inline def setCrlExtensions(value: Extensions): Self = StObject.set(x, "crlExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlExtensionsUndefined: Self = StObject.set(x, "crlExtensions", js.undefined)
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNextUpdate(value: Time): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setRevokedCertificates(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "revokedCertificates", value.asInstanceOf[js.Any])
    
    inline def setRevokedCertificatesUndefined: Self = StObject.set(x, "revokedCertificates", js.undefined)
    
    inline def setRevokedCertificatesVarargs(value: RevokedCertificate*): Self = StObject.set(x, "revokedCertificates", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setTbsUndefined: Self = StObject.set(x, "tbs", js.undefined)
    
    inline def setThisUpdate(value: Time): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
    
    inline def setThisUpdateUndefined: Self = StObject.set(x, "thisUpdate", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

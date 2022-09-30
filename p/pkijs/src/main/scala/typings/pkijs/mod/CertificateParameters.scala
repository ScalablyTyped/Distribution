package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constructor parameters for the {@link Certificate} class
  */
/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificate> */
trait CertificateParameters extends StObject {
  
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var issuer: js.UndefOr[RelativeDistinguishedNames] = js.undefined
  
  var issuerUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var notAfter: js.UndefOr[Time] = js.undefined
  
  var notBefore: js.UndefOr[Time] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var serialNumber: js.UndefOr[Integer] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureValue: js.UndefOr[BitString] = js.undefined
  
  var subject: js.UndefOr[RelativeDistinguishedNames] = js.undefined
  
  var subjectPublicKeyInfo: js.UndefOr[PublicKeyInfo] = js.undefined
  
  var subjectUniqueID: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var tbs: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object CertificateParameters {
  
  inline def apply(): CertificateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateParameters]
  }
  
  extension [Self <: CertificateParameters](x: Self) {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setIssuer(value: RelativeDistinguishedNames): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setIssuerUniqueID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setIssuerUniqueIDUndefined: Self = StObject.set(x, "issuerUniqueID", js.undefined)
    
    inline def setNotAfter(value: Time): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: Time): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifier): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
    
    inline def setSubject(value: RelativeDistinguishedNames): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfo): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfoUndefined: Self = StObject.set(x, "subjectPublicKeyInfo", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectUniqueID(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "subjectUniqueID", value.asInstanceOf[js.Any])
    
    inline def setSubjectUniqueIDUndefined: Self = StObject.set(x, "subjectUniqueID", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setTbsUndefined: Self = StObject.set(x, "tbs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

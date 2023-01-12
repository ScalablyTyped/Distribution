package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.ExtensionsSchema
import typings.pkijs.mod.PublicKeyInfoSchema
import typings.pkijs.mod.RelativeDistinguishedNamesSchema
import typings.pkijs.mod.TimeSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotBefore extends StObject {
  
  var extensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var issuer: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
  
  var notAfter: js.UndefOr[TimeSchema] = js.undefined
  
  var notBefore: js.UndefOr[TimeSchema] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var subject: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
  
  var subjectPublicKeyInfo: js.UndefOr[PublicKeyInfoSchema] = js.undefined
  
  var tbsCertificateIssuerUniqueID: js.UndefOr[String] = js.undefined
  
  var tbsCertificateSerialNumber: js.UndefOr[String] = js.undefined
  
  var tbsCertificateSubjectUniqueID: js.UndefOr[String] = js.undefined
  
  var tbsCertificateValidity: js.UndefOr[String] = js.undefined
  
  var tbsCertificateVersion: js.UndefOr[String] = js.undefined
}
object NotBefore {
  
  inline def apply(): NotBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotBefore] (val x: Self) extends AnyVal {
    
    inline def setExtensions(value: ExtensionsSchema): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setIssuer(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNotAfter(value: TimeSchema): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: TimeSchema): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSubject(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfoSchema): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfoUndefined: Self = StObject.set(x, "subjectPublicKeyInfo", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTbsCertificateIssuerUniqueID(value: String): Self = StObject.set(x, "tbsCertificateIssuerUniqueID", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateIssuerUniqueIDUndefined: Self = StObject.set(x, "tbsCertificateIssuerUniqueID", js.undefined)
    
    inline def setTbsCertificateSerialNumber(value: String): Self = StObject.set(x, "tbsCertificateSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateSerialNumberUndefined: Self = StObject.set(x, "tbsCertificateSerialNumber", js.undefined)
    
    inline def setTbsCertificateSubjectUniqueID(value: String): Self = StObject.set(x, "tbsCertificateSubjectUniqueID", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateSubjectUniqueIDUndefined: Self = StObject.set(x, "tbsCertificateSubjectUniqueID", js.undefined)
    
    inline def setTbsCertificateValidity(value: String): Self = StObject.set(x, "tbsCertificateValidity", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateValidityUndefined: Self = StObject.set(x, "tbsCertificateValidity", js.undefined)
    
    inline def setTbsCertificateVersion(value: String): Self = StObject.set(x, "tbsCertificateVersion", value.asInstanceOf[js.Any])
    
    inline def setTbsCertificateVersionUndefined: Self = StObject.set(x, "tbsCertificateVersion", js.undefined)
  }
}

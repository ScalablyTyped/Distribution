package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.ExtensionsSchema
import typings.pkijs.mod.RelativeDistinguishedNamesSchema
import typings.pkijs.mod.TimeSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrlExtensions extends StObject {
  
  var crlExtensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var issuer: js.UndefOr[RelativeDistinguishedNamesSchema] = js.undefined
  
  var signature: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signatureValue: js.UndefOr[String] = js.undefined
  
  var tbsCertListNextUpdate: js.UndefOr[TimeSchema] = js.undefined
  
  var tbsCertListRevokedCertificates: js.UndefOr[String] = js.undefined
  
  var tbsCertListThisUpdate: js.UndefOr[TimeSchema] = js.undefined
  
  var tbsCertListVersion: js.UndefOr[String] = js.undefined
}
object CrlExtensions {
  
  inline def apply(): CrlExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrlExtensions]
  }
  
  extension [Self <: CrlExtensions](x: Self) {
    
    inline def setCrlExtensions(value: ExtensionsSchema): Self = StObject.set(x, "crlExtensions", value.asInstanceOf[js.Any])
    
    inline def setCrlExtensionsUndefined: Self = StObject.set(x, "crlExtensions", js.undefined)
    
    inline def setIssuer(value: RelativeDistinguishedNamesSchema): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSignature(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignatureValue(value: String): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
    
    inline def setTbsCertListNextUpdate(value: TimeSchema): Self = StObject.set(x, "tbsCertListNextUpdate", value.asInstanceOf[js.Any])
    
    inline def setTbsCertListNextUpdateUndefined: Self = StObject.set(x, "tbsCertListNextUpdate", js.undefined)
    
    inline def setTbsCertListRevokedCertificates(value: String): Self = StObject.set(x, "tbsCertListRevokedCertificates", value.asInstanceOf[js.Any])
    
    inline def setTbsCertListRevokedCertificatesUndefined: Self = StObject.set(x, "tbsCertListRevokedCertificates", js.undefined)
    
    inline def setTbsCertListThisUpdate(value: TimeSchema): Self = StObject.set(x, "tbsCertListThisUpdate", value.asInstanceOf[js.Any])
    
    inline def setTbsCertListThisUpdateUndefined: Self = StObject.set(x, "tbsCertListThisUpdate", js.undefined)
    
    inline def setTbsCertListVersion(value: String): Self = StObject.set(x, "tbsCertListVersion", value.asInstanceOf[js.Any])
    
    inline def setTbsCertListVersionUndefined: Self = StObject.set(x, "tbsCertListVersion", js.undefined)
  }
}

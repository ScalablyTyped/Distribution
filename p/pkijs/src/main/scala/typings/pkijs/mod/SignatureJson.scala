package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureJson extends StObject {
  
  var certs: js.UndefOr[js.Array[CertificateJson]] = js.undefined
  
  var signature: BitStringJson
  
  var signatureAlgorithm: AlgorithmIdentifierJson
}
object SignatureJson {
  
  inline def apply(signature: BitStringJson, signatureAlgorithm: AlgorithmIdentifierJson): SignatureJson = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureJson] (val x: Self) extends AnyVal {
    
    inline def setCerts(value: js.Array[CertificateJson]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: CertificateJson*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setSignature(value: BitStringJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
  }
}

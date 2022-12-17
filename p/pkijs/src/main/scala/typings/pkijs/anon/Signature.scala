package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature extends StObject {
  
  var certs: js.UndefOr[String] = js.undefined
  
  var signature: js.UndefOr[String] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
}
object Signature {
  
  inline def apply(): Signature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signature]
  }
  
  extension [Self <: Signature](x: Self) {
    
    inline def setCerts(value: String): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}

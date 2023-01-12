package typings.pkijs.anon

import typings.pkijs.mod.Certificate
import typings.pkijs.mod._MakeInternalValuesParams
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKey
  extends StObject
     with _MakeInternalValuesParams {
  
  var hashAlgorithm: String
  
  var privateKey: CryptoKey
  
  var signingCertificate: Certificate
}
object PrivateKey {
  
  inline def apply(hashAlgorithm: String, privateKey: CryptoKey, signingCertificate: Certificate): PrivateKey = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
  }
}

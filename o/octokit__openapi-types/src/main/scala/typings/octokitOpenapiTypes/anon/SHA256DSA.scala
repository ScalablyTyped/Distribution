package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SHA256DSA extends StObject {
  
  var SHA256_DSA: js.UndefOr[String] = js.undefined
  
  var SHA256_ECDSA: js.UndefOr[String] = js.undefined
  
  var SHA256_ED25519: js.UndefOr[String] = js.undefined
  
  var SHA256_RSA: js.UndefOr[String] = js.undefined
}
object SHA256DSA {
  
  inline def apply(): SHA256DSA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SHA256DSA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SHA256DSA] (val x: Self) extends AnyVal {
    
    inline def setSHA256_DSA(value: String): Self = StObject.set(x, "SHA256_DSA", value.asInstanceOf[js.Any])
    
    inline def setSHA256_DSAUndefined: Self = StObject.set(x, "SHA256_DSA", js.undefined)
    
    inline def setSHA256_ECDSA(value: String): Self = StObject.set(x, "SHA256_ECDSA", value.asInstanceOf[js.Any])
    
    inline def setSHA256_ECDSAUndefined: Self = StObject.set(x, "SHA256_ECDSA", js.undefined)
    
    inline def setSHA256_ED25519(value: String): Self = StObject.set(x, "SHA256_ED25519", value.asInstanceOf[js.Any])
    
    inline def setSHA256_ED25519Undefined: Self = StObject.set(x, "SHA256_ED25519", js.undefined)
    
    inline def setSHA256_RSA(value: String): Self = StObject.set(x, "SHA256_RSA", value.asInstanceOf[js.Any])
    
    inline def setSHA256_RSAUndefined: Self = StObject.set(x, "SHA256_RSA", js.undefined)
  }
}

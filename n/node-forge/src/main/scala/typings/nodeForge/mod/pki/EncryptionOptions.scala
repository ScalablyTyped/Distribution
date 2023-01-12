package typings.nodeForge.mod.pki

import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import typings.nodeForge.nodeForgeStrings.sha1
import typings.nodeForge.nodeForgeStrings.sha224
import typings.nodeForge.nodeForgeStrings.sha256
import typings.nodeForge.nodeForgeStrings.sha384
import typings.nodeForge.nodeForgeStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionOptions extends StObject {
  
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var legacy: js.UndefOr[Boolean] = js.undefined
  
  var prfAlgorithm: js.UndefOr[sha1 | sha224 | sha256 | sha384 | sha512] = js.undefined
  
  var saltSize: js.UndefOr[Double] = js.undefined
}
object EncryptionOptions {
  
  inline def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    inline def setPrfAlgorithm(value: sha1 | sha224 | sha256 | sha384 | sha512): Self = StObject.set(x, "prfAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPrfAlgorithmUndefined: Self = StObject.set(x, "prfAlgorithm", js.undefined)
    
    inline def setSaltSize(value: Double): Self = StObject.set(x, "saltSize", value.asInstanceOf[js.Any])
    
    inline def setSaltSizeUndefined: Self = StObject.set(x, "saltSize", js.undefined)
  }
}

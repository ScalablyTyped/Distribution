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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionOptions extends StObject {
  
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var legacy: js.UndefOr[Boolean] = js.native
  
  var prfAlgorithm: js.UndefOr[sha1 | sha224 | sha256 | sha384 | sha512] = js.native
  
  var saltSize: js.UndefOr[Double] = js.native
}
object EncryptionOptions {
  
  @scala.inline
  def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  @scala.inline
  implicit class EncryptionOptionsMutableBuilder[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    @scala.inline
    def setPrfAlgorithm(value: sha1 | sha224 | sha256 | sha384 | sha512): Self = StObject.set(x, "prfAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrfAlgorithmUndefined: Self = StObject.set(x, "prfAlgorithm", js.undefined)
    
    @scala.inline
    def setSaltSize(value: Double): Self = StObject.set(x, "saltSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltSizeUndefined: Self = StObject.set(x, "saltSize", js.undefined)
  }
}

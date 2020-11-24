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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionOptions extends js.Object {
  
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
  implicit class EncryptionOptionsOps[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setLegacy(value: Boolean): Self = this.set("legacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacy: Self = this.set("legacy", js.undefined)
    
    @scala.inline
    def setPrfAlgorithm(value: sha1 | sha224 | sha256 | sha384 | sha512): Self = this.set("prfAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrfAlgorithm: Self = this.set("prfAlgorithm", js.undefined)
    
    @scala.inline
    def setSaltSize(value: Double): Self = this.set("saltSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltSize: Self = this.set("saltSize", js.undefined)
  }
}

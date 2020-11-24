package typings.nodeForge.anon

import typings.nodeForge.mod.Hex
import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends js.Object {
  
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var generateLocalKeyId: js.UndefOr[Boolean] = js.native
  
  var localKeyId: js.UndefOr[Hex] = js.native
  
  var saltSize: js.UndefOr[Double] = js.native
  
  var useMac: js.UndefOr[Boolean] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    
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
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setGenerateLocalKeyId(value: Boolean): Self = this.set("generateLocalKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateLocalKeyId: Self = this.set("generateLocalKeyId", js.undefined)
    
    @scala.inline
    def setLocalKeyId(value: Hex): Self = this.set("localKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalKeyId: Self = this.set("localKeyId", js.undefined)
    
    @scala.inline
    def setSaltSize(value: Double): Self = this.set("saltSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltSize: Self = this.set("saltSize", js.undefined)
    
    @scala.inline
    def setUseMac(value: Boolean): Self = this.set("useMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMac: Self = this.set("useMac", js.undefined)
  }
}

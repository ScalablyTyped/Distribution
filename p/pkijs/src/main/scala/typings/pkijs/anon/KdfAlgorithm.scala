package typings.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KdfAlgorithm extends js.Object {
  
  var kdfAlgorithm: js.UndefOr[String] = js.native
  
  var kekEncryptionLength: js.UndefOr[Double] = js.native
  
  var oaepHashAlgorithm: js.UndefOr[String] = js.native
}
object KdfAlgorithm {
  
  @scala.inline
  def apply(): KdfAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KdfAlgorithm]
  }
  
  @scala.inline
  implicit class KdfAlgorithmOps[Self <: KdfAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setKdfAlgorithm(value: String): Self = this.set("kdfAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKdfAlgorithm: Self = this.set("kdfAlgorithm", js.undefined)
    
    @scala.inline
    def setKekEncryptionLength(value: Double): Self = this.set("kekEncryptionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKekEncryptionLength: Self = this.set("kekEncryptionLength", js.undefined)
    
    @scala.inline
    def setOaepHashAlgorithm(value: String): Self = this.set("oaepHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOaepHashAlgorithm: Self = this.set("oaepHashAlgorithm", js.undefined)
  }
}

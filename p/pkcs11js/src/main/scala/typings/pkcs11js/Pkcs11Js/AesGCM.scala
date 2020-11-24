package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesGCM extends IParams {
  
  var aad: js.UndefOr[Buffer] = js.native
  
  var iv: js.UndefOr[Buffer] = js.native
  
  var ivBits: Double = js.native
  
  var tagBits: Double = js.native
}
object AesGCM {
  
  @scala.inline
  def apply(ivBits: Double, tagBits: Double, `type`: Double): AesGCM = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], tagBits = tagBits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGCM]
  }
  
  @scala.inline
  implicit class AesGCMOps[Self <: AesGCM] (val x: Self) extends AnyVal {
    
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
    def setIvBits(value: Double): Self = this.set("ivBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagBits(value: Double): Self = this.set("tagBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAad(value: Buffer): Self = this.set("aad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAad: Self = this.set("aad", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
  }
}

package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningOptions extends js.Object {
  
  var dsaEncoding: js.UndefOr[DSAEncoding] = js.native
  
  /**
    * @See crypto.constants.RSA_PKCS1_PADDING
    */
  var padding: js.UndefOr[Double] = js.native
  
  var saltLength: js.UndefOr[Double] = js.native
}
object SigningOptions {
  
  @scala.inline
  def apply(): SigningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningOptions]
  }
  
  @scala.inline
  implicit class SigningOptionsOps[Self <: SigningOptions] (val x: Self) extends AnyVal {
    
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
    def setDsaEncoding(value: DSAEncoding): Self = this.set("dsaEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsaEncoding: Self = this.set("dsaEncoding", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSaltLength(value: Double): Self = this.set("saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltLength: Self = this.set("saltLength", js.undefined)
  }
}

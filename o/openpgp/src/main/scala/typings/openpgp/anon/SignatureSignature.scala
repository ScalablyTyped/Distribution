package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureSignature extends js.Object {
  
  var signature: typings.openpgp.mod.signature.Signature = js.native
}
object SignatureSignature {
  
  @scala.inline
  def apply(signature: typings.openpgp.mod.signature.Signature): SignatureSignature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSignature]
  }
  
  @scala.inline
  implicit class SignatureSignatureOps[Self <: SignatureSignature] (val x: Self) extends AnyVal {
    
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
    def setSignature(value: typings.openpgp.mod.signature.Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
}

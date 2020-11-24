package typings.pkijs.anon

import typings.pkijs.certificateMod.default
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientCertificate extends js.Object {
  
  var recipientCertificate: default = js.native
  
  var recipientPrivateKey: ArrayBuffer = js.native
}
object RecipientCertificate {
  
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: ArrayBuffer): RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientCertificate]
  }
  
  @scala.inline
  implicit class RecipientCertificateOps[Self <: RecipientCertificate] (val x: Self) extends AnyVal {
    
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
    def setRecipientCertificate(value: default): Self = this.set("recipientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientPrivateKey(value: ArrayBuffer): Self = this.set("recipientPrivateKey", value.asInstanceOf[js.Any])
  }
}

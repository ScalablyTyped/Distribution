package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// other types
@js.native
trait SendParamsRecipient extends js.Object {
  
  var Email: String = js.native
  
  var Name: js.UndefOr[String] = js.native
}
object SendParamsRecipient {
  
  @scala.inline
  def apply(Email: String): SendParamsRecipient = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParamsRecipient]
  }
  
  @scala.inline
  implicit class SendParamsRecipientOps[Self <: SendParamsRecipient] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}

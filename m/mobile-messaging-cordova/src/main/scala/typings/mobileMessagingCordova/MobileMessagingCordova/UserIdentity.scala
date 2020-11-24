package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIdentity extends js.Object {
  
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  var externalUserId: String = js.native
  
  var phones: js.UndefOr[js.Array[String]] = js.native
}
object UserIdentity {
  
  @scala.inline
  def apply(externalUserId: String): UserIdentity = {
    val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  
  @scala.inline
  implicit class UserIdentityOps[Self <: UserIdentity] (val x: Self) extends AnyVal {
    
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
    def setExternalUserId(value: String): Self = this.set("externalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: String*): Self = this.set("phones", js.Array(value :_*))
    
    @scala.inline
    def setPhones(value: js.Array[String]): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
  }
}

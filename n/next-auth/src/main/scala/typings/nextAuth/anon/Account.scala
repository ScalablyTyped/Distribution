package typings.nextAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  var Account: js.UndefOr[Model] = js.native
  
  var Session: js.UndefOr[Model] = js.native
  
  var User: js.UndefOr[Model] = js.native
  
  var VerificationRequest: js.UndefOr[Model] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Model): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    
    @scala.inline
    def setSession(value: Model): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
    
    @scala.inline
    def setUser(value: Model): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
    
    @scala.inline
    def setVerificationRequest(value: Model): Self = this.set("VerificationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationRequest: Self = this.set("VerificationRequest", js.undefined)
  }
}

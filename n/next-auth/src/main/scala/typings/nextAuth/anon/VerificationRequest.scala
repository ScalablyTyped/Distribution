package typings.nextAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationRequest extends js.Object {
  
  var Account: String = js.native
  
  var Session: String = js.native
  
  var User: String = js.native
  
  var VerificationRequest: String = js.native
}
object VerificationRequest {
  
  @scala.inline
  def apply(Account: String, Session: String, User: String, VerificationRequest: String): VerificationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], VerificationRequest = VerificationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationRequest]
  }
  
  @scala.inline
  implicit class VerificationRequestOps[Self <: VerificationRequest] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: String): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequest(value: String): Self = this.set("VerificationRequest", value.asInstanceOf[js.Any])
  }
}

package typings.nextAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  var Account: ModelTypeORMAccountModel = js.native
  
  var Session: ModelTypeORMSessionModel = js.native
  
  var User: ModelTypeORMUserModel = js.native
  
  var VerificationRequest: ModelTypeORMVerificationRequestModel = js.native
}
object User {
  
  @scala.inline
  def apply(
    Account: ModelTypeORMAccountModel,
    Session: ModelTypeORMSessionModel,
    User: ModelTypeORMUserModel,
    VerificationRequest: ModelTypeORMVerificationRequestModel
  ): User = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], VerificationRequest = VerificationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: ModelTypeORMAccountModel): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: ModelTypeORMSessionModel): Self = this.set("Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ModelTypeORMUserModel): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequest(value: ModelTypeORMVerificationRequestModel): Self = this.set("VerificationRequest", value.asInstanceOf[js.Any])
  }
}

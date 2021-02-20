package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
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
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: ModelTypeORMAccountModel): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: ModelTypeORMSessionModel): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ModelTypeORMUserModel): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequest(value: ModelTypeORMVerificationRequestModel): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
  }
}

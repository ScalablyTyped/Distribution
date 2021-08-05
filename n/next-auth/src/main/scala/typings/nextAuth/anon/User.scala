package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var Account: ModelTypeORMAccountModel
  
  var Session: ModelTypeORMSessionModel
  
  var User: ModelTypeORMUserModel
  
  var VerificationRequest: ModelTypeORMVerificationRequestModel
}
object User {
  
  inline def apply(
    Account: ModelTypeORMAccountModel,
    Session: ModelTypeORMSessionModel,
    User: ModelTypeORMUserModel,
    VerificationRequest: ModelTypeORMVerificationRequestModel
  ): User = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], VerificationRequest = VerificationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAccount(value: ModelTypeORMAccountModel): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setSession(value: ModelTypeORMSessionModel): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setUser(value: ModelTypeORMUserModel): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setVerificationRequest(value: ModelTypeORMVerificationRequestModel): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
  }
}

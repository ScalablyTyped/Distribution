package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
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
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Model): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    @scala.inline
    def setSession(value: Model): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    @scala.inline
    def setUser(value: Model): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    @scala.inline
    def setVerificationRequest(value: Model): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequestUndefined: Self = StObject.set(x, "VerificationRequest", js.undefined)
  }
}

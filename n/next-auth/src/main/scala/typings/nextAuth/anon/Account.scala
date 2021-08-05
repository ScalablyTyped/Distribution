package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var Account: js.UndefOr[Model] = js.undefined
  
  var Session: js.UndefOr[Model] = js.undefined
  
  var User: js.UndefOr[Model] = js.undefined
  
  var VerificationRequest: js.UndefOr[Model] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccount(value: Model): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setSession(value: Model): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setUser(value: Model): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setVerificationRequest(value: Model): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
    
    inline def setVerificationRequestUndefined: Self = StObject.set(x, "VerificationRequest", js.undefined)
  }
}

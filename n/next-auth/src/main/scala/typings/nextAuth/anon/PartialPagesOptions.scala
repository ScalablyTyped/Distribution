package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/core/types.PagesOptions> */
trait PartialPagesOptions extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var newUser: js.UndefOr[String] = js.undefined
  
  var signIn: js.UndefOr[String] = js.undefined
  
  var signOut: js.UndefOr[String] = js.undefined
  
  var verifyRequest: js.UndefOr[String] = js.undefined
}
object PartialPagesOptions {
  
  inline def apply(): PartialPagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPagesOptions]
  }
  
  extension [Self <: PartialPagesOptions](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNewUser(value: String): Self = StObject.set(x, "newUser", value.asInstanceOf[js.Any])
    
    inline def setNewUserUndefined: Self = StObject.set(x, "newUser", js.undefined)
    
    inline def setSignIn(value: String): Self = StObject.set(x, "signIn", value.asInstanceOf[js.Any])
    
    inline def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
    
    inline def setSignOut(value: String): Self = StObject.set(x, "signOut", value.asInstanceOf[js.Any])
    
    inline def setSignOutUndefined: Self = StObject.set(x, "signOut", js.undefined)
    
    inline def setVerifyRequest(value: String): Self = StObject.set(x, "verifyRequest", value.asInstanceOf[js.Any])
    
    inline def setVerifyRequestUndefined: Self = StObject.set(x, "verifyRequest", js.undefined)
  }
}

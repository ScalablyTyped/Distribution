package typings.nextAuth.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagesOptions extends StObject {
  
  /** Error code passed in query string as ?error= */
  var error: String
  
  /** If set, new users will be directed here on first sign in */
  var newUser: String
  
  var signIn: String
  
  var signOut: String
  
  var verifyRequest: String
}
object PagesOptions {
  
  inline def apply(error: String, newUser: String, signIn: String, signOut: String, verifyRequest: String): PagesOptions = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], newUser = newUser.asInstanceOf[js.Any], signIn = signIn.asInstanceOf[js.Any], signOut = signOut.asInstanceOf[js.Any], verifyRequest = verifyRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagesOptions]
  }
  
  extension [Self <: PagesOptions](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNewUser(value: String): Self = StObject.set(x, "newUser", value.asInstanceOf[js.Any])
    
    inline def setSignIn(value: String): Self = StObject.set(x, "signIn", value.asInstanceOf[js.Any])
    
    inline def setSignOut(value: String): Self = StObject.set(x, "signOut", value.asInstanceOf[js.Any])
    
    inline def setVerifyRequest(value: String): Self = StObject.set(x, "verifyRequest", value.asInstanceOf[js.Any])
  }
}

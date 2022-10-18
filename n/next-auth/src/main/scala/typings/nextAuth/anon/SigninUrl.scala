package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigninUrl extends StObject {
  
  var callbackUrl: String
  
  var signinUrl: String
}
object SigninUrl {
  
  inline def apply(callbackUrl: String, signinUrl: String): SigninUrl = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigninUrl]
  }
  
  extension [Self <: SigninUrl](x: Self) {
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
  }
}

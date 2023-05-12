package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsAuthenticationMethodTarget
  extends StObject
     with AuthenticationMethodTarget {
  
  /**
    * Determines if users can use this authentication method to sign in to Azure AD. true if users can use this method for
    * primary authentication, otherwise false.
    */
  var isUsableForSignIn: js.UndefOr[Boolean] = js.undefined
}
object SmsAuthenticationMethodTarget {
  
  inline def apply(): SmsAuthenticationMethodTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsAuthenticationMethodTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmsAuthenticationMethodTarget] (val x: Self) extends AnyVal {
    
    inline def setIsUsableForSignIn(value: Boolean): Self = StObject.set(x, "isUsableForSignIn", value.asInstanceOf[js.Any])
    
    inline def setIsUsableForSignInUndefined: Self = StObject.set(x, "isUsableForSignIn", js.undefined)
  }
}

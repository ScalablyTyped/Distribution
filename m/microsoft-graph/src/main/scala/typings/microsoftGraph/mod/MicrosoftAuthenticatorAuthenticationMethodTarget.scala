package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftAuthenticatorAuthenticationMethodTarget
  extends StObject
     with AuthenticationMethodTarget {
  
  /**
    * Determines which types of notifications can be used for sign-in. Possible values are: any, deviceBasedPush
    * (passwordless only), push.
    */
  var authenticationMode: js.UndefOr[MicrosoftAuthenticatorAuthenticationMode] = js.undefined
}
object MicrosoftAuthenticatorAuthenticationMethodTarget {
  
  inline def apply(): MicrosoftAuthenticatorAuthenticationMethodTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftAuthenticatorAuthenticationMethodTarget]
  }
  
  extension [Self <: MicrosoftAuthenticatorAuthenticationMethodTarget](x: Self) {
    
    inline def setAuthenticationMode(value: MicrosoftAuthenticatorAuthenticationMode): Self = StObject.set(x, "authenticationMode", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationModeUndefined: Self = StObject.set(x, "authenticationMode", js.undefined)
  }
}

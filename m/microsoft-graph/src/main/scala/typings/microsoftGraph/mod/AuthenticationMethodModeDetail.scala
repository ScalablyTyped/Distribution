package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodModeDetail
  extends StObject
     with Entity {
  
  /**
    * The authentication method that this mode modifies. The possible values are: password, voice, hardwareOath,
    * softwareOath, sms, fido2, windowsHelloForBusiness, microsoftAuthenticator, temporaryAccessPass, email, x509Certificate,
    * federation, unknownFutureValue.
    */
  var authenticationMethod: js.UndefOr[BaseAuthenticationMethod] = js.undefined
  
  // The display name of this mode
  var displayName: js.UndefOr[String] = js.undefined
}
object AuthenticationMethodModeDetail {
  
  inline def apply(): AuthenticationMethodModeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodModeDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodModeDetail] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethod(value: BaseAuthenticationMethod): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}

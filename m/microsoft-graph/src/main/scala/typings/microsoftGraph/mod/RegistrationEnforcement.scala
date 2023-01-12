package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationEnforcement extends StObject {
  
  // Run campaigns to remind users to set up targeted authentication methods.
  var authenticationMethodsRegistrationCampaign: js.UndefOr[NullableOption[AuthenticationMethodsRegistrationCampaign]] = js.undefined
}
object RegistrationEnforcement {
  
  inline def apply(): RegistrationEnforcement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationEnforcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistrationEnforcement] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethodsRegistrationCampaign(value: NullableOption[AuthenticationMethodsRegistrationCampaign]): Self = StObject.set(x, "authenticationMethodsRegistrationCampaign", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodsRegistrationCampaignNull: Self = StObject.set(x, "authenticationMethodsRegistrationCampaign", null)
    
    inline def setAuthenticationMethodsRegistrationCampaignUndefined: Self = StObject.set(x, "authenticationMethodsRegistrationCampaign", js.undefined)
  }
}

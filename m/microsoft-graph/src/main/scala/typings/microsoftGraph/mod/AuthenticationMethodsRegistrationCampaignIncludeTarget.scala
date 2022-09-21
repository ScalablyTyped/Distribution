package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodsRegistrationCampaignIncludeTarget extends StObject {
  
  // The object identifier of an Azure Active Directory user or group.
  var id: js.UndefOr[String] = js.undefined
  
  // The type of the authentication method target. Possible values are: user, group, unknownFutureValue.
  var targetType: js.UndefOr[AuthenticationMethodTargetType] = js.undefined
  
  // The authentication method that the user is prompted to register. The value must be microsoftAuthenticator.
  var targetedAuthenticationMethod: js.UndefOr[NullableOption[String]] = js.undefined
}
object AuthenticationMethodsRegistrationCampaignIncludeTarget {
  
  inline def apply(): AuthenticationMethodsRegistrationCampaignIncludeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodsRegistrationCampaignIncludeTarget]
  }
  
  extension [Self <: AuthenticationMethodsRegistrationCampaignIncludeTarget](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTargetType(value: AuthenticationMethodTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTargetedAuthenticationMethod(value: NullableOption[String]): Self = StObject.set(x, "targetedAuthenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetedAuthenticationMethodNull: Self = StObject.set(x, "targetedAuthenticationMethod", null)
    
    inline def setTargetedAuthenticationMethodUndefined: Self = StObject.set(x, "targetedAuthenticationMethod", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  /**
    * Determines whether email OTP is usable by external users for authentication. Possible values are: default, enabled,
    * disabled, unknownFutureValue. Tenants in the default state who did not use public preview will automatically have email
    * OTP enabled beginning in October 2021.
    */
  var allowExternalIdToUseEmailOtp: js.UndefOr[NullableOption[ExternalEmailOtpState]] = js.undefined
  
  // A collection of users or groups who are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[AuthenticationMethodTarget]]] = js.undefined
}
object EmailAuthenticationMethodConfiguration {
  
  inline def apply(): EmailAuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailAuthenticationMethodConfiguration]
  }
  
  extension [Self <: EmailAuthenticationMethodConfiguration](x: Self) {
    
    inline def setAllowExternalIdToUseEmailOtp(value: NullableOption[ExternalEmailOtpState]): Self = StObject.set(x, "allowExternalIdToUseEmailOtp", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalIdToUseEmailOtpNull: Self = StObject.set(x, "allowExternalIdToUseEmailOtp", null)
    
    inline def setAllowExternalIdToUseEmailOtpUndefined: Self = StObject.set(x, "allowExternalIdToUseEmailOtp", js.undefined)
    
    inline def setIncludeTargets(value: NullableOption[js.Array[AuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
  }
}

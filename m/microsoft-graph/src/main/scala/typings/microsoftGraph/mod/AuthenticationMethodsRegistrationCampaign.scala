package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodsRegistrationCampaign extends StObject {
  
  // Users and groups of users that are excluded from being prompted to set up the authentication method.
  var excludeTargets: js.UndefOr[js.Array[ExcludeTarget]] = js.undefined
  
  // Users and groups of users that are prompted to set up the authentication method.
  var includeTargets: js.UndefOr[js.Array[AuthenticationMethodsRegistrationCampaignIncludeTarget]] = js.undefined
  
  /**
    * Specifies the number of days that the user sees a prompt again if they select 'Not now' and snoozes the prompt.
    * Minimum: 0 days. Maximum: 14 days. If the value is '0', the user is prompted during every MFA attempt.
    */
  var snoozeDurationInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value
    * is used when the configuration hasn't been explicitly set and uses the default behavior of Azure Active Directory for
    * the setting. The default value is disabled.
    */
  var state: js.UndefOr[AdvancedConfigState] = js.undefined
}
object AuthenticationMethodsRegistrationCampaign {
  
  inline def apply(): AuthenticationMethodsRegistrationCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodsRegistrationCampaign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodsRegistrationCampaign] (val x: Self) extends AnyVal {
    
    inline def setExcludeTargets(value: js.Array[ExcludeTarget]): Self = StObject.set(x, "excludeTargets", value.asInstanceOf[js.Any])
    
    inline def setExcludeTargetsUndefined: Self = StObject.set(x, "excludeTargets", js.undefined)
    
    inline def setExcludeTargetsVarargs(value: ExcludeTarget*): Self = StObject.set(x, "excludeTargets", js.Array(value*))
    
    inline def setIncludeTargets(value: js.Array[AuthenticationMethodsRegistrationCampaignIncludeTarget]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodsRegistrationCampaignIncludeTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
    
    inline def setSnoozeDurationInDays(value: Double): Self = StObject.set(x, "snoozeDurationInDays", value.asInstanceOf[js.Any])
    
    inline def setSnoozeDurationInDaysUndefined: Self = StObject.set(x, "snoozeDurationInDays", js.undefined)
    
    inline def setState(value: AdvancedConfigState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessConditionSet extends StObject {
  
  // Applications and user actions included in and excluded from the policy. Required.
  var applications: js.UndefOr[NullableOption[ConditionalAccessApplications]] = js.native
  
  /**
    * Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients,
    * exchangeActiveSync, easSupported, other.
    */
  var clientAppTypes: js.UndefOr[js.Array[ConditionalAccessClientApp]] = js.native
  
  // Locations included in and excluded from the policy.
  var locations: js.UndefOr[NullableOption[ConditionalAccessLocations]] = js.native
  
  // Platforms included in and excluded from the policy.
  var platforms: js.UndefOr[NullableOption[ConditionalAccessPlatforms]] = js.native
  
  // Risk levels included in the policy. Possible values are: low, medium, high, none.
  var signInRiskLevels: js.UndefOr[js.Array[RiskLevel]] = js.native
  
  // Users, groups, and roles included in and excluded from the policy. Required.
  var users: js.UndefOr[ConditionalAccessUsers] = js.native
}
object ConditionalAccessConditionSet {
  
  @scala.inline
  def apply(): ConditionalAccessConditionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessConditionSet]
  }
  
  @scala.inline
  implicit class ConditionalAccessConditionSetMutableBuilder[Self <: ConditionalAccessConditionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: NullableOption[ConditionalAccessApplications]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsNull: Self = StObject.set(x, "applications", null)
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setClientAppTypes(value: js.Array[ConditionalAccessClientApp]): Self = StObject.set(x, "clientAppTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAppTypesUndefined: Self = StObject.set(x, "clientAppTypes", js.undefined)
    
    @scala.inline
    def setClientAppTypesVarargs(value: ConditionalAccessClientApp*): Self = StObject.set(x, "clientAppTypes", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: NullableOption[ConditionalAccessLocations]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setPlatforms(value: NullableOption[ConditionalAccessPlatforms]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsNull: Self = StObject.set(x, "platforms", null)
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setSignInRiskLevels(value: js.Array[RiskLevel]): Self = StObject.set(x, "signInRiskLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInRiskLevelsUndefined: Self = StObject.set(x, "signInRiskLevels", js.undefined)
    
    @scala.inline
    def setSignInRiskLevelsVarargs(value: RiskLevel*): Self = StObject.set(x, "signInRiskLevels", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: ConditionalAccessUsers): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessConditionSet extends StObject {
  
  // Applications and user actions included in and excluded from the policy. Required.
  var applications: js.UndefOr[NullableOption[ConditionalAccessApplications]] = js.undefined
  
  /**
    * Client application types included in the policy. Possible values are: all, browser, mobileAppsAndDesktopClients,
    * exchangeActiveSync, easSupported, other. Required.
    */
  var clientAppTypes: js.UndefOr[js.Array[ConditionalAccessClientApp]] = js.undefined
  
  /**
    * Client applications (service principals and workload identities) included in and excluded from the policy. Either users
    * or clientApplications is required.
    */
  var clientApplications: js.UndefOr[NullableOption[ConditionalAccessClientApplications]] = js.undefined
  
  // Devices in the policy.
  var devices: js.UndefOr[NullableOption[ConditionalAccessDevices]] = js.undefined
  
  // Locations included in and excluded from the policy.
  var locations: js.UndefOr[NullableOption[ConditionalAccessLocations]] = js.undefined
  
  // Platforms included in and excluded from the policy.
  var platforms: js.UndefOr[NullableOption[ConditionalAccessPlatforms]] = js.undefined
  
  var servicePrincipalRiskLevels: js.UndefOr[js.Array[RiskLevel]] = js.undefined
  
  /**
    * Sign-in risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
    * Required.
    */
  var signInRiskLevels: js.UndefOr[js.Array[RiskLevel]] = js.undefined
  
  /**
    * User risk levels included in the policy. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
    * Required.
    */
  var userRiskLevels: js.UndefOr[js.Array[RiskLevel]] = js.undefined
  
  // Users, groups, and roles included in and excluded from the policy. Required.
  var users: js.UndefOr[NullableOption[ConditionalAccessUsers]] = js.undefined
}
object ConditionalAccessConditionSet {
  
  inline def apply(): ConditionalAccessConditionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessConditionSet]
  }
  
  extension [Self <: ConditionalAccessConditionSet](x: Self) {
    
    inline def setApplications(value: NullableOption[ConditionalAccessApplications]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsNull: Self = StObject.set(x, "applications", null)
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setClientAppTypes(value: js.Array[ConditionalAccessClientApp]): Self = StObject.set(x, "clientAppTypes", value.asInstanceOf[js.Any])
    
    inline def setClientAppTypesUndefined: Self = StObject.set(x, "clientAppTypes", js.undefined)
    
    inline def setClientAppTypesVarargs(value: ConditionalAccessClientApp*): Self = StObject.set(x, "clientAppTypes", js.Array(value*))
    
    inline def setClientApplications(value: NullableOption[ConditionalAccessClientApplications]): Self = StObject.set(x, "clientApplications", value.asInstanceOf[js.Any])
    
    inline def setClientApplicationsNull: Self = StObject.set(x, "clientApplications", null)
    
    inline def setClientApplicationsUndefined: Self = StObject.set(x, "clientApplications", js.undefined)
    
    inline def setDevices(value: NullableOption[ConditionalAccessDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesNull: Self = StObject.set(x, "devices", null)
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setLocations(value: NullableOption[ConditionalAccessLocations]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setPlatforms(value: NullableOption[ConditionalAccessPlatforms]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsNull: Self = StObject.set(x, "platforms", null)
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setServicePrincipalRiskLevels(value: js.Array[RiskLevel]): Self = StObject.set(x, "servicePrincipalRiskLevels", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalRiskLevelsUndefined: Self = StObject.set(x, "servicePrincipalRiskLevels", js.undefined)
    
    inline def setServicePrincipalRiskLevelsVarargs(value: RiskLevel*): Self = StObject.set(x, "servicePrincipalRiskLevels", js.Array(value*))
    
    inline def setSignInRiskLevels(value: js.Array[RiskLevel]): Self = StObject.set(x, "signInRiskLevels", value.asInstanceOf[js.Any])
    
    inline def setSignInRiskLevelsUndefined: Self = StObject.set(x, "signInRiskLevels", js.undefined)
    
    inline def setSignInRiskLevelsVarargs(value: RiskLevel*): Self = StObject.set(x, "signInRiskLevels", js.Array(value*))
    
    inline def setUserRiskLevels(value: js.Array[RiskLevel]): Self = StObject.set(x, "userRiskLevels", value.asInstanceOf[js.Any])
    
    inline def setUserRiskLevelsUndefined: Self = StObject.set(x, "userRiskLevels", js.undefined)
    
    inline def setUserRiskLevelsVarargs(value: RiskLevel*): Self = StObject.set(x, "userRiskLevels", js.Array(value*))
    
    inline def setUsers(value: NullableOption[ConditionalAccessUsers]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersNull: Self = StObject.set(x, "users", null)
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
  }
}

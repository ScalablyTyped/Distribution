package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessConditionSet extends js.Object {
  
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
  implicit class ConditionalAccessConditionSetOps[Self <: ConditionalAccessConditionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplications(value: NullableOption[ConditionalAccessApplications]): Self = this.set("applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    
    @scala.inline
    def setApplicationsNull: Self = this.set("applications", null)
    
    @scala.inline
    def setClientAppTypesVarargs(value: ConditionalAccessClientApp*): Self = this.set("clientAppTypes", js.Array(value :_*))
    
    @scala.inline
    def setClientAppTypes(value: js.Array[ConditionalAccessClientApp]): Self = this.set("clientAppTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAppTypes: Self = this.set("clientAppTypes", js.undefined)
    
    @scala.inline
    def setLocations(value: NullableOption[ConditionalAccessLocations]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    
    @scala.inline
    def setPlatforms(value: NullableOption[ConditionalAccessPlatforms]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setPlatformsNull: Self = this.set("platforms", null)
    
    @scala.inline
    def setSignInRiskLevelsVarargs(value: RiskLevel*): Self = this.set("signInRiskLevels", js.Array(value :_*))
    
    @scala.inline
    def setSignInRiskLevels(value: js.Array[RiskLevel]): Self = this.set("signInRiskLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInRiskLevels: Self = this.set("signInRiskLevels", js.undefined)
    
    @scala.inline
    def setUsers(value: ConditionalAccessUsers): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}

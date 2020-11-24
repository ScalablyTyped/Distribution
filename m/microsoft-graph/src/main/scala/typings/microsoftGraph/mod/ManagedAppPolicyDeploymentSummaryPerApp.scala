package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppPolicyDeploymentSummaryPerApp extends js.Object {
  
  // Number of users the policy is applied.
  var configurationAppliedUserCount: js.UndefOr[Double] = js.native
  
  // Deployment of an app.
  var mobileAppIdentifier: js.UndefOr[NullableOption[MobileAppIdentifier]] = js.native
}
object ManagedAppPolicyDeploymentSummaryPerApp {
  
  @scala.inline
  def apply(): ManagedAppPolicyDeploymentSummaryPerApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummaryPerApp]
  }
  
  @scala.inline
  implicit class ManagedAppPolicyDeploymentSummaryPerAppOps[Self <: ManagedAppPolicyDeploymentSummaryPerApp] (val x: Self) extends AnyVal {
    
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
    def setConfigurationAppliedUserCount(value: Double): Self = this.set("configurationAppliedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationAppliedUserCount: Self = this.set("configurationAppliedUserCount", js.undefined)
    
    @scala.inline
    def setMobileAppIdentifier(value: NullableOption[MobileAppIdentifier]): Self = this.set("mobileAppIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileAppIdentifier: Self = this.set("mobileAppIdentifier", js.undefined)
    
    @scala.inline
    def setMobileAppIdentifierNull: Self = this.set("mobileAppIdentifier", null)
  }
}

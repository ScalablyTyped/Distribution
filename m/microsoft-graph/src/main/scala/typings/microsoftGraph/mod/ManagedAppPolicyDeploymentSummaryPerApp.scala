package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppPolicyDeploymentSummaryPerApp extends StObject {
  
  // Number of users the policy is applied.
  var configurationAppliedUserCount: js.UndefOr[Double] = js.undefined
  
  // Deployment of an app.
  var mobileAppIdentifier: js.UndefOr[NullableOption[MobileAppIdentifier]] = js.undefined
}
object ManagedAppPolicyDeploymentSummaryPerApp {
  
  @scala.inline
  def apply(): ManagedAppPolicyDeploymentSummaryPerApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummaryPerApp]
  }
  
  @scala.inline
  implicit class ManagedAppPolicyDeploymentSummaryPerAppMutableBuilder[Self <: ManagedAppPolicyDeploymentSummaryPerApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationAppliedUserCount(value: Double): Self = StObject.set(x, "configurationAppliedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAppliedUserCountUndefined: Self = StObject.set(x, "configurationAppliedUserCount", js.undefined)
    
    @scala.inline
    def setMobileAppIdentifier(value: NullableOption[MobileAppIdentifier]): Self = StObject.set(x, "mobileAppIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileAppIdentifierNull: Self = StObject.set(x, "mobileAppIdentifier", null)
    
    @scala.inline
    def setMobileAppIdentifierUndefined: Self = StObject.set(x, "mobileAppIdentifier", js.undefined)
  }
}

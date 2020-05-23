package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppPolicyDeploymentSummaryPerApp extends js.Object {
  // Number of users the policy is applied.
  var configurationAppliedUserCount: js.UndefOr[Double] = js.undefined
  // Deployment of an app.
  var mobileAppIdentifier: js.UndefOr[MobileAppIdentifier] = js.undefined
}

object ManagedAppPolicyDeploymentSummaryPerApp {
  @scala.inline
  def apply(
    configurationAppliedUserCount: js.UndefOr[Double] = js.undefined,
    mobileAppIdentifier: MobileAppIdentifier = null
  ): ManagedAppPolicyDeploymentSummaryPerApp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurationAppliedUserCount)) __obj.updateDynamic("configurationAppliedUserCount")(configurationAppliedUserCount.get.asInstanceOf[js.Any])
    if (mobileAppIdentifier != null) __obj.updateDynamic("mobileAppIdentifier")(mobileAppIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummaryPerApp]
  }
}


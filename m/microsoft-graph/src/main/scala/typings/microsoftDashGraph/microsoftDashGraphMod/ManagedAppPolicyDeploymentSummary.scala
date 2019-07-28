package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppPolicyDeploymentSummary extends Entity {
  // Not yet documented
  var configurationDeployedUserCount: js.UndefOr[Double] = js.undefined
  // Not yet documented
  var configurationDeploymentSummaryPerApp: js.UndefOr[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]] = js.undefined
  // Not yet documented
  var displayName: js.UndefOr[String] = js.undefined
  // Not yet documented
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object ManagedAppPolicyDeploymentSummary {
  @scala.inline
  def apply(
    configurationDeployedUserCount: Int | Double = null,
    configurationDeploymentSummaryPerApp: js.Array[ManagedAppPolicyDeploymentSummaryPerApp] = null,
    displayName: String = null,
    id: String = null,
    lastRefreshTime: String = null,
    version: String = null
  ): ManagedAppPolicyDeploymentSummary = {
    val __obj = js.Dynamic.literal()
    if (configurationDeployedUserCount != null) __obj.updateDynamic("configurationDeployedUserCount")(configurationDeployedUserCount.asInstanceOf[js.Any])
    if (configurationDeploymentSummaryPerApp != null) __obj.updateDynamic("configurationDeploymentSummaryPerApp")(configurationDeploymentSummaryPerApp)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastRefreshTime != null) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummary]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppPolicyDeploymentSummary extends Entity {
  // Not yet documented
  var configurationDeployedUserCount: js.UndefOr[scala.Double] = js.undefined
  // Not yet documented
  var configurationDeploymentSummaryPerApp: js.UndefOr[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]] = js.undefined
  // Not yet documented
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Not yet documented
  var lastRefreshTime: js.UndefOr[java.lang.String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppPolicyDeploymentSummary {
  @scala.inline
  def apply(
    configurationDeployedUserCount: scala.Int | scala.Double = null,
    configurationDeploymentSummaryPerApp: js.Array[ManagedAppPolicyDeploymentSummaryPerApp] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastRefreshTime: java.lang.String = null,
    version: java.lang.String = null
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


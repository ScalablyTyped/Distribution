package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationUserOverview extends Entity {
  // Version of the policy for that overview
  var configurationVersion: js.UndefOr[Double] = js.undefined
  // Number of error Users
  var errorCount: js.UndefOr[Double] = js.undefined
  // Number of failed Users
  var failedCount: js.UndefOr[Double] = js.undefined
  // Last update time
  var lastUpdateDateTime: js.UndefOr[String] = js.undefined
  // Number of not applicable users
  var notApplicableCount: js.UndefOr[Double] = js.undefined
  // Number of pending Users
  var pendingCount: js.UndefOr[Double] = js.undefined
  // Number of succeeded Users
  var successCount: js.UndefOr[Double] = js.undefined
}

object DeviceConfigurationUserOverview {
  @scala.inline
  def apply(
    configurationVersion: js.UndefOr[Double] = js.undefined,
    errorCount: js.UndefOr[Double] = js.undefined,
    failedCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    lastUpdateDateTime: String = null,
    notApplicableCount: js.UndefOr[Double] = js.undefined,
    pendingCount: js.UndefOr[Double] = js.undefined,
    successCount: js.UndefOr[Double] = js.undefined
  ): DeviceConfigurationUserOverview = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurationVersion)) __obj.updateDynamic("configurationVersion")(configurationVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorCount)) __obj.updateDynamic("errorCount")(errorCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failedCount)) __obj.updateDynamic("failedCount")(failedCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastUpdateDateTime != null) __obj.updateDynamic("lastUpdateDateTime")(lastUpdateDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableCount)) __obj.updateDynamic("notApplicableCount")(notApplicableCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingCount)) __obj.updateDynamic("pendingCount")(pendingCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(successCount)) __obj.updateDynamic("successCount")(successCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationUserOverview]
  }
}


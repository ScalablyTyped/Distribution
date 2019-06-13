package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationUserOverview extends Entity {
  /** Version of the policy for that overview */
  var configurationVersion: js.UndefOr[scala.Double] = js.undefined
  /** Number of error Users */
  var errorCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of failed Users */
  var failedCount: js.UndefOr[scala.Double] = js.undefined
  /** Last update time */
  var lastUpdateDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Number of not applicable users */
  var notApplicableCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of pending Users */
  var pendingCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of succeeded Users */
  var successCount: js.UndefOr[scala.Double] = js.undefined
}

object DeviceConfigurationUserOverview {
  @scala.inline
  def apply(
    configurationVersion: scala.Int | scala.Double = null,
    errorCount: scala.Int | scala.Double = null,
    failedCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    lastUpdateDateTime: java.lang.String = null,
    notApplicableCount: scala.Int | scala.Double = null,
    pendingCount: scala.Int | scala.Double = null,
    successCount: scala.Int | scala.Double = null
  ): DeviceConfigurationUserOverview = {
    val __obj = js.Dynamic.literal()
    if (configurationVersion != null) __obj.updateDynamic("configurationVersion")(configurationVersion.asInstanceOf[js.Any])
    if (errorCount != null) __obj.updateDynamic("errorCount")(errorCount.asInstanceOf[js.Any])
    if (failedCount != null) __obj.updateDynamic("failedCount")(failedCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastUpdateDateTime != null) __obj.updateDynamic("lastUpdateDateTime")(lastUpdateDateTime)
    if (notApplicableCount != null) __obj.updateDynamic("notApplicableCount")(notApplicableCount.asInstanceOf[js.Any])
    if (pendingCount != null) __obj.updateDynamic("pendingCount")(pendingCount.asInstanceOf[js.Any])
    if (successCount != null) __obj.updateDynamic("successCount")(successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationUserOverview]
  }
}


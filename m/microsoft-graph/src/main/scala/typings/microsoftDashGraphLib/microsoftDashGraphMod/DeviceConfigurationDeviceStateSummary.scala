package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceConfigurationDeviceStateSummary extends Entity {
  /** Number of compliant devices */
  var compliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of conflict devices */
  var conflictDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of error devices */
  var errorDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of NonCompliant devices */
  var nonCompliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of not applicable devices */
  var notApplicableDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of remediated devices */
  var remediatedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of unknown devices */
  var unknownDeviceCount: js.UndefOr[scala.Double] = js.undefined
}

object DeviceConfigurationDeviceStateSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: scala.Int | scala.Double = null,
    conflictDeviceCount: scala.Int | scala.Double = null,
    errorDeviceCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    nonCompliantDeviceCount: scala.Int | scala.Double = null,
    notApplicableDeviceCount: scala.Int | scala.Double = null,
    remediatedDeviceCount: scala.Int | scala.Double = null,
    unknownDeviceCount: scala.Int | scala.Double = null
  ): DeviceConfigurationDeviceStateSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfigurationDeviceStateSummary]
  }
}


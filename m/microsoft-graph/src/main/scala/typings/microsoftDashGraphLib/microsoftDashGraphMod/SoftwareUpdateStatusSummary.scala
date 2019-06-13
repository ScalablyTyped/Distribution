package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareUpdateStatusSummary extends Entity {
  /** Number of compliant devices. */
  var compliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of compliant users. */
  var compliantUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of conflict devices. */
  var conflictDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of conflict users. */
  var conflictUserCount: js.UndefOr[scala.Double] = js.undefined
  /** The name of the policy. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Number of devices had error. */
  var errorDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of users had error. */
  var errorUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of non compliant devices. */
  var nonCompliantDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of non compliant users. */
  var nonCompliantUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of not applicable devices. */
  var notApplicableDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of not applicable users. */
  var notApplicableUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of remediated devices. */
  var remediatedDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of remediated users. */
  var remediatedUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of unknown devices. */
  var unknownDeviceCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of unknown users. */
  var unknownUserCount: js.UndefOr[scala.Double] = js.undefined
}

object SoftwareUpdateStatusSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: scala.Int | scala.Double = null,
    compliantUserCount: scala.Int | scala.Double = null,
    conflictDeviceCount: scala.Int | scala.Double = null,
    conflictUserCount: scala.Int | scala.Double = null,
    displayName: java.lang.String = null,
    errorDeviceCount: scala.Int | scala.Double = null,
    errorUserCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    nonCompliantDeviceCount: scala.Int | scala.Double = null,
    nonCompliantUserCount: scala.Int | scala.Double = null,
    notApplicableDeviceCount: scala.Int | scala.Double = null,
    notApplicableUserCount: scala.Int | scala.Double = null,
    remediatedDeviceCount: scala.Int | scala.Double = null,
    remediatedUserCount: scala.Int | scala.Double = null,
    unknownDeviceCount: scala.Int | scala.Double = null,
    unknownUserCount: scala.Int | scala.Double = null
  ): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (compliantUserCount != null) __obj.updateDynamic("compliantUserCount")(compliantUserCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (conflictUserCount != null) __obj.updateDynamic("conflictUserCount")(conflictUserCount.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (errorUserCount != null) __obj.updateDynamic("errorUserCount")(errorUserCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (nonCompliantDeviceCount != null) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.asInstanceOf[js.Any])
    if (nonCompliantUserCount != null) __obj.updateDynamic("nonCompliantUserCount")(nonCompliantUserCount.asInstanceOf[js.Any])
    if (notApplicableDeviceCount != null) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.asInstanceOf[js.Any])
    if (notApplicableUserCount != null) __obj.updateDynamic("notApplicableUserCount")(notApplicableUserCount.asInstanceOf[js.Any])
    if (remediatedDeviceCount != null) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.asInstanceOf[js.Any])
    if (remediatedUserCount != null) __obj.updateDynamic("remediatedUserCount")(remediatedUserCount.asInstanceOf[js.Any])
    if (unknownDeviceCount != null) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.asInstanceOf[js.Any])
    if (unknownUserCount != null) __obj.updateDynamic("unknownUserCount")(unknownUserCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareUpdateStatusSummary]
  }
}


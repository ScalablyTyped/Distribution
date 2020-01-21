package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftwareUpdateStatusSummary extends Entity {
  // Number of compliant devices.
  var compliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of compliant users.
  var compliantUserCount: js.UndefOr[Double] = js.undefined
  // Number of conflict devices.
  var conflictDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of conflict users.
  var conflictUserCount: js.UndefOr[Double] = js.undefined
  // The name of the policy.
  var displayName: js.UndefOr[String] = js.undefined
  // Number of devices had error.
  var errorDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of users had error.
  var errorUserCount: js.UndefOr[Double] = js.undefined
  // Number of non compliant devices.
  var nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of non compliant users.
  var nonCompliantUserCount: js.UndefOr[Double] = js.undefined
  // Number of not applicable devices.
  var notApplicableDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of not applicable users.
  var notApplicableUserCount: js.UndefOr[Double] = js.undefined
  // Number of remediated devices.
  var remediatedDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of remediated users.
  var remediatedUserCount: js.UndefOr[Double] = js.undefined
  // Number of unknown devices.
  var unknownDeviceCount: js.UndefOr[Double] = js.undefined
  // Number of unknown users.
  var unknownUserCount: js.UndefOr[Double] = js.undefined
}

object SoftwareUpdateStatusSummary {
  @scala.inline
  def apply(
    compliantDeviceCount: Int | Double = null,
    compliantUserCount: Int | Double = null,
    conflictDeviceCount: Int | Double = null,
    conflictUserCount: Int | Double = null,
    displayName: String = null,
    errorDeviceCount: Int | Double = null,
    errorUserCount: Int | Double = null,
    id: String = null,
    nonCompliantDeviceCount: Int | Double = null,
    nonCompliantUserCount: Int | Double = null,
    notApplicableDeviceCount: Int | Double = null,
    notApplicableUserCount: Int | Double = null,
    remediatedDeviceCount: Int | Double = null,
    remediatedUserCount: Int | Double = null,
    unknownDeviceCount: Int | Double = null,
    unknownUserCount: Int | Double = null
  ): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    if (compliantDeviceCount != null) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.asInstanceOf[js.Any])
    if (compliantUserCount != null) __obj.updateDynamic("compliantUserCount")(compliantUserCount.asInstanceOf[js.Any])
    if (conflictDeviceCount != null) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.asInstanceOf[js.Any])
    if (conflictUserCount != null) __obj.updateDynamic("conflictUserCount")(conflictUserCount.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (errorDeviceCount != null) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.asInstanceOf[js.Any])
    if (errorUserCount != null) __obj.updateDynamic("errorUserCount")(errorUserCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
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


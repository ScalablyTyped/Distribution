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
    compliantDeviceCount: js.UndefOr[Double] = js.undefined,
    compliantUserCount: js.UndefOr[Double] = js.undefined,
    conflictDeviceCount: js.UndefOr[Double] = js.undefined,
    conflictUserCount: js.UndefOr[Double] = js.undefined,
    displayName: String = null,
    errorDeviceCount: js.UndefOr[Double] = js.undefined,
    errorUserCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    nonCompliantDeviceCount: js.UndefOr[Double] = js.undefined,
    nonCompliantUserCount: js.UndefOr[Double] = js.undefined,
    notApplicableDeviceCount: js.UndefOr[Double] = js.undefined,
    notApplicableUserCount: js.UndefOr[Double] = js.undefined,
    remediatedDeviceCount: js.UndefOr[Double] = js.undefined,
    remediatedUserCount: js.UndefOr[Double] = js.undefined,
    unknownDeviceCount: js.UndefOr[Double] = js.undefined,
    unknownUserCount: js.UndefOr[Double] = js.undefined
  ): SoftwareUpdateStatusSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compliantDeviceCount)) __obj.updateDynamic("compliantDeviceCount")(compliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compliantUserCount)) __obj.updateDynamic("compliantUserCount")(compliantUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflictDeviceCount)) __obj.updateDynamic("conflictDeviceCount")(conflictDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conflictUserCount)) __obj.updateDynamic("conflictUserCount")(conflictUserCount.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(errorDeviceCount)) __obj.updateDynamic("errorDeviceCount")(errorDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorUserCount)) __obj.updateDynamic("errorUserCount")(errorUserCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantDeviceCount)) __obj.updateDynamic("nonCompliantDeviceCount")(nonCompliantDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantUserCount)) __obj.updateDynamic("nonCompliantUserCount")(nonCompliantUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableDeviceCount)) __obj.updateDynamic("notApplicableDeviceCount")(notApplicableDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notApplicableUserCount)) __obj.updateDynamic("notApplicableUserCount")(notApplicableUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remediatedDeviceCount)) __obj.updateDynamic("remediatedDeviceCount")(remediatedDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remediatedUserCount)) __obj.updateDynamic("remediatedUserCount")(remediatedUserCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownDeviceCount)) __obj.updateDynamic("unknownDeviceCount")(unknownDeviceCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownUserCount)) __obj.updateDynamic("unknownUserCount")(unknownUserCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareUpdateStatusSummary]
  }
}


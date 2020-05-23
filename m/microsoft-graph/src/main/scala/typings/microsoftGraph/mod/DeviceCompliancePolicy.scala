package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCompliancePolicy extends Entity {
  // The collection of assignments for this compliance policy.
  var assignments: js.UndefOr[js.Array[DeviceCompliancePolicyAssignment]] = js.undefined
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Admin provided description of the Device Configuration.
  var description: js.UndefOr[String] = js.undefined
  // Compliance Setting State Device Summary
  var deviceSettingStateSummaries: js.UndefOr[js.Array[SettingStateDeviceSummary]] = js.undefined
  // Device compliance devices status overview
  var deviceStatusOverview: js.UndefOr[DeviceComplianceDeviceOverview] = js.undefined
  // List of DeviceComplianceDeviceStatus.
  var deviceStatuses: js.UndefOr[js.Array[DeviceComplianceDeviceStatus]] = js.undefined
  // Admin provided name of the device configuration.
  var displayName: js.UndefOr[String] = js.undefined
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The list of scheduled action for this rule
  var scheduledActionsForRule: js.UndefOr[js.Array[DeviceComplianceScheduledActionForRule]] = js.undefined
  // Device compliance users status overview
  var userStatusOverview: js.UndefOr[DeviceComplianceUserOverview] = js.undefined
  // List of DeviceComplianceUserStatus.
  var userStatuses: js.UndefOr[js.Array[DeviceComplianceUserStatus]] = js.undefined
  // Version of the device configuration.
  var version: js.UndefOr[Double] = js.undefined
}

object DeviceCompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): DeviceCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCompliancePolicy]
  }
}


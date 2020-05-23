package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsPhone81CompliancePolicy extends DeviceCompliancePolicy {
  // Maximum Windows Phone version.
  var osMaximumVersion: js.UndefOr[String] = js.undefined
  // Minimum Windows Phone version.
  var osMinimumVersion: js.UndefOr[String] = js.undefined
  // Whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Require encryption on windows phone devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
}

object WindowsPhone81CompliancePolicy {
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
    osMaximumVersion: String = null,
    osMinimumVersion: String = null,
    passwordBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    storageRequireEncryption: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): WindowsPhone81CompliancePolicy = {
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
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion.asInstanceOf[js.Any])
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumCharacterSetCount)) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeLock)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsPhone81CompliancePolicy]
  }
}


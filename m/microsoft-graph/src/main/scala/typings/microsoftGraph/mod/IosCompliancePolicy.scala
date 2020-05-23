package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection .
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  // Indicates whether or not to require a managed email profile.
  var managedEmailProfileRequired: js.UndefOr[Boolean] = js.undefined
  // Maximum IOS version.
  var osMaximumVersion: js.UndefOr[String] = js.undefined
  // Minimum IOS version.
  var osMinimumVersion: js.UndefOr[String] = js.undefined
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.undefined
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.undefined
  // The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.undefined
}

object IosCompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
    deviceThreatProtectionRequiredSecurityLevel: DeviceThreatProtectionLevel = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    managedEmailProfileRequired: js.UndefOr[Boolean] = js.undefined,
    osMaximumVersion: String = null,
    osMinimumVersion: String = null,
    passcodeBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passcodeExpirationDays: js.UndefOr[Double] = js.undefined,
    passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passcodeMinimumLength: js.UndefOr[Double] = js.undefined,
    passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined,
    passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.undefined,
    passcodeRequired: js.UndefOr[Boolean] = js.undefined,
    passcodeRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): IosCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceThreatProtectionEnabled)) __obj.updateDynamic("deviceThreatProtectionEnabled")(deviceThreatProtectionEnabled.get.asInstanceOf[js.Any])
    if (deviceThreatProtectionRequiredSecurityLevel != null) __obj.updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(deviceThreatProtectionRequiredSecurityLevel.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(managedEmailProfileRequired)) __obj.updateDynamic("managedEmailProfileRequired")(managedEmailProfileRequired.get.asInstanceOf[js.Any])
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion.asInstanceOf[js.Any])
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeBlockSimple)) __obj.updateDynamic("passcodeBlockSimple")(passcodeBlockSimple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeExpirationDays)) __obj.updateDynamic("passcodeExpirationDays")(passcodeExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinimumCharacterSetCount)) __obj.updateDynamic("passcodeMinimumCharacterSetCount")(passcodeMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinimumLength)) __obj.updateDynamic("passcodeMinimumLength")(passcodeMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinutesOfInactivityBeforeLock)) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeLock")(passcodeMinutesOfInactivityBeforeLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodePreviousPasscodeBlockCount)) __obj.updateDynamic("passcodePreviousPasscodeBlockCount")(passcodePreviousPasscodeBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeRequired)) __obj.updateDynamic("passcodeRequired")(passcodeRequired.get.asInstanceOf[js.Any])
    if (passcodeRequiredType != null) __obj.updateDynamic("passcodeRequiredType")(passcodeRequiredType.asInstanceOf[js.Any])
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule.asInstanceOf[js.Any])
    if (!js.isUndefined(securityBlockJailbrokenDevices)) __obj.updateDynamic("securityBlockJailbrokenDevices")(securityBlockJailbrokenDevices.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosCompliancePolicy]
  }
}


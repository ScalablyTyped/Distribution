package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  // Corresponds to the 'Block all incoming connections' option.
  var firewallBlockAllIncoming: js.UndefOr[Boolean] = js.undefined
  // Corresponds to 'Enable stealth mode.'
  var firewallEnableStealthMode: js.UndefOr[Boolean] = js.undefined
  // Whether the firewall should be enabled or not.
  var firewallEnabled: js.UndefOr[Boolean] = js.undefined
  // Maximum MacOS version.
  var osMaximumVersion: js.UndefOr[String] = js.undefined
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[String] = js.undefined
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Require encryption on Mac OS devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
  // Require that devices have enabled system integrity protection.
  var systemIntegrityProtectionEnabled: js.UndefOr[Boolean] = js.undefined
}

object MacOSCompliancePolicy {
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
    firewallBlockAllIncoming: js.UndefOr[Boolean] = js.undefined,
    firewallEnableStealthMode: js.UndefOr[Boolean] = js.undefined,
    firewallEnabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    osMaximumVersion: String = null,
    osMinimumVersion: String = null,
    passwordBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: Int | Double = null,
    passwordMinimumCharacterSetCount: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinutesOfInactivityBeforeLock: Int | Double = null,
    passwordPreviousPasswordBlockCount: Int | Double = null,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    storageRequireEncryption: js.UndefOr[Boolean] = js.undefined,
    systemIntegrityProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: Int | Double = null
  ): MacOSCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceThreatProtectionEnabled)) __obj.updateDynamic("deviceThreatProtectionEnabled")(deviceThreatProtectionEnabled.asInstanceOf[js.Any])
    if (deviceThreatProtectionRequiredSecurityLevel != null) __obj.updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(deviceThreatProtectionRequiredSecurityLevel.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallBlockAllIncoming)) __obj.updateDynamic("firewallBlockAllIncoming")(firewallBlockAllIncoming.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallEnableStealthMode)) __obj.updateDynamic("firewallEnableStealthMode")(firewallEnableStealthMode.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallEnabled)) __obj.updateDynamic("firewallEnabled")(firewallEnabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion.asInstanceOf[js.Any])
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple.asInstanceOf[js.Any])
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(systemIntegrityProtectionEnabled)) __obj.updateDynamic("systemIntegrityProtectionEnabled")(systemIntegrityProtectionEnabled.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSCompliancePolicy]
  }
}


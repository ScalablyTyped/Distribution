package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacOSCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  // Corresponds to the 'Block all incoming connections' option.
  var firewallBlockAllIncoming: js.UndefOr[scala.Boolean] = js.undefined
  // Corresponds to 'Enable stealth mode.'
  var firewallEnableStealthMode: js.UndefOr[scala.Boolean] = js.undefined
  // Whether the firewall should be enabled or not.
  var firewallEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Maximum MacOS version.
  var osMaximumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[scala.Double] = js.undefined
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Require encryption on Mac OS devices.
  var storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined
  // Require that devices have enabled system integrity protection.
  var systemIntegrityProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object MacOSCompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    deviceThreatProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    deviceThreatProtectionRequiredSecurityLevel: DeviceThreatProtectionLevel = null,
    displayName: java.lang.String = null,
    firewallBlockAllIncoming: js.UndefOr[scala.Boolean] = js.undefined,
    firewallEnableStealthMode: js.UndefOr[scala.Boolean] = js.undefined,
    firewallEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    osMaximumVersion: java.lang.String = null,
    osMinimumVersion: java.lang.String = null,
    passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumCharacterSetCount: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeLock: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    systemIntegrityProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): MacOSCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(deviceThreatProtectionEnabled)) __obj.updateDynamic("deviceThreatProtectionEnabled")(deviceThreatProtectionEnabled)
    if (deviceThreatProtectionRequiredSecurityLevel != null) __obj.updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(deviceThreatProtectionRequiredSecurityLevel)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(firewallBlockAllIncoming)) __obj.updateDynamic("firewallBlockAllIncoming")(firewallBlockAllIncoming)
    if (!js.isUndefined(firewallEnableStealthMode)) __obj.updateDynamic("firewallEnableStealthMode")(firewallEnableStealthMode)
    if (!js.isUndefined(firewallEnabled)) __obj.updateDynamic("firewallEnabled")(firewallEnabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule)
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption)
    if (!js.isUndefined(systemIntegrityProtectionEnabled)) __obj.updateDynamic("systemIntegrityProtectionEnabled")(systemIntegrityProtectionEnabled)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOSCompliancePolicy]
  }
}


package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10MobileCompliancePolicy extends DeviceCompliancePolicy {
  // Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
  var bitLockerEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var codeIntegrityEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is
    * enabled.
    */
  var earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Maximum Windows Phone version.
  var osMaximumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Minimum Windows Phone version.
  var osMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  // Number of days before password expiration. Valid values 1 to 255
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[scala.Double] = js.undefined
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  // Require a password to unlock an idle device.
  var passwordRequireToUnlockFromIdle: js.UndefOr[scala.Boolean] = js.undefined
  // Require a password to unlock Windows Phone device.
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined
}

object Windows10MobileCompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    bitLockerEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    codeIntegrityEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    displayName: java.lang.String = null,
    earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[scala.Boolean] = js.undefined,
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
    passwordRequireToUnlockFromIdle: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    secureBootEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): Windows10MobileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(bitLockerEnabled)) __obj.updateDynamic("bitLockerEnabled")(bitLockerEnabled)
    if (!js.isUndefined(codeIntegrityEnabled)) __obj.updateDynamic("codeIntegrityEnabled")(codeIntegrityEnabled)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(earlyLaunchAntiMalwareDriverEnabled)) __obj.updateDynamic("earlyLaunchAntiMalwareDriverEnabled")(earlyLaunchAntiMalwareDriverEnabled)
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
    if (!js.isUndefined(passwordRequireToUnlockFromIdle)) __obj.updateDynamic("passwordRequireToUnlockFromIdle")(passwordRequireToUnlockFromIdle)
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule)
    if (!js.isUndefined(secureBootEnabled)) __obj.updateDynamic("secureBootEnabled")(secureBootEnabled)
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10MobileCompliancePolicy]
  }
}


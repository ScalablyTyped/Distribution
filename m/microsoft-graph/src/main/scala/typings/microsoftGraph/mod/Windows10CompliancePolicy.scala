package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10CompliancePolicy extends DeviceCompliancePolicy {
  // Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
  var bitLockerEnabled: js.UndefOr[Boolean] = js.undefined
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var codeIntegrityEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is
    * enabled.
    */
  var earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[Boolean] = js.undefined
  // Maximum Windows Phone version.
  var mobileOsMaximumVersion: js.UndefOr[String] = js.undefined
  // Minimum Windows Phone version.
  var mobileOsMinimumVersion: js.UndefOr[String] = js.undefined
  // Maximum Windows 10 version.
  var osMaximumVersion: js.UndefOr[String] = js.undefined
  // Minimum Windows 10 version.
  var osMinimumVersion: js.UndefOr[String] = js.undefined
  // Indicates whether or not to block simple password.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  // The password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined
  // The number of previous passwords to prevent re-use of.
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Require a password to unlock Windows device.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  // Require a password to unlock an idle device.
  var passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Require devices to be reported as healthy by Windows Device Health Attestation.
  var requireHealthyDeviceReport: js.UndefOr[Boolean] = js.undefined
  // Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
  var secureBootEnabled: js.UndefOr[Boolean] = js.undefined
  // Require encryption on windows devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
}

object Windows10CompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    bitLockerEnabled: js.UndefOr[Boolean] = js.undefined,
    codeIntegrityEnabled: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    displayName: String = null,
    earlyLaunchAntiMalwareDriverEnabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    mobileOsMaximumVersion: String = null,
    mobileOsMinimumVersion: String = null,
    osMaximumVersion: String = null,
    osMinimumVersion: String = null,
    passwordBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    requireHealthyDeviceReport: js.UndefOr[Boolean] = js.undefined,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    secureBootEnabled: js.UndefOr[Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined
  ): Windows10CompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(bitLockerEnabled)) __obj.updateDynamic("bitLockerEnabled")(bitLockerEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(codeIntegrityEnabled)) __obj.updateDynamic("codeIntegrityEnabled")(codeIntegrityEnabled.get.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(earlyLaunchAntiMalwareDriverEnabled)) __obj.updateDynamic("earlyLaunchAntiMalwareDriverEnabled")(earlyLaunchAntiMalwareDriverEnabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (mobileOsMaximumVersion != null) __obj.updateDynamic("mobileOsMaximumVersion")(mobileOsMaximumVersion.asInstanceOf[js.Any])
    if (mobileOsMinimumVersion != null) __obj.updateDynamic("mobileOsMinimumVersion")(mobileOsMinimumVersion.asInstanceOf[js.Any])
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion.asInstanceOf[js.Any])
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumCharacterSetCount)) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeLock)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequiredToUnlockFromIdle)) __obj.updateDynamic("passwordRequiredToUnlockFromIdle")(passwordRequiredToUnlockFromIdle.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(requireHealthyDeviceReport)) __obj.updateDynamic("requireHealthyDeviceReport")(requireHealthyDeviceReport.get.asInstanceOf[js.Any])
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule.asInstanceOf[js.Any])
    if (!js.isUndefined(secureBootEnabled)) __obj.updateDynamic("secureBootEnabled")(secureBootEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10CompliancePolicy]
  }
}


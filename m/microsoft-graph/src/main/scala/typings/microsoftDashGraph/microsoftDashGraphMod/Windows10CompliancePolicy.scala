package typings.microsoftDashGraph.microsoftDashGraphMod

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
    passwordExpirationDays: Int | Double = null,
    passwordMinimumCharacterSetCount: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinutesOfInactivityBeforeLock: Int | Double = null,
    passwordPreviousPasswordBlockCount: Int | Double = null,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredToUnlockFromIdle: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    requireHealthyDeviceReport: js.UndefOr[Boolean] = js.undefined,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    secureBootEnabled: js.UndefOr[Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: Int | Double = null
  ): Windows10CompliancePolicy = {
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
    if (mobileOsMaximumVersion != null) __obj.updateDynamic("mobileOsMaximumVersion")(mobileOsMaximumVersion)
    if (mobileOsMinimumVersion != null) __obj.updateDynamic("mobileOsMinimumVersion")(mobileOsMinimumVersion)
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (!js.isUndefined(passwordRequiredToUnlockFromIdle)) __obj.updateDynamic("passwordRequiredToUnlockFromIdle")(passwordRequiredToUnlockFromIdle)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (!js.isUndefined(requireHealthyDeviceReport)) __obj.updateDynamic("requireHealthyDeviceReport")(requireHealthyDeviceReport)
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule)
    if (!js.isUndefined(secureBootEnabled)) __obj.updateDynamic("secureBootEnabled")(secureBootEnabled)
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10CompliancePolicy]
  }
}


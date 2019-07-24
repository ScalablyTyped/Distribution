package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidWorkProfileCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  // Minimum Android security patch level.
  var minAndroidSecurityPatchLevel: js.UndefOr[java.lang.String] = js.undefined
  // Maximum Android version.
  var osMaximumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Minimum Android version.
  var osMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[scala.Double] = js.undefined
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  // Require a password to unlock device.
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols,
    * lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.undefined
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[scala.Boolean] = js.undefined
  // Disable USB debugging on Android devices.
  var securityDisableUsbDebugging: js.UndefOr[scala.Boolean] = js.undefined
  // Require that devices disallow installation of apps from unknown sources.
  var securityPreventInstallAppsFromUnknownSources: js.UndefOr[scala.Boolean] = js.undefined
  // Require the device to pass the Company Portal client app runtime integrity check.
  var securityRequireCompanyPortalAppIntegrity: js.UndefOr[scala.Boolean] = js.undefined
  // Require Google Play Services to be installed and enabled on the device.
  var securityRequireGooglePlayServices: js.UndefOr[scala.Boolean] = js.undefined
  // Require the device to pass the SafetyNet basic integrity check.
  var securityRequireSafetyNetAttestationBasicIntegrity: js.UndefOr[scala.Boolean] = js.undefined
  // Require the device to pass the SafetyNet certified device check.
  var securityRequireSafetyNetAttestationCertifiedDevice: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Require the device to have up to date security providers. The device will require Google Play Services to be enabled
    * and up to date.
    */
  var securityRequireUpToDateSecurityProviders: js.UndefOr[scala.Boolean] = js.undefined
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined
  // Require encryption on Android devices.
  var storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined
}

object AndroidWorkProfileCompliancePolicy {
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
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    minAndroidSecurityPatchLevel: java.lang.String = null,
    osMaximumVersion: java.lang.String = null,
    osMinimumVersion: java.lang.String = null,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeLock: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: AndroidRequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    securityBlockJailbrokenDevices: js.UndefOr[scala.Boolean] = js.undefined,
    securityDisableUsbDebugging: js.UndefOr[scala.Boolean] = js.undefined,
    securityPreventInstallAppsFromUnknownSources: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireCompanyPortalAppIntegrity: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireGooglePlayServices: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireSafetyNetAttestationBasicIntegrity: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireSafetyNetAttestationCertifiedDevice: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireUpToDateSecurityProviders: js.UndefOr[scala.Boolean] = js.undefined,
    securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): AndroidWorkProfileCompliancePolicy = {
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
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (minAndroidSecurityPatchLevel != null) __obj.updateDynamic("minAndroidSecurityPatchLevel")(minAndroidSecurityPatchLevel)
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeLock")(passwordMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule)
    if (!js.isUndefined(securityBlockJailbrokenDevices)) __obj.updateDynamic("securityBlockJailbrokenDevices")(securityBlockJailbrokenDevices)
    if (!js.isUndefined(securityDisableUsbDebugging)) __obj.updateDynamic("securityDisableUsbDebugging")(securityDisableUsbDebugging)
    if (!js.isUndefined(securityPreventInstallAppsFromUnknownSources)) __obj.updateDynamic("securityPreventInstallAppsFromUnknownSources")(securityPreventInstallAppsFromUnknownSources)
    if (!js.isUndefined(securityRequireCompanyPortalAppIntegrity)) __obj.updateDynamic("securityRequireCompanyPortalAppIntegrity")(securityRequireCompanyPortalAppIntegrity)
    if (!js.isUndefined(securityRequireGooglePlayServices)) __obj.updateDynamic("securityRequireGooglePlayServices")(securityRequireGooglePlayServices)
    if (!js.isUndefined(securityRequireSafetyNetAttestationBasicIntegrity)) __obj.updateDynamic("securityRequireSafetyNetAttestationBasicIntegrity")(securityRequireSafetyNetAttestationBasicIntegrity)
    if (!js.isUndefined(securityRequireSafetyNetAttestationCertifiedDevice)) __obj.updateDynamic("securityRequireSafetyNetAttestationCertifiedDevice")(securityRequireSafetyNetAttestationCertifiedDevice)
    if (!js.isUndefined(securityRequireUpToDateSecurityProviders)) __obj.updateDynamic("securityRequireUpToDateSecurityProviders")(securityRequireUpToDateSecurityProviders)
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps)
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidWorkProfileCompliancePolicy]
  }
}


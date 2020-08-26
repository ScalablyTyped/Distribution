package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidCompliancePolicy extends DeviceCompliancePolicy {
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  // Minimum Android security patch level.
  var minAndroidSecurityPatchLevel: js.UndefOr[String] = js.native
  // Maximum Android version.
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum Android version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // Require a password to unlock device.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  /**
    * Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols,
    * lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.native
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.native
  // Disable USB debugging on Android devices.
  var securityDisableUsbDebugging: js.UndefOr[Boolean] = js.native
  // Require that devices disallow installation of apps from unknown sources.
  var securityPreventInstallAppsFromUnknownSources: js.UndefOr[Boolean] = js.native
  // Require the device to pass the Company Portal client app runtime integrity check.
  var securityRequireCompanyPortalAppIntegrity: js.UndefOr[Boolean] = js.native
  // Require Google Play Services to be installed and enabled on the device.
  var securityRequireGooglePlayServices: js.UndefOr[Boolean] = js.native
  // Require the device to pass the SafetyNet basic integrity check.
  var securityRequireSafetyNetAttestationBasicIntegrity: js.UndefOr[Boolean] = js.native
  // Require the device to pass the SafetyNet certified device check.
  var securityRequireSafetyNetAttestationCertifiedDevice: js.UndefOr[Boolean] = js.native
  /**
    * Require the device to have up to date security providers. The device will require Google Play Services to be enabled
    * and up to date.
    */
  var securityRequireUpToDateSecurityProviders: js.UndefOr[Boolean] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Require encryption on Android devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
}

object AndroidCompliancePolicy {
  @scala.inline
  def apply(): AndroidCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidCompliancePolicy]
  }
  @scala.inline
  implicit class AndroidCompliancePolicyOps[Self <: AndroidCompliancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceThreatProtectionEnabled(value: Boolean): Self = this.set("deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceThreatProtectionEnabled: Self = this.set("deviceThreatProtectionEnabled", js.undefined)
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = this.set("deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceThreatProtectionRequiredSecurityLevel: Self = this.set("deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    @scala.inline
    def setMinAndroidSecurityPatchLevel(value: String): Self = this.set("minAndroidSecurityPatchLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAndroidSecurityPatchLevel: Self = this.set("minAndroidSecurityPatchLevel", js.undefined)
    @scala.inline
    def setOsMaximumVersion(value: String): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    @scala.inline
    def setOsMinimumVersion(value: String): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumLength(value: Double): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: Double): Self = this.set("passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeLock: Self = this.set("passwordMinutesOfInactivityBeforeLock", js.undefined)
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: Double): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    @scala.inline
    def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setSecurityBlockJailbrokenDevices(value: Boolean): Self = this.set("securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityBlockJailbrokenDevices: Self = this.set("securityBlockJailbrokenDevices", js.undefined)
    @scala.inline
    def setSecurityDisableUsbDebugging(value: Boolean): Self = this.set("securityDisableUsbDebugging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDisableUsbDebugging: Self = this.set("securityDisableUsbDebugging", js.undefined)
    @scala.inline
    def setSecurityPreventInstallAppsFromUnknownSources(value: Boolean): Self = this.set("securityPreventInstallAppsFromUnknownSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPreventInstallAppsFromUnknownSources: Self = this.set("securityPreventInstallAppsFromUnknownSources", js.undefined)
    @scala.inline
    def setSecurityRequireCompanyPortalAppIntegrity(value: Boolean): Self = this.set("securityRequireCompanyPortalAppIntegrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireCompanyPortalAppIntegrity: Self = this.set("securityRequireCompanyPortalAppIntegrity", js.undefined)
    @scala.inline
    def setSecurityRequireGooglePlayServices(value: Boolean): Self = this.set("securityRequireGooglePlayServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireGooglePlayServices: Self = this.set("securityRequireGooglePlayServices", js.undefined)
    @scala.inline
    def setSecurityRequireSafetyNetAttestationBasicIntegrity(value: Boolean): Self = this.set("securityRequireSafetyNetAttestationBasicIntegrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireSafetyNetAttestationBasicIntegrity: Self = this.set("securityRequireSafetyNetAttestationBasicIntegrity", js.undefined)
    @scala.inline
    def setSecurityRequireSafetyNetAttestationCertifiedDevice(value: Boolean): Self = this.set("securityRequireSafetyNetAttestationCertifiedDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireSafetyNetAttestationCertifiedDevice: Self = this.set("securityRequireSafetyNetAttestationCertifiedDevice", js.undefined)
    @scala.inline
    def setSecurityRequireUpToDateSecurityProviders(value: Boolean): Self = this.set("securityRequireUpToDateSecurityProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireUpToDateSecurityProviders: Self = this.set("securityRequireUpToDateSecurityProviders", js.undefined)
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = this.set("securityRequireVerifyApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireVerifyApps: Self = this.set("securityRequireVerifyApps", js.undefined)
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = this.set("storageRequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireEncryption: Self = this.set("storageRequireEncryption", js.undefined)
  }
  
}


package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidWorkProfileCompliancePolicy
  extends StObject
     with DeviceCompliancePolicy {
  
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  
  // Minimum Android security patch level.
  var minAndroidSecurityPatchLevel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Maximum Android version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum Android version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Require a password to unlock device.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols,
    * lowSecurityBiometric, numeric, numericComplex, any.
    */
  var passwordRequiredType: js.UndefOr[AndroidRequiredPasswordType] = js.undefined
  
  // Devices must not be jailbroken or rooted.
  var securityBlockJailbrokenDevices: js.UndefOr[Boolean] = js.undefined
  
  // Disable USB debugging on Android devices.
  var securityDisableUsbDebugging: js.UndefOr[Boolean] = js.undefined
  
  // Require that devices disallow installation of apps from unknown sources.
  var securityPreventInstallAppsFromUnknownSources: js.UndefOr[Boolean] = js.undefined
  
  // Require the device to pass the Company Portal client app runtime integrity check.
  var securityRequireCompanyPortalAppIntegrity: js.UndefOr[Boolean] = js.undefined
  
  // Require Google Play Services to be installed and enabled on the device.
  var securityRequireGooglePlayServices: js.UndefOr[Boolean] = js.undefined
  
  // Require the device to pass the SafetyNet basic integrity check.
  var securityRequireSafetyNetAttestationBasicIntegrity: js.UndefOr[Boolean] = js.undefined
  
  // Require the device to pass the SafetyNet certified device check.
  var securityRequireSafetyNetAttestationCertifiedDevice: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Require the device to have up to date security providers. The device will require Google Play Services to be enabled
    * and up to date.
    */
  var securityRequireUpToDateSecurityProviders: js.UndefOr[Boolean] = js.undefined
  
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined
  
  // Require encryption on Android devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
}
object AndroidWorkProfileCompliancePolicy {
  
  @scala.inline
  def apply(): AndroidWorkProfileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileCompliancePolicy]
  }
  
  @scala.inline
  implicit class AndroidWorkProfileCompliancePolicyMutableBuilder[Self <: AndroidWorkProfileCompliancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    @scala.inline
    def setMinAndroidSecurityPatchLevel(value: NullableOption[String]): Self = StObject.set(x, "minAndroidSecurityPatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAndroidSecurityPatchLevelNull: Self = StObject.set(x, "minAndroidSecurityPatchLevel", null)
    
    @scala.inline
    def setMinAndroidSecurityPatchLevelUndefined: Self = StObject.set(x, "minAndroidSecurityPatchLevel", js.undefined)
    
    @scala.inline
    def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    @scala.inline
    def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    @scala.inline
    def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    @scala.inline
    def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    @scala.inline
    def setSecurityBlockJailbrokenDevices(value: Boolean): Self = StObject.set(x, "securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityBlockJailbrokenDevicesUndefined: Self = StObject.set(x, "securityBlockJailbrokenDevices", js.undefined)
    
    @scala.inline
    def setSecurityDisableUsbDebugging(value: Boolean): Self = StObject.set(x, "securityDisableUsbDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDisableUsbDebuggingUndefined: Self = StObject.set(x, "securityDisableUsbDebugging", js.undefined)
    
    @scala.inline
    def setSecurityPreventInstallAppsFromUnknownSources(value: Boolean): Self = StObject.set(x, "securityPreventInstallAppsFromUnknownSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPreventInstallAppsFromUnknownSourcesUndefined: Self = StObject.set(x, "securityPreventInstallAppsFromUnknownSources", js.undefined)
    
    @scala.inline
    def setSecurityRequireCompanyPortalAppIntegrity(value: Boolean): Self = StObject.set(x, "securityRequireCompanyPortalAppIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireCompanyPortalAppIntegrityUndefined: Self = StObject.set(x, "securityRequireCompanyPortalAppIntegrity", js.undefined)
    
    @scala.inline
    def setSecurityRequireGooglePlayServices(value: Boolean): Self = StObject.set(x, "securityRequireGooglePlayServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireGooglePlayServicesUndefined: Self = StObject.set(x, "securityRequireGooglePlayServices", js.undefined)
    
    @scala.inline
    def setSecurityRequireSafetyNetAttestationBasicIntegrity(value: Boolean): Self = StObject.set(x, "securityRequireSafetyNetAttestationBasicIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireSafetyNetAttestationBasicIntegrityUndefined: Self = StObject.set(x, "securityRequireSafetyNetAttestationBasicIntegrity", js.undefined)
    
    @scala.inline
    def setSecurityRequireSafetyNetAttestationCertifiedDevice(value: Boolean): Self = StObject.set(x, "securityRequireSafetyNetAttestationCertifiedDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireSafetyNetAttestationCertifiedDeviceUndefined: Self = StObject.set(x, "securityRequireSafetyNetAttestationCertifiedDevice", js.undefined)
    
    @scala.inline
    def setSecurityRequireUpToDateSecurityProviders(value: Boolean): Self = StObject.set(x, "securityRequireUpToDateSecurityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireUpToDateSecurityProvidersUndefined: Self = StObject.set(x, "securityRequireUpToDateSecurityProviders", js.undefined)
    
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
  }
}

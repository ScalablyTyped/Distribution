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
  
  inline def apply(): AndroidWorkProfileCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileCompliancePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidWorkProfileCompliancePolicy] (val x: Self) extends AnyVal {
    
    inline def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    inline def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    inline def setMinAndroidSecurityPatchLevel(value: NullableOption[String]): Self = StObject.set(x, "minAndroidSecurityPatchLevel", value.asInstanceOf[js.Any])
    
    inline def setMinAndroidSecurityPatchLevelNull: Self = StObject.set(x, "minAndroidSecurityPatchLevel", null)
    
    inline def setMinAndroidSecurityPatchLevelUndefined: Self = StObject.set(x, "minAndroidSecurityPatchLevel", js.undefined)
    
    inline def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    inline def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    inline def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    inline def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    inline def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    inline def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    inline def setPasswordMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", null)
    
    inline def setPasswordMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeLock", js.undefined)
    
    inline def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    inline def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredType(value: AndroidRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    inline def setSecurityBlockJailbrokenDevices(value: Boolean): Self = StObject.set(x, "securityBlockJailbrokenDevices", value.asInstanceOf[js.Any])
    
    inline def setSecurityBlockJailbrokenDevicesUndefined: Self = StObject.set(x, "securityBlockJailbrokenDevices", js.undefined)
    
    inline def setSecurityDisableUsbDebugging(value: Boolean): Self = StObject.set(x, "securityDisableUsbDebugging", value.asInstanceOf[js.Any])
    
    inline def setSecurityDisableUsbDebuggingUndefined: Self = StObject.set(x, "securityDisableUsbDebugging", js.undefined)
    
    inline def setSecurityPreventInstallAppsFromUnknownSources(value: Boolean): Self = StObject.set(x, "securityPreventInstallAppsFromUnknownSources", value.asInstanceOf[js.Any])
    
    inline def setSecurityPreventInstallAppsFromUnknownSourcesUndefined: Self = StObject.set(x, "securityPreventInstallAppsFromUnknownSources", js.undefined)
    
    inline def setSecurityRequireCompanyPortalAppIntegrity(value: Boolean): Self = StObject.set(x, "securityRequireCompanyPortalAppIntegrity", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireCompanyPortalAppIntegrityUndefined: Self = StObject.set(x, "securityRequireCompanyPortalAppIntegrity", js.undefined)
    
    inline def setSecurityRequireGooglePlayServices(value: Boolean): Self = StObject.set(x, "securityRequireGooglePlayServices", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireGooglePlayServicesUndefined: Self = StObject.set(x, "securityRequireGooglePlayServices", js.undefined)
    
    inline def setSecurityRequireSafetyNetAttestationBasicIntegrity(value: Boolean): Self = StObject.set(x, "securityRequireSafetyNetAttestationBasicIntegrity", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireSafetyNetAttestationBasicIntegrityUndefined: Self = StObject.set(x, "securityRequireSafetyNetAttestationBasicIntegrity", js.undefined)
    
    inline def setSecurityRequireSafetyNetAttestationCertifiedDevice(value: Boolean): Self = StObject.set(x, "securityRequireSafetyNetAttestationCertifiedDevice", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireSafetyNetAttestationCertifiedDeviceUndefined: Self = StObject.set(x, "securityRequireSafetyNetAttestationCertifiedDevice", js.undefined)
    
    inline def setSecurityRequireUpToDateSecurityProviders(value: Boolean): Self = StObject.set(x, "securityRequireUpToDateSecurityProviders", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireUpToDateSecurityProvidersUndefined: Self = StObject.set(x, "securityRequireUpToDateSecurityProviders", js.undefined)
    
    inline def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    inline def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
  }
}

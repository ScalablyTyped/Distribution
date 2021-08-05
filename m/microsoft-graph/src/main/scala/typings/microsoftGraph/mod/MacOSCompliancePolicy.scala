package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSCompliancePolicy
  extends StObject
     with DeviceCompliancePolicy {
  
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
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
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
  
  inline def apply(): MacOSCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSCompliancePolicy]
  }
  
  extension [Self <: MacOSCompliancePolicy](x: Self) {
    
    inline def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    inline def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    inline def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    inline def setFirewallBlockAllIncoming(value: Boolean): Self = StObject.set(x, "firewallBlockAllIncoming", value.asInstanceOf[js.Any])
    
    inline def setFirewallBlockAllIncomingUndefined: Self = StObject.set(x, "firewallBlockAllIncoming", js.undefined)
    
    inline def setFirewallEnableStealthMode(value: Boolean): Self = StObject.set(x, "firewallEnableStealthMode", value.asInstanceOf[js.Any])
    
    inline def setFirewallEnableStealthModeUndefined: Self = StObject.set(x, "firewallEnableStealthMode", js.undefined)
    
    inline def setFirewallEnabled(value: Boolean): Self = StObject.set(x, "firewallEnabled", value.asInstanceOf[js.Any])
    
    inline def setFirewallEnabledUndefined: Self = StObject.set(x, "firewallEnabled", js.undefined)
    
    inline def setOsMaximumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMaximumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMaximumVersionNull: Self = StObject.set(x, "osMaximumVersion", null)
    
    inline def setOsMaximumVersionUndefined: Self = StObject.set(x, "osMaximumVersion", js.undefined)
    
    inline def setOsMinimumVersion(value: NullableOption[String]): Self = StObject.set(x, "osMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setOsMinimumVersionNull: Self = StObject.set(x, "osMinimumVersion", null)
    
    inline def setOsMinimumVersionUndefined: Self = StObject.set(x, "osMinimumVersion", js.undefined)
    
    inline def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    inline def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    inline def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
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
    
    inline def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    inline def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    inline def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
    
    inline def setSystemIntegrityProtectionEnabled(value: Boolean): Self = StObject.set(x, "systemIntegrityProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setSystemIntegrityProtectionEnabledUndefined: Self = StObject.set(x, "systemIntegrityProtectionEnabled", js.undefined)
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacOSCompliancePolicy extends DeviceCompliancePolicy {
  
  // Require that devices have enabled device threat protection.
  var deviceThreatProtectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured,
    * low, medium, high, notSet.
    */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.native
  
  // Corresponds to the 'Block all incoming connections' option.
  var firewallBlockAllIncoming: js.UndefOr[Boolean] = js.native
  
  // Corresponds to 'Enable stealth mode.'
  var firewallEnableStealthMode: js.UndefOr[Boolean] = js.native
  
  // Whether the firewall should be enabled or not.
  var firewallEnabled: js.UndefOr[Boolean] = js.native
  
  // Maximum MacOS version.
  var osMaximumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  
  // Require encryption on Mac OS devices.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.native
  
  // Require that devices have enabled system integrity protection.
  var systemIntegrityProtectionEnabled: js.UndefOr[Boolean] = js.native
}
object MacOSCompliancePolicy {
  
  @scala.inline
  def apply(): MacOSCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSCompliancePolicy]
  }
  
  @scala.inline
  implicit class MacOSCompliancePolicyMutableBuilder[Self <: MacOSCompliancePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceThreatProtectionEnabled(value: Boolean): Self = StObject.set(x, "deviceThreatProtectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionEnabledUndefined: Self = StObject.set(x, "deviceThreatProtectionEnabled", js.undefined)
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevel(value: DeviceThreatProtectionLevel): Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceThreatProtectionRequiredSecurityLevelUndefined: Self = StObject.set(x, "deviceThreatProtectionRequiredSecurityLevel", js.undefined)
    
    @scala.inline
    def setFirewallBlockAllIncoming(value: Boolean): Self = StObject.set(x, "firewallBlockAllIncoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallBlockAllIncomingUndefined: Self = StObject.set(x, "firewallBlockAllIncoming", js.undefined)
    
    @scala.inline
    def setFirewallEnableStealthMode(value: Boolean): Self = StObject.set(x, "firewallEnableStealthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallEnableStealthModeUndefined: Self = StObject.set(x, "firewallEnableStealthMode", js.undefined)
    
    @scala.inline
    def setFirewallEnabled(value: Boolean): Self = StObject.set(x, "firewallEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallEnabledUndefined: Self = StObject.set(x, "firewallEnabled", js.undefined)
    
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
    def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
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
    def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = StObject.set(x, "storageRequireEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireEncryptionUndefined: Self = StObject.set(x, "storageRequireEncryption", js.undefined)
    
    @scala.inline
    def setSystemIntegrityProtectionEnabled(value: Boolean): Self = StObject.set(x, "systemIntegrityProtectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIntegrityProtectionEnabledUndefined: Self = StObject.set(x, "systemIntegrityProtectionEnabled", js.undefined)
  }
}

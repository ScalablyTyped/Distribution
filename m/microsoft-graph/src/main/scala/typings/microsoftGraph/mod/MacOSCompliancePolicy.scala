package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var osMaximumVersion: js.UndefOr[String] = js.native
  // Minimum MacOS version.
  var osMinimumVersion: js.UndefOr[String] = js.native
  // Indicates whether or not to block simple passwords.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires. Valid values 1 to 65535
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of password. Valid values 4 to 14
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a password is required.
  var passwordMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 1 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
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
  implicit class MacOSCompliancePolicyOps[Self <: MacOSCompliancePolicy] (val x: Self) extends AnyVal {
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
    def setFirewallBlockAllIncoming(value: Boolean): Self = this.set("firewallBlockAllIncoming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallBlockAllIncoming: Self = this.set("firewallBlockAllIncoming", js.undefined)
    @scala.inline
    def setFirewallEnableStealthMode(value: Boolean): Self = this.set("firewallEnableStealthMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallEnableStealthMode: Self = this.set("firewallEnableStealthMode", js.undefined)
    @scala.inline
    def setFirewallEnabled(value: Boolean): Self = this.set("firewallEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallEnabled: Self = this.set("firewallEnabled", js.undefined)
    @scala.inline
    def setOsMaximumVersion(value: String): Self = this.set("osMaximumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMaximumVersion: Self = this.set("osMaximumVersion", js.undefined)
    @scala.inline
    def setOsMinimumVersion(value: String): Self = this.set("osMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsMinimumVersion: Self = this.set("osMinimumVersion", js.undefined)
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: Double): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
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
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setStorageRequireEncryption(value: Boolean): Self = this.set("storageRequireEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireEncryption: Self = this.set("storageRequireEncryption", js.undefined)
    @scala.inline
    def setSystemIntegrityProtectionEnabled(value: Boolean): Self = this.set("systemIntegrityProtectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemIntegrityProtectionEnabled: Self = this.set("systemIntegrityProtectionEnabled", js.undefined)
  }
  
}


package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.native
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  /**
    * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric,
    * numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var passwordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.native
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.native
  // Block users from adding/removing accounts in work profile.
  var workProfileBlockAddingAccounts: js.UndefOr[Boolean] = js.native
  // Block work profile camera.
  var workProfileBlockCamera: js.UndefOr[Boolean] = js.native
  // Block display work profile caller ID in personal profile.
  var workProfileBlockCrossProfileCallerId: js.UndefOr[Boolean] = js.native
  // Block work profile contacts availability in personal profile.
  var workProfileBlockCrossProfileContactsSearch: js.UndefOr[Boolean] = js.native
  // Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
  var workProfileBlockCrossProfileCopyPaste: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block notifications while device locked.
  var workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[Boolean] = js.native
  // Block screen capture in work profile.
  var workProfileBlockScreenCapture: js.UndefOr[Boolean] = js.native
  // Allow bluetooth devices to access enterprise contacts.
  var workProfileBluetoothEnableContactSharing: js.UndefOr[Boolean] = js.native
  /**
    * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork,
    * noRestrictions.
    */
  var workProfileDataSharingType: js.UndefOr[AndroidWorkProfileCrossProfileDataSharingType] = js.native
  // Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
  var workProfileDefaultAppPermissionPolicy: js.UndefOr[AndroidWorkProfileDefaultAppPermissionPolicyType] = js.native
  // Indicates whether or not to block fingerprint unlock for work profile.
  var workProfilePasswordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Smart Lock and other trust agents for work profile.
  var workProfilePasswordBlockTrustAgents: js.UndefOr[Boolean] = js.native
  // Number of days before the work profile password expires. Valid values 1 to 365
  var workProfilePasswordExpirationDays: js.UndefOr[Double] = js.native
  // Minimum # of letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLetterCharacters: js.UndefOr[Double] = js.native
  // Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLowerCaseCharacters: js.UndefOr[Double] = js.native
  // Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNonLetterCharacters: js.UndefOr[Double] = js.native
  // Minimum # of numeric characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNumericCharacters: js.UndefOr[Double] = js.native
  // Minimum # of symbols required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinSymbolCharacters: js.UndefOr[Double] = js.native
  // Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinUpperCaseCharacters: js.UndefOr[Double] = js.native
  // Minimum length of work profile password. Valid values 4 to 16
  var workProfilePasswordMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous work profile passwords to block. Valid values 0 to 24
  var workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  /**
    * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required,
    * atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var workProfilePasswordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.native
  // Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
  var workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Password is required or not for work profile
  var workProfileRequirePassword: js.UndefOr[Boolean] = js.native
}

object AndroidWorkProfileGeneralDeviceConfiguration {
  @scala.inline
  def apply(): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class AndroidWorkProfileGeneralDeviceConfigurationOps[Self <: AndroidWorkProfileGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
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
    def setPasswordBlockFingerprintUnlock(value: Boolean): Self = this.set("passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockFingerprintUnlock: Self = this.set("passwordBlockFingerprintUnlock", js.undefined)
    @scala.inline
    def setPasswordBlockTrustAgents(value: Boolean): Self = this.set("passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockTrustAgents: Self = this.set("passwordBlockTrustAgents", js.undefined)
    @scala.inline
    def setPasswordExpirationDays(value: Double): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    @scala.inline
    def setPasswordMinimumLength(value: Double): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: Double): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setPasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = this.set("passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = this.set("securityRequireVerifyApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRequireVerifyApps: Self = this.set("securityRequireVerifyApps", js.undefined)
    @scala.inline
    def setWorkProfileBlockAddingAccounts(value: Boolean): Self = this.set("workProfileBlockAddingAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockAddingAccounts: Self = this.set("workProfileBlockAddingAccounts", js.undefined)
    @scala.inline
    def setWorkProfileBlockCamera(value: Boolean): Self = this.set("workProfileBlockCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockCamera: Self = this.set("workProfileBlockCamera", js.undefined)
    @scala.inline
    def setWorkProfileBlockCrossProfileCallerId(value: Boolean): Self = this.set("workProfileBlockCrossProfileCallerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockCrossProfileCallerId: Self = this.set("workProfileBlockCrossProfileCallerId", js.undefined)
    @scala.inline
    def setWorkProfileBlockCrossProfileContactsSearch(value: Boolean): Self = this.set("workProfileBlockCrossProfileContactsSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockCrossProfileContactsSearch: Self = this.set("workProfileBlockCrossProfileContactsSearch", js.undefined)
    @scala.inline
    def setWorkProfileBlockCrossProfileCopyPaste(value: Boolean): Self = this.set("workProfileBlockCrossProfileCopyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockCrossProfileCopyPaste: Self = this.set("workProfileBlockCrossProfileCopyPaste", js.undefined)
    @scala.inline
    def setWorkProfileBlockNotificationsWhileDeviceLocked(value: Boolean): Self = this.set("workProfileBlockNotificationsWhileDeviceLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockNotificationsWhileDeviceLocked: Self = this.set("workProfileBlockNotificationsWhileDeviceLocked", js.undefined)
    @scala.inline
    def setWorkProfileBlockScreenCapture(value: Boolean): Self = this.set("workProfileBlockScreenCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBlockScreenCapture: Self = this.set("workProfileBlockScreenCapture", js.undefined)
    @scala.inline
    def setWorkProfileBluetoothEnableContactSharing(value: Boolean): Self = this.set("workProfileBluetoothEnableContactSharing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileBluetoothEnableContactSharing: Self = this.set("workProfileBluetoothEnableContactSharing", js.undefined)
    @scala.inline
    def setWorkProfileDataSharingType(value: AndroidWorkProfileCrossProfileDataSharingType): Self = this.set("workProfileDataSharingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileDataSharingType: Self = this.set("workProfileDataSharingType", js.undefined)
    @scala.inline
    def setWorkProfileDefaultAppPermissionPolicy(value: AndroidWorkProfileDefaultAppPermissionPolicyType): Self = this.set("workProfileDefaultAppPermissionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileDefaultAppPermissionPolicy: Self = this.set("workProfileDefaultAppPermissionPolicy", js.undefined)
    @scala.inline
    def setWorkProfilePasswordBlockFingerprintUnlock(value: Boolean): Self = this.set("workProfilePasswordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordBlockFingerprintUnlock: Self = this.set("workProfilePasswordBlockFingerprintUnlock", js.undefined)
    @scala.inline
    def setWorkProfilePasswordBlockTrustAgents(value: Boolean): Self = this.set("workProfilePasswordBlockTrustAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordBlockTrustAgents: Self = this.set("workProfilePasswordBlockTrustAgents", js.undefined)
    @scala.inline
    def setWorkProfilePasswordExpirationDays(value: Double): Self = this.set("workProfilePasswordExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordExpirationDays: Self = this.set("workProfilePasswordExpirationDays", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinLetterCharacters(value: Double): Self = this.set("workProfilePasswordMinLetterCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinLetterCharacters: Self = this.set("workProfilePasswordMinLetterCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinLowerCaseCharacters(value: Double): Self = this.set("workProfilePasswordMinLowerCaseCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinLowerCaseCharacters: Self = this.set("workProfilePasswordMinLowerCaseCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinNonLetterCharacters(value: Double): Self = this.set("workProfilePasswordMinNonLetterCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinNonLetterCharacters: Self = this.set("workProfilePasswordMinNonLetterCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinNumericCharacters(value: Double): Self = this.set("workProfilePasswordMinNumericCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinNumericCharacters: Self = this.set("workProfilePasswordMinNumericCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinSymbolCharacters(value: Double): Self = this.set("workProfilePasswordMinSymbolCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinSymbolCharacters: Self = this.set("workProfilePasswordMinSymbolCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinUpperCaseCharacters(value: Double): Self = this.set("workProfilePasswordMinUpperCaseCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinUpperCaseCharacters: Self = this.set("workProfilePasswordMinUpperCaseCharacters", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinimumLength(value: Double): Self = this.set("workProfilePasswordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinimumLength: Self = this.set("workProfilePasswordMinimumLength", js.undefined)
    @scala.inline
    def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = this.set("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    @scala.inline
    def setWorkProfilePasswordPreviousPasswordBlockCount(value: Double): Self = this.set("workProfilePasswordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordPreviousPasswordBlockCount: Self = this.set("workProfilePasswordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setWorkProfilePasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = this.set("workProfilePasswordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordRequiredType: Self = this.set("workProfilePasswordRequiredType", js.undefined)
    @scala.inline
    def setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = this.set("workProfilePasswordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfilePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("workProfilePasswordSignInFailureCountBeforeFactoryReset", js.undefined)
    @scala.inline
    def setWorkProfileRequirePassword(value: Boolean): Self = this.set("workProfileRequirePassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkProfileRequirePassword: Self = this.set("workProfileRequirePassword", js.undefined)
  }
  
}


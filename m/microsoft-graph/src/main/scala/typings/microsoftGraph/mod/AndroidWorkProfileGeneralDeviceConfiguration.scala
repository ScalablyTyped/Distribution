package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidWorkProfileGeneralDeviceConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric,
    * numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var passwordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined
  
  // Block users from adding/removing accounts in work profile.
  var workProfileBlockAddingAccounts: js.UndefOr[Boolean] = js.undefined
  
  // Block work profile camera.
  var workProfileBlockCamera: js.UndefOr[Boolean] = js.undefined
  
  // Block display work profile caller ID in personal profile.
  var workProfileBlockCrossProfileCallerId: js.UndefOr[Boolean] = js.undefined
  
  // Block work profile contacts availability in personal profile.
  var workProfileBlockCrossProfileContactsSearch: js.UndefOr[Boolean] = js.undefined
  
  // Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
  var workProfileBlockCrossProfileCopyPaste: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block notifications while device locked.
  var workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[Boolean] = js.undefined
  
  // Block screen capture in work profile.
  var workProfileBlockScreenCapture: js.UndefOr[Boolean] = js.undefined
  
  // Allow bluetooth devices to access enterprise contacts.
  var workProfileBluetoothEnableContactSharing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork,
    * noRestrictions.
    */
  var workProfileDataSharingType: js.UndefOr[AndroidWorkProfileCrossProfileDataSharingType] = js.undefined
  
  // Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
  var workProfileDefaultAppPermissionPolicy: js.UndefOr[AndroidWorkProfileDefaultAppPermissionPolicyType] = js.undefined
  
  // Indicates whether or not to block fingerprint unlock for work profile.
  var workProfilePasswordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to block Smart Lock and other trust agents for work profile.
  var workProfilePasswordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined
  
  // Number of days before the work profile password expires. Valid values 1 to 365
  var workProfilePasswordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLetterCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLowerCaseCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNonLetterCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of numeric characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNumericCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of symbols required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinSymbolCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinUpperCaseCharacters: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of work profile password. Valid values 4 to 16
  var workProfilePasswordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before the screen times out.
  var workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous work profile passwords to block. Valid values 0 to 24
  var workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required,
    * atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var workProfilePasswordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  
  // Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
  var workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Password is required or not for work profile
  var workProfileRequirePassword: js.UndefOr[Boolean] = js.undefined
}
object AndroidWorkProfileGeneralDeviceConfiguration {
  
  @scala.inline
  def apply(): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit class AndroidWorkProfileGeneralDeviceConfigurationMutableBuilder[Self <: AndroidWorkProfileGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "passwordBlockFingerprintUnlock", js.undefined)
    
    @scala.inline
    def setPasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "passwordBlockTrustAgents", js.undefined)
    
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
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockAddingAccounts(value: Boolean): Self = StObject.set(x, "workProfileBlockAddingAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockAddingAccountsUndefined: Self = StObject.set(x, "workProfileBlockAddingAccounts", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockCamera(value: Boolean): Self = StObject.set(x, "workProfileBlockCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockCameraUndefined: Self = StObject.set(x, "workProfileBlockCamera", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockCrossProfileCallerId(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileCallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockCrossProfileCallerIdUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileCallerId", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockCrossProfileContactsSearch(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileContactsSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockCrossProfileContactsSearchUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileContactsSearch", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockCrossProfileCopyPaste(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileCopyPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockCrossProfileCopyPasteUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileCopyPaste", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockNotificationsWhileDeviceLocked(value: Boolean): Self = StObject.set(x, "workProfileBlockNotificationsWhileDeviceLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockNotificationsWhileDeviceLockedUndefined: Self = StObject.set(x, "workProfileBlockNotificationsWhileDeviceLocked", js.undefined)
    
    @scala.inline
    def setWorkProfileBlockScreenCapture(value: Boolean): Self = StObject.set(x, "workProfileBlockScreenCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBlockScreenCaptureUndefined: Self = StObject.set(x, "workProfileBlockScreenCapture", js.undefined)
    
    @scala.inline
    def setWorkProfileBluetoothEnableContactSharing(value: Boolean): Self = StObject.set(x, "workProfileBluetoothEnableContactSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileBluetoothEnableContactSharingUndefined: Self = StObject.set(x, "workProfileBluetoothEnableContactSharing", js.undefined)
    
    @scala.inline
    def setWorkProfileDataSharingType(value: AndroidWorkProfileCrossProfileDataSharingType): Self = StObject.set(x, "workProfileDataSharingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileDataSharingTypeUndefined: Self = StObject.set(x, "workProfileDataSharingType", js.undefined)
    
    @scala.inline
    def setWorkProfileDefaultAppPermissionPolicy(value: AndroidWorkProfileDefaultAppPermissionPolicyType): Self = StObject.set(x, "workProfileDefaultAppPermissionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileDefaultAppPermissionPolicyUndefined: Self = StObject.set(x, "workProfileDefaultAppPermissionPolicy", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "workProfilePasswordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "workProfilePasswordBlockFingerprintUnlock", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "workProfilePasswordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "workProfilePasswordBlockTrustAgents", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordExpirationDaysNull: Self = StObject.set(x, "workProfilePasswordExpirationDays", null)
    
    @scala.inline
    def setWorkProfilePasswordExpirationDaysUndefined: Self = StObject.set(x, "workProfilePasswordExpirationDays", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinLetterCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinLetterCharactersNull: Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinLetterCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinLowerCaseCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinLowerCaseCharactersNull: Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinLowerCaseCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinNonLetterCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinNonLetterCharactersNull: Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinNonLetterCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinNumericCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinNumericCharactersNull: Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinNumericCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinSymbolCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinSymbolCharactersNull: Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinSymbolCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinUpperCaseCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinUpperCaseCharactersNull: Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", null)
    
    @scala.inline
    def setWorkProfilePasswordMinUpperCaseCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinimumLengthNull: Self = StObject.set(x, "workProfilePasswordMinimumLength", null)
    
    @scala.inline
    def setWorkProfilePasswordMinimumLengthUndefined: Self = StObject.set(x, "workProfilePasswordMinimumLength", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setWorkProfilePasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = StObject.set(x, "workProfilePasswordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordRequiredTypeUndefined: Self = StObject.set(x, "workProfilePasswordRequiredType", js.undefined)
    
    @scala.inline
    def setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfilePasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setWorkProfilePasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setWorkProfileRequirePassword(value: Boolean): Self = StObject.set(x, "workProfileRequirePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkProfileRequirePasswordUndefined: Self = StObject.set(x, "workProfileRequirePassword", js.undefined)
  }
}

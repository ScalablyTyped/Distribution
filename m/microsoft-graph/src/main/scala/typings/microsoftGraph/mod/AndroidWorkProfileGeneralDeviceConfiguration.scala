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
  
  inline def apply(): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidWorkProfileGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "passwordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "passwordBlockFingerprintUnlock", js.undefined)
    
    inline def setPasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "passwordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    inline def setPasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "passwordBlockTrustAgents", js.undefined)
    
    inline def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    inline def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    inline def setPasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinimumLengthNull: Self = StObject.set(x, "passwordMinimumLength", null)
    
    inline def setPasswordMinimumLengthUndefined: Self = StObject.set(x, "passwordMinimumLength", js.undefined)
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    inline def setPasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    inline def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    inline def setPasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", null)
    
    inline def setPasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "passwordPreviousPasswordBlockCount", js.undefined)
    
    inline def setPasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    inline def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    inline def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    inline def setSecurityRequireVerifyApps(value: Boolean): Self = StObject.set(x, "securityRequireVerifyApps", value.asInstanceOf[js.Any])
    
    inline def setSecurityRequireVerifyAppsUndefined: Self = StObject.set(x, "securityRequireVerifyApps", js.undefined)
    
    inline def setWorkProfileBlockAddingAccounts(value: Boolean): Self = StObject.set(x, "workProfileBlockAddingAccounts", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockAddingAccountsUndefined: Self = StObject.set(x, "workProfileBlockAddingAccounts", js.undefined)
    
    inline def setWorkProfileBlockCamera(value: Boolean): Self = StObject.set(x, "workProfileBlockCamera", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockCameraUndefined: Self = StObject.set(x, "workProfileBlockCamera", js.undefined)
    
    inline def setWorkProfileBlockCrossProfileCallerId(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileCallerId", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockCrossProfileCallerIdUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileCallerId", js.undefined)
    
    inline def setWorkProfileBlockCrossProfileContactsSearch(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileContactsSearch", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockCrossProfileContactsSearchUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileContactsSearch", js.undefined)
    
    inline def setWorkProfileBlockCrossProfileCopyPaste(value: Boolean): Self = StObject.set(x, "workProfileBlockCrossProfileCopyPaste", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockCrossProfileCopyPasteUndefined: Self = StObject.set(x, "workProfileBlockCrossProfileCopyPaste", js.undefined)
    
    inline def setWorkProfileBlockNotificationsWhileDeviceLocked(value: Boolean): Self = StObject.set(x, "workProfileBlockNotificationsWhileDeviceLocked", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockNotificationsWhileDeviceLockedUndefined: Self = StObject.set(x, "workProfileBlockNotificationsWhileDeviceLocked", js.undefined)
    
    inline def setWorkProfileBlockScreenCapture(value: Boolean): Self = StObject.set(x, "workProfileBlockScreenCapture", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBlockScreenCaptureUndefined: Self = StObject.set(x, "workProfileBlockScreenCapture", js.undefined)
    
    inline def setWorkProfileBluetoothEnableContactSharing(value: Boolean): Self = StObject.set(x, "workProfileBluetoothEnableContactSharing", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileBluetoothEnableContactSharingUndefined: Self = StObject.set(x, "workProfileBluetoothEnableContactSharing", js.undefined)
    
    inline def setWorkProfileDataSharingType(value: AndroidWorkProfileCrossProfileDataSharingType): Self = StObject.set(x, "workProfileDataSharingType", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileDataSharingTypeUndefined: Self = StObject.set(x, "workProfileDataSharingType", js.undefined)
    
    inline def setWorkProfileDefaultAppPermissionPolicy(value: AndroidWorkProfileDefaultAppPermissionPolicyType): Self = StObject.set(x, "workProfileDefaultAppPermissionPolicy", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileDefaultAppPermissionPolicyUndefined: Self = StObject.set(x, "workProfileDefaultAppPermissionPolicy", js.undefined)
    
    inline def setWorkProfilePasswordBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "workProfilePasswordBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordBlockFingerprintUnlockUndefined: Self = StObject.set(x, "workProfilePasswordBlockFingerprintUnlock", js.undefined)
    
    inline def setWorkProfilePasswordBlockTrustAgents(value: Boolean): Self = StObject.set(x, "workProfilePasswordBlockTrustAgents", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordBlockTrustAgentsUndefined: Self = StObject.set(x, "workProfilePasswordBlockTrustAgents", js.undefined)
    
    inline def setWorkProfilePasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordExpirationDaysNull: Self = StObject.set(x, "workProfilePasswordExpirationDays", null)
    
    inline def setWorkProfilePasswordExpirationDaysUndefined: Self = StObject.set(x, "workProfilePasswordExpirationDays", js.undefined)
    
    inline def setWorkProfilePasswordMinLetterCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinLetterCharactersNull: Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", null)
    
    inline def setWorkProfilePasswordMinLetterCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinLetterCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinLowerCaseCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinLowerCaseCharactersNull: Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", null)
    
    inline def setWorkProfilePasswordMinLowerCaseCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinLowerCaseCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinNonLetterCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinNonLetterCharactersNull: Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", null)
    
    inline def setWorkProfilePasswordMinNonLetterCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinNonLetterCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinNumericCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinNumericCharactersNull: Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", null)
    
    inline def setWorkProfilePasswordMinNumericCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinNumericCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinSymbolCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinSymbolCharactersNull: Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", null)
    
    inline def setWorkProfilePasswordMinSymbolCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinSymbolCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinUpperCaseCharacters(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinUpperCaseCharactersNull: Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", null)
    
    inline def setWorkProfilePasswordMinUpperCaseCharactersUndefined: Self = StObject.set(x, "workProfilePasswordMinUpperCaseCharacters", js.undefined)
    
    inline def setWorkProfilePasswordMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinimumLength", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinimumLengthNull: Self = StObject.set(x, "workProfilePasswordMinimumLength", null)
    
    inline def setWorkProfilePasswordMinimumLengthUndefined: Self = StObject.set(x, "workProfilePasswordMinimumLength", js.undefined)
    
    inline def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", null)
    
    inline def setWorkProfilePasswordMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    inline def setWorkProfilePasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordPreviousPasswordBlockCountNull: Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", null)
    
    inline def setWorkProfilePasswordPreviousPasswordBlockCountUndefined: Self = StObject.set(x, "workProfilePasswordPreviousPasswordBlockCount", js.undefined)
    
    inline def setWorkProfilePasswordRequiredType(value: AndroidWorkProfileRequiredPasswordType): Self = StObject.set(x, "workProfilePasswordRequiredType", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordRequiredTypeUndefined: Self = StObject.set(x, "workProfilePasswordRequiredType", js.undefined)
    
    inline def setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    inline def setWorkProfilePasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", null)
    
    inline def setWorkProfilePasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "workProfilePasswordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    inline def setWorkProfileRequirePassword(value: Boolean): Self = StObject.set(x, "workProfileRequirePassword", value.asInstanceOf[js.Any])
    
    inline def setWorkProfileRequirePasswordUndefined: Self = StObject.set(x, "workProfileRequirePassword", js.undefined)
  }
}

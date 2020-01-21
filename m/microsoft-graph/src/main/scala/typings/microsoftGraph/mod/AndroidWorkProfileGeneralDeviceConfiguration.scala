package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  /**
    * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric,
    * numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var passwordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
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
  var workProfilePasswordExpirationDays: js.UndefOr[Double] = js.undefined
  // Minimum # of letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLetterCharacters: js.UndefOr[Double] = js.undefined
  // Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLowerCaseCharacters: js.UndefOr[Double] = js.undefined
  // Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNonLetterCharacters: js.UndefOr[Double] = js.undefined
  // Minimum # of numeric characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNumericCharacters: js.UndefOr[Double] = js.undefined
  // Minimum # of symbols required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinSymbolCharacters: js.UndefOr[Double] = js.undefined
  // Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinUpperCaseCharacters: js.UndefOr[Double] = js.undefined
  // Minimum length of work profile password. Valid values 4 to 16
  var workProfilePasswordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // Number of previous work profile passwords to block. Valid values 0 to 24
  var workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  /**
    * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required,
    * atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var workProfilePasswordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
  var workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
  // Password is required or not for work profile
  var workProfileRequirePassword: js.UndefOr[Boolean] = js.undefined
}

object AndroidWorkProfileGeneralDeviceConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    passwordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined,
    passwordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: Int | Double = null,
    passwordPreviousPasswordBlockCount: Int | Double = null,
    passwordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: Int | Double = null,
    securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null,
    workProfileBlockAddingAccounts: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockCamera: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockCrossProfileCallerId: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockCrossProfileContactsSearch: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockCrossProfileCopyPaste: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[Boolean] = js.undefined,
    workProfileBlockScreenCapture: js.UndefOr[Boolean] = js.undefined,
    workProfileBluetoothEnableContactSharing: js.UndefOr[Boolean] = js.undefined,
    workProfileDataSharingType: AndroidWorkProfileCrossProfileDataSharingType = null,
    workProfileDefaultAppPermissionPolicy: AndroidWorkProfileDefaultAppPermissionPolicyType = null,
    workProfilePasswordBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined,
    workProfilePasswordBlockTrustAgents: js.UndefOr[Boolean] = js.undefined,
    workProfilePasswordExpirationDays: Int | Double = null,
    workProfilePasswordMinLetterCharacters: Int | Double = null,
    workProfilePasswordMinLowerCaseCharacters: Int | Double = null,
    workProfilePasswordMinNonLetterCharacters: Int | Double = null,
    workProfilePasswordMinNumericCharacters: Int | Double = null,
    workProfilePasswordMinSymbolCharacters: Int | Double = null,
    workProfilePasswordMinUpperCaseCharacters: Int | Double = null,
    workProfilePasswordMinimumLength: Int | Double = null,
    workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: Int | Double = null,
    workProfilePasswordPreviousPasswordBlockCount: Int | Double = null,
    workProfilePasswordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    workProfilePasswordSignInFailureCountBeforeFactoryReset: Int | Double = null,
    workProfileRequirePassword: js.UndefOr[Boolean] = js.undefined
  ): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockFingerprintUnlock)) __obj.updateDynamic("passwordBlockFingerprintUnlock")(passwordBlockFingerprintUnlock.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockTrustAgents)) __obj.updateDynamic("passwordBlockTrustAgents")(passwordBlockTrustAgents.asInstanceOf[js.Any])
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockAddingAccounts)) __obj.updateDynamic("workProfileBlockAddingAccounts")(workProfileBlockAddingAccounts.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCamera)) __obj.updateDynamic("workProfileBlockCamera")(workProfileBlockCamera.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileCallerId)) __obj.updateDynamic("workProfileBlockCrossProfileCallerId")(workProfileBlockCrossProfileCallerId.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileContactsSearch)) __obj.updateDynamic("workProfileBlockCrossProfileContactsSearch")(workProfileBlockCrossProfileContactsSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileCopyPaste)) __obj.updateDynamic("workProfileBlockCrossProfileCopyPaste")(workProfileBlockCrossProfileCopyPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockNotificationsWhileDeviceLocked)) __obj.updateDynamic("workProfileBlockNotificationsWhileDeviceLocked")(workProfileBlockNotificationsWhileDeviceLocked.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockScreenCapture)) __obj.updateDynamic("workProfileBlockScreenCapture")(workProfileBlockScreenCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBluetoothEnableContactSharing)) __obj.updateDynamic("workProfileBluetoothEnableContactSharing")(workProfileBluetoothEnableContactSharing.asInstanceOf[js.Any])
    if (workProfileDataSharingType != null) __obj.updateDynamic("workProfileDataSharingType")(workProfileDataSharingType.asInstanceOf[js.Any])
    if (workProfileDefaultAppPermissionPolicy != null) __obj.updateDynamic("workProfileDefaultAppPermissionPolicy")(workProfileDefaultAppPermissionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordBlockFingerprintUnlock)) __obj.updateDynamic("workProfilePasswordBlockFingerprintUnlock")(workProfilePasswordBlockFingerprintUnlock.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordBlockTrustAgents)) __obj.updateDynamic("workProfilePasswordBlockTrustAgents")(workProfilePasswordBlockTrustAgents.asInstanceOf[js.Any])
    if (workProfilePasswordExpirationDays != null) __obj.updateDynamic("workProfilePasswordExpirationDays")(workProfilePasswordExpirationDays.asInstanceOf[js.Any])
    if (workProfilePasswordMinLetterCharacters != null) __obj.updateDynamic("workProfilePasswordMinLetterCharacters")(workProfilePasswordMinLetterCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinLowerCaseCharacters != null) __obj.updateDynamic("workProfilePasswordMinLowerCaseCharacters")(workProfilePasswordMinLowerCaseCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinNonLetterCharacters != null) __obj.updateDynamic("workProfilePasswordMinNonLetterCharacters")(workProfilePasswordMinNonLetterCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinNumericCharacters != null) __obj.updateDynamic("workProfilePasswordMinNumericCharacters")(workProfilePasswordMinNumericCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinSymbolCharacters != null) __obj.updateDynamic("workProfilePasswordMinSymbolCharacters")(workProfilePasswordMinSymbolCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinUpperCaseCharacters != null) __obj.updateDynamic("workProfilePasswordMinUpperCaseCharacters")(workProfilePasswordMinUpperCaseCharacters.asInstanceOf[js.Any])
    if (workProfilePasswordMinimumLength != null) __obj.updateDynamic("workProfilePasswordMinimumLength")(workProfilePasswordMinimumLength.asInstanceOf[js.Any])
    if (workProfilePasswordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")(workProfilePasswordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (workProfilePasswordPreviousPasswordBlockCount != null) __obj.updateDynamic("workProfilePasswordPreviousPasswordBlockCount")(workProfilePasswordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (workProfilePasswordRequiredType != null) __obj.updateDynamic("workProfilePasswordRequiredType")(workProfilePasswordRequiredType.asInstanceOf[js.Any])
    if (workProfilePasswordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("workProfilePasswordSignInFailureCountBeforeFactoryReset")(workProfilePasswordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileRequirePassword)) __obj.updateDynamic("workProfileRequirePassword")(workProfileRequirePassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
}


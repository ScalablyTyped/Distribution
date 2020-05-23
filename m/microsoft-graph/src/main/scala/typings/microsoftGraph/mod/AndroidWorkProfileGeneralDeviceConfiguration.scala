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
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined,
    securityRequireVerifyApps: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined,
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
    workProfilePasswordExpirationDays: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinLetterCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinLowerCaseCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinNonLetterCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinNumericCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinSymbolCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinUpperCaseCharacters: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinimumLength: js.UndefOr[Double] = js.undefined,
    workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    workProfilePasswordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(passwordBlockFingerprintUnlock)) __obj.updateDynamic("passwordBlockFingerprintUnlock")(passwordBlockFingerprintUnlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockTrustAgents)) __obj.updateDynamic("passwordBlockTrustAgents")(passwordBlockTrustAgents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordSignInFailureCountBeforeFactoryReset)) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockAddingAccounts)) __obj.updateDynamic("workProfileBlockAddingAccounts")(workProfileBlockAddingAccounts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCamera)) __obj.updateDynamic("workProfileBlockCamera")(workProfileBlockCamera.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileCallerId)) __obj.updateDynamic("workProfileBlockCrossProfileCallerId")(workProfileBlockCrossProfileCallerId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileContactsSearch)) __obj.updateDynamic("workProfileBlockCrossProfileContactsSearch")(workProfileBlockCrossProfileContactsSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockCrossProfileCopyPaste)) __obj.updateDynamic("workProfileBlockCrossProfileCopyPaste")(workProfileBlockCrossProfileCopyPaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockNotificationsWhileDeviceLocked)) __obj.updateDynamic("workProfileBlockNotificationsWhileDeviceLocked")(workProfileBlockNotificationsWhileDeviceLocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockScreenCapture)) __obj.updateDynamic("workProfileBlockScreenCapture")(workProfileBlockScreenCapture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBluetoothEnableContactSharing)) __obj.updateDynamic("workProfileBluetoothEnableContactSharing")(workProfileBluetoothEnableContactSharing.get.asInstanceOf[js.Any])
    if (workProfileDataSharingType != null) __obj.updateDynamic("workProfileDataSharingType")(workProfileDataSharingType.asInstanceOf[js.Any])
    if (workProfileDefaultAppPermissionPolicy != null) __obj.updateDynamic("workProfileDefaultAppPermissionPolicy")(workProfileDefaultAppPermissionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordBlockFingerprintUnlock)) __obj.updateDynamic("workProfilePasswordBlockFingerprintUnlock")(workProfilePasswordBlockFingerprintUnlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordBlockTrustAgents)) __obj.updateDynamic("workProfilePasswordBlockTrustAgents")(workProfilePasswordBlockTrustAgents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordExpirationDays)) __obj.updateDynamic("workProfilePasswordExpirationDays")(workProfilePasswordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinLetterCharacters)) __obj.updateDynamic("workProfilePasswordMinLetterCharacters")(workProfilePasswordMinLetterCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinLowerCaseCharacters)) __obj.updateDynamic("workProfilePasswordMinLowerCaseCharacters")(workProfilePasswordMinLowerCaseCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinNonLetterCharacters)) __obj.updateDynamic("workProfilePasswordMinNonLetterCharacters")(workProfilePasswordMinNonLetterCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinNumericCharacters)) __obj.updateDynamic("workProfilePasswordMinNumericCharacters")(workProfilePasswordMinNumericCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinSymbolCharacters)) __obj.updateDynamic("workProfilePasswordMinSymbolCharacters")(workProfilePasswordMinSymbolCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinUpperCaseCharacters)) __obj.updateDynamic("workProfilePasswordMinUpperCaseCharacters")(workProfilePasswordMinUpperCaseCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinimumLength)) __obj.updateDynamic("workProfilePasswordMinimumLength")(workProfilePasswordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")(workProfilePasswordMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordPreviousPasswordBlockCount)) __obj.updateDynamic("workProfilePasswordPreviousPasswordBlockCount")(workProfilePasswordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (workProfilePasswordRequiredType != null) __obj.updateDynamic("workProfilePasswordRequiredType")(workProfilePasswordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfilePasswordSignInFailureCountBeforeFactoryReset)) __obj.updateDynamic("workProfilePasswordSignInFailureCountBeforeFactoryReset")(workProfilePasswordSignInFailureCountBeforeFactoryReset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileRequirePassword)) __obj.updateDynamic("workProfileRequirePassword")(workProfileRequirePassword.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
}


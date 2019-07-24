package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to block fingerprint unlock.
  var passwordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Smart Lock and other trust agents.
  var passwordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined
  // Number of days before the password expires. Valid values 1 to 365
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // Minimum length of passwords. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric,
    * numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var passwordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before factory reset. Valid values 1 to 16
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[scala.Double] = js.undefined
  // Require the Android Verify apps feature is turned on.
  var securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined
  // Block users from adding/removing accounts in work profile.
  var workProfileBlockAddingAccounts: js.UndefOr[scala.Boolean] = js.undefined
  // Block work profile camera.
  var workProfileBlockCamera: js.UndefOr[scala.Boolean] = js.undefined
  // Block display work profile caller ID in personal profile.
  var workProfileBlockCrossProfileCallerId: js.UndefOr[scala.Boolean] = js.undefined
  // Block work profile contacts availability in personal profile.
  var workProfileBlockCrossProfileContactsSearch: js.UndefOr[scala.Boolean] = js.undefined
  // Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
  var workProfileBlockCrossProfileCopyPaste: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block notifications while device locked.
  var workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[scala.Boolean] = js.undefined
  // Block screen capture in work profile.
  var workProfileBlockScreenCapture: js.UndefOr[scala.Boolean] = js.undefined
  // Allow bluetooth devices to access enterprise contacts.
  var workProfileBluetoothEnableContactSharing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork,
    * noRestrictions.
    */
  var workProfileDataSharingType: js.UndefOr[AndroidWorkProfileCrossProfileDataSharingType] = js.undefined
  // Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
  var workProfileDefaultAppPermissionPolicy: js.UndefOr[AndroidWorkProfileDefaultAppPermissionPolicyType] = js.undefined
  // Indicates whether or not to block fingerprint unlock for work profile.
  var workProfilePasswordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether or not to block Smart Lock and other trust agents for work profile.
  var workProfilePasswordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined
  // Number of days before the work profile password expires. Valid values 1 to 365
  var workProfilePasswordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLetterCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinLowerCaseCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNonLetterCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of numeric characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinNumericCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of symbols required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinSymbolCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
  var workProfilePasswordMinUpperCaseCharacters: js.UndefOr[scala.Double] = js.undefined
  // Minimum length of work profile password. Valid values 4 to 16
  var workProfilePasswordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  // Number of previous work profile passwords to block. Valid values 0 to 24
  var workProfilePasswordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required,
    * atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
    */
  var workProfilePasswordRequiredType: js.UndefOr[AndroidWorkProfileRequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
  var workProfilePasswordSignInFailureCountBeforeFactoryReset: js.UndefOr[scala.Double] = js.undefined
  // Password is required or not for work profile
  var workProfileRequirePassword: js.UndefOr[scala.Boolean] = js.undefined
}

object AndroidWorkProfileGeneralDeviceConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    passwordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined,
    passwordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: scala.Int | scala.Double = null,
    securityRequireVerifyApps: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null,
    workProfileBlockAddingAccounts: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockCamera: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockCrossProfileCallerId: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockCrossProfileContactsSearch: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockCrossProfileCopyPaste: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockNotificationsWhileDeviceLocked: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBlockScreenCapture: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileBluetoothEnableContactSharing: js.UndefOr[scala.Boolean] = js.undefined,
    workProfileDataSharingType: AndroidWorkProfileCrossProfileDataSharingType = null,
    workProfileDefaultAppPermissionPolicy: AndroidWorkProfileDefaultAppPermissionPolicyType = null,
    workProfilePasswordBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined,
    workProfilePasswordBlockTrustAgents: js.UndefOr[scala.Boolean] = js.undefined,
    workProfilePasswordExpirationDays: scala.Int | scala.Double = null,
    workProfilePasswordMinLetterCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinLowerCaseCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinNonLetterCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinNumericCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinSymbolCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinUpperCaseCharacters: scala.Int | scala.Double = null,
    workProfilePasswordMinimumLength: scala.Int | scala.Double = null,
    workProfilePasswordMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    workProfilePasswordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    workProfilePasswordRequiredType: AndroidWorkProfileRequiredPasswordType = null,
    workProfilePasswordSignInFailureCountBeforeFactoryReset: scala.Int | scala.Double = null,
    workProfileRequirePassword: js.UndefOr[scala.Boolean] = js.undefined
  ): AndroidWorkProfileGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(passwordBlockFingerprintUnlock)) __obj.updateDynamic("passwordBlockFingerprintUnlock")(passwordBlockFingerprintUnlock)
    if (!js.isUndefined(passwordBlockTrustAgents)) __obj.updateDynamic("passwordBlockTrustAgents")(passwordBlockTrustAgents)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(securityRequireVerifyApps)) __obj.updateDynamic("securityRequireVerifyApps")(securityRequireVerifyApps)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileBlockAddingAccounts)) __obj.updateDynamic("workProfileBlockAddingAccounts")(workProfileBlockAddingAccounts)
    if (!js.isUndefined(workProfileBlockCamera)) __obj.updateDynamic("workProfileBlockCamera")(workProfileBlockCamera)
    if (!js.isUndefined(workProfileBlockCrossProfileCallerId)) __obj.updateDynamic("workProfileBlockCrossProfileCallerId")(workProfileBlockCrossProfileCallerId)
    if (!js.isUndefined(workProfileBlockCrossProfileContactsSearch)) __obj.updateDynamic("workProfileBlockCrossProfileContactsSearch")(workProfileBlockCrossProfileContactsSearch)
    if (!js.isUndefined(workProfileBlockCrossProfileCopyPaste)) __obj.updateDynamic("workProfileBlockCrossProfileCopyPaste")(workProfileBlockCrossProfileCopyPaste)
    if (!js.isUndefined(workProfileBlockNotificationsWhileDeviceLocked)) __obj.updateDynamic("workProfileBlockNotificationsWhileDeviceLocked")(workProfileBlockNotificationsWhileDeviceLocked)
    if (!js.isUndefined(workProfileBlockScreenCapture)) __obj.updateDynamic("workProfileBlockScreenCapture")(workProfileBlockScreenCapture)
    if (!js.isUndefined(workProfileBluetoothEnableContactSharing)) __obj.updateDynamic("workProfileBluetoothEnableContactSharing")(workProfileBluetoothEnableContactSharing)
    if (workProfileDataSharingType != null) __obj.updateDynamic("workProfileDataSharingType")(workProfileDataSharingType)
    if (workProfileDefaultAppPermissionPolicy != null) __obj.updateDynamic("workProfileDefaultAppPermissionPolicy")(workProfileDefaultAppPermissionPolicy)
    if (!js.isUndefined(workProfilePasswordBlockFingerprintUnlock)) __obj.updateDynamic("workProfilePasswordBlockFingerprintUnlock")(workProfilePasswordBlockFingerprintUnlock)
    if (!js.isUndefined(workProfilePasswordBlockTrustAgents)) __obj.updateDynamic("workProfilePasswordBlockTrustAgents")(workProfilePasswordBlockTrustAgents)
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
    if (workProfilePasswordRequiredType != null) __obj.updateDynamic("workProfilePasswordRequiredType")(workProfilePasswordRequiredType)
    if (workProfilePasswordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("workProfilePasswordSignInFailureCountBeforeFactoryReset")(workProfilePasswordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(workProfileRequirePassword)) __obj.updateDynamic("workProfileRequirePassword")(workProfileRequirePassword)
    __obj.asInstanceOf[AndroidWorkProfileGeneralDeviceConfiguration]
  }
}


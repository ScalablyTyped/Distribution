package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows81GeneralConfiguration extends DeviceConfiguration {
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.undefined
  // Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
  var applyOnlyToWindows81: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block auto fill.
  var browserBlockAutofill: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block automatic detection of Intranet sites.
  var browserBlockAutomaticDetectionOfIntranetSites: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block enterprise mode access.
  var browserBlockEnterpriseModeAccess: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using JavaScript.
  var browserBlockJavaScript: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block plug-ins.
  var browserBlockPlugins: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block popups.
  var browserBlockPopups: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from sending the do not track header.
  var browserBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block a single word entry on Intranet sites.
  var browserBlockSingleWordEntryOnIntranetSites: js.UndefOr[Boolean] = js.undefined
  // The enterprise mode site list location. Could be a local file, local network or http location.
  var browserEnterpriseModeSiteListLocation: js.UndefOr[String] = js.undefined
  // The internet security level. Possible values are: userDefined, medium, mediumHigh, high.
  var browserInternetSecurityLevel: js.UndefOr[InternetSiteSecurityLevel] = js.undefined
  // The Intranet security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserIntranetSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.undefined
  // The logging report location.
  var browserLoggingReportLocation: js.UndefOr[String] = js.undefined
  // Indicates whether or not to require a firewall.
  var browserRequireFirewall: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require fraud warning.
  var browserRequireFraudWarning: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require high security for restricted sites.
  var browserRequireHighSecurityForRestrictedSites: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require the user to use the smart screen filter.
  var browserRequireSmartScreen: js.UndefOr[Boolean] = js.undefined
  // The trusted sites security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserTrustedSitesSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.undefined
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticsBlockDataSubmission: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using a pictures password and pin.
  var passwordBlockPicturePasswordAndPin: js.UndefOr[Boolean] = js.undefined
  // Password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // The number of previous passwords to prevent re-use of. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // The number of sign in failures before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require encryption on a mobile device.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require automatic updates.
  var updatesRequireAutomaticUpdates: js.UndefOr[Boolean] = js.undefined
  /**
    * The user account control settings. Possible values are: userDefined, alwaysNotify, notifyOnAppChanges,
    * notifyOnAppChangesWithoutDimming, neverNotify.
    */
  var userAccountControlSettings: js.UndefOr[WindowsUserAccountControlSettings] = js.undefined
  // The work folders url.
  var workFoldersUrl: js.UndefOr[String] = js.undefined
}

object Windows81GeneralConfiguration {
  @scala.inline
  def apply(
    accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.undefined,
    applyOnlyToWindows81: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    browserBlockAutofill: js.UndefOr[Boolean] = js.undefined,
    browserBlockAutomaticDetectionOfIntranetSites: js.UndefOr[Boolean] = js.undefined,
    browserBlockEnterpriseModeAccess: js.UndefOr[Boolean] = js.undefined,
    browserBlockJavaScript: js.UndefOr[Boolean] = js.undefined,
    browserBlockPlugins: js.UndefOr[Boolean] = js.undefined,
    browserBlockPopups: js.UndefOr[Boolean] = js.undefined,
    browserBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.undefined,
    browserBlockSingleWordEntryOnIntranetSites: js.UndefOr[Boolean] = js.undefined,
    browserEnterpriseModeSiteListLocation: String = null,
    browserInternetSecurityLevel: InternetSiteSecurityLevel = null,
    browserIntranetSecurityLevel: SiteSecurityLevel = null,
    browserLoggingReportLocation: String = null,
    browserRequireFirewall: js.UndefOr[Boolean] = js.undefined,
    browserRequireFraudWarning: js.UndefOr[Boolean] = js.undefined,
    browserRequireHighSecurityForRestrictedSites: js.UndefOr[Boolean] = js.undefined,
    browserRequireSmartScreen: js.UndefOr[Boolean] = js.undefined,
    browserTrustedSitesSecurityLevel: SiteSecurityLevel = null,
    cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticsBlockDataSubmission: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    passwordBlockPicturePasswordAndPin: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined,
    storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.undefined,
    updatesRequireAutomaticUpdates: js.UndefOr[Boolean] = js.undefined,
    userAccountControlSettings: WindowsUserAccountControlSettings = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined,
    workFoldersUrl: String = null
  ): Windows81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsBlockAddingNonMicrosoftAccountEmail)) __obj.updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(accountsBlockAddingNonMicrosoftAccountEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applyOnlyToWindows81)) __obj.updateDynamic("applyOnlyToWindows81")(applyOnlyToWindows81.get.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockAutofill)) __obj.updateDynamic("browserBlockAutofill")(browserBlockAutofill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockAutomaticDetectionOfIntranetSites)) __obj.updateDynamic("browserBlockAutomaticDetectionOfIntranetSites")(browserBlockAutomaticDetectionOfIntranetSites.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockEnterpriseModeAccess)) __obj.updateDynamic("browserBlockEnterpriseModeAccess")(browserBlockEnterpriseModeAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockJavaScript)) __obj.updateDynamic("browserBlockJavaScript")(browserBlockJavaScript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockPlugins)) __obj.updateDynamic("browserBlockPlugins")(browserBlockPlugins.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockPopups)) __obj.updateDynamic("browserBlockPopups")(browserBlockPopups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockSendingDoNotTrackHeader)) __obj.updateDynamic("browserBlockSendingDoNotTrackHeader")(browserBlockSendingDoNotTrackHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserBlockSingleWordEntryOnIntranetSites)) __obj.updateDynamic("browserBlockSingleWordEntryOnIntranetSites")(browserBlockSingleWordEntryOnIntranetSites.get.asInstanceOf[js.Any])
    if (browserEnterpriseModeSiteListLocation != null) __obj.updateDynamic("browserEnterpriseModeSiteListLocation")(browserEnterpriseModeSiteListLocation.asInstanceOf[js.Any])
    if (browserInternetSecurityLevel != null) __obj.updateDynamic("browserInternetSecurityLevel")(browserInternetSecurityLevel.asInstanceOf[js.Any])
    if (browserIntranetSecurityLevel != null) __obj.updateDynamic("browserIntranetSecurityLevel")(browserIntranetSecurityLevel.asInstanceOf[js.Any])
    if (browserLoggingReportLocation != null) __obj.updateDynamic("browserLoggingReportLocation")(browserLoggingReportLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(browserRequireFirewall)) __obj.updateDynamic("browserRequireFirewall")(browserRequireFirewall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserRequireFraudWarning)) __obj.updateDynamic("browserRequireFraudWarning")(browserRequireFraudWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserRequireHighSecurityForRestrictedSites)) __obj.updateDynamic("browserRequireHighSecurityForRestrictedSites")(browserRequireHighSecurityForRestrictedSites.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserRequireSmartScreen)) __obj.updateDynamic("browserRequireSmartScreen")(browserRequireSmartScreen.get.asInstanceOf[js.Any])
    if (browserTrustedSitesSecurityLevel != null) __obj.updateDynamic("browserTrustedSitesSecurityLevel")(browserTrustedSitesSecurityLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming.get.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticsBlockDataSubmission)) __obj.updateDynamic("diagnosticsBlockDataSubmission")(diagnosticsBlockDataSubmission.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockPicturePasswordAndPin)) __obj.updateDynamic("passwordBlockPicturePasswordAndPin")(passwordBlockPicturePasswordAndPin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumCharacterSetCount)) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordSignInFailureCountBeforeFactoryReset)) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireDeviceEncryption)) __obj.updateDynamic("storageRequireDeviceEncryption")(storageRequireDeviceEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatesRequireAutomaticUpdates)) __obj.updateDynamic("updatesRequireAutomaticUpdates")(updatesRequireAutomaticUpdates.get.asInstanceOf[js.Any])
    if (userAccountControlSettings != null) __obj.updateDynamic("userAccountControlSettings")(userAccountControlSettings.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (workFoldersUrl != null) __obj.updateDynamic("workFoldersUrl")(workFoldersUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows81GeneralConfiguration]
  }
}


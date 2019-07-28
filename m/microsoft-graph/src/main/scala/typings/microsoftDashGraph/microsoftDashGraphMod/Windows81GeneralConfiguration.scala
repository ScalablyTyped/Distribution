package typings.microsoftDashGraph.microsoftDashGraphMod

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
    passwordExpirationDays: Int | Double = null,
    passwordMinimumCharacterSetCount: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: Int | Double = null,
    passwordPreviousPasswordBlockCount: Int | Double = null,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: Int | Double = null,
    storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.undefined,
    updatesRequireAutomaticUpdates: js.UndefOr[Boolean] = js.undefined,
    userAccountControlSettings: WindowsUserAccountControlSettings = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null,
    workFoldersUrl: String = null
  ): Windows81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsBlockAddingNonMicrosoftAccountEmail)) __obj.updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(accountsBlockAddingNonMicrosoftAccountEmail)
    if (!js.isUndefined(applyOnlyToWindows81)) __obj.updateDynamic("applyOnlyToWindows81")(applyOnlyToWindows81)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(browserBlockAutofill)) __obj.updateDynamic("browserBlockAutofill")(browserBlockAutofill)
    if (!js.isUndefined(browserBlockAutomaticDetectionOfIntranetSites)) __obj.updateDynamic("browserBlockAutomaticDetectionOfIntranetSites")(browserBlockAutomaticDetectionOfIntranetSites)
    if (!js.isUndefined(browserBlockEnterpriseModeAccess)) __obj.updateDynamic("browserBlockEnterpriseModeAccess")(browserBlockEnterpriseModeAccess)
    if (!js.isUndefined(browserBlockJavaScript)) __obj.updateDynamic("browserBlockJavaScript")(browserBlockJavaScript)
    if (!js.isUndefined(browserBlockPlugins)) __obj.updateDynamic("browserBlockPlugins")(browserBlockPlugins)
    if (!js.isUndefined(browserBlockPopups)) __obj.updateDynamic("browserBlockPopups")(browserBlockPopups)
    if (!js.isUndefined(browserBlockSendingDoNotTrackHeader)) __obj.updateDynamic("browserBlockSendingDoNotTrackHeader")(browserBlockSendingDoNotTrackHeader)
    if (!js.isUndefined(browserBlockSingleWordEntryOnIntranetSites)) __obj.updateDynamic("browserBlockSingleWordEntryOnIntranetSites")(browserBlockSingleWordEntryOnIntranetSites)
    if (browserEnterpriseModeSiteListLocation != null) __obj.updateDynamic("browserEnterpriseModeSiteListLocation")(browserEnterpriseModeSiteListLocation)
    if (browserInternetSecurityLevel != null) __obj.updateDynamic("browserInternetSecurityLevel")(browserInternetSecurityLevel)
    if (browserIntranetSecurityLevel != null) __obj.updateDynamic("browserIntranetSecurityLevel")(browserIntranetSecurityLevel)
    if (browserLoggingReportLocation != null) __obj.updateDynamic("browserLoggingReportLocation")(browserLoggingReportLocation)
    if (!js.isUndefined(browserRequireFirewall)) __obj.updateDynamic("browserRequireFirewall")(browserRequireFirewall)
    if (!js.isUndefined(browserRequireFraudWarning)) __obj.updateDynamic("browserRequireFraudWarning")(browserRequireFraudWarning)
    if (!js.isUndefined(browserRequireHighSecurityForRestrictedSites)) __obj.updateDynamic("browserRequireHighSecurityForRestrictedSites")(browserRequireHighSecurityForRestrictedSites)
    if (!js.isUndefined(browserRequireSmartScreen)) __obj.updateDynamic("browserRequireSmartScreen")(browserRequireSmartScreen)
    if (browserTrustedSitesSecurityLevel != null) __obj.updateDynamic("browserTrustedSitesSecurityLevel")(browserTrustedSitesSecurityLevel)
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(diagnosticsBlockDataSubmission)) __obj.updateDynamic("diagnosticsBlockDataSubmission")(diagnosticsBlockDataSubmission)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(passwordBlockPicturePasswordAndPin)) __obj.updateDynamic("passwordBlockPicturePasswordAndPin")(passwordBlockPicturePasswordAndPin)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireDeviceEncryption)) __obj.updateDynamic("storageRequireDeviceEncryption")(storageRequireDeviceEncryption)
    if (!js.isUndefined(updatesRequireAutomaticUpdates)) __obj.updateDynamic("updatesRequireAutomaticUpdates")(updatesRequireAutomaticUpdates)
    if (userAccountControlSettings != null) __obj.updateDynamic("userAccountControlSettings")(userAccountControlSettings)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (workFoldersUrl != null) __obj.updateDynamic("workFoldersUrl")(workFoldersUrl)
    __obj.asInstanceOf[Windows81GeneralConfiguration]
  }
}


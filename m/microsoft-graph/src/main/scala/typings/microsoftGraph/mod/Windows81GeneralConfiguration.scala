package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows81GeneralConfiguration extends DeviceConfiguration {
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.native
  // Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
  var applyOnlyToWindows81: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block auto fill.
  var browserBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block automatic detection of Intranet sites.
  var browserBlockAutomaticDetectionOfIntranetSites: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block enterprise mode access.
  var browserBlockEnterpriseModeAccess: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using JavaScript.
  var browserBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block plug-ins.
  var browserBlockPlugins: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups.
  var browserBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from sending the do not track header.
  var browserBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block a single word entry on Intranet sites.
  var browserBlockSingleWordEntryOnIntranetSites: js.UndefOr[Boolean] = js.native
  // The enterprise mode site list location. Could be a local file, local network or http location.
  var browserEnterpriseModeSiteListLocation: js.UndefOr[String] = js.native
  // The internet security level. Possible values are: userDefined, medium, mediumHigh, high.
  var browserInternetSecurityLevel: js.UndefOr[InternetSiteSecurityLevel] = js.native
  // The Intranet security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserIntranetSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.native
  // The logging report location.
  var browserLoggingReportLocation: js.UndefOr[String] = js.native
  // Indicates whether or not to require a firewall.
  var browserRequireFirewall: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require fraud warning.
  var browserRequireFraudWarning: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require high security for restricted sites.
  var browserRequireHighSecurityForRestrictedSites: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require the user to use the smart screen filter.
  var browserRequireSmartScreen: js.UndefOr[Boolean] = js.native
  // The trusted sites security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserTrustedSitesSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticsBlockDataSubmission: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block the user from using a pictures password and pin.
  var passwordBlockPicturePasswordAndPin: js.UndefOr[Boolean] = js.native
  // Password expiration in days.
  var passwordExpirationDays: js.UndefOr[Double] = js.native
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // The number of previous passwords to prevent re-use of. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.native
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // The number of sign in failures before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.native
  // Indicates whether or not to require encryption on a mobile device.
  var storageRequireDeviceEncryption: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require automatic updates.
  var updatesRequireAutomaticUpdates: js.UndefOr[Boolean] = js.native
  /**
    * The user account control settings. Possible values are: userDefined, alwaysNotify, notifyOnAppChanges,
    * notifyOnAppChangesWithoutDimming, neverNotify.
    */
  var userAccountControlSettings: js.UndefOr[WindowsUserAccountControlSettings] = js.native
  // The work folders url.
  var workFoldersUrl: js.UndefOr[String] = js.native
}

object Windows81GeneralConfiguration {
  @scala.inline
  def apply(): Windows81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows81GeneralConfiguration]
  }
  @scala.inline
  implicit class Windows81GeneralConfigurationOps[Self <: Windows81GeneralConfiguration] (val x: Self) extends AnyVal {
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
    def setAccountsBlockAddingNonMicrosoftAccountEmail(value: Boolean): Self = this.set("accountsBlockAddingNonMicrosoftAccountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountsBlockAddingNonMicrosoftAccountEmail: Self = this.set("accountsBlockAddingNonMicrosoftAccountEmail", js.undefined)
    @scala.inline
    def setApplyOnlyToWindows81(value: Boolean): Self = this.set("applyOnlyToWindows81", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyOnlyToWindows81: Self = this.set("applyOnlyToWindows81", js.undefined)
    @scala.inline
    def setBrowserBlockAutofill(value: Boolean): Self = this.set("browserBlockAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockAutofill: Self = this.set("browserBlockAutofill", js.undefined)
    @scala.inline
    def setBrowserBlockAutomaticDetectionOfIntranetSites(value: Boolean): Self = this.set("browserBlockAutomaticDetectionOfIntranetSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockAutomaticDetectionOfIntranetSites: Self = this.set("browserBlockAutomaticDetectionOfIntranetSites", js.undefined)
    @scala.inline
    def setBrowserBlockEnterpriseModeAccess(value: Boolean): Self = this.set("browserBlockEnterpriseModeAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockEnterpriseModeAccess: Self = this.set("browserBlockEnterpriseModeAccess", js.undefined)
    @scala.inline
    def setBrowserBlockJavaScript(value: Boolean): Self = this.set("browserBlockJavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockJavaScript: Self = this.set("browserBlockJavaScript", js.undefined)
    @scala.inline
    def setBrowserBlockPlugins(value: Boolean): Self = this.set("browserBlockPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockPlugins: Self = this.set("browserBlockPlugins", js.undefined)
    @scala.inline
    def setBrowserBlockPopups(value: Boolean): Self = this.set("browserBlockPopups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockPopups: Self = this.set("browserBlockPopups", js.undefined)
    @scala.inline
    def setBrowserBlockSendingDoNotTrackHeader(value: Boolean): Self = this.set("browserBlockSendingDoNotTrackHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockSendingDoNotTrackHeader: Self = this.set("browserBlockSendingDoNotTrackHeader", js.undefined)
    @scala.inline
    def setBrowserBlockSingleWordEntryOnIntranetSites(value: Boolean): Self = this.set("browserBlockSingleWordEntryOnIntranetSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserBlockSingleWordEntryOnIntranetSites: Self = this.set("browserBlockSingleWordEntryOnIntranetSites", js.undefined)
    @scala.inline
    def setBrowserEnterpriseModeSiteListLocation(value: String): Self = this.set("browserEnterpriseModeSiteListLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserEnterpriseModeSiteListLocation: Self = this.set("browserEnterpriseModeSiteListLocation", js.undefined)
    @scala.inline
    def setBrowserInternetSecurityLevel(value: InternetSiteSecurityLevel): Self = this.set("browserInternetSecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserInternetSecurityLevel: Self = this.set("browserInternetSecurityLevel", js.undefined)
    @scala.inline
    def setBrowserIntranetSecurityLevel(value: SiteSecurityLevel): Self = this.set("browserIntranetSecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserIntranetSecurityLevel: Self = this.set("browserIntranetSecurityLevel", js.undefined)
    @scala.inline
    def setBrowserLoggingReportLocation(value: String): Self = this.set("browserLoggingReportLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserLoggingReportLocation: Self = this.set("browserLoggingReportLocation", js.undefined)
    @scala.inline
    def setBrowserRequireFirewall(value: Boolean): Self = this.set("browserRequireFirewall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserRequireFirewall: Self = this.set("browserRequireFirewall", js.undefined)
    @scala.inline
    def setBrowserRequireFraudWarning(value: Boolean): Self = this.set("browserRequireFraudWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserRequireFraudWarning: Self = this.set("browserRequireFraudWarning", js.undefined)
    @scala.inline
    def setBrowserRequireHighSecurityForRestrictedSites(value: Boolean): Self = this.set("browserRequireHighSecurityForRestrictedSites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserRequireHighSecurityForRestrictedSites: Self = this.set("browserRequireHighSecurityForRestrictedSites", js.undefined)
    @scala.inline
    def setBrowserRequireSmartScreen(value: Boolean): Self = this.set("browserRequireSmartScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserRequireSmartScreen: Self = this.set("browserRequireSmartScreen", js.undefined)
    @scala.inline
    def setBrowserTrustedSitesSecurityLevel(value: SiteSecurityLevel): Self = this.set("browserTrustedSitesSecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserTrustedSitesSecurityLevel: Self = this.set("browserTrustedSitesSecurityLevel", js.undefined)
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = this.set("cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockDataRoaming: Self = this.set("cellularBlockDataRoaming", js.undefined)
    @scala.inline
    def setDiagnosticsBlockDataSubmission(value: Boolean): Self = this.set("diagnosticsBlockDataSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticsBlockDataSubmission: Self = this.set("diagnosticsBlockDataSubmission", js.undefined)
    @scala.inline
    def setPasswordBlockPicturePasswordAndPin(value: Boolean): Self = this.set("passwordBlockPicturePasswordAndPin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordBlockPicturePasswordAndPin: Self = this.set("passwordBlockPicturePasswordAndPin", js.undefined)
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
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: Double): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: Double): Self = this.set("passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    @scala.inline
    def setStorageRequireDeviceEncryption(value: Boolean): Self = this.set("storageRequireDeviceEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageRequireDeviceEncryption: Self = this.set("storageRequireDeviceEncryption", js.undefined)
    @scala.inline
    def setUpdatesRequireAutomaticUpdates(value: Boolean): Self = this.set("updatesRequireAutomaticUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatesRequireAutomaticUpdates: Self = this.set("updatesRequireAutomaticUpdates", js.undefined)
    @scala.inline
    def setUserAccountControlSettings(value: WindowsUserAccountControlSettings): Self = this.set("userAccountControlSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAccountControlSettings: Self = this.set("userAccountControlSettings", js.undefined)
    @scala.inline
    def setWorkFoldersUrl(value: String): Self = this.set("workFoldersUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkFoldersUrl: Self = this.set("workFoldersUrl", js.undefined)
  }
  
}


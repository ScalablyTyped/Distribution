package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows81GeneralConfiguration
  extends StObject
     with DeviceConfiguration {
  
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
  var browserEnterpriseModeSiteListLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The internet security level. Possible values are: userDefined, medium, mediumHigh, high.
  var browserInternetSecurityLevel: js.UndefOr[InternetSiteSecurityLevel] = js.undefined
  
  // The Intranet security level. Possible values are: userDefined, low, mediumLow, medium, mediumHigh, high.
  var browserIntranetSecurityLevel: js.UndefOr[SiteSecurityLevel] = js.undefined
  
  // The logging report location.
  var browserLoggingReportLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The minimum password length.
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of previous passwords to prevent re-use of. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // The number of sign in failures before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.undefined
  
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
  var workFoldersUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object Windows81GeneralConfiguration {
  
  @scala.inline
  def apply(): Windows81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows81GeneralConfiguration]
  }
  
  @scala.inline
  implicit class Windows81GeneralConfigurationMutableBuilder[Self <: Windows81GeneralConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountsBlockAddingNonMicrosoftAccountEmail(value: Boolean): Self = StObject.set(x, "accountsBlockAddingNonMicrosoftAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsBlockAddingNonMicrosoftAccountEmailUndefined: Self = StObject.set(x, "accountsBlockAddingNonMicrosoftAccountEmail", js.undefined)
    
    @scala.inline
    def setApplyOnlyToWindows81(value: Boolean): Self = StObject.set(x, "applyOnlyToWindows81", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyOnlyToWindows81Undefined: Self = StObject.set(x, "applyOnlyToWindows81", js.undefined)
    
    @scala.inline
    def setBrowserBlockAutofill(value: Boolean): Self = StObject.set(x, "browserBlockAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockAutofillUndefined: Self = StObject.set(x, "browserBlockAutofill", js.undefined)
    
    @scala.inline
    def setBrowserBlockAutomaticDetectionOfIntranetSites(value: Boolean): Self = StObject.set(x, "browserBlockAutomaticDetectionOfIntranetSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockAutomaticDetectionOfIntranetSitesUndefined: Self = StObject.set(x, "browserBlockAutomaticDetectionOfIntranetSites", js.undefined)
    
    @scala.inline
    def setBrowserBlockEnterpriseModeAccess(value: Boolean): Self = StObject.set(x, "browserBlockEnterpriseModeAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockEnterpriseModeAccessUndefined: Self = StObject.set(x, "browserBlockEnterpriseModeAccess", js.undefined)
    
    @scala.inline
    def setBrowserBlockJavaScript(value: Boolean): Self = StObject.set(x, "browserBlockJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockJavaScriptUndefined: Self = StObject.set(x, "browserBlockJavaScript", js.undefined)
    
    @scala.inline
    def setBrowserBlockPlugins(value: Boolean): Self = StObject.set(x, "browserBlockPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockPluginsUndefined: Self = StObject.set(x, "browserBlockPlugins", js.undefined)
    
    @scala.inline
    def setBrowserBlockPopups(value: Boolean): Self = StObject.set(x, "browserBlockPopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockPopupsUndefined: Self = StObject.set(x, "browserBlockPopups", js.undefined)
    
    @scala.inline
    def setBrowserBlockSendingDoNotTrackHeader(value: Boolean): Self = StObject.set(x, "browserBlockSendingDoNotTrackHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockSendingDoNotTrackHeaderUndefined: Self = StObject.set(x, "browserBlockSendingDoNotTrackHeader", js.undefined)
    
    @scala.inline
    def setBrowserBlockSingleWordEntryOnIntranetSites(value: Boolean): Self = StObject.set(x, "browserBlockSingleWordEntryOnIntranetSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserBlockSingleWordEntryOnIntranetSitesUndefined: Self = StObject.set(x, "browserBlockSingleWordEntryOnIntranetSites", js.undefined)
    
    @scala.inline
    def setBrowserEnterpriseModeSiteListLocation(value: NullableOption[String]): Self = StObject.set(x, "browserEnterpriseModeSiteListLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserEnterpriseModeSiteListLocationNull: Self = StObject.set(x, "browserEnterpriseModeSiteListLocation", null)
    
    @scala.inline
    def setBrowserEnterpriseModeSiteListLocationUndefined: Self = StObject.set(x, "browserEnterpriseModeSiteListLocation", js.undefined)
    
    @scala.inline
    def setBrowserInternetSecurityLevel(value: InternetSiteSecurityLevel): Self = StObject.set(x, "browserInternetSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserInternetSecurityLevelUndefined: Self = StObject.set(x, "browserInternetSecurityLevel", js.undefined)
    
    @scala.inline
    def setBrowserIntranetSecurityLevel(value: SiteSecurityLevel): Self = StObject.set(x, "browserIntranetSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserIntranetSecurityLevelUndefined: Self = StObject.set(x, "browserIntranetSecurityLevel", js.undefined)
    
    @scala.inline
    def setBrowserLoggingReportLocation(value: NullableOption[String]): Self = StObject.set(x, "browserLoggingReportLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserLoggingReportLocationNull: Self = StObject.set(x, "browserLoggingReportLocation", null)
    
    @scala.inline
    def setBrowserLoggingReportLocationUndefined: Self = StObject.set(x, "browserLoggingReportLocation", js.undefined)
    
    @scala.inline
    def setBrowserRequireFirewall(value: Boolean): Self = StObject.set(x, "browserRequireFirewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserRequireFirewallUndefined: Self = StObject.set(x, "browserRequireFirewall", js.undefined)
    
    @scala.inline
    def setBrowserRequireFraudWarning(value: Boolean): Self = StObject.set(x, "browserRequireFraudWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserRequireFraudWarningUndefined: Self = StObject.set(x, "browserRequireFraudWarning", js.undefined)
    
    @scala.inline
    def setBrowserRequireHighSecurityForRestrictedSites(value: Boolean): Self = StObject.set(x, "browserRequireHighSecurityForRestrictedSites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserRequireHighSecurityForRestrictedSitesUndefined: Self = StObject.set(x, "browserRequireHighSecurityForRestrictedSites", js.undefined)
    
    @scala.inline
    def setBrowserRequireSmartScreen(value: Boolean): Self = StObject.set(x, "browserRequireSmartScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserRequireSmartScreenUndefined: Self = StObject.set(x, "browserRequireSmartScreen", js.undefined)
    
    @scala.inline
    def setBrowserTrustedSitesSecurityLevel(value: SiteSecurityLevel): Self = StObject.set(x, "browserTrustedSitesSecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserTrustedSitesSecurityLevelUndefined: Self = StObject.set(x, "browserTrustedSitesSecurityLevel", js.undefined)
    
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockDataRoamingUndefined: Self = StObject.set(x, "cellularBlockDataRoaming", js.undefined)
    
    @scala.inline
    def setDiagnosticsBlockDataSubmission(value: Boolean): Self = StObject.set(x, "diagnosticsBlockDataSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsBlockDataSubmissionUndefined: Self = StObject.set(x, "diagnosticsBlockDataSubmission", js.undefined)
    
    @scala.inline
    def setPasswordBlockPicturePasswordAndPin(value: Boolean): Self = StObject.set(x, "passwordBlockPicturePasswordAndPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockPicturePasswordAndPinUndefined: Self = StObject.set(x, "passwordBlockPicturePasswordAndPin", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = StObject.set(x, "passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordExpirationDaysUndefined: Self = StObject.set(x, "passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = StObject.set(x, "passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passwordMinimumCharacterSetCount", js.undefined)
    
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
    def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setStorageRequireDeviceEncryption(value: Boolean): Self = StObject.set(x, "storageRequireDeviceEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireDeviceEncryptionUndefined: Self = StObject.set(x, "storageRequireDeviceEncryption", js.undefined)
    
    @scala.inline
    def setUpdatesRequireAutomaticUpdates(value: Boolean): Self = StObject.set(x, "updatesRequireAutomaticUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesRequireAutomaticUpdatesUndefined: Self = StObject.set(x, "updatesRequireAutomaticUpdates", js.undefined)
    
    @scala.inline
    def setUserAccountControlSettings(value: WindowsUserAccountControlSettings): Self = StObject.set(x, "userAccountControlSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccountControlSettingsUndefined: Self = StObject.set(x, "userAccountControlSettings", js.undefined)
    
    @scala.inline
    def setWorkFoldersUrl(value: NullableOption[String]): Self = StObject.set(x, "workFoldersUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkFoldersUrlNull: Self = StObject.set(x, "workFoldersUrl", null)
    
    @scala.inline
    def setWorkFoldersUrlUndefined: Self = StObject.set(x, "workFoldersUrl", js.undefined)
  }
}

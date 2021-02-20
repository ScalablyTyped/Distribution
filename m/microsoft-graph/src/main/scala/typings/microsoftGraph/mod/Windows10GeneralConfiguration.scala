package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10GeneralConfiguration extends DeviceConfiguration {
  
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
  var antiTheftModeBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether apps from AppX packages signed with a trusted certificate can be side loaded. Possible values are:
    * notConfigured, blocked, allowed.
    */
  var appsAllowTrustedAppsSideloading: js.UndefOr[StateManagementSetting] = js.native
  
  /**
    * Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were
    * downloaded.
    */
  var appsBlockWindowsStoreOriginatedApps: js.UndefOr[Boolean] = js.native
  
  // Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
  var bluetoothAllowedServices: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Whether or not to Block the user from using bluetooth advertising.
  var bluetoothBlockAdvertising: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using bluetooth discoverable mode.
  var bluetoothBlockDiscoverableMode: js.UndefOr[Boolean] = js.native
  
  // Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
  var bluetoothBlockPrePairing: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using data over cellular while roaming.
  var cellularBlockDataWhenRoaming: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using VPN over cellular.
  var cellularBlockVpn: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using VPN when roaming over cellular.
  var cellularBlockVpnWhenRoaming: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from doing manual root certificate installation.
  var certificatesBlockManualRootCertificateInstallation: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote
    * messaging, remote app sessions and other cross-device experiences.
    */
  var connectedDevicesServiceBlocked: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using copy paste.
  var copyPasteBlocked: js.UndefOr[Boolean] = js.native
  
  // Whether or not to Block the user from using Cortana.
  var cortanaBlocked: js.UndefOr[Boolean] = js.native
  
  // Whether or not to block end user access to Defender.
  var defenderBlockEndUserAccess: js.UndefOr[Boolean] = js.native
  
  // Specifies the level of cloud-delivered protection. Possible values are: notConfigured, high, highPlus, zeroTolerance.
  var defenderCloudBlockLevel: js.UndefOr[DefenderCloudBlockLevelType] = js.native
  
  // Number of days before deleting quarantined malware. Valid values 0 to 90
  var defenderDaysBeforeDeletingQuarantinedMalware: js.UndefOr[NullableOption[Double]] = js.native
  
  // Gets or sets Defender’s actions to take on detected Malware per threat level.
  var defenderDetectedMalwareActions: js.UndefOr[NullableOption[DefenderDetectedMalwareActions]] = js.native
  
  // File extensions to exclude from scans and real time protection.
  var defenderFileExtensionsToExclude: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Files and folder to exclude from scans and real time protection.
  var defenderFilesAndFoldersToExclude: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Value for monitoring file activity. Possible values are: userDefined, disable, monitorAllFiles,
    * monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
    */
  var defenderMonitorFileActivity: js.UndefOr[DefenderMonitorFileActivity] = js.native
  
  // Processes to exclude from scans and real time protection.
  var defenderProcessesToExclude: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * The configuration for how to prompt user for sample submission. Possible values are: userDefined, alwaysPrompt,
    * promptBeforeSendingPersonalData, neverSendData, sendAllDataWithoutPrompting.
    */
  var defenderPromptForSampleSubmission: js.UndefOr[DefenderPromptForSampleSubmission] = js.native
  
  // Indicates whether or not to require behavior monitoring.
  var defenderRequireBehaviorMonitoring: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to require cloud protection.
  var defenderRequireCloudProtection: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to require network inspection system.
  var defenderRequireNetworkInspectionSystem: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to require real time monitoring.
  var defenderRequireRealTimeMonitoring: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan archive files.
  var defenderScanArchiveFiles: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan downloads.
  var defenderScanDownloads: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan incoming mail messages.
  var defenderScanIncomingMail: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan mapped network drives during full scan.
  var defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[Boolean] = js.native
  
  // Max CPU usage percentage during scan. Valid values 0 to 100
  var defenderScanMaxCpu: js.UndefOr[NullableOption[Double]] = js.native
  
  // Indicates whether or not to scan files opened from a network folder.
  var defenderScanNetworkFiles: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan removable drives during full scan.
  var defenderScanRemovableDrivesDuringFullScan: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to scan scripts loaded in Internet Explorer browser.
  var defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[Boolean] = js.native
  
  // The defender system scan type. Possible values are: userDefined, disabled, quick, full.
  var defenderScanType: js.UndefOr[DefenderScanType] = js.native
  
  // The time to perform a daily quick scan.
  var defenderScheduledQuickScanTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The defender time for the system scan.
  var defenderScheduledScanTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
  var defenderSignatureUpdateIntervalInHours: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Defender day of the week for the system scan. Possible values are: userDefined, everyday, sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday.
    */
  var defenderSystemScanSchedule: js.UndefOr[WeeklySchedule] = js.native
  
  // Indicates whether or not to allow developer unlock. Possible values are: notConfigured, blocked, allowed.
  var developerUnlockSetting: js.UndefOr[StateManagementSetting] = js.native
  
  // Indicates whether or not to Block the user from resetting their phone.
  var deviceManagementBlockFactoryResetOnMobile: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from doing manual un-enrollment from device management.
  var deviceManagementBlockManualUnenroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets a value allowing the device to send diagnostic and usage telemetry data, such as Watson. Possible values
    * are: userDefined, none, basic, enhanced, full.
    */
  var diagnosticsDataSubmissionMode: js.UndefOr[DiagnosticDataSubmissionMode] = js.native
  
  /**
    * Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see
    * by default when they open Edge.
    */
  var edgeAllowStartPagesModification: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to prevent access to about flags on Edge browser.
  var edgeBlockAccessToAboutFlags: js.UndefOr[Boolean] = js.native
  
  /**
    * Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections
    * from Microsoft Edge to Microsoft services.
    */
  var edgeBlockAddressBarDropdown: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block auto fill.
  var edgeBlockAutofill: js.UndefOr[Boolean] = js.native
  
  /**
    * Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with
    * known compatibility issues.
    */
  var edgeBlockCompatibilityList: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block developer tools in the Edge browser.
  var edgeBlockDeveloperTools: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block extensions in the Edge browser.
  var edgeBlockExtensions: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
  var edgeBlockInPrivateBrowsing: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using JavaScript.
  var edgeBlockJavaScript: js.UndefOr[Boolean] = js.native
  
  /**
    * Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft
    * Edge.
    */
  var edgeBlockLiveTileDataCollection: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block password manager.
  var edgeBlockPasswordManager: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block popups.
  var edgeBlockPopups: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from using the search suggestions in the address bar.
  var edgeBlockSearchSuggestions: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from sending the do not track header.
  var edgeBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property
    * is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
    */
  var edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using the Edge browser.
  var edgeBlocked: js.UndefOr[Boolean] = js.native
  
  // Clear browsing data on exiting Microsoft Edge.
  var edgeClearBrowsingDataOnExit: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates which cookies to block in the Edge browser. Possible values are: userDefined, allow, blockThirdParty,
    * blockAll.
    */
  var edgeCookiePolicy: js.UndefOr[EdgeCookiePolicy] = js.native
  
  /**
    * Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those
    * enrolled in zero emissions configurations, to block this page.
    */
  var edgeDisableFirstRunPage: js.UndefOr[Boolean] = js.native
  
  // Indicates the enterprise mode site list location. Could be a local file, local network or http location.
  var edgeEnterpriseModeSiteListLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // The first run URL for when Edge browser is opened for the first time.
  var edgeFirstRunUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
  var edgeHomepageUrls: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Indicates whether or not to Require the user to use the smart screen filter.
  var edgeRequireSmartScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their
    * default search engine provided the AllowSearchEngineCustomization policy is not set.
    */
  var edgeSearchEngine: js.UndefOr[NullableOption[EdgeSearchEngineBase]] = js.native
  
  // Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
  var edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order
    * changes to favorites are shared between browsers.
    */
  var edgeSyncFavoritesWithInternetExplorer: js.UndefOr[Boolean] = js.native
  
  // Endpoint for discovering cloud printers.
  var enterpriseCloudPrintDiscoveryEndPoint: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid
    * values 1 to 65535
    */
  var enterpriseCloudPrintDiscoveryMaxLimit: js.UndefOr[NullableOption[Double]] = js.native
  
  // OAuth resource URI for printer discovery service as configured in Azure portal.
  var enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // Authentication endpoint for acquiring OAuth tokens.
  var enterpriseCloudPrintOAuthAuthority: js.UndefOr[NullableOption[String]] = js.native
  
  // GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
  var enterpriseCloudPrintOAuthClientIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // OAuth resource URI for print service as configured in the Azure portal.
  var enterpriseCloudPrintResourceIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether or not to enable device discovery UX.
  var experienceBlockDeviceDiscovery: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
  var experienceBlockErrorDialogWhenNoSIM: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to enable task switching on the device.
  var experienceBlockTaskSwitcher: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block DVR and broadcasting.
  var gameDvrBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using internet sharing.
  var internetSharingBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows
    * 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
    */
  var lockScreenAllowTimeoutConfiguration: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block action center notifications over lock screen.
  var lockScreenBlockActionCenterNotifications: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not the user can interact with Cortana using speech while the system is locked.
  var lockScreenBlockCortana: js.UndefOr[Boolean] = js.native
  
  // Indicates whether to allow toast notifications above the device lock screen.
  var lockScreenBlockToastNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices.
    * Supported values are 11-1800. Valid values 11 to 1800
    */
  var lockScreenTimeoutInSeconds: js.UndefOr[NullableOption[Double]] = js.native
  
  // Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
  var logonBlockFastUserSwitching: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block Microsoft account settings sync.
  var microsoftAccountBlockSettingsSync: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block a Microsoft account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to
    * the user account that’s enrolled into MDM.
    */
  var networkProxyApplySettingsDeviceWide: js.UndefOr[Boolean] = js.native
  
  // Address to the proxy auto-config (PAC) script you want to use.
  var networkProxyAutomaticConfigurationUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC)
    * script.
    */
  var networkProxyDisableAutoDetect: js.UndefOr[Boolean] = js.native
  
  // Specifies manual proxy server settings.
  var networkProxyServer: js.UndefOr[NullableOption[Windows10NetworkProxyServer]] = js.native
  
  // Indicates whether or not to Block the user from using near field communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.native
  
  // Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
  var oneDriveDisableFileSync: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the
    * use of picture passwords.
    */
  var passwordBlockSimple: js.UndefOr[Boolean] = js.native
  
  // The password expiration in days. Valid values 0 to 730
  var passwordExpirationDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of previous passwords to prevent reuse of. Valid values 0 to 50
  var passwordPreviousPasswordBlockCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // Indicates whether or not to require a password upon resuming from an idle state.
  var passwordRequireWhenResumeFromIdleState: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to require the user to have a password.
  var passwordRequired: js.UndefOr[Boolean] = js.native
  
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  
  // The number of sign in failures before factory reset. Valid values 0 to 999
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url
    * to a local image on the file system that needs to used as the Desktop Image.
    */
  var personalizationDesktopImageUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a
    * file Url to a local image on the file system that needs to be used as the Lock Screen Image.
    */
  var personalizationLockScreenImageUrl: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Enables or disables the use of advertising ID. Added in Windows 10, version 1607. Possible values are: notConfigured,
    * blocked, allowed.
    */
  var privacyAdvertisingId: js.UndefOr[StateManagementSetting] = js.native
  
  /**
    * Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when
    * launching apps.
    */
  var privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store
    * applications.
    */
  var privacyBlockInputPersonalization: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from reset protection mode.
  var resetProtectionModeBlocked: js.UndefOr[Boolean] = js.native
  
  // Specifies what filter level of safe search is required. Possible values are: userDefined, strict, moderate.
  var safeSearchFilter: js.UndefOr[SafeSearchFilterType] = js.native
  
  // Indicates whether or not to Block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  
  // Specifies if search can use diacritics.
  var searchBlockDiacritics: js.UndefOr[Boolean] = js.native
  
  // Specifies whether to use automatic language detection when indexing content and properties.
  var searchDisableAutoLanguageDetection: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to disable the search indexer backoff feature.
  var searchDisableIndexerBackoff: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for
    * Cortana or Explorer.
    */
  var searchDisableIndexingEncryptedItems: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
  var searchDisableIndexingRemovableDrive: js.UndefOr[Boolean] = js.native
  
  // Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
  var searchEnableAutomaticIndexSizeManangement: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block remote queries of this computer’s index.
  var searchEnableRemoteQueries: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Accounts in Settings app.
  var settingsBlockAccountsPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from installing provisioning packages.
  var settingsBlockAddProvisioningPackage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Apps in Settings app.
  var settingsBlockAppsPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from changing the language settings.
  var settingsBlockChangeLanguage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from changing power and sleep settings.
  var settingsBlockChangePowerSleep: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from changing the region settings.
  var settingsBlockChangeRegion: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from changing date and time settings.
  var settingsBlockChangeSystemTime: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Devices in Settings app.
  var settingsBlockDevicesPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Ease of Access in Settings app.
  var settingsBlockEaseOfAccessPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from editing the device name.
  var settingsBlockEditDeviceName: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Gaming in Settings app.
  var settingsBlockGamingPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Network &amp; Internet in Settings app.
  var settingsBlockNetworkInternetPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Personalization in Settings app.
  var settingsBlockPersonalizationPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Privacy in Settings app.
  var settingsBlockPrivacyPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
  var settingsBlockRemoveProvisioningPackage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Settings app.
  var settingsBlockSettingsApp: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to System in Settings app.
  var settingsBlockSystemPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Time &amp; Language in Settings app.
  var settingsBlockTimeLanguagePage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block access to Update &amp; Security in Settings app.
  var settingsBlockUpdateSecurityPage: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block multiple users of the same app to share data.
  var sharedUserAppDataAllowed: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
  var smartScreenBlockPromptOverride: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
  var smartScreenBlockPromptOverrideForFiles: js.UndefOr[Boolean] = js.native
  
  // Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
  var smartScreenEnableAppInstallControl: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to block the user from unpinning apps from taskbar.
  var startBlockUnpinningAppsFromTaskbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Setting the value of this collapses the app list, removes the app list entirely, or disables the corresponding toggle
    * in the Settings app. Possible values are: userDefined, collapse, remove, disableSettingsApp.
    */
  var startMenuAppListVisibility: js.UndefOr[WindowsStartMenuAppListVisibilityType] = js.native
  
  // Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
  var startMenuHideChangeAccountSettings: js.UndefOr[Boolean] = js.native
  
  /**
    * Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in
    * the Settings app.
    */
  var startMenuHideFrequentlyUsedApps: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides hibernate from appearing in the power button in the start menu.
  var startMenuHideHibernate: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides lock from appearing in the user tile in the start menu.
  var startMenuHideLock: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides the power button from appearing in the start menu.
  var startMenuHidePowerButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding
    * toggle in the Settings app.
    */
  var startMenuHideRecentJumpLists: js.UndefOr[Boolean] = js.native
  
  /**
    * Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle
    * in the Settings app.
    */
  var startMenuHideRecentlyAddedApps: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
  var startMenuHideRestartOptions: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
  var startMenuHideShutDown: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides sign out from appearing in the user tile in the start menu.
  var startMenuHideSignOut: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides sleep from appearing in the power button in the start menu.
  var startMenuHideSleep: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides switch account from appearing in the user tile in the start menu.
  var startMenuHideSwitchAccount: js.UndefOr[Boolean] = js.native
  
  // Enabling this policy hides the user tile from appearing in the start menu.
  var startMenuHideUserTile: js.UndefOr[Boolean] = js.native
  
  /**
    * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can
    * contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause
    * Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is
    * modified. The value should be a UTF-8 Base64 encoded byte array.
    */
  var startMenuLayoutEdgeAssetsXml: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified
    * by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
    */
  var startMenuLayoutXml: js.UndefOr[NullableOption[Double]] = js.native
  
  // Allows admins to decide how the Start menu is displayed. Possible values are: userDefined, fullScreen, nonFullScreen.
  var startMenuMode: js.UndefOr[WindowsStartMenuModeType] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Documents folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDocuments: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Downloads folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDownloads: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the FileExplorer shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderFileExplorer: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the HomeGroup folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderHomeGroup: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Music folder shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderMusic: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Network folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderNetwork: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the PersonalFolder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPersonalFolder: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Pictures folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPictures: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Settings folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderSettings: js.UndefOr[VisibilitySetting] = js.native
  
  /**
    * Enforces the visibility (Show/Hide) of the Videos folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderVideos: js.UndefOr[VisibilitySetting] = js.native
  
  // Indicates whether or not to Block the user from using removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.native
  
  // Indicating whether or not to require encryption on a mobile device.
  var storageRequireMobileDeviceEncryption: js.UndefOr[Boolean] = js.native
  
  // Indicates whether application data is restricted to the system drive.
  var storageRestrictAppDataToSystemVolume: js.UndefOr[Boolean] = js.native
  
  // Indicates whether the installation of applications is restricted to the system drive.
  var storageRestrictAppInstallToSystemVolume: js.UndefOr[Boolean] = js.native
  
  // Whether the device is required to connect to the network.
  var tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from USB connection.
  var usbBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from voice recording.
  var voiceRecordingBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
  var webRtcBlockLocalhostIpAddress: js.UndefOr[Boolean] = js.native
  
  // Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wiFiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using Wi-Fi manual configuration.
  var wiFiBlockManualConfiguration: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low
    * frequency. Valid values 1 to 500
    */
  var wiFiScanInterval: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership
    * notifications, Post-OOBE app install and redirect tiles.
    */
  var windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[Boolean] = js.native
  
  /**
    * Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce
    * users to what is new or changed
    */
  var windowsSpotlightBlockOnActionCenter: js.UndefOr[Boolean] = js.native
  
  // Block personalized content in Windows spotlight based on user’s device usage.
  var windowsSpotlightBlockTailoredExperiences: js.UndefOr[Boolean] = js.native
  
  // Block third party content delivered via Windows Spotlight
  var windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[Boolean] = js.native
  
  // Block Windows Spotlight Windows welcome experience
  var windowsSpotlightBlockWelcomeExperience: js.UndefOr[Boolean] = js.native
  
  // Allows IT admins to turn off the popup of Windows Tips.
  var windowsSpotlightBlockWindowsTips: js.UndefOr[Boolean] = js.native
  
  // Allows IT admins to turn off all Windows Spotlight features
  var windowsSpotlightBlocked: js.UndefOr[Boolean] = js.native
  
  // Specifies the type of Spotlight. Possible values are: notConfigured, disabled, enabled.
  var windowsSpotlightConfigureOnLockScreen: js.UndefOr[WindowsSpotlightEnablementSettings] = js.native
  
  // Indicates whether or not to block automatic update of apps from Windows Store.
  var windowsStoreBlockAutoUpdate: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block the user from using the Windows store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to enable Private Store Only.
  var windowsStoreEnablePrivateStoreOnly: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to allow other devices from discovering this PC for projection.
  var wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to allow user input from wireless display receiver.
  var wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to require a PIN for new devices to initiate pairing.
  var wirelessDisplayRequirePinForPairing: js.UndefOr[Boolean] = js.native
}
object Windows10GeneralConfiguration {
  
  @scala.inline
  def apply(): Windows10GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10GeneralConfiguration]
  }
  
  @scala.inline
  implicit class Windows10GeneralConfigurationMutableBuilder[Self <: Windows10GeneralConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountsBlockAddingNonMicrosoftAccountEmail(value: Boolean): Self = StObject.set(x, "accountsBlockAddingNonMicrosoftAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsBlockAddingNonMicrosoftAccountEmailUndefined: Self = StObject.set(x, "accountsBlockAddingNonMicrosoftAccountEmail", js.undefined)
    
    @scala.inline
    def setAntiTheftModeBlocked(value: Boolean): Self = StObject.set(x, "antiTheftModeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntiTheftModeBlockedUndefined: Self = StObject.set(x, "antiTheftModeBlocked", js.undefined)
    
    @scala.inline
    def setAppsAllowTrustedAppsSideloading(value: StateManagementSetting): Self = StObject.set(x, "appsAllowTrustedAppsSideloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsAllowTrustedAppsSideloadingUndefined: Self = StObject.set(x, "appsAllowTrustedAppsSideloading", js.undefined)
    
    @scala.inline
    def setAppsBlockWindowsStoreOriginatedApps(value: Boolean): Self = StObject.set(x, "appsBlockWindowsStoreOriginatedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsBlockWindowsStoreOriginatedAppsUndefined: Self = StObject.set(x, "appsBlockWindowsStoreOriginatedApps", js.undefined)
    
    @scala.inline
    def setBluetoothAllowedServices(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "bluetoothAllowedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothAllowedServicesNull: Self = StObject.set(x, "bluetoothAllowedServices", null)
    
    @scala.inline
    def setBluetoothAllowedServicesUndefined: Self = StObject.set(x, "bluetoothAllowedServices", js.undefined)
    
    @scala.inline
    def setBluetoothAllowedServicesVarargs(value: String*): Self = StObject.set(x, "bluetoothAllowedServices", js.Array(value :_*))
    
    @scala.inline
    def setBluetoothBlockAdvertising(value: Boolean): Self = StObject.set(x, "bluetoothBlockAdvertising", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockAdvertisingUndefined: Self = StObject.set(x, "bluetoothBlockAdvertising", js.undefined)
    
    @scala.inline
    def setBluetoothBlockDiscoverableMode(value: Boolean): Self = StObject.set(x, "bluetoothBlockDiscoverableMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockDiscoverableModeUndefined: Self = StObject.set(x, "bluetoothBlockDiscoverableMode", js.undefined)
    
    @scala.inline
    def setBluetoothBlockPrePairing(value: Boolean): Self = StObject.set(x, "bluetoothBlockPrePairing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockPrePairingUndefined: Self = StObject.set(x, "bluetoothBlockPrePairing", js.undefined)
    
    @scala.inline
    def setBluetoothBlocked(value: Boolean): Self = StObject.set(x, "bluetoothBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockedUndefined: Self = StObject.set(x, "bluetoothBlocked", js.undefined)
    
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = StObject.set(x, "cameraBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraBlockedUndefined: Self = StObject.set(x, "cameraBlocked", js.undefined)
    
    @scala.inline
    def setCellularBlockDataWhenRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockDataWhenRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockDataWhenRoamingUndefined: Self = StObject.set(x, "cellularBlockDataWhenRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockVpn(value: Boolean): Self = StObject.set(x, "cellularBlockVpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockVpnUndefined: Self = StObject.set(x, "cellularBlockVpn", js.undefined)
    
    @scala.inline
    def setCellularBlockVpnWhenRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockVpnWhenRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockVpnWhenRoamingUndefined: Self = StObject.set(x, "cellularBlockVpnWhenRoaming", js.undefined)
    
    @scala.inline
    def setCertificatesBlockManualRootCertificateInstallation(value: Boolean): Self = StObject.set(x, "certificatesBlockManualRootCertificateInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesBlockManualRootCertificateInstallationUndefined: Self = StObject.set(x, "certificatesBlockManualRootCertificateInstallation", js.undefined)
    
    @scala.inline
    def setConnectedDevicesServiceBlocked(value: Boolean): Self = StObject.set(x, "connectedDevicesServiceBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedDevicesServiceBlockedUndefined: Self = StObject.set(x, "connectedDevicesServiceBlocked", js.undefined)
    
    @scala.inline
    def setCopyPasteBlocked(value: Boolean): Self = StObject.set(x, "copyPasteBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPasteBlockedUndefined: Self = StObject.set(x, "copyPasteBlocked", js.undefined)
    
    @scala.inline
    def setCortanaBlocked(value: Boolean): Self = StObject.set(x, "cortanaBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCortanaBlockedUndefined: Self = StObject.set(x, "cortanaBlocked", js.undefined)
    
    @scala.inline
    def setDefenderBlockEndUserAccess(value: Boolean): Self = StObject.set(x, "defenderBlockEndUserAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderBlockEndUserAccessUndefined: Self = StObject.set(x, "defenderBlockEndUserAccess", js.undefined)
    
    @scala.inline
    def setDefenderCloudBlockLevel(value: DefenderCloudBlockLevelType): Self = StObject.set(x, "defenderCloudBlockLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderCloudBlockLevelUndefined: Self = StObject.set(x, "defenderCloudBlockLevel", js.undefined)
    
    @scala.inline
    def setDefenderDaysBeforeDeletingQuarantinedMalware(value: NullableOption[Double]): Self = StObject.set(x, "defenderDaysBeforeDeletingQuarantinedMalware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderDaysBeforeDeletingQuarantinedMalwareNull: Self = StObject.set(x, "defenderDaysBeforeDeletingQuarantinedMalware", null)
    
    @scala.inline
    def setDefenderDaysBeforeDeletingQuarantinedMalwareUndefined: Self = StObject.set(x, "defenderDaysBeforeDeletingQuarantinedMalware", js.undefined)
    
    @scala.inline
    def setDefenderDetectedMalwareActions(value: NullableOption[DefenderDetectedMalwareActions]): Self = StObject.set(x, "defenderDetectedMalwareActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderDetectedMalwareActionsNull: Self = StObject.set(x, "defenderDetectedMalwareActions", null)
    
    @scala.inline
    def setDefenderDetectedMalwareActionsUndefined: Self = StObject.set(x, "defenderDetectedMalwareActions", js.undefined)
    
    @scala.inline
    def setDefenderFileExtensionsToExclude(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderFileExtensionsToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderFileExtensionsToExcludeNull: Self = StObject.set(x, "defenderFileExtensionsToExclude", null)
    
    @scala.inline
    def setDefenderFileExtensionsToExcludeUndefined: Self = StObject.set(x, "defenderFileExtensionsToExclude", js.undefined)
    
    @scala.inline
    def setDefenderFileExtensionsToExcludeVarargs(value: String*): Self = StObject.set(x, "defenderFileExtensionsToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderFilesAndFoldersToExclude(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderFilesAndFoldersToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderFilesAndFoldersToExcludeNull: Self = StObject.set(x, "defenderFilesAndFoldersToExclude", null)
    
    @scala.inline
    def setDefenderFilesAndFoldersToExcludeUndefined: Self = StObject.set(x, "defenderFilesAndFoldersToExclude", js.undefined)
    
    @scala.inline
    def setDefenderFilesAndFoldersToExcludeVarargs(value: String*): Self = StObject.set(x, "defenderFilesAndFoldersToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderMonitorFileActivity(value: DefenderMonitorFileActivity): Self = StObject.set(x, "defenderMonitorFileActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderMonitorFileActivityUndefined: Self = StObject.set(x, "defenderMonitorFileActivity", js.undefined)
    
    @scala.inline
    def setDefenderProcessesToExclude(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderProcessesToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderProcessesToExcludeNull: Self = StObject.set(x, "defenderProcessesToExclude", null)
    
    @scala.inline
    def setDefenderProcessesToExcludeUndefined: Self = StObject.set(x, "defenderProcessesToExclude", js.undefined)
    
    @scala.inline
    def setDefenderProcessesToExcludeVarargs(value: String*): Self = StObject.set(x, "defenderProcessesToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderPromptForSampleSubmission(value: DefenderPromptForSampleSubmission): Self = StObject.set(x, "defenderPromptForSampleSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderPromptForSampleSubmissionUndefined: Self = StObject.set(x, "defenderPromptForSampleSubmission", js.undefined)
    
    @scala.inline
    def setDefenderRequireBehaviorMonitoring(value: Boolean): Self = StObject.set(x, "defenderRequireBehaviorMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderRequireBehaviorMonitoringUndefined: Self = StObject.set(x, "defenderRequireBehaviorMonitoring", js.undefined)
    
    @scala.inline
    def setDefenderRequireCloudProtection(value: Boolean): Self = StObject.set(x, "defenderRequireCloudProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderRequireCloudProtectionUndefined: Self = StObject.set(x, "defenderRequireCloudProtection", js.undefined)
    
    @scala.inline
    def setDefenderRequireNetworkInspectionSystem(value: Boolean): Self = StObject.set(x, "defenderRequireNetworkInspectionSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderRequireNetworkInspectionSystemUndefined: Self = StObject.set(x, "defenderRequireNetworkInspectionSystem", js.undefined)
    
    @scala.inline
    def setDefenderRequireRealTimeMonitoring(value: Boolean): Self = StObject.set(x, "defenderRequireRealTimeMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderRequireRealTimeMonitoringUndefined: Self = StObject.set(x, "defenderRequireRealTimeMonitoring", js.undefined)
    
    @scala.inline
    def setDefenderScanArchiveFiles(value: Boolean): Self = StObject.set(x, "defenderScanArchiveFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanArchiveFilesUndefined: Self = StObject.set(x, "defenderScanArchiveFiles", js.undefined)
    
    @scala.inline
    def setDefenderScanDownloads(value: Boolean): Self = StObject.set(x, "defenderScanDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanDownloadsUndefined: Self = StObject.set(x, "defenderScanDownloads", js.undefined)
    
    @scala.inline
    def setDefenderScanIncomingMail(value: Boolean): Self = StObject.set(x, "defenderScanIncomingMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanIncomingMailUndefined: Self = StObject.set(x, "defenderScanIncomingMail", js.undefined)
    
    @scala.inline
    def setDefenderScanMappedNetworkDrivesDuringFullScan(value: Boolean): Self = StObject.set(x, "defenderScanMappedNetworkDrivesDuringFullScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanMappedNetworkDrivesDuringFullScanUndefined: Self = StObject.set(x, "defenderScanMappedNetworkDrivesDuringFullScan", js.undefined)
    
    @scala.inline
    def setDefenderScanMaxCpu(value: NullableOption[Double]): Self = StObject.set(x, "defenderScanMaxCpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanMaxCpuNull: Self = StObject.set(x, "defenderScanMaxCpu", null)
    
    @scala.inline
    def setDefenderScanMaxCpuUndefined: Self = StObject.set(x, "defenderScanMaxCpu", js.undefined)
    
    @scala.inline
    def setDefenderScanNetworkFiles(value: Boolean): Self = StObject.set(x, "defenderScanNetworkFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanNetworkFilesUndefined: Self = StObject.set(x, "defenderScanNetworkFiles", js.undefined)
    
    @scala.inline
    def setDefenderScanRemovableDrivesDuringFullScan(value: Boolean): Self = StObject.set(x, "defenderScanRemovableDrivesDuringFullScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanRemovableDrivesDuringFullScanUndefined: Self = StObject.set(x, "defenderScanRemovableDrivesDuringFullScan", js.undefined)
    
    @scala.inline
    def setDefenderScanScriptsLoadedInInternetExplorer(value: Boolean): Self = StObject.set(x, "defenderScanScriptsLoadedInInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanScriptsLoadedInInternetExplorerUndefined: Self = StObject.set(x, "defenderScanScriptsLoadedInInternetExplorer", js.undefined)
    
    @scala.inline
    def setDefenderScanType(value: DefenderScanType): Self = StObject.set(x, "defenderScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScanTypeUndefined: Self = StObject.set(x, "defenderScanType", js.undefined)
    
    @scala.inline
    def setDefenderScheduledQuickScanTime(value: NullableOption[String]): Self = StObject.set(x, "defenderScheduledQuickScanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScheduledQuickScanTimeNull: Self = StObject.set(x, "defenderScheduledQuickScanTime", null)
    
    @scala.inline
    def setDefenderScheduledQuickScanTimeUndefined: Self = StObject.set(x, "defenderScheduledQuickScanTime", js.undefined)
    
    @scala.inline
    def setDefenderScheduledScanTime(value: NullableOption[String]): Self = StObject.set(x, "defenderScheduledScanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderScheduledScanTimeNull: Self = StObject.set(x, "defenderScheduledScanTime", null)
    
    @scala.inline
    def setDefenderScheduledScanTimeUndefined: Self = StObject.set(x, "defenderScheduledScanTime", js.undefined)
    
    @scala.inline
    def setDefenderSignatureUpdateIntervalInHours(value: NullableOption[Double]): Self = StObject.set(x, "defenderSignatureUpdateIntervalInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderSignatureUpdateIntervalInHoursNull: Self = StObject.set(x, "defenderSignatureUpdateIntervalInHours", null)
    
    @scala.inline
    def setDefenderSignatureUpdateIntervalInHoursUndefined: Self = StObject.set(x, "defenderSignatureUpdateIntervalInHours", js.undefined)
    
    @scala.inline
    def setDefenderSystemScanSchedule(value: WeeklySchedule): Self = StObject.set(x, "defenderSystemScanSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenderSystemScanScheduleUndefined: Self = StObject.set(x, "defenderSystemScanSchedule", js.undefined)
    
    @scala.inline
    def setDeveloperUnlockSetting(value: StateManagementSetting): Self = StObject.set(x, "developerUnlockSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUnlockSettingUndefined: Self = StObject.set(x, "developerUnlockSetting", js.undefined)
    
    @scala.inline
    def setDeviceManagementBlockFactoryResetOnMobile(value: Boolean): Self = StObject.set(x, "deviceManagementBlockFactoryResetOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceManagementBlockFactoryResetOnMobileUndefined: Self = StObject.set(x, "deviceManagementBlockFactoryResetOnMobile", js.undefined)
    
    @scala.inline
    def setDeviceManagementBlockManualUnenroll(value: Boolean): Self = StObject.set(x, "deviceManagementBlockManualUnenroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceManagementBlockManualUnenrollUndefined: Self = StObject.set(x, "deviceManagementBlockManualUnenroll", js.undefined)
    
    @scala.inline
    def setDiagnosticsDataSubmissionMode(value: DiagnosticDataSubmissionMode): Self = StObject.set(x, "diagnosticsDataSubmissionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsDataSubmissionModeUndefined: Self = StObject.set(x, "diagnosticsDataSubmissionMode", js.undefined)
    
    @scala.inline
    def setEdgeAllowStartPagesModification(value: Boolean): Self = StObject.set(x, "edgeAllowStartPagesModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeAllowStartPagesModificationUndefined: Self = StObject.set(x, "edgeAllowStartPagesModification", js.undefined)
    
    @scala.inline
    def setEdgeBlockAccessToAboutFlags(value: Boolean): Self = StObject.set(x, "edgeBlockAccessToAboutFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockAccessToAboutFlagsUndefined: Self = StObject.set(x, "edgeBlockAccessToAboutFlags", js.undefined)
    
    @scala.inline
    def setEdgeBlockAddressBarDropdown(value: Boolean): Self = StObject.set(x, "edgeBlockAddressBarDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockAddressBarDropdownUndefined: Self = StObject.set(x, "edgeBlockAddressBarDropdown", js.undefined)
    
    @scala.inline
    def setEdgeBlockAutofill(value: Boolean): Self = StObject.set(x, "edgeBlockAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockAutofillUndefined: Self = StObject.set(x, "edgeBlockAutofill", js.undefined)
    
    @scala.inline
    def setEdgeBlockCompatibilityList(value: Boolean): Self = StObject.set(x, "edgeBlockCompatibilityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockCompatibilityListUndefined: Self = StObject.set(x, "edgeBlockCompatibilityList", js.undefined)
    
    @scala.inline
    def setEdgeBlockDeveloperTools(value: Boolean): Self = StObject.set(x, "edgeBlockDeveloperTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockDeveloperToolsUndefined: Self = StObject.set(x, "edgeBlockDeveloperTools", js.undefined)
    
    @scala.inline
    def setEdgeBlockExtensions(value: Boolean): Self = StObject.set(x, "edgeBlockExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockExtensionsUndefined: Self = StObject.set(x, "edgeBlockExtensions", js.undefined)
    
    @scala.inline
    def setEdgeBlockInPrivateBrowsing(value: Boolean): Self = StObject.set(x, "edgeBlockInPrivateBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockInPrivateBrowsingUndefined: Self = StObject.set(x, "edgeBlockInPrivateBrowsing", js.undefined)
    
    @scala.inline
    def setEdgeBlockJavaScript(value: Boolean): Self = StObject.set(x, "edgeBlockJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockJavaScriptUndefined: Self = StObject.set(x, "edgeBlockJavaScript", js.undefined)
    
    @scala.inline
    def setEdgeBlockLiveTileDataCollection(value: Boolean): Self = StObject.set(x, "edgeBlockLiveTileDataCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockLiveTileDataCollectionUndefined: Self = StObject.set(x, "edgeBlockLiveTileDataCollection", js.undefined)
    
    @scala.inline
    def setEdgeBlockPasswordManager(value: Boolean): Self = StObject.set(x, "edgeBlockPasswordManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockPasswordManagerUndefined: Self = StObject.set(x, "edgeBlockPasswordManager", js.undefined)
    
    @scala.inline
    def setEdgeBlockPopups(value: Boolean): Self = StObject.set(x, "edgeBlockPopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockPopupsUndefined: Self = StObject.set(x, "edgeBlockPopups", js.undefined)
    
    @scala.inline
    def setEdgeBlockSearchSuggestions(value: Boolean): Self = StObject.set(x, "edgeBlockSearchSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockSearchSuggestionsUndefined: Self = StObject.set(x, "edgeBlockSearchSuggestions", js.undefined)
    
    @scala.inline
    def setEdgeBlockSendingDoNotTrackHeader(value: Boolean): Self = StObject.set(x, "edgeBlockSendingDoNotTrackHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockSendingDoNotTrackHeaderUndefined: Self = StObject.set(x, "edgeBlockSendingDoNotTrackHeader", js.undefined)
    
    @scala.inline
    def setEdgeBlockSendingIntranetTrafficToInternetExplorer(value: Boolean): Self = StObject.set(x, "edgeBlockSendingIntranetTrafficToInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockSendingIntranetTrafficToInternetExplorerUndefined: Self = StObject.set(x, "edgeBlockSendingIntranetTrafficToInternetExplorer", js.undefined)
    
    @scala.inline
    def setEdgeBlocked(value: Boolean): Self = StObject.set(x, "edgeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeBlockedUndefined: Self = StObject.set(x, "edgeBlocked", js.undefined)
    
    @scala.inline
    def setEdgeClearBrowsingDataOnExit(value: Boolean): Self = StObject.set(x, "edgeClearBrowsingDataOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeClearBrowsingDataOnExitUndefined: Self = StObject.set(x, "edgeClearBrowsingDataOnExit", js.undefined)
    
    @scala.inline
    def setEdgeCookiePolicy(value: EdgeCookiePolicy): Self = StObject.set(x, "edgeCookiePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeCookiePolicyUndefined: Self = StObject.set(x, "edgeCookiePolicy", js.undefined)
    
    @scala.inline
    def setEdgeDisableFirstRunPage(value: Boolean): Self = StObject.set(x, "edgeDisableFirstRunPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeDisableFirstRunPageUndefined: Self = StObject.set(x, "edgeDisableFirstRunPage", js.undefined)
    
    @scala.inline
    def setEdgeEnterpriseModeSiteListLocation(value: NullableOption[String]): Self = StObject.set(x, "edgeEnterpriseModeSiteListLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeEnterpriseModeSiteListLocationNull: Self = StObject.set(x, "edgeEnterpriseModeSiteListLocation", null)
    
    @scala.inline
    def setEdgeEnterpriseModeSiteListLocationUndefined: Self = StObject.set(x, "edgeEnterpriseModeSiteListLocation", js.undefined)
    
    @scala.inline
    def setEdgeFirstRunUrl(value: NullableOption[String]): Self = StObject.set(x, "edgeFirstRunUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeFirstRunUrlNull: Self = StObject.set(x, "edgeFirstRunUrl", null)
    
    @scala.inline
    def setEdgeFirstRunUrlUndefined: Self = StObject.set(x, "edgeFirstRunUrl", js.undefined)
    
    @scala.inline
    def setEdgeHomepageUrls(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "edgeHomepageUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeHomepageUrlsNull: Self = StObject.set(x, "edgeHomepageUrls", null)
    
    @scala.inline
    def setEdgeHomepageUrlsUndefined: Self = StObject.set(x, "edgeHomepageUrls", js.undefined)
    
    @scala.inline
    def setEdgeHomepageUrlsVarargs(value: String*): Self = StObject.set(x, "edgeHomepageUrls", js.Array(value :_*))
    
    @scala.inline
    def setEdgeRequireSmartScreen(value: Boolean): Self = StObject.set(x, "edgeRequireSmartScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeRequireSmartScreenUndefined: Self = StObject.set(x, "edgeRequireSmartScreen", js.undefined)
    
    @scala.inline
    def setEdgeSearchEngine(value: NullableOption[EdgeSearchEngineBase]): Self = StObject.set(x, "edgeSearchEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSearchEngineNull: Self = StObject.set(x, "edgeSearchEngine", null)
    
    @scala.inline
    def setEdgeSearchEngineUndefined: Self = StObject.set(x, "edgeSearchEngine", js.undefined)
    
    @scala.inline
    def setEdgeSendIntranetTrafficToInternetExplorer(value: Boolean): Self = StObject.set(x, "edgeSendIntranetTrafficToInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSendIntranetTrafficToInternetExplorerUndefined: Self = StObject.set(x, "edgeSendIntranetTrafficToInternetExplorer", js.undefined)
    
    @scala.inline
    def setEdgeSyncFavoritesWithInternetExplorer(value: Boolean): Self = StObject.set(x, "edgeSyncFavoritesWithInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSyncFavoritesWithInternetExplorerUndefined: Self = StObject.set(x, "edgeSyncFavoritesWithInternetExplorer", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryEndPoint(value: NullableOption[String]): Self = StObject.set(x, "enterpriseCloudPrintDiscoveryEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryEndPointNull: Self = StObject.set(x, "enterpriseCloudPrintDiscoveryEndPoint", null)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryEndPointUndefined: Self = StObject.set(x, "enterpriseCloudPrintDiscoveryEndPoint", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryMaxLimit(value: NullableOption[Double]): Self = StObject.set(x, "enterpriseCloudPrintDiscoveryMaxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryMaxLimitNull: Self = StObject.set(x, "enterpriseCloudPrintDiscoveryMaxLimit", null)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryMaxLimitUndefined: Self = StObject.set(x, "enterpriseCloudPrintDiscoveryMaxLimit", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifierNull: Self = StObject.set(x, "enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", null)
    
    @scala.inline
    def setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifierUndefined: Self = StObject.set(x, "enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthAuthority(value: NullableOption[String]): Self = StObject.set(x, "enterpriseCloudPrintOAuthAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthAuthorityNull: Self = StObject.set(x, "enterpriseCloudPrintOAuthAuthority", null)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthAuthorityUndefined: Self = StObject.set(x, "enterpriseCloudPrintOAuthAuthority", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthClientIdentifier(value: NullableOption[String]): Self = StObject.set(x, "enterpriseCloudPrintOAuthClientIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthClientIdentifierNull: Self = StObject.set(x, "enterpriseCloudPrintOAuthClientIdentifier", null)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthClientIdentifierUndefined: Self = StObject.set(x, "enterpriseCloudPrintOAuthClientIdentifier", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintResourceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "enterpriseCloudPrintResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseCloudPrintResourceIdentifierNull: Self = StObject.set(x, "enterpriseCloudPrintResourceIdentifier", null)
    
    @scala.inline
    def setEnterpriseCloudPrintResourceIdentifierUndefined: Self = StObject.set(x, "enterpriseCloudPrintResourceIdentifier", js.undefined)
    
    @scala.inline
    def setExperienceBlockDeviceDiscovery(value: Boolean): Self = StObject.set(x, "experienceBlockDeviceDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperienceBlockDeviceDiscoveryUndefined: Self = StObject.set(x, "experienceBlockDeviceDiscovery", js.undefined)
    
    @scala.inline
    def setExperienceBlockErrorDialogWhenNoSIM(value: Boolean): Self = StObject.set(x, "experienceBlockErrorDialogWhenNoSIM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperienceBlockErrorDialogWhenNoSIMUndefined: Self = StObject.set(x, "experienceBlockErrorDialogWhenNoSIM", js.undefined)
    
    @scala.inline
    def setExperienceBlockTaskSwitcher(value: Boolean): Self = StObject.set(x, "experienceBlockTaskSwitcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperienceBlockTaskSwitcherUndefined: Self = StObject.set(x, "experienceBlockTaskSwitcher", js.undefined)
    
    @scala.inline
    def setGameDvrBlocked(value: Boolean): Self = StObject.set(x, "gameDvrBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameDvrBlockedUndefined: Self = StObject.set(x, "gameDvrBlocked", js.undefined)
    
    @scala.inline
    def setInternetSharingBlocked(value: Boolean): Self = StObject.set(x, "internetSharingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternetSharingBlockedUndefined: Self = StObject.set(x, "internetSharingBlocked", js.undefined)
    
    @scala.inline
    def setLocationServicesBlocked(value: Boolean): Self = StObject.set(x, "locationServicesBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationServicesBlockedUndefined: Self = StObject.set(x, "locationServicesBlocked", js.undefined)
    
    @scala.inline
    def setLockScreenAllowTimeoutConfiguration(value: Boolean): Self = StObject.set(x, "lockScreenAllowTimeoutConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenAllowTimeoutConfigurationUndefined: Self = StObject.set(x, "lockScreenAllowTimeoutConfiguration", js.undefined)
    
    @scala.inline
    def setLockScreenBlockActionCenterNotifications(value: Boolean): Self = StObject.set(x, "lockScreenBlockActionCenterNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockActionCenterNotificationsUndefined: Self = StObject.set(x, "lockScreenBlockActionCenterNotifications", js.undefined)
    
    @scala.inline
    def setLockScreenBlockCortana(value: Boolean): Self = StObject.set(x, "lockScreenBlockCortana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockCortanaUndefined: Self = StObject.set(x, "lockScreenBlockCortana", js.undefined)
    
    @scala.inline
    def setLockScreenBlockToastNotifications(value: Boolean): Self = StObject.set(x, "lockScreenBlockToastNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockToastNotificationsUndefined: Self = StObject.set(x, "lockScreenBlockToastNotifications", js.undefined)
    
    @scala.inline
    def setLockScreenTimeoutInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "lockScreenTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenTimeoutInSecondsNull: Self = StObject.set(x, "lockScreenTimeoutInSeconds", null)
    
    @scala.inline
    def setLockScreenTimeoutInSecondsUndefined: Self = StObject.set(x, "lockScreenTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setLogonBlockFastUserSwitching(value: Boolean): Self = StObject.set(x, "logonBlockFastUserSwitching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonBlockFastUserSwitchingUndefined: Self = StObject.set(x, "logonBlockFastUserSwitching", js.undefined)
    
    @scala.inline
    def setMicrosoftAccountBlockSettingsSync(value: Boolean): Self = StObject.set(x, "microsoftAccountBlockSettingsSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosoftAccountBlockSettingsSyncUndefined: Self = StObject.set(x, "microsoftAccountBlockSettingsSync", js.undefined)
    
    @scala.inline
    def setMicrosoftAccountBlocked(value: Boolean): Self = StObject.set(x, "microsoftAccountBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosoftAccountBlockedUndefined: Self = StObject.set(x, "microsoftAccountBlocked", js.undefined)
    
    @scala.inline
    def setNetworkProxyApplySettingsDeviceWide(value: Boolean): Self = StObject.set(x, "networkProxyApplySettingsDeviceWide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProxyApplySettingsDeviceWideUndefined: Self = StObject.set(x, "networkProxyApplySettingsDeviceWide", js.undefined)
    
    @scala.inline
    def setNetworkProxyAutomaticConfigurationUrl(value: NullableOption[String]): Self = StObject.set(x, "networkProxyAutomaticConfigurationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProxyAutomaticConfigurationUrlNull: Self = StObject.set(x, "networkProxyAutomaticConfigurationUrl", null)
    
    @scala.inline
    def setNetworkProxyAutomaticConfigurationUrlUndefined: Self = StObject.set(x, "networkProxyAutomaticConfigurationUrl", js.undefined)
    
    @scala.inline
    def setNetworkProxyDisableAutoDetect(value: Boolean): Self = StObject.set(x, "networkProxyDisableAutoDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProxyDisableAutoDetectUndefined: Self = StObject.set(x, "networkProxyDisableAutoDetect", js.undefined)
    
    @scala.inline
    def setNetworkProxyServer(value: NullableOption[Windows10NetworkProxyServer]): Self = StObject.set(x, "networkProxyServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProxyServerNull: Self = StObject.set(x, "networkProxyServer", null)
    
    @scala.inline
    def setNetworkProxyServerUndefined: Self = StObject.set(x, "networkProxyServer", js.undefined)
    
    @scala.inline
    def setNfcBlocked(value: Boolean): Self = StObject.set(x, "nfcBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfcBlockedUndefined: Self = StObject.set(x, "nfcBlocked", js.undefined)
    
    @scala.inline
    def setOneDriveDisableFileSync(value: Boolean): Self = StObject.set(x, "oneDriveDisableFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneDriveDisableFileSyncUndefined: Self = StObject.set(x, "oneDriveDisableFileSync", js.undefined)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = StObject.set(x, "passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordBlockSimpleUndefined: Self = StObject.set(x, "passwordBlockSimple", js.undefined)
    
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
    def setPasswordRequireWhenResumeFromIdleState(value: Boolean): Self = StObject.set(x, "passwordRequireWhenResumeFromIdleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequireWhenResumeFromIdleStateUndefined: Self = StObject.set(x, "passwordRequireWhenResumeFromIdleState", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredTypeUndefined: Self = StObject.set(x, "passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetUndefined: Self = StObject.set(x, "passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setPersonalizationDesktopImageUrl(value: NullableOption[String]): Self = StObject.set(x, "personalizationDesktopImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizationDesktopImageUrlNull: Self = StObject.set(x, "personalizationDesktopImageUrl", null)
    
    @scala.inline
    def setPersonalizationDesktopImageUrlUndefined: Self = StObject.set(x, "personalizationDesktopImageUrl", js.undefined)
    
    @scala.inline
    def setPersonalizationLockScreenImageUrl(value: NullableOption[String]): Self = StObject.set(x, "personalizationLockScreenImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizationLockScreenImageUrlNull: Self = StObject.set(x, "personalizationLockScreenImageUrl", null)
    
    @scala.inline
    def setPersonalizationLockScreenImageUrlUndefined: Self = StObject.set(x, "personalizationLockScreenImageUrl", js.undefined)
    
    @scala.inline
    def setPrivacyAdvertisingId(value: StateManagementSetting): Self = StObject.set(x, "privacyAdvertisingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyAdvertisingIdUndefined: Self = StObject.set(x, "privacyAdvertisingId", js.undefined)
    
    @scala.inline
    def setPrivacyAutoAcceptPairingAndConsentPrompts(value: Boolean): Self = StObject.set(x, "privacyAutoAcceptPairingAndConsentPrompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyAutoAcceptPairingAndConsentPromptsUndefined: Self = StObject.set(x, "privacyAutoAcceptPairingAndConsentPrompts", js.undefined)
    
    @scala.inline
    def setPrivacyBlockInputPersonalization(value: Boolean): Self = StObject.set(x, "privacyBlockInputPersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyBlockInputPersonalizationUndefined: Self = StObject.set(x, "privacyBlockInputPersonalization", js.undefined)
    
    @scala.inline
    def setResetProtectionModeBlocked(value: Boolean): Self = StObject.set(x, "resetProtectionModeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetProtectionModeBlockedUndefined: Self = StObject.set(x, "resetProtectionModeBlocked", js.undefined)
    
    @scala.inline
    def setSafeSearchFilter(value: SafeSearchFilterType): Self = StObject.set(x, "safeSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeSearchFilterUndefined: Self = StObject.set(x, "safeSearchFilter", js.undefined)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
    
    @scala.inline
    def setSearchBlockDiacritics(value: Boolean): Self = StObject.set(x, "searchBlockDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBlockDiacriticsUndefined: Self = StObject.set(x, "searchBlockDiacritics", js.undefined)
    
    @scala.inline
    def setSearchDisableAutoLanguageDetection(value: Boolean): Self = StObject.set(x, "searchDisableAutoLanguageDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDisableAutoLanguageDetectionUndefined: Self = StObject.set(x, "searchDisableAutoLanguageDetection", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexerBackoff(value: Boolean): Self = StObject.set(x, "searchDisableIndexerBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDisableIndexerBackoffUndefined: Self = StObject.set(x, "searchDisableIndexerBackoff", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexingEncryptedItems(value: Boolean): Self = StObject.set(x, "searchDisableIndexingEncryptedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDisableIndexingEncryptedItemsUndefined: Self = StObject.set(x, "searchDisableIndexingEncryptedItems", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexingRemovableDrive(value: Boolean): Self = StObject.set(x, "searchDisableIndexingRemovableDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDisableIndexingRemovableDriveUndefined: Self = StObject.set(x, "searchDisableIndexingRemovableDrive", js.undefined)
    
    @scala.inline
    def setSearchEnableAutomaticIndexSizeManangement(value: Boolean): Self = StObject.set(x, "searchEnableAutomaticIndexSizeManangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchEnableAutomaticIndexSizeManangementUndefined: Self = StObject.set(x, "searchEnableAutomaticIndexSizeManangement", js.undefined)
    
    @scala.inline
    def setSearchEnableRemoteQueries(value: Boolean): Self = StObject.set(x, "searchEnableRemoteQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchEnableRemoteQueriesUndefined: Self = StObject.set(x, "searchEnableRemoteQueries", js.undefined)
    
    @scala.inline
    def setSettingsBlockAccountsPage(value: Boolean): Self = StObject.set(x, "settingsBlockAccountsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockAccountsPageUndefined: Self = StObject.set(x, "settingsBlockAccountsPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockAddProvisioningPackage(value: Boolean): Self = StObject.set(x, "settingsBlockAddProvisioningPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockAddProvisioningPackageUndefined: Self = StObject.set(x, "settingsBlockAddProvisioningPackage", js.undefined)
    
    @scala.inline
    def setSettingsBlockAppsPage(value: Boolean): Self = StObject.set(x, "settingsBlockAppsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockAppsPageUndefined: Self = StObject.set(x, "settingsBlockAppsPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeLanguage(value: Boolean): Self = StObject.set(x, "settingsBlockChangeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockChangeLanguageUndefined: Self = StObject.set(x, "settingsBlockChangeLanguage", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangePowerSleep(value: Boolean): Self = StObject.set(x, "settingsBlockChangePowerSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockChangePowerSleepUndefined: Self = StObject.set(x, "settingsBlockChangePowerSleep", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeRegion(value: Boolean): Self = StObject.set(x, "settingsBlockChangeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockChangeRegionUndefined: Self = StObject.set(x, "settingsBlockChangeRegion", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeSystemTime(value: Boolean): Self = StObject.set(x, "settingsBlockChangeSystemTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockChangeSystemTimeUndefined: Self = StObject.set(x, "settingsBlockChangeSystemTime", js.undefined)
    
    @scala.inline
    def setSettingsBlockDevicesPage(value: Boolean): Self = StObject.set(x, "settingsBlockDevicesPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockDevicesPageUndefined: Self = StObject.set(x, "settingsBlockDevicesPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockEaseOfAccessPage(value: Boolean): Self = StObject.set(x, "settingsBlockEaseOfAccessPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockEaseOfAccessPageUndefined: Self = StObject.set(x, "settingsBlockEaseOfAccessPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockEditDeviceName(value: Boolean): Self = StObject.set(x, "settingsBlockEditDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockEditDeviceNameUndefined: Self = StObject.set(x, "settingsBlockEditDeviceName", js.undefined)
    
    @scala.inline
    def setSettingsBlockGamingPage(value: Boolean): Self = StObject.set(x, "settingsBlockGamingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockGamingPageUndefined: Self = StObject.set(x, "settingsBlockGamingPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockNetworkInternetPage(value: Boolean): Self = StObject.set(x, "settingsBlockNetworkInternetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockNetworkInternetPageUndefined: Self = StObject.set(x, "settingsBlockNetworkInternetPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockPersonalizationPage(value: Boolean): Self = StObject.set(x, "settingsBlockPersonalizationPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockPersonalizationPageUndefined: Self = StObject.set(x, "settingsBlockPersonalizationPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockPrivacyPage(value: Boolean): Self = StObject.set(x, "settingsBlockPrivacyPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockPrivacyPageUndefined: Self = StObject.set(x, "settingsBlockPrivacyPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockRemoveProvisioningPackage(value: Boolean): Self = StObject.set(x, "settingsBlockRemoveProvisioningPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockRemoveProvisioningPackageUndefined: Self = StObject.set(x, "settingsBlockRemoveProvisioningPackage", js.undefined)
    
    @scala.inline
    def setSettingsBlockSettingsApp(value: Boolean): Self = StObject.set(x, "settingsBlockSettingsApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockSettingsAppUndefined: Self = StObject.set(x, "settingsBlockSettingsApp", js.undefined)
    
    @scala.inline
    def setSettingsBlockSystemPage(value: Boolean): Self = StObject.set(x, "settingsBlockSystemPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockSystemPageUndefined: Self = StObject.set(x, "settingsBlockSystemPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockTimeLanguagePage(value: Boolean): Self = StObject.set(x, "settingsBlockTimeLanguagePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockTimeLanguagePageUndefined: Self = StObject.set(x, "settingsBlockTimeLanguagePage", js.undefined)
    
    @scala.inline
    def setSettingsBlockUpdateSecurityPage(value: Boolean): Self = StObject.set(x, "settingsBlockUpdateSecurityPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockUpdateSecurityPageUndefined: Self = StObject.set(x, "settingsBlockUpdateSecurityPage", js.undefined)
    
    @scala.inline
    def setSharedUserAppDataAllowed(value: Boolean): Self = StObject.set(x, "sharedUserAppDataAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUserAppDataAllowedUndefined: Self = StObject.set(x, "sharedUserAppDataAllowed", js.undefined)
    
    @scala.inline
    def setSmartScreenBlockPromptOverride(value: Boolean): Self = StObject.set(x, "smartScreenBlockPromptOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartScreenBlockPromptOverrideForFiles(value: Boolean): Self = StObject.set(x, "smartScreenBlockPromptOverrideForFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartScreenBlockPromptOverrideForFilesUndefined: Self = StObject.set(x, "smartScreenBlockPromptOverrideForFiles", js.undefined)
    
    @scala.inline
    def setSmartScreenBlockPromptOverrideUndefined: Self = StObject.set(x, "smartScreenBlockPromptOverride", js.undefined)
    
    @scala.inline
    def setSmartScreenEnableAppInstallControl(value: Boolean): Self = StObject.set(x, "smartScreenEnableAppInstallControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartScreenEnableAppInstallControlUndefined: Self = StObject.set(x, "smartScreenEnableAppInstallControl", js.undefined)
    
    @scala.inline
    def setStartBlockUnpinningAppsFromTaskbar(value: Boolean): Self = StObject.set(x, "startBlockUnpinningAppsFromTaskbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBlockUnpinningAppsFromTaskbarUndefined: Self = StObject.set(x, "startBlockUnpinningAppsFromTaskbar", js.undefined)
    
    @scala.inline
    def setStartMenuAppListVisibility(value: WindowsStartMenuAppListVisibilityType): Self = StObject.set(x, "startMenuAppListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuAppListVisibilityUndefined: Self = StObject.set(x, "startMenuAppListVisibility", js.undefined)
    
    @scala.inline
    def setStartMenuHideChangeAccountSettings(value: Boolean): Self = StObject.set(x, "startMenuHideChangeAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideChangeAccountSettingsUndefined: Self = StObject.set(x, "startMenuHideChangeAccountSettings", js.undefined)
    
    @scala.inline
    def setStartMenuHideFrequentlyUsedApps(value: Boolean): Self = StObject.set(x, "startMenuHideFrequentlyUsedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideFrequentlyUsedAppsUndefined: Self = StObject.set(x, "startMenuHideFrequentlyUsedApps", js.undefined)
    
    @scala.inline
    def setStartMenuHideHibernate(value: Boolean): Self = StObject.set(x, "startMenuHideHibernate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideHibernateUndefined: Self = StObject.set(x, "startMenuHideHibernate", js.undefined)
    
    @scala.inline
    def setStartMenuHideLock(value: Boolean): Self = StObject.set(x, "startMenuHideLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideLockUndefined: Self = StObject.set(x, "startMenuHideLock", js.undefined)
    
    @scala.inline
    def setStartMenuHidePowerButton(value: Boolean): Self = StObject.set(x, "startMenuHidePowerButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHidePowerButtonUndefined: Self = StObject.set(x, "startMenuHidePowerButton", js.undefined)
    
    @scala.inline
    def setStartMenuHideRecentJumpLists(value: Boolean): Self = StObject.set(x, "startMenuHideRecentJumpLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideRecentJumpListsUndefined: Self = StObject.set(x, "startMenuHideRecentJumpLists", js.undefined)
    
    @scala.inline
    def setStartMenuHideRecentlyAddedApps(value: Boolean): Self = StObject.set(x, "startMenuHideRecentlyAddedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideRecentlyAddedAppsUndefined: Self = StObject.set(x, "startMenuHideRecentlyAddedApps", js.undefined)
    
    @scala.inline
    def setStartMenuHideRestartOptions(value: Boolean): Self = StObject.set(x, "startMenuHideRestartOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideRestartOptionsUndefined: Self = StObject.set(x, "startMenuHideRestartOptions", js.undefined)
    
    @scala.inline
    def setStartMenuHideShutDown(value: Boolean): Self = StObject.set(x, "startMenuHideShutDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideShutDownUndefined: Self = StObject.set(x, "startMenuHideShutDown", js.undefined)
    
    @scala.inline
    def setStartMenuHideSignOut(value: Boolean): Self = StObject.set(x, "startMenuHideSignOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideSignOutUndefined: Self = StObject.set(x, "startMenuHideSignOut", js.undefined)
    
    @scala.inline
    def setStartMenuHideSleep(value: Boolean): Self = StObject.set(x, "startMenuHideSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideSleepUndefined: Self = StObject.set(x, "startMenuHideSleep", js.undefined)
    
    @scala.inline
    def setStartMenuHideSwitchAccount(value: Boolean): Self = StObject.set(x, "startMenuHideSwitchAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideSwitchAccountUndefined: Self = StObject.set(x, "startMenuHideSwitchAccount", js.undefined)
    
    @scala.inline
    def setStartMenuHideUserTile(value: Boolean): Self = StObject.set(x, "startMenuHideUserTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuHideUserTileUndefined: Self = StObject.set(x, "startMenuHideUserTile", js.undefined)
    
    @scala.inline
    def setStartMenuLayoutEdgeAssetsXml(value: NullableOption[Double]): Self = StObject.set(x, "startMenuLayoutEdgeAssetsXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuLayoutEdgeAssetsXmlNull: Self = StObject.set(x, "startMenuLayoutEdgeAssetsXml", null)
    
    @scala.inline
    def setStartMenuLayoutEdgeAssetsXmlUndefined: Self = StObject.set(x, "startMenuLayoutEdgeAssetsXml", js.undefined)
    
    @scala.inline
    def setStartMenuLayoutXml(value: NullableOption[Double]): Self = StObject.set(x, "startMenuLayoutXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuLayoutXmlNull: Self = StObject.set(x, "startMenuLayoutXml", null)
    
    @scala.inline
    def setStartMenuLayoutXmlUndefined: Self = StObject.set(x, "startMenuLayoutXml", js.undefined)
    
    @scala.inline
    def setStartMenuMode(value: WindowsStartMenuModeType): Self = StObject.set(x, "startMenuMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuModeUndefined: Self = StObject.set(x, "startMenuMode", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderDocuments(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderDocumentsUndefined: Self = StObject.set(x, "startMenuPinnedFolderDocuments", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderDownloads(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderDownloadsUndefined: Self = StObject.set(x, "startMenuPinnedFolderDownloads", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderFileExplorer(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderFileExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderFileExplorerUndefined: Self = StObject.set(x, "startMenuPinnedFolderFileExplorer", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderHomeGroup(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderHomeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderHomeGroupUndefined: Self = StObject.set(x, "startMenuPinnedFolderHomeGroup", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderMusic(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderMusic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderMusicUndefined: Self = StObject.set(x, "startMenuPinnedFolderMusic", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderNetwork(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderNetworkUndefined: Self = StObject.set(x, "startMenuPinnedFolderNetwork", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderPersonalFolder(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderPersonalFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderPersonalFolderUndefined: Self = StObject.set(x, "startMenuPinnedFolderPersonalFolder", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderPictures(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderPictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderPicturesUndefined: Self = StObject.set(x, "startMenuPinnedFolderPictures", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderSettings(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderSettingsUndefined: Self = StObject.set(x, "startMenuPinnedFolderSettings", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderVideos(value: VisibilitySetting): Self = StObject.set(x, "startMenuPinnedFolderVideos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMenuPinnedFolderVideosUndefined: Self = StObject.set(x, "startMenuPinnedFolderVideos", js.undefined)
    
    @scala.inline
    def setStorageBlockRemovableStorage(value: Boolean): Self = StObject.set(x, "storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBlockRemovableStorageUndefined: Self = StObject.set(x, "storageBlockRemovableStorage", js.undefined)
    
    @scala.inline
    def setStorageRequireMobileDeviceEncryption(value: Boolean): Self = StObject.set(x, "storageRequireMobileDeviceEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRequireMobileDeviceEncryptionUndefined: Self = StObject.set(x, "storageRequireMobileDeviceEncryption", js.undefined)
    
    @scala.inline
    def setStorageRestrictAppDataToSystemVolume(value: Boolean): Self = StObject.set(x, "storageRestrictAppDataToSystemVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRestrictAppDataToSystemVolumeUndefined: Self = StObject.set(x, "storageRestrictAppDataToSystemVolume", js.undefined)
    
    @scala.inline
    def setStorageRestrictAppInstallToSystemVolume(value: Boolean): Self = StObject.set(x, "storageRestrictAppInstallToSystemVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRestrictAppInstallToSystemVolumeUndefined: Self = StObject.set(x, "storageRestrictAppInstallToSystemVolume", js.undefined)
    
    @scala.inline
    def setTenantLockdownRequireNetworkDuringOutOfBoxExperience(value: Boolean): Self = StObject.set(x, "tenantLockdownRequireNetworkDuringOutOfBoxExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantLockdownRequireNetworkDuringOutOfBoxExperienceUndefined: Self = StObject.set(x, "tenantLockdownRequireNetworkDuringOutOfBoxExperience", js.undefined)
    
    @scala.inline
    def setUsbBlocked(value: Boolean): Self = StObject.set(x, "usbBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbBlockedUndefined: Self = StObject.set(x, "usbBlocked", js.undefined)
    
    @scala.inline
    def setVoiceRecordingBlocked(value: Boolean): Self = StObject.set(x, "voiceRecordingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceRecordingBlockedUndefined: Self = StObject.set(x, "voiceRecordingBlocked", js.undefined)
    
    @scala.inline
    def setWebRtcBlockLocalhostIpAddress(value: Boolean): Self = StObject.set(x, "webRtcBlockLocalhostIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRtcBlockLocalhostIpAddressUndefined: Self = StObject.set(x, "webRtcBlockLocalhostIpAddress", js.undefined)
    
    @scala.inline
    def setWiFiBlockAutomaticConnectHotspots(value: Boolean): Self = StObject.set(x, "wiFiBlockAutomaticConnectHotspots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiBlockAutomaticConnectHotspotsUndefined: Self = StObject.set(x, "wiFiBlockAutomaticConnectHotspots", js.undefined)
    
    @scala.inline
    def setWiFiBlockManualConfiguration(value: Boolean): Self = StObject.set(x, "wiFiBlockManualConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiBlockManualConfigurationUndefined: Self = StObject.set(x, "wiFiBlockManualConfiguration", js.undefined)
    
    @scala.inline
    def setWiFiBlocked(value: Boolean): Self = StObject.set(x, "wiFiBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiBlockedUndefined: Self = StObject.set(x, "wiFiBlocked", js.undefined)
    
    @scala.inline
    def setWiFiScanInterval(value: NullableOption[Double]): Self = StObject.set(x, "wiFiScanInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiScanIntervalNull: Self = StObject.set(x, "wiFiScanInterval", null)
    
    @scala.inline
    def setWiFiScanIntervalUndefined: Self = StObject.set(x, "wiFiScanInterval", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockConsumerSpecificFeatures(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockConsumerSpecificFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockConsumerSpecificFeaturesUndefined: Self = StObject.set(x, "windowsSpotlightBlockConsumerSpecificFeatures", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockOnActionCenter(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockOnActionCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockOnActionCenterUndefined: Self = StObject.set(x, "windowsSpotlightBlockOnActionCenter", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockTailoredExperiences(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockTailoredExperiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockTailoredExperiencesUndefined: Self = StObject.set(x, "windowsSpotlightBlockTailoredExperiences", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockThirdPartyNotifications(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockThirdPartyNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockThirdPartyNotificationsUndefined: Self = StObject.set(x, "windowsSpotlightBlockThirdPartyNotifications", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockWelcomeExperience(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockWelcomeExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockWelcomeExperienceUndefined: Self = StObject.set(x, "windowsSpotlightBlockWelcomeExperience", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockWindowsTips(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlockWindowsTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockWindowsTipsUndefined: Self = StObject.set(x, "windowsSpotlightBlockWindowsTips", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlocked(value: Boolean): Self = StObject.set(x, "windowsSpotlightBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightBlockedUndefined: Self = StObject.set(x, "windowsSpotlightBlocked", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightConfigureOnLockScreen(value: WindowsSpotlightEnablementSettings): Self = StObject.set(x, "windowsSpotlightConfigureOnLockScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsSpotlightConfigureOnLockScreenUndefined: Self = StObject.set(x, "windowsSpotlightConfigureOnLockScreen", js.undefined)
    
    @scala.inline
    def setWindowsStoreBlockAutoUpdate(value: Boolean): Self = StObject.set(x, "windowsStoreBlockAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsStoreBlockAutoUpdateUndefined: Self = StObject.set(x, "windowsStoreBlockAutoUpdate", js.undefined)
    
    @scala.inline
    def setWindowsStoreBlocked(value: Boolean): Self = StObject.set(x, "windowsStoreBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsStoreBlockedUndefined: Self = StObject.set(x, "windowsStoreBlocked", js.undefined)
    
    @scala.inline
    def setWindowsStoreEnablePrivateStoreOnly(value: Boolean): Self = StObject.set(x, "windowsStoreEnablePrivateStoreOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsStoreEnablePrivateStoreOnlyUndefined: Self = StObject.set(x, "windowsStoreEnablePrivateStoreOnly", js.undefined)
    
    @scala.inline
    def setWirelessDisplayBlockProjectionToThisDevice(value: Boolean): Self = StObject.set(x, "wirelessDisplayBlockProjectionToThisDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWirelessDisplayBlockProjectionToThisDeviceUndefined: Self = StObject.set(x, "wirelessDisplayBlockProjectionToThisDevice", js.undefined)
    
    @scala.inline
    def setWirelessDisplayBlockUserInputFromReceiver(value: Boolean): Self = StObject.set(x, "wirelessDisplayBlockUserInputFromReceiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWirelessDisplayBlockUserInputFromReceiverUndefined: Self = StObject.set(x, "wirelessDisplayBlockUserInputFromReceiver", js.undefined)
    
    @scala.inline
    def setWirelessDisplayRequirePinForPairing(value: Boolean): Self = StObject.set(x, "wirelessDisplayRequirePinForPairing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWirelessDisplayRequirePinForPairingUndefined: Self = StObject.set(x, "wirelessDisplayRequirePinForPairing", js.undefined)
  }
}

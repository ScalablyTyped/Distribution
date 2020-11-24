package typings.microsoftGraph.mod

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
  implicit class Windows10GeneralConfigurationOps[Self <: Windows10GeneralConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAntiTheftModeBlocked(value: Boolean): Self = this.set("antiTheftModeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntiTheftModeBlocked: Self = this.set("antiTheftModeBlocked", js.undefined)
    
    @scala.inline
    def setAppsAllowTrustedAppsSideloading(value: StateManagementSetting): Self = this.set("appsAllowTrustedAppsSideloading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsAllowTrustedAppsSideloading: Self = this.set("appsAllowTrustedAppsSideloading", js.undefined)
    
    @scala.inline
    def setAppsBlockWindowsStoreOriginatedApps(value: Boolean): Self = this.set("appsBlockWindowsStoreOriginatedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsBlockWindowsStoreOriginatedApps: Self = this.set("appsBlockWindowsStoreOriginatedApps", js.undefined)
    
    @scala.inline
    def setBluetoothAllowedServicesVarargs(value: String*): Self = this.set("bluetoothAllowedServices", js.Array(value :_*))
    
    @scala.inline
    def setBluetoothAllowedServices(value: NullableOption[js.Array[String]]): Self = this.set("bluetoothAllowedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothAllowedServices: Self = this.set("bluetoothAllowedServices", js.undefined)
    
    @scala.inline
    def setBluetoothAllowedServicesNull: Self = this.set("bluetoothAllowedServices", null)
    
    @scala.inline
    def setBluetoothBlockAdvertising(value: Boolean): Self = this.set("bluetoothBlockAdvertising", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothBlockAdvertising: Self = this.set("bluetoothBlockAdvertising", js.undefined)
    
    @scala.inline
    def setBluetoothBlockDiscoverableMode(value: Boolean): Self = this.set("bluetoothBlockDiscoverableMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothBlockDiscoverableMode: Self = this.set("bluetoothBlockDiscoverableMode", js.undefined)
    
    @scala.inline
    def setBluetoothBlockPrePairing(value: Boolean): Self = this.set("bluetoothBlockPrePairing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothBlockPrePairing: Self = this.set("bluetoothBlockPrePairing", js.undefined)
    
    @scala.inline
    def setBluetoothBlocked(value: Boolean): Self = this.set("bluetoothBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothBlocked: Self = this.set("bluetoothBlocked", js.undefined)
    
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = this.set("cameraBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraBlocked: Self = this.set("cameraBlocked", js.undefined)
    
    @scala.inline
    def setCellularBlockDataWhenRoaming(value: Boolean): Self = this.set("cellularBlockDataWhenRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellularBlockDataWhenRoaming: Self = this.set("cellularBlockDataWhenRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockVpn(value: Boolean): Self = this.set("cellularBlockVpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellularBlockVpn: Self = this.set("cellularBlockVpn", js.undefined)
    
    @scala.inline
    def setCellularBlockVpnWhenRoaming(value: Boolean): Self = this.set("cellularBlockVpnWhenRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellularBlockVpnWhenRoaming: Self = this.set("cellularBlockVpnWhenRoaming", js.undefined)
    
    @scala.inline
    def setCertificatesBlockManualRootCertificateInstallation(value: Boolean): Self = this.set("certificatesBlockManualRootCertificateInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatesBlockManualRootCertificateInstallation: Self = this.set("certificatesBlockManualRootCertificateInstallation", js.undefined)
    
    @scala.inline
    def setConnectedDevicesServiceBlocked(value: Boolean): Self = this.set("connectedDevicesServiceBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedDevicesServiceBlocked: Self = this.set("connectedDevicesServiceBlocked", js.undefined)
    
    @scala.inline
    def setCopyPasteBlocked(value: Boolean): Self = this.set("copyPasteBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyPasteBlocked: Self = this.set("copyPasteBlocked", js.undefined)
    
    @scala.inline
    def setCortanaBlocked(value: Boolean): Self = this.set("cortanaBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCortanaBlocked: Self = this.set("cortanaBlocked", js.undefined)
    
    @scala.inline
    def setDefenderBlockEndUserAccess(value: Boolean): Self = this.set("defenderBlockEndUserAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderBlockEndUserAccess: Self = this.set("defenderBlockEndUserAccess", js.undefined)
    
    @scala.inline
    def setDefenderCloudBlockLevel(value: DefenderCloudBlockLevelType): Self = this.set("defenderCloudBlockLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderCloudBlockLevel: Self = this.set("defenderCloudBlockLevel", js.undefined)
    
    @scala.inline
    def setDefenderDaysBeforeDeletingQuarantinedMalware(value: NullableOption[Double]): Self = this.set("defenderDaysBeforeDeletingQuarantinedMalware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderDaysBeforeDeletingQuarantinedMalware: Self = this.set("defenderDaysBeforeDeletingQuarantinedMalware", js.undefined)
    
    @scala.inline
    def setDefenderDaysBeforeDeletingQuarantinedMalwareNull: Self = this.set("defenderDaysBeforeDeletingQuarantinedMalware", null)
    
    @scala.inline
    def setDefenderDetectedMalwareActions(value: NullableOption[DefenderDetectedMalwareActions]): Self = this.set("defenderDetectedMalwareActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderDetectedMalwareActions: Self = this.set("defenderDetectedMalwareActions", js.undefined)
    
    @scala.inline
    def setDefenderDetectedMalwareActionsNull: Self = this.set("defenderDetectedMalwareActions", null)
    
    @scala.inline
    def setDefenderFileExtensionsToExcludeVarargs(value: String*): Self = this.set("defenderFileExtensionsToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderFileExtensionsToExclude(value: NullableOption[js.Array[String]]): Self = this.set("defenderFileExtensionsToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderFileExtensionsToExclude: Self = this.set("defenderFileExtensionsToExclude", js.undefined)
    
    @scala.inline
    def setDefenderFileExtensionsToExcludeNull: Self = this.set("defenderFileExtensionsToExclude", null)
    
    @scala.inline
    def setDefenderFilesAndFoldersToExcludeVarargs(value: String*): Self = this.set("defenderFilesAndFoldersToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderFilesAndFoldersToExclude(value: NullableOption[js.Array[String]]): Self = this.set("defenderFilesAndFoldersToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderFilesAndFoldersToExclude: Self = this.set("defenderFilesAndFoldersToExclude", js.undefined)
    
    @scala.inline
    def setDefenderFilesAndFoldersToExcludeNull: Self = this.set("defenderFilesAndFoldersToExclude", null)
    
    @scala.inline
    def setDefenderMonitorFileActivity(value: DefenderMonitorFileActivity): Self = this.set("defenderMonitorFileActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderMonitorFileActivity: Self = this.set("defenderMonitorFileActivity", js.undefined)
    
    @scala.inline
    def setDefenderProcessesToExcludeVarargs(value: String*): Self = this.set("defenderProcessesToExclude", js.Array(value :_*))
    
    @scala.inline
    def setDefenderProcessesToExclude(value: NullableOption[js.Array[String]]): Self = this.set("defenderProcessesToExclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderProcessesToExclude: Self = this.set("defenderProcessesToExclude", js.undefined)
    
    @scala.inline
    def setDefenderProcessesToExcludeNull: Self = this.set("defenderProcessesToExclude", null)
    
    @scala.inline
    def setDefenderPromptForSampleSubmission(value: DefenderPromptForSampleSubmission): Self = this.set("defenderPromptForSampleSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderPromptForSampleSubmission: Self = this.set("defenderPromptForSampleSubmission", js.undefined)
    
    @scala.inline
    def setDefenderRequireBehaviorMonitoring(value: Boolean): Self = this.set("defenderRequireBehaviorMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderRequireBehaviorMonitoring: Self = this.set("defenderRequireBehaviorMonitoring", js.undefined)
    
    @scala.inline
    def setDefenderRequireCloudProtection(value: Boolean): Self = this.set("defenderRequireCloudProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderRequireCloudProtection: Self = this.set("defenderRequireCloudProtection", js.undefined)
    
    @scala.inline
    def setDefenderRequireNetworkInspectionSystem(value: Boolean): Self = this.set("defenderRequireNetworkInspectionSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderRequireNetworkInspectionSystem: Self = this.set("defenderRequireNetworkInspectionSystem", js.undefined)
    
    @scala.inline
    def setDefenderRequireRealTimeMonitoring(value: Boolean): Self = this.set("defenderRequireRealTimeMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderRequireRealTimeMonitoring: Self = this.set("defenderRequireRealTimeMonitoring", js.undefined)
    
    @scala.inline
    def setDefenderScanArchiveFiles(value: Boolean): Self = this.set("defenderScanArchiveFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanArchiveFiles: Self = this.set("defenderScanArchiveFiles", js.undefined)
    
    @scala.inline
    def setDefenderScanDownloads(value: Boolean): Self = this.set("defenderScanDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanDownloads: Self = this.set("defenderScanDownloads", js.undefined)
    
    @scala.inline
    def setDefenderScanIncomingMail(value: Boolean): Self = this.set("defenderScanIncomingMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanIncomingMail: Self = this.set("defenderScanIncomingMail", js.undefined)
    
    @scala.inline
    def setDefenderScanMappedNetworkDrivesDuringFullScan(value: Boolean): Self = this.set("defenderScanMappedNetworkDrivesDuringFullScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanMappedNetworkDrivesDuringFullScan: Self = this.set("defenderScanMappedNetworkDrivesDuringFullScan", js.undefined)
    
    @scala.inline
    def setDefenderScanMaxCpu(value: NullableOption[Double]): Self = this.set("defenderScanMaxCpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanMaxCpu: Self = this.set("defenderScanMaxCpu", js.undefined)
    
    @scala.inline
    def setDefenderScanMaxCpuNull: Self = this.set("defenderScanMaxCpu", null)
    
    @scala.inline
    def setDefenderScanNetworkFiles(value: Boolean): Self = this.set("defenderScanNetworkFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanNetworkFiles: Self = this.set("defenderScanNetworkFiles", js.undefined)
    
    @scala.inline
    def setDefenderScanRemovableDrivesDuringFullScan(value: Boolean): Self = this.set("defenderScanRemovableDrivesDuringFullScan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanRemovableDrivesDuringFullScan: Self = this.set("defenderScanRemovableDrivesDuringFullScan", js.undefined)
    
    @scala.inline
    def setDefenderScanScriptsLoadedInInternetExplorer(value: Boolean): Self = this.set("defenderScanScriptsLoadedInInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanScriptsLoadedInInternetExplorer: Self = this.set("defenderScanScriptsLoadedInInternetExplorer", js.undefined)
    
    @scala.inline
    def setDefenderScanType(value: DefenderScanType): Self = this.set("defenderScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScanType: Self = this.set("defenderScanType", js.undefined)
    
    @scala.inline
    def setDefenderScheduledQuickScanTime(value: NullableOption[String]): Self = this.set("defenderScheduledQuickScanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScheduledQuickScanTime: Self = this.set("defenderScheduledQuickScanTime", js.undefined)
    
    @scala.inline
    def setDefenderScheduledQuickScanTimeNull: Self = this.set("defenderScheduledQuickScanTime", null)
    
    @scala.inline
    def setDefenderScheduledScanTime(value: NullableOption[String]): Self = this.set("defenderScheduledScanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderScheduledScanTime: Self = this.set("defenderScheduledScanTime", js.undefined)
    
    @scala.inline
    def setDefenderScheduledScanTimeNull: Self = this.set("defenderScheduledScanTime", null)
    
    @scala.inline
    def setDefenderSignatureUpdateIntervalInHours(value: NullableOption[Double]): Self = this.set("defenderSignatureUpdateIntervalInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderSignatureUpdateIntervalInHours: Self = this.set("defenderSignatureUpdateIntervalInHours", js.undefined)
    
    @scala.inline
    def setDefenderSignatureUpdateIntervalInHoursNull: Self = this.set("defenderSignatureUpdateIntervalInHours", null)
    
    @scala.inline
    def setDefenderSystemScanSchedule(value: WeeklySchedule): Self = this.set("defenderSystemScanSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefenderSystemScanSchedule: Self = this.set("defenderSystemScanSchedule", js.undefined)
    
    @scala.inline
    def setDeveloperUnlockSetting(value: StateManagementSetting): Self = this.set("developerUnlockSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperUnlockSetting: Self = this.set("developerUnlockSetting", js.undefined)
    
    @scala.inline
    def setDeviceManagementBlockFactoryResetOnMobile(value: Boolean): Self = this.set("deviceManagementBlockFactoryResetOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceManagementBlockFactoryResetOnMobile: Self = this.set("deviceManagementBlockFactoryResetOnMobile", js.undefined)
    
    @scala.inline
    def setDeviceManagementBlockManualUnenroll(value: Boolean): Self = this.set("deviceManagementBlockManualUnenroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceManagementBlockManualUnenroll: Self = this.set("deviceManagementBlockManualUnenroll", js.undefined)
    
    @scala.inline
    def setDiagnosticsDataSubmissionMode(value: DiagnosticDataSubmissionMode): Self = this.set("diagnosticsDataSubmissionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnosticsDataSubmissionMode: Self = this.set("diagnosticsDataSubmissionMode", js.undefined)
    
    @scala.inline
    def setEdgeAllowStartPagesModification(value: Boolean): Self = this.set("edgeAllowStartPagesModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeAllowStartPagesModification: Self = this.set("edgeAllowStartPagesModification", js.undefined)
    
    @scala.inline
    def setEdgeBlockAccessToAboutFlags(value: Boolean): Self = this.set("edgeBlockAccessToAboutFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockAccessToAboutFlags: Self = this.set("edgeBlockAccessToAboutFlags", js.undefined)
    
    @scala.inline
    def setEdgeBlockAddressBarDropdown(value: Boolean): Self = this.set("edgeBlockAddressBarDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockAddressBarDropdown: Self = this.set("edgeBlockAddressBarDropdown", js.undefined)
    
    @scala.inline
    def setEdgeBlockAutofill(value: Boolean): Self = this.set("edgeBlockAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockAutofill: Self = this.set("edgeBlockAutofill", js.undefined)
    
    @scala.inline
    def setEdgeBlockCompatibilityList(value: Boolean): Self = this.set("edgeBlockCompatibilityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockCompatibilityList: Self = this.set("edgeBlockCompatibilityList", js.undefined)
    
    @scala.inline
    def setEdgeBlockDeveloperTools(value: Boolean): Self = this.set("edgeBlockDeveloperTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockDeveloperTools: Self = this.set("edgeBlockDeveloperTools", js.undefined)
    
    @scala.inline
    def setEdgeBlockExtensions(value: Boolean): Self = this.set("edgeBlockExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockExtensions: Self = this.set("edgeBlockExtensions", js.undefined)
    
    @scala.inline
    def setEdgeBlockInPrivateBrowsing(value: Boolean): Self = this.set("edgeBlockInPrivateBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockInPrivateBrowsing: Self = this.set("edgeBlockInPrivateBrowsing", js.undefined)
    
    @scala.inline
    def setEdgeBlockJavaScript(value: Boolean): Self = this.set("edgeBlockJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockJavaScript: Self = this.set("edgeBlockJavaScript", js.undefined)
    
    @scala.inline
    def setEdgeBlockLiveTileDataCollection(value: Boolean): Self = this.set("edgeBlockLiveTileDataCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockLiveTileDataCollection: Self = this.set("edgeBlockLiveTileDataCollection", js.undefined)
    
    @scala.inline
    def setEdgeBlockPasswordManager(value: Boolean): Self = this.set("edgeBlockPasswordManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockPasswordManager: Self = this.set("edgeBlockPasswordManager", js.undefined)
    
    @scala.inline
    def setEdgeBlockPopups(value: Boolean): Self = this.set("edgeBlockPopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockPopups: Self = this.set("edgeBlockPopups", js.undefined)
    
    @scala.inline
    def setEdgeBlockSearchSuggestions(value: Boolean): Self = this.set("edgeBlockSearchSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockSearchSuggestions: Self = this.set("edgeBlockSearchSuggestions", js.undefined)
    
    @scala.inline
    def setEdgeBlockSendingDoNotTrackHeader(value: Boolean): Self = this.set("edgeBlockSendingDoNotTrackHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockSendingDoNotTrackHeader: Self = this.set("edgeBlockSendingDoNotTrackHeader", js.undefined)
    
    @scala.inline
    def setEdgeBlockSendingIntranetTrafficToInternetExplorer(value: Boolean): Self = this.set("edgeBlockSendingIntranetTrafficToInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlockSendingIntranetTrafficToInternetExplorer: Self = this.set("edgeBlockSendingIntranetTrafficToInternetExplorer", js.undefined)
    
    @scala.inline
    def setEdgeBlocked(value: Boolean): Self = this.set("edgeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeBlocked: Self = this.set("edgeBlocked", js.undefined)
    
    @scala.inline
    def setEdgeClearBrowsingDataOnExit(value: Boolean): Self = this.set("edgeClearBrowsingDataOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeClearBrowsingDataOnExit: Self = this.set("edgeClearBrowsingDataOnExit", js.undefined)
    
    @scala.inline
    def setEdgeCookiePolicy(value: EdgeCookiePolicy): Self = this.set("edgeCookiePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeCookiePolicy: Self = this.set("edgeCookiePolicy", js.undefined)
    
    @scala.inline
    def setEdgeDisableFirstRunPage(value: Boolean): Self = this.set("edgeDisableFirstRunPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeDisableFirstRunPage: Self = this.set("edgeDisableFirstRunPage", js.undefined)
    
    @scala.inline
    def setEdgeEnterpriseModeSiteListLocation(value: NullableOption[String]): Self = this.set("edgeEnterpriseModeSiteListLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeEnterpriseModeSiteListLocation: Self = this.set("edgeEnterpriseModeSiteListLocation", js.undefined)
    
    @scala.inline
    def setEdgeEnterpriseModeSiteListLocationNull: Self = this.set("edgeEnterpriseModeSiteListLocation", null)
    
    @scala.inline
    def setEdgeFirstRunUrl(value: NullableOption[String]): Self = this.set("edgeFirstRunUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeFirstRunUrl: Self = this.set("edgeFirstRunUrl", js.undefined)
    
    @scala.inline
    def setEdgeFirstRunUrlNull: Self = this.set("edgeFirstRunUrl", null)
    
    @scala.inline
    def setEdgeHomepageUrlsVarargs(value: String*): Self = this.set("edgeHomepageUrls", js.Array(value :_*))
    
    @scala.inline
    def setEdgeHomepageUrls(value: NullableOption[js.Array[String]]): Self = this.set("edgeHomepageUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeHomepageUrls: Self = this.set("edgeHomepageUrls", js.undefined)
    
    @scala.inline
    def setEdgeHomepageUrlsNull: Self = this.set("edgeHomepageUrls", null)
    
    @scala.inline
    def setEdgeRequireSmartScreen(value: Boolean): Self = this.set("edgeRequireSmartScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeRequireSmartScreen: Self = this.set("edgeRequireSmartScreen", js.undefined)
    
    @scala.inline
    def setEdgeSearchEngine(value: NullableOption[EdgeSearchEngineBase]): Self = this.set("edgeSearchEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSearchEngine: Self = this.set("edgeSearchEngine", js.undefined)
    
    @scala.inline
    def setEdgeSearchEngineNull: Self = this.set("edgeSearchEngine", null)
    
    @scala.inline
    def setEdgeSendIntranetTrafficToInternetExplorer(value: Boolean): Self = this.set("edgeSendIntranetTrafficToInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSendIntranetTrafficToInternetExplorer: Self = this.set("edgeSendIntranetTrafficToInternetExplorer", js.undefined)
    
    @scala.inline
    def setEdgeSyncFavoritesWithInternetExplorer(value: Boolean): Self = this.set("edgeSyncFavoritesWithInternetExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeSyncFavoritesWithInternetExplorer: Self = this.set("edgeSyncFavoritesWithInternetExplorer", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryEndPoint(value: NullableOption[String]): Self = this.set("enterpriseCloudPrintDiscoveryEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintDiscoveryEndPoint: Self = this.set("enterpriseCloudPrintDiscoveryEndPoint", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryEndPointNull: Self = this.set("enterpriseCloudPrintDiscoveryEndPoint", null)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryMaxLimit(value: NullableOption[Double]): Self = this.set("enterpriseCloudPrintDiscoveryMaxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintDiscoveryMaxLimit: Self = this.set("enterpriseCloudPrintDiscoveryMaxLimit", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintDiscoveryMaxLimitNull: Self = this.set("enterpriseCloudPrintDiscoveryMaxLimit", null)
    
    @scala.inline
    def setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(value: NullableOption[String]): Self = this.set("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier: Self = this.set("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifierNull: Self = this.set("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", null)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthAuthority(value: NullableOption[String]): Self = this.set("enterpriseCloudPrintOAuthAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintOAuthAuthority: Self = this.set("enterpriseCloudPrintOAuthAuthority", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthAuthorityNull: Self = this.set("enterpriseCloudPrintOAuthAuthority", null)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthClientIdentifier(value: NullableOption[String]): Self = this.set("enterpriseCloudPrintOAuthClientIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintOAuthClientIdentifier: Self = this.set("enterpriseCloudPrintOAuthClientIdentifier", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintOAuthClientIdentifierNull: Self = this.set("enterpriseCloudPrintOAuthClientIdentifier", null)
    
    @scala.inline
    def setEnterpriseCloudPrintResourceIdentifier(value: NullableOption[String]): Self = this.set("enterpriseCloudPrintResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseCloudPrintResourceIdentifier: Self = this.set("enterpriseCloudPrintResourceIdentifier", js.undefined)
    
    @scala.inline
    def setEnterpriseCloudPrintResourceIdentifierNull: Self = this.set("enterpriseCloudPrintResourceIdentifier", null)
    
    @scala.inline
    def setExperienceBlockDeviceDiscovery(value: Boolean): Self = this.set("experienceBlockDeviceDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperienceBlockDeviceDiscovery: Self = this.set("experienceBlockDeviceDiscovery", js.undefined)
    
    @scala.inline
    def setExperienceBlockErrorDialogWhenNoSIM(value: Boolean): Self = this.set("experienceBlockErrorDialogWhenNoSIM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperienceBlockErrorDialogWhenNoSIM: Self = this.set("experienceBlockErrorDialogWhenNoSIM", js.undefined)
    
    @scala.inline
    def setExperienceBlockTaskSwitcher(value: Boolean): Self = this.set("experienceBlockTaskSwitcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperienceBlockTaskSwitcher: Self = this.set("experienceBlockTaskSwitcher", js.undefined)
    
    @scala.inline
    def setGameDvrBlocked(value: Boolean): Self = this.set("gameDvrBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameDvrBlocked: Self = this.set("gameDvrBlocked", js.undefined)
    
    @scala.inline
    def setInternetSharingBlocked(value: Boolean): Self = this.set("internetSharingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternetSharingBlocked: Self = this.set("internetSharingBlocked", js.undefined)
    
    @scala.inline
    def setLocationServicesBlocked(value: Boolean): Self = this.set("locationServicesBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationServicesBlocked: Self = this.set("locationServicesBlocked", js.undefined)
    
    @scala.inline
    def setLockScreenAllowTimeoutConfiguration(value: Boolean): Self = this.set("lockScreenAllowTimeoutConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenAllowTimeoutConfiguration: Self = this.set("lockScreenAllowTimeoutConfiguration", js.undefined)
    
    @scala.inline
    def setLockScreenBlockActionCenterNotifications(value: Boolean): Self = this.set("lockScreenBlockActionCenterNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenBlockActionCenterNotifications: Self = this.set("lockScreenBlockActionCenterNotifications", js.undefined)
    
    @scala.inline
    def setLockScreenBlockCortana(value: Boolean): Self = this.set("lockScreenBlockCortana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenBlockCortana: Self = this.set("lockScreenBlockCortana", js.undefined)
    
    @scala.inline
    def setLockScreenBlockToastNotifications(value: Boolean): Self = this.set("lockScreenBlockToastNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenBlockToastNotifications: Self = this.set("lockScreenBlockToastNotifications", js.undefined)
    
    @scala.inline
    def setLockScreenTimeoutInSeconds(value: NullableOption[Double]): Self = this.set("lockScreenTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockScreenTimeoutInSeconds: Self = this.set("lockScreenTimeoutInSeconds", js.undefined)
    
    @scala.inline
    def setLockScreenTimeoutInSecondsNull: Self = this.set("lockScreenTimeoutInSeconds", null)
    
    @scala.inline
    def setLogonBlockFastUserSwitching(value: Boolean): Self = this.set("logonBlockFastUserSwitching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogonBlockFastUserSwitching: Self = this.set("logonBlockFastUserSwitching", js.undefined)
    
    @scala.inline
    def setMicrosoftAccountBlockSettingsSync(value: Boolean): Self = this.set("microsoftAccountBlockSettingsSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicrosoftAccountBlockSettingsSync: Self = this.set("microsoftAccountBlockSettingsSync", js.undefined)
    
    @scala.inline
    def setMicrosoftAccountBlocked(value: Boolean): Self = this.set("microsoftAccountBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicrosoftAccountBlocked: Self = this.set("microsoftAccountBlocked", js.undefined)
    
    @scala.inline
    def setNetworkProxyApplySettingsDeviceWide(value: Boolean): Self = this.set("networkProxyApplySettingsDeviceWide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProxyApplySettingsDeviceWide: Self = this.set("networkProxyApplySettingsDeviceWide", js.undefined)
    
    @scala.inline
    def setNetworkProxyAutomaticConfigurationUrl(value: NullableOption[String]): Self = this.set("networkProxyAutomaticConfigurationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProxyAutomaticConfigurationUrl: Self = this.set("networkProxyAutomaticConfigurationUrl", js.undefined)
    
    @scala.inline
    def setNetworkProxyAutomaticConfigurationUrlNull: Self = this.set("networkProxyAutomaticConfigurationUrl", null)
    
    @scala.inline
    def setNetworkProxyDisableAutoDetect(value: Boolean): Self = this.set("networkProxyDisableAutoDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProxyDisableAutoDetect: Self = this.set("networkProxyDisableAutoDetect", js.undefined)
    
    @scala.inline
    def setNetworkProxyServer(value: NullableOption[Windows10NetworkProxyServer]): Self = this.set("networkProxyServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProxyServer: Self = this.set("networkProxyServer", js.undefined)
    
    @scala.inline
    def setNetworkProxyServerNull: Self = this.set("networkProxyServer", null)
    
    @scala.inline
    def setNfcBlocked(value: Boolean): Self = this.set("nfcBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNfcBlocked: Self = this.set("nfcBlocked", js.undefined)
    
    @scala.inline
    def setOneDriveDisableFileSync(value: Boolean): Self = this.set("oneDriveDisableFileSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveDisableFileSync: Self = this.set("oneDriveDisableFileSync", js.undefined)
    
    @scala.inline
    def setPasswordBlockSimple(value: Boolean): Self = this.set("passwordBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordBlockSimple: Self = this.set("passwordBlockSimple", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDays(value: NullableOption[Double]): Self = this.set("passwordExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordExpirationDays: Self = this.set("passwordExpirationDays", js.undefined)
    
    @scala.inline
    def setPasswordExpirationDaysNull: Self = this.set("passwordExpirationDays", null)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCount(value: NullableOption[Double]): Self = this.set("passwordMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumCharacterSetCount: Self = this.set("passwordMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasswordMinimumCharacterSetCountNull: Self = this.set("passwordMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasswordMinimumLength(value: NullableOption[Double]): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    
    @scala.inline
    def setPasswordMinimumLengthNull: Self = this.set("passwordMinimumLength", null)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasswordMinutesOfInactivityBeforeScreenTimeoutNull: Self = this.set("passwordMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCount(value: NullableOption[Double]): Self = this.set("passwordPreviousPasswordBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPreviousPasswordBlockCount: Self = this.set("passwordPreviousPasswordBlockCount", js.undefined)
    
    @scala.inline
    def setPasswordPreviousPasswordBlockCountNull: Self = this.set("passwordPreviousPasswordBlockCount", null)
    
    @scala.inline
    def setPasswordRequireWhenResumeFromIdleState(value: Boolean): Self = this.set("passwordRequireWhenResumeFromIdleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequireWhenResumeFromIdleState: Self = this.set("passwordRequireWhenResumeFromIdleState", js.undefined)
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = this.set("passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequired: Self = this.set("passwordRequired", js.undefined)
    
    @scala.inline
    def setPasswordRequiredType(value: RequiredPasswordType): Self = this.set("passwordRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequiredType: Self = this.set("passwordRequiredType", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryReset(value: NullableOption[Double]): Self = this.set("passwordSignInFailureCountBeforeFactoryReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordSignInFailureCountBeforeFactoryReset: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", js.undefined)
    
    @scala.inline
    def setPasswordSignInFailureCountBeforeFactoryResetNull: Self = this.set("passwordSignInFailureCountBeforeFactoryReset", null)
    
    @scala.inline
    def setPersonalizationDesktopImageUrl(value: NullableOption[String]): Self = this.set("personalizationDesktopImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizationDesktopImageUrl: Self = this.set("personalizationDesktopImageUrl", js.undefined)
    
    @scala.inline
    def setPersonalizationDesktopImageUrlNull: Self = this.set("personalizationDesktopImageUrl", null)
    
    @scala.inline
    def setPersonalizationLockScreenImageUrl(value: NullableOption[String]): Self = this.set("personalizationLockScreenImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalizationLockScreenImageUrl: Self = this.set("personalizationLockScreenImageUrl", js.undefined)
    
    @scala.inline
    def setPersonalizationLockScreenImageUrlNull: Self = this.set("personalizationLockScreenImageUrl", null)
    
    @scala.inline
    def setPrivacyAdvertisingId(value: StateManagementSetting): Self = this.set("privacyAdvertisingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyAdvertisingId: Self = this.set("privacyAdvertisingId", js.undefined)
    
    @scala.inline
    def setPrivacyAutoAcceptPairingAndConsentPrompts(value: Boolean): Self = this.set("privacyAutoAcceptPairingAndConsentPrompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyAutoAcceptPairingAndConsentPrompts: Self = this.set("privacyAutoAcceptPairingAndConsentPrompts", js.undefined)
    
    @scala.inline
    def setPrivacyBlockInputPersonalization(value: Boolean): Self = this.set("privacyBlockInputPersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyBlockInputPersonalization: Self = this.set("privacyBlockInputPersonalization", js.undefined)
    
    @scala.inline
    def setResetProtectionModeBlocked(value: Boolean): Self = this.set("resetProtectionModeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetProtectionModeBlocked: Self = this.set("resetProtectionModeBlocked", js.undefined)
    
    @scala.inline
    def setSafeSearchFilter(value: SafeSearchFilterType): Self = this.set("safeSearchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeSearchFilter: Self = this.set("safeSearchFilter", js.undefined)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
    
    @scala.inline
    def setSearchBlockDiacritics(value: Boolean): Self = this.set("searchBlockDiacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBlockDiacritics: Self = this.set("searchBlockDiacritics", js.undefined)
    
    @scala.inline
    def setSearchDisableAutoLanguageDetection(value: Boolean): Self = this.set("searchDisableAutoLanguageDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDisableAutoLanguageDetection: Self = this.set("searchDisableAutoLanguageDetection", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexerBackoff(value: Boolean): Self = this.set("searchDisableIndexerBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDisableIndexerBackoff: Self = this.set("searchDisableIndexerBackoff", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexingEncryptedItems(value: Boolean): Self = this.set("searchDisableIndexingEncryptedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDisableIndexingEncryptedItems: Self = this.set("searchDisableIndexingEncryptedItems", js.undefined)
    
    @scala.inline
    def setSearchDisableIndexingRemovableDrive(value: Boolean): Self = this.set("searchDisableIndexingRemovableDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDisableIndexingRemovableDrive: Self = this.set("searchDisableIndexingRemovableDrive", js.undefined)
    
    @scala.inline
    def setSearchEnableAutomaticIndexSizeManangement(value: Boolean): Self = this.set("searchEnableAutomaticIndexSizeManangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchEnableAutomaticIndexSizeManangement: Self = this.set("searchEnableAutomaticIndexSizeManangement", js.undefined)
    
    @scala.inline
    def setSearchEnableRemoteQueries(value: Boolean): Self = this.set("searchEnableRemoteQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchEnableRemoteQueries: Self = this.set("searchEnableRemoteQueries", js.undefined)
    
    @scala.inline
    def setSettingsBlockAccountsPage(value: Boolean): Self = this.set("settingsBlockAccountsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockAccountsPage: Self = this.set("settingsBlockAccountsPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockAddProvisioningPackage(value: Boolean): Self = this.set("settingsBlockAddProvisioningPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockAddProvisioningPackage: Self = this.set("settingsBlockAddProvisioningPackage", js.undefined)
    
    @scala.inline
    def setSettingsBlockAppsPage(value: Boolean): Self = this.set("settingsBlockAppsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockAppsPage: Self = this.set("settingsBlockAppsPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeLanguage(value: Boolean): Self = this.set("settingsBlockChangeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockChangeLanguage: Self = this.set("settingsBlockChangeLanguage", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangePowerSleep(value: Boolean): Self = this.set("settingsBlockChangePowerSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockChangePowerSleep: Self = this.set("settingsBlockChangePowerSleep", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeRegion(value: Boolean): Self = this.set("settingsBlockChangeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockChangeRegion: Self = this.set("settingsBlockChangeRegion", js.undefined)
    
    @scala.inline
    def setSettingsBlockChangeSystemTime(value: Boolean): Self = this.set("settingsBlockChangeSystemTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockChangeSystemTime: Self = this.set("settingsBlockChangeSystemTime", js.undefined)
    
    @scala.inline
    def setSettingsBlockDevicesPage(value: Boolean): Self = this.set("settingsBlockDevicesPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockDevicesPage: Self = this.set("settingsBlockDevicesPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockEaseOfAccessPage(value: Boolean): Self = this.set("settingsBlockEaseOfAccessPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockEaseOfAccessPage: Self = this.set("settingsBlockEaseOfAccessPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockEditDeviceName(value: Boolean): Self = this.set("settingsBlockEditDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockEditDeviceName: Self = this.set("settingsBlockEditDeviceName", js.undefined)
    
    @scala.inline
    def setSettingsBlockGamingPage(value: Boolean): Self = this.set("settingsBlockGamingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockGamingPage: Self = this.set("settingsBlockGamingPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockNetworkInternetPage(value: Boolean): Self = this.set("settingsBlockNetworkInternetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockNetworkInternetPage: Self = this.set("settingsBlockNetworkInternetPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockPersonalizationPage(value: Boolean): Self = this.set("settingsBlockPersonalizationPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockPersonalizationPage: Self = this.set("settingsBlockPersonalizationPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockPrivacyPage(value: Boolean): Self = this.set("settingsBlockPrivacyPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockPrivacyPage: Self = this.set("settingsBlockPrivacyPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockRemoveProvisioningPackage(value: Boolean): Self = this.set("settingsBlockRemoveProvisioningPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockRemoveProvisioningPackage: Self = this.set("settingsBlockRemoveProvisioningPackage", js.undefined)
    
    @scala.inline
    def setSettingsBlockSettingsApp(value: Boolean): Self = this.set("settingsBlockSettingsApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockSettingsApp: Self = this.set("settingsBlockSettingsApp", js.undefined)
    
    @scala.inline
    def setSettingsBlockSystemPage(value: Boolean): Self = this.set("settingsBlockSystemPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockSystemPage: Self = this.set("settingsBlockSystemPage", js.undefined)
    
    @scala.inline
    def setSettingsBlockTimeLanguagePage(value: Boolean): Self = this.set("settingsBlockTimeLanguagePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockTimeLanguagePage: Self = this.set("settingsBlockTimeLanguagePage", js.undefined)
    
    @scala.inline
    def setSettingsBlockUpdateSecurityPage(value: Boolean): Self = this.set("settingsBlockUpdateSecurityPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsBlockUpdateSecurityPage: Self = this.set("settingsBlockUpdateSecurityPage", js.undefined)
    
    @scala.inline
    def setSharedUserAppDataAllowed(value: Boolean): Self = this.set("sharedUserAppDataAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedUserAppDataAllowed: Self = this.set("sharedUserAppDataAllowed", js.undefined)
    
    @scala.inline
    def setSmartScreenBlockPromptOverride(value: Boolean): Self = this.set("smartScreenBlockPromptOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartScreenBlockPromptOverride: Self = this.set("smartScreenBlockPromptOverride", js.undefined)
    
    @scala.inline
    def setSmartScreenBlockPromptOverrideForFiles(value: Boolean): Self = this.set("smartScreenBlockPromptOverrideForFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartScreenBlockPromptOverrideForFiles: Self = this.set("smartScreenBlockPromptOverrideForFiles", js.undefined)
    
    @scala.inline
    def setSmartScreenEnableAppInstallControl(value: Boolean): Self = this.set("smartScreenEnableAppInstallControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartScreenEnableAppInstallControl: Self = this.set("smartScreenEnableAppInstallControl", js.undefined)
    
    @scala.inline
    def setStartBlockUnpinningAppsFromTaskbar(value: Boolean): Self = this.set("startBlockUnpinningAppsFromTaskbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartBlockUnpinningAppsFromTaskbar: Self = this.set("startBlockUnpinningAppsFromTaskbar", js.undefined)
    
    @scala.inline
    def setStartMenuAppListVisibility(value: WindowsStartMenuAppListVisibilityType): Self = this.set("startMenuAppListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuAppListVisibility: Self = this.set("startMenuAppListVisibility", js.undefined)
    
    @scala.inline
    def setStartMenuHideChangeAccountSettings(value: Boolean): Self = this.set("startMenuHideChangeAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideChangeAccountSettings: Self = this.set("startMenuHideChangeAccountSettings", js.undefined)
    
    @scala.inline
    def setStartMenuHideFrequentlyUsedApps(value: Boolean): Self = this.set("startMenuHideFrequentlyUsedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideFrequentlyUsedApps: Self = this.set("startMenuHideFrequentlyUsedApps", js.undefined)
    
    @scala.inline
    def setStartMenuHideHibernate(value: Boolean): Self = this.set("startMenuHideHibernate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideHibernate: Self = this.set("startMenuHideHibernate", js.undefined)
    
    @scala.inline
    def setStartMenuHideLock(value: Boolean): Self = this.set("startMenuHideLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideLock: Self = this.set("startMenuHideLock", js.undefined)
    
    @scala.inline
    def setStartMenuHidePowerButton(value: Boolean): Self = this.set("startMenuHidePowerButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHidePowerButton: Self = this.set("startMenuHidePowerButton", js.undefined)
    
    @scala.inline
    def setStartMenuHideRecentJumpLists(value: Boolean): Self = this.set("startMenuHideRecentJumpLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideRecentJumpLists: Self = this.set("startMenuHideRecentJumpLists", js.undefined)
    
    @scala.inline
    def setStartMenuHideRecentlyAddedApps(value: Boolean): Self = this.set("startMenuHideRecentlyAddedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideRecentlyAddedApps: Self = this.set("startMenuHideRecentlyAddedApps", js.undefined)
    
    @scala.inline
    def setStartMenuHideRestartOptions(value: Boolean): Self = this.set("startMenuHideRestartOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideRestartOptions: Self = this.set("startMenuHideRestartOptions", js.undefined)
    
    @scala.inline
    def setStartMenuHideShutDown(value: Boolean): Self = this.set("startMenuHideShutDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideShutDown: Self = this.set("startMenuHideShutDown", js.undefined)
    
    @scala.inline
    def setStartMenuHideSignOut(value: Boolean): Self = this.set("startMenuHideSignOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideSignOut: Self = this.set("startMenuHideSignOut", js.undefined)
    
    @scala.inline
    def setStartMenuHideSleep(value: Boolean): Self = this.set("startMenuHideSleep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideSleep: Self = this.set("startMenuHideSleep", js.undefined)
    
    @scala.inline
    def setStartMenuHideSwitchAccount(value: Boolean): Self = this.set("startMenuHideSwitchAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideSwitchAccount: Self = this.set("startMenuHideSwitchAccount", js.undefined)
    
    @scala.inline
    def setStartMenuHideUserTile(value: Boolean): Self = this.set("startMenuHideUserTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuHideUserTile: Self = this.set("startMenuHideUserTile", js.undefined)
    
    @scala.inline
    def setStartMenuLayoutEdgeAssetsXml(value: NullableOption[Double]): Self = this.set("startMenuLayoutEdgeAssetsXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuLayoutEdgeAssetsXml: Self = this.set("startMenuLayoutEdgeAssetsXml", js.undefined)
    
    @scala.inline
    def setStartMenuLayoutEdgeAssetsXmlNull: Self = this.set("startMenuLayoutEdgeAssetsXml", null)
    
    @scala.inline
    def setStartMenuLayoutXml(value: NullableOption[Double]): Self = this.set("startMenuLayoutXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuLayoutXml: Self = this.set("startMenuLayoutXml", js.undefined)
    
    @scala.inline
    def setStartMenuLayoutXmlNull: Self = this.set("startMenuLayoutXml", null)
    
    @scala.inline
    def setStartMenuMode(value: WindowsStartMenuModeType): Self = this.set("startMenuMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuMode: Self = this.set("startMenuMode", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderDocuments(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderDocuments: Self = this.set("startMenuPinnedFolderDocuments", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderDownloads(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderDownloads: Self = this.set("startMenuPinnedFolderDownloads", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderFileExplorer(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderFileExplorer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderFileExplorer: Self = this.set("startMenuPinnedFolderFileExplorer", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderHomeGroup(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderHomeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderHomeGroup: Self = this.set("startMenuPinnedFolderHomeGroup", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderMusic(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderMusic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderMusic: Self = this.set("startMenuPinnedFolderMusic", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderNetwork(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderNetwork: Self = this.set("startMenuPinnedFolderNetwork", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderPersonalFolder(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderPersonalFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderPersonalFolder: Self = this.set("startMenuPinnedFolderPersonalFolder", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderPictures(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderPictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderPictures: Self = this.set("startMenuPinnedFolderPictures", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderSettings(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderSettings: Self = this.set("startMenuPinnedFolderSettings", js.undefined)
    
    @scala.inline
    def setStartMenuPinnedFolderVideos(value: VisibilitySetting): Self = this.set("startMenuPinnedFolderVideos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMenuPinnedFolderVideos: Self = this.set("startMenuPinnedFolderVideos", js.undefined)
    
    @scala.inline
    def setStorageBlockRemovableStorage(value: Boolean): Self = this.set("storageBlockRemovableStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageBlockRemovableStorage: Self = this.set("storageBlockRemovableStorage", js.undefined)
    
    @scala.inline
    def setStorageRequireMobileDeviceEncryption(value: Boolean): Self = this.set("storageRequireMobileDeviceEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRequireMobileDeviceEncryption: Self = this.set("storageRequireMobileDeviceEncryption", js.undefined)
    
    @scala.inline
    def setStorageRestrictAppDataToSystemVolume(value: Boolean): Self = this.set("storageRestrictAppDataToSystemVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRestrictAppDataToSystemVolume: Self = this.set("storageRestrictAppDataToSystemVolume", js.undefined)
    
    @scala.inline
    def setStorageRestrictAppInstallToSystemVolume(value: Boolean): Self = this.set("storageRestrictAppInstallToSystemVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRestrictAppInstallToSystemVolume: Self = this.set("storageRestrictAppInstallToSystemVolume", js.undefined)
    
    @scala.inline
    def setTenantLockdownRequireNetworkDuringOutOfBoxExperience(value: Boolean): Self = this.set("tenantLockdownRequireNetworkDuringOutOfBoxExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantLockdownRequireNetworkDuringOutOfBoxExperience: Self = this.set("tenantLockdownRequireNetworkDuringOutOfBoxExperience", js.undefined)
    
    @scala.inline
    def setUsbBlocked(value: Boolean): Self = this.set("usbBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbBlocked: Self = this.set("usbBlocked", js.undefined)
    
    @scala.inline
    def setVoiceRecordingBlocked(value: Boolean): Self = this.set("voiceRecordingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceRecordingBlocked: Self = this.set("voiceRecordingBlocked", js.undefined)
    
    @scala.inline
    def setWebRtcBlockLocalhostIpAddress(value: Boolean): Self = this.set("webRtcBlockLocalhostIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebRtcBlockLocalhostIpAddress: Self = this.set("webRtcBlockLocalhostIpAddress", js.undefined)
    
    @scala.inline
    def setWiFiBlockAutomaticConnectHotspots(value: Boolean): Self = this.set("wiFiBlockAutomaticConnectHotspots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWiFiBlockAutomaticConnectHotspots: Self = this.set("wiFiBlockAutomaticConnectHotspots", js.undefined)
    
    @scala.inline
    def setWiFiBlockManualConfiguration(value: Boolean): Self = this.set("wiFiBlockManualConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWiFiBlockManualConfiguration: Self = this.set("wiFiBlockManualConfiguration", js.undefined)
    
    @scala.inline
    def setWiFiBlocked(value: Boolean): Self = this.set("wiFiBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWiFiBlocked: Self = this.set("wiFiBlocked", js.undefined)
    
    @scala.inline
    def setWiFiScanInterval(value: NullableOption[Double]): Self = this.set("wiFiScanInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWiFiScanInterval: Self = this.set("wiFiScanInterval", js.undefined)
    
    @scala.inline
    def setWiFiScanIntervalNull: Self = this.set("wiFiScanInterval", null)
    
    @scala.inline
    def setWindowsSpotlightBlockConsumerSpecificFeatures(value: Boolean): Self = this.set("windowsSpotlightBlockConsumerSpecificFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockConsumerSpecificFeatures: Self = this.set("windowsSpotlightBlockConsumerSpecificFeatures", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockOnActionCenter(value: Boolean): Self = this.set("windowsSpotlightBlockOnActionCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockOnActionCenter: Self = this.set("windowsSpotlightBlockOnActionCenter", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockTailoredExperiences(value: Boolean): Self = this.set("windowsSpotlightBlockTailoredExperiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockTailoredExperiences: Self = this.set("windowsSpotlightBlockTailoredExperiences", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockThirdPartyNotifications(value: Boolean): Self = this.set("windowsSpotlightBlockThirdPartyNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockThirdPartyNotifications: Self = this.set("windowsSpotlightBlockThirdPartyNotifications", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockWelcomeExperience(value: Boolean): Self = this.set("windowsSpotlightBlockWelcomeExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockWelcomeExperience: Self = this.set("windowsSpotlightBlockWelcomeExperience", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlockWindowsTips(value: Boolean): Self = this.set("windowsSpotlightBlockWindowsTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlockWindowsTips: Self = this.set("windowsSpotlightBlockWindowsTips", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightBlocked(value: Boolean): Self = this.set("windowsSpotlightBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightBlocked: Self = this.set("windowsSpotlightBlocked", js.undefined)
    
    @scala.inline
    def setWindowsSpotlightConfigureOnLockScreen(value: WindowsSpotlightEnablementSettings): Self = this.set("windowsSpotlightConfigureOnLockScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsSpotlightConfigureOnLockScreen: Self = this.set("windowsSpotlightConfigureOnLockScreen", js.undefined)
    
    @scala.inline
    def setWindowsStoreBlockAutoUpdate(value: Boolean): Self = this.set("windowsStoreBlockAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsStoreBlockAutoUpdate: Self = this.set("windowsStoreBlockAutoUpdate", js.undefined)
    
    @scala.inline
    def setWindowsStoreBlocked(value: Boolean): Self = this.set("windowsStoreBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsStoreBlocked: Self = this.set("windowsStoreBlocked", js.undefined)
    
    @scala.inline
    def setWindowsStoreEnablePrivateStoreOnly(value: Boolean): Self = this.set("windowsStoreEnablePrivateStoreOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsStoreEnablePrivateStoreOnly: Self = this.set("windowsStoreEnablePrivateStoreOnly", js.undefined)
    
    @scala.inline
    def setWirelessDisplayBlockProjectionToThisDevice(value: Boolean): Self = this.set("wirelessDisplayBlockProjectionToThisDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWirelessDisplayBlockProjectionToThisDevice: Self = this.set("wirelessDisplayBlockProjectionToThisDevice", js.undefined)
    
    @scala.inline
    def setWirelessDisplayBlockUserInputFromReceiver(value: Boolean): Self = this.set("wirelessDisplayBlockUserInputFromReceiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWirelessDisplayBlockUserInputFromReceiver: Self = this.set("wirelessDisplayBlockUserInputFromReceiver", js.undefined)
    
    @scala.inline
    def setWirelessDisplayRequirePinForPairing(value: Boolean): Self = this.set("wirelessDisplayRequirePinForPairing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWirelessDisplayRequirePinForPairing: Self = this.set("wirelessDisplayRequirePinForPairing", js.undefined)
  }
}

package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10GeneralConfiguration extends DeviceConfiguration {
  /** Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account. */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only). */
  var antiTheftModeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether apps from AppX packages signed with a trusted certificate can be side loaded. Possible values are: notConfigured, blocked, allowed. */
  var appsAllowTrustedAppsSideloading: js.UndefOr[StateManagementSetting] = js.undefined
  /** Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded. */
  var appsBlockWindowsStoreOriginatedApps: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify a list of allowed Bluetooth services and profiles in hex formatted strings. */
  var bluetoothAllowedServices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether or not to Block the user from using bluetooth advertising. */
  var bluetoothBlockAdvertising: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using bluetooth discoverable mode. */
  var bluetoothBlockDiscoverableMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device. */
  var bluetoothBlockPrePairing: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using bluetooth. */
  var bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from accessing the camera of the device. */
  var cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using data over cellular while roaming. */
  var cellularBlockDataWhenRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using VPN over cellular. */
  var cellularBlockVpn: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using VPN when roaming over cellular. */
  var cellularBlockVpnWhenRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from doing manual root certificate installation. */
  var certificatesBlockManualRootCertificateInstallation: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences. */
  var connectedDevicesServiceBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using copy paste. */
  var copyPasteBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to Block the user from using Cortana. */
  var cortanaBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to block end user access to Defender. */
  var defenderBlockEndUserAccess: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the level of cloud-delivered protection. Possible values are: notConfigured, high, highPlus, zeroTolerance. */
  var defenderCloudBlockLevel: js.UndefOr[DefenderCloudBlockLevelType] = js.undefined
  /** Number of days before deleting quarantined malware. Valid values 0 to 90 */
  var defenderDaysBeforeDeletingQuarantinedMalware: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets Defender’s actions to take on detected Malware per threat level. */
  var defenderDetectedMalwareActions: js.UndefOr[DefenderDetectedMalwareActions] = js.undefined
  /** File extensions to exclude from scans and real time protection. */
  var defenderFileExtensionsToExclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Files and folder to exclude from scans and real time protection. */
  var defenderFilesAndFoldersToExclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Value for monitoring file activity. Possible values are: userDefined, disable, monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly. */
  var defenderMonitorFileActivity: js.UndefOr[DefenderMonitorFileActivity] = js.undefined
  /** Processes to exclude from scans and real time protection. */
  var defenderProcessesToExclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The configuration for how to prompt user for sample submission. Possible values are: userDefined, alwaysPrompt, promptBeforeSendingPersonalData, neverSendData, sendAllDataWithoutPrompting. */
  var defenderPromptForSampleSubmission: js.UndefOr[DefenderPromptForSampleSubmission] = js.undefined
  /** Indicates whether or not to require behavior monitoring. */
  var defenderRequireBehaviorMonitoring: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require cloud protection. */
  var defenderRequireCloudProtection: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require network inspection system. */
  var defenderRequireNetworkInspectionSystem: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require real time monitoring. */
  var defenderRequireRealTimeMonitoring: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan archive files. */
  var defenderScanArchiveFiles: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan downloads. */
  var defenderScanDownloads: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan incoming mail messages. */
  var defenderScanIncomingMail: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan mapped network drives during full scan. */
  var defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[scala.Boolean] = js.undefined
  /** Max CPU usage percentage during scan. Valid values 0 to 100 */
  var defenderScanMaxCpu: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to scan files opened from a network folder. */
  var defenderScanNetworkFiles: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan removable drives during full scan. */
  var defenderScanRemovableDrivesDuringFullScan: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to scan scripts loaded in Internet Explorer browser. */
  var defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined
  /** The defender system scan type. Possible values are: userDefined, disabled, quick, full. */
  var defenderScanType: js.UndefOr[DefenderScanType] = js.undefined
  /** The time to perform a daily quick scan. */
  var defenderScheduledQuickScanTime: js.UndefOr[java.lang.String] = js.undefined
  /** The defender time for the system scan. */
  var defenderScheduledScanTime: js.UndefOr[java.lang.String] = js.undefined
  /** The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24 */
  var defenderSignatureUpdateIntervalInHours: js.UndefOr[scala.Double] = js.undefined
  /** Defender day of the week for the system scan. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday. */
  var defenderSystemScanSchedule: js.UndefOr[WeeklySchedule] = js.undefined
  /** Indicates whether or not to allow developer unlock. Possible values are: notConfigured, blocked, allowed. */
  var developerUnlockSetting: js.UndefOr[StateManagementSetting] = js.undefined
  /** Indicates whether or not to Block the user from resetting their phone. */
  var deviceManagementBlockFactoryResetOnMobile: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from doing manual un-enrollment from device management. */
  var deviceManagementBlockManualUnenroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value allowing the device to send diagnostic and usage telemetry data, such as Watson. Possible values are: userDefined, none, basic, enhanced, full. */
  var diagnosticsDataSubmissionMode: js.UndefOr[DiagnosticDataSubmissionMode] = js.undefined
  /** Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge. */
  var edgeAllowStartPagesModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to prevent access to about flags on Edge browser. */
  var edgeBlockAccessToAboutFlags: js.UndefOr[scala.Boolean] = js.undefined
  /** Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services. */
  var edgeBlockAddressBarDropdown: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block auto fill. */
  var edgeBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined
  /** Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues. */
  var edgeBlockCompatibilityList: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block developer tools in the Edge browser. */
  var edgeBlockDeveloperTools: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block extensions in the Edge browser. */
  var edgeBlockExtensions: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser. */
  var edgeBlockInPrivateBrowsing: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using JavaScript. */
  var edgeBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined
  /** Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge. */
  var edgeBlockLiveTileDataCollection: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block password manager. */
  var edgeBlockPasswordManager: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block popups. */
  var edgeBlockPopups: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using the search suggestions in the address bar. */
  var edgeBlockSearchSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from sending the do not track header. */
  var edgeBlockSendingDoNotTrackHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
    * Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
    */
  var edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using the Edge browser. */
  var edgeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Clear browsing data on exiting Microsoft Edge. */
  var edgeClearBrowsingDataOnExit: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates which cookies to block in the Edge browser. Possible values are: userDefined, allow, blockThirdParty, blockAll. */
  var edgeCookiePolicy: js.UndefOr[EdgeCookiePolicy] = js.undefined
  /** Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page. */
  var edgeDisableFirstRunPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates the enterprise mode site list location. Could be a local file, local network or http location. */
  var edgeEnterpriseModeSiteListLocation: js.UndefOr[java.lang.String] = js.undefined
  /** The first run URL for when Edge browser is opened for the first time. */
  var edgeFirstRunUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser. */
  var edgeHomepageUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Indicates whether or not to Require the user to use the smart screen filter. */
  var edgeRequireSmartScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows IT admins to set a default search engine for MDM-Controlled devices.
    * Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
    */
  var edgeSearchEngine: js.UndefOr[EdgeSearchEngineBase] = js.undefined
  /** Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. */
  var edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers. */
  var edgeSyncFavoritesWithInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined
  /** Endpoint for discovering cloud printers. */
  var enterpriseCloudPrintDiscoveryEndPoint: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535 */
  var enterpriseCloudPrintDiscoveryMaxLimit: js.UndefOr[scala.Double] = js.undefined
  /** OAuth resource URI for printer discovery service as configured in Azure portal. */
  var enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** Authentication endpoint for acquiring OAuth tokens. */
  var enterpriseCloudPrintOAuthAuthority: js.UndefOr[java.lang.String] = js.undefined
  /** GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority. */
  var enterpriseCloudPrintOAuthClientIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth resource URI for print service as configured in the Azure portal. */
  var enterpriseCloudPrintResourceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether or not to enable device discovery UX. */
  var experienceBlockDeviceDiscovery: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow the error dialog from displaying if no SIM card is detected. */
  var experienceBlockErrorDialogWhenNoSIM: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to enable task switching on the device. */
  var experienceBlockTaskSwitcher: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block DVR and broadcasting. */
  var gameDvrBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using internet sharing. */
  var internetSharingBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from location services. */
  var locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices.
    * If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
    */
  var lockScreenAllowTimeoutConfiguration: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block action center notifications over lock screen. */
  var lockScreenBlockActionCenterNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not the user can interact with Cortana using speech while the system is locked. */
  var lockScreenBlockCortana: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether to allow toast notifications above the device lock screen. */
  var lockScreenBlockToastNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800 */
  var lockScreenTimeoutInSeconds: js.UndefOr[scala.Double] = js.undefined
  /** Disables the ability to quickly switch between users that are logged on simultaneously without logging off. */
  var logonBlockFastUserSwitching: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block Microsoft account settings sync. */
  var microsoftAccountBlockSettingsSync: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block a Microsoft account. */
  var microsoftAccountBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account that’s enrolled into MDM. */
  var networkProxyApplySettingsDeviceWide: js.UndefOr[scala.Boolean] = js.undefined
  /** Address to the proxy auto-config (PAC) script you want to use. */
  var networkProxyAutomaticConfigurationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script. */
  var networkProxyDisableAutoDetect: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies manual proxy server settings. */
  var networkProxyServer: js.UndefOr[Windows10NetworkProxyServer] = js.undefined
  /** Indicates whether or not to Block the user from using near field communication. */
  var nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive. */
  var oneDriveDisableFileSync: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords. */
  var passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  /** The password expiration in days. Valid values 0 to 730 */
  var passwordExpirationDays: js.UndefOr[scala.Double] = js.undefined
  /** The number of character sets required in the password. */
  var passwordMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  /** The minimum password length. Valid values 4 to 16 */
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /** The minutes of inactivity before the screen times out. */
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  /** The number of previous passwords to prevent reuse of. Valid values 0 to 50 */
  var passwordPreviousPasswordBlockCount: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to require a password upon resuming from an idle state. */
  var passwordRequireWhenResumeFromIdleState: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require the user to have a password. */
  var passwordRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** The required password type. Possible values are: deviceDefault, alphanumeric, numeric. */
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  /** The number of sign in failures before factory reset. Valid values 0 to 999 */
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[scala.Double] = js.undefined
  /**
    * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the
    * Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
    */
  var personalizationDesktopImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image
    * or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
    */
  var personalizationLockScreenImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables the use of advertising ID. Added in Windows 10, version 1607. Possible values are: notConfigured, blocked, allowed. */
  var privacyAdvertisingId: js.UndefOr[StateManagementSetting] = js.undefined
  /** Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps. */
  var privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications. */
  var privacyBlockInputPersonalization: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from reset protection mode. */
  var resetProtectionModeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies what filter level of safe search is required. Possible values are: userDefined, strict, moderate. */
  var safeSearchFilter: js.UndefOr[SafeSearchFilterType] = js.undefined
  /** Indicates whether or not to Block the user from taking Screenshots. */
  var screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies if search can use diacritics. */
  var searchBlockDiacritics: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to use automatic language detection when indexing content and properties. */
  var searchDisableAutoLanguageDetection: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to disable the search indexer backoff feature. */
  var searchDisableIndexerBackoff: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer. */
  var searchDisableIndexingEncryptedItems: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed. */
  var searchDisableIndexingRemovableDrive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops. */
  var searchEnableAutomaticIndexSizeManangement: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block remote queries of this computer’s index. */
  var searchEnableRemoteQueries: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Accounts in Settings app. */
  var settingsBlockAccountsPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from installing provisioning packages. */
  var settingsBlockAddProvisioningPackage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Apps in Settings app. */
  var settingsBlockAppsPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from changing the language settings. */
  var settingsBlockChangeLanguage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from changing power and sleep settings. */
  var settingsBlockChangePowerSleep: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from changing the region settings. */
  var settingsBlockChangeRegion: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from changing date and time settings. */
  var settingsBlockChangeSystemTime: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Devices in Settings app. */
  var settingsBlockDevicesPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Ease of Access in Settings app. */
  var settingsBlockEaseOfAccessPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from editing the device name. */
  var settingsBlockEditDeviceName: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Gaming in Settings app. */
  var settingsBlockGamingPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Network &amp; Internet in Settings app. */
  var settingsBlockNetworkInternetPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Personalization in Settings app. */
  var settingsBlockPersonalizationPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Privacy in Settings app. */
  var settingsBlockPrivacyPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the runtime configuration agent from removing provisioning packages. */
  var settingsBlockRemoveProvisioningPackage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Settings app. */
  var settingsBlockSettingsApp: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to System in Settings app. */
  var settingsBlockSystemPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Time &amp; Language in Settings app. */
  var settingsBlockTimeLanguagePage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block access to Update &amp; Security in Settings app. */
  var settingsBlockUpdateSecurityPage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block multiple users of the same app to share data. */
  var sharedUserAppDataAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites. */
  var smartScreenBlockPromptOverride: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files */
  var smartScreenBlockPromptOverrideForFiles: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows IT Admins to control whether users are allowed to install apps from places other than the Store. */
  var smartScreenEnableAppInstallControl: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from unpinning apps from taskbar. */
  var startBlockUnpinningAppsFromTaskbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting the value of this collapses the app list, removes the app list entirely, or disables the corresponding toggle in the Settings app.
    * Possible values are: userDefined, collapse, remove, disableSettingsApp.
    */
  var startMenuAppListVisibility: js.UndefOr[WindowsStartMenuAppListVisibilityType] = js.undefined
  /** Enabling this policy hides the change account setting from appearing in the user tile in the start menu. */
  var startMenuHideChangeAccountSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
  var startMenuHideFrequentlyUsedApps: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides hibernate from appearing in the power button in the start menu. */
  var startMenuHideHibernate: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides lock from appearing in the user tile in the start menu. */
  var startMenuHideLock: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides the power button from appearing in the start menu. */
  var startMenuHidePowerButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app. */
  var startMenuHideRecentJumpLists: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
  var startMenuHideRecentlyAddedApps: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu. */
  var startMenuHideRestartOptions: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu. */
  var startMenuHideShutDown: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides sign out from appearing in the user tile in the start menu. */
  var startMenuHideSignOut: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides sleep from appearing in the power button in the start menu. */
  var startMenuHideSleep: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides switch account from appearing in the user tile in the start menu. */
  var startMenuHideSwitchAccount: js.UndefOr[scala.Boolean] = js.undefined
  /** Enabling this policy hides the user tile from appearing in the start menu. */
  var startMenuHideUserTile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy.
    * Start layout can contain secondary tile from Edge app which looks for Edge local asset file.
    * Edge local asset would not exist and cause Edge secondary tile to appear empty in this case.
    * This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
    */
  var startMenuLayoutEdgeAssetsXml: js.UndefOr[scala.Double] = js.undefined
  /**
    * Allows admins to override the default Start menu layout and prevents the user from changing it.
    * The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
    */
  var startMenuLayoutXml: js.UndefOr[scala.Double] = js.undefined
  /** Allows admins to decide how the Start menu is displayed. Possible values are: userDefined, fullScreen, nonFullScreen. */
  var startMenuMode: js.UndefOr[WindowsStartMenuModeType] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Documents folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderDocuments: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Downloads folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderDownloads: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the FileExplorer shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderFileExplorer: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the HomeGroup folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderHomeGroup: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Music folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderMusic: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Network folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderNetwork: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the PersonalFolder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderPersonalFolder: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Pictures folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderPictures: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Settings folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderSettings: js.UndefOr[VisibilitySetting] = js.undefined
  /** Enforces the visibility (Show/Hide) of the Videos folder shortcut on the Start menu. Possible values are: notConfigured, hide, show. */
  var startMenuPinnedFolderVideos: js.UndefOr[VisibilitySetting] = js.undefined
  /** Indicates whether or not to Block the user from using removable storage. */
  var storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicating whether or not to require encryption on a mobile device. */
  var storageRequireMobileDeviceEncryption: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether application data is restricted to the system drive. */
  var storageRestrictAppDataToSystemVolume: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the installation of applications is restricted to the system drive. */
  var storageRestrictAppInstallToSystemVolume: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the device is required to connect to the network. */
  var tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from USB connection. */
  var usbBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from voice recording. */
  var voiceRecordingBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC */
  var webRtcBlockLocalhostIpAddress: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked. */
  var wiFiBlockAutomaticConnectHotspots: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using Wi-Fi manual configuration. */
  var wiFiBlockManualConfiguration: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using Wi-Fi. */
  var wiFiBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500 */
  var wiFiScanInterval: js.UndefOr[scala.Double] = js.undefined
  /** Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles. */
  var windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[scala.Boolean] = js.undefined
  /** Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed */
  var windowsSpotlightBlockOnActionCenter: js.UndefOr[scala.Boolean] = js.undefined
  /** Block personalized content in Windows spotlight based on user’s device usage. */
  var windowsSpotlightBlockTailoredExperiences: js.UndefOr[scala.Boolean] = js.undefined
  /** Block third party content delivered via Windows Spotlight */
  var windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[scala.Boolean] = js.undefined
  /** Block Windows Spotlight Windows welcome experience */
  var windowsSpotlightBlockWelcomeExperience: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows IT admins to turn off the popup of Windows Tips. */
  var windowsSpotlightBlockWindowsTips: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows IT admins to turn off all Windows Spotlight features */
  var windowsSpotlightBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the type of Spotlight. Possible values are: notConfigured, disabled, enabled. */
  var windowsSpotlightConfigureOnLockScreen: js.UndefOr[WindowsSpotlightEnablementSettings] = js.undefined
  /** Indicates whether or not to block automatic update of apps from Windows Store. */
  var windowsStoreBlockAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to Block the user from using the Windows store. */
  var windowsStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to enable Private Store Only. */
  var windowsStoreEnablePrivateStoreOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow other devices from discovering this PC for projection. */
  var wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow user input from wireless display receiver. */
  var wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require a PIN for new devices to initiate pairing. */
  var wirelessDisplayRequirePinForPairing: js.UndefOr[scala.Boolean] = js.undefined
}

object Windows10GeneralConfiguration {
  @scala.inline
  def apply(
    accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[scala.Boolean] = js.undefined,
    antiTheftModeBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    appsAllowTrustedAppsSideloading: StateManagementSetting = null,
    appsBlockWindowsStoreOriginatedApps: js.UndefOr[scala.Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothAllowedServices: js.Array[java.lang.String] = null,
    bluetoothBlockAdvertising: js.UndefOr[scala.Boolean] = js.undefined,
    bluetoothBlockDiscoverableMode: js.UndefOr[scala.Boolean] = js.undefined,
    bluetoothBlockPrePairing: js.UndefOr[scala.Boolean] = js.undefined,
    bluetoothBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockDataWhenRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockVpn: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockVpnWhenRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    certificatesBlockManualRootCertificateInstallation: js.UndefOr[scala.Boolean] = js.undefined,
    connectedDevicesServiceBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    copyPasteBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cortanaBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    defenderBlockEndUserAccess: js.UndefOr[scala.Boolean] = js.undefined,
    defenderCloudBlockLevel: DefenderCloudBlockLevelType = null,
    defenderDaysBeforeDeletingQuarantinedMalware: scala.Int | scala.Double = null,
    defenderDetectedMalwareActions: DefenderDetectedMalwareActions = null,
    defenderFileExtensionsToExclude: js.Array[java.lang.String] = null,
    defenderFilesAndFoldersToExclude: js.Array[java.lang.String] = null,
    defenderMonitorFileActivity: DefenderMonitorFileActivity = null,
    defenderProcessesToExclude: js.Array[java.lang.String] = null,
    defenderPromptForSampleSubmission: DefenderPromptForSampleSubmission = null,
    defenderRequireBehaviorMonitoring: js.UndefOr[scala.Boolean] = js.undefined,
    defenderRequireCloudProtection: js.UndefOr[scala.Boolean] = js.undefined,
    defenderRequireNetworkInspectionSystem: js.UndefOr[scala.Boolean] = js.undefined,
    defenderRequireRealTimeMonitoring: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanArchiveFiles: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanDownloads: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanIncomingMail: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanMaxCpu: scala.Int | scala.Double = null,
    defenderScanNetworkFiles: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanRemovableDrivesDuringFullScan: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined,
    defenderScanType: DefenderScanType = null,
    defenderScheduledQuickScanTime: java.lang.String = null,
    defenderScheduledScanTime: java.lang.String = null,
    defenderSignatureUpdateIntervalInHours: scala.Int | scala.Double = null,
    defenderSystemScanSchedule: WeeklySchedule = null,
    description: java.lang.String = null,
    developerUnlockSetting: StateManagementSetting = null,
    deviceManagementBlockFactoryResetOnMobile: js.UndefOr[scala.Boolean] = js.undefined,
    deviceManagementBlockManualUnenroll: js.UndefOr[scala.Boolean] = js.undefined,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticsDataSubmissionMode: DiagnosticDataSubmissionMode = null,
    displayName: java.lang.String = null,
    edgeAllowStartPagesModification: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockAccessToAboutFlags: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockAddressBarDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockCompatibilityList: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockDeveloperTools: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockInPrivateBrowsing: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockLiveTileDataCollection: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockPasswordManager: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockPopups: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockSearchSuggestions: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockSendingDoNotTrackHeader: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined,
    edgeBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    edgeClearBrowsingDataOnExit: js.UndefOr[scala.Boolean] = js.undefined,
    edgeCookiePolicy: EdgeCookiePolicy = null,
    edgeDisableFirstRunPage: js.UndefOr[scala.Boolean] = js.undefined,
    edgeEnterpriseModeSiteListLocation: java.lang.String = null,
    edgeFirstRunUrl: java.lang.String = null,
    edgeHomepageUrls: js.Array[java.lang.String] = null,
    edgeRequireSmartScreen: js.UndefOr[scala.Boolean] = js.undefined,
    edgeSearchEngine: EdgeSearchEngineBase = null,
    edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined,
    edgeSyncFavoritesWithInternetExplorer: js.UndefOr[scala.Boolean] = js.undefined,
    enterpriseCloudPrintDiscoveryEndPoint: java.lang.String = null,
    enterpriseCloudPrintDiscoveryMaxLimit: scala.Int | scala.Double = null,
    enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: java.lang.String = null,
    enterpriseCloudPrintOAuthAuthority: java.lang.String = null,
    enterpriseCloudPrintOAuthClientIdentifier: java.lang.String = null,
    enterpriseCloudPrintResourceIdentifier: java.lang.String = null,
    experienceBlockDeviceDiscovery: js.UndefOr[scala.Boolean] = js.undefined,
    experienceBlockErrorDialogWhenNoSIM: js.UndefOr[scala.Boolean] = js.undefined,
    experienceBlockTaskSwitcher: js.UndefOr[scala.Boolean] = js.undefined,
    gameDvrBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    internetSharingBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    locationServicesBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenAllowTimeoutConfiguration: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockActionCenterNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockCortana: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockToastNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenTimeoutInSeconds: scala.Int | scala.Double = null,
    logonBlockFastUserSwitching: js.UndefOr[scala.Boolean] = js.undefined,
    microsoftAccountBlockSettingsSync: js.UndefOr[scala.Boolean] = js.undefined,
    microsoftAccountBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    networkProxyApplySettingsDeviceWide: js.UndefOr[scala.Boolean] = js.undefined,
    networkProxyAutomaticConfigurationUrl: java.lang.String = null,
    networkProxyDisableAutoDetect: js.UndefOr[scala.Boolean] = js.undefined,
    networkProxyServer: Windows10NetworkProxyServer = null,
    nfcBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    oneDriveDisableFileSync: js.UndefOr[scala.Boolean] = js.undefined,
    passwordBlockSimple: js.UndefOr[scala.Boolean] = js.undefined,
    passwordExpirationDays: scala.Int | scala.Double = null,
    passwordMinimumCharacterSetCount: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    passwordPreviousPasswordBlockCount: scala.Int | scala.Double = null,
    passwordRequireWhenResumeFromIdleState: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: scala.Int | scala.Double = null,
    personalizationDesktopImageUrl: java.lang.String = null,
    personalizationLockScreenImageUrl: java.lang.String = null,
    privacyAdvertisingId: StateManagementSetting = null,
    privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[scala.Boolean] = js.undefined,
    privacyBlockInputPersonalization: js.UndefOr[scala.Boolean] = js.undefined,
    resetProtectionModeBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    safeSearchFilter: SafeSearchFilterType = null,
    screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    searchBlockDiacritics: js.UndefOr[scala.Boolean] = js.undefined,
    searchDisableAutoLanguageDetection: js.UndefOr[scala.Boolean] = js.undefined,
    searchDisableIndexerBackoff: js.UndefOr[scala.Boolean] = js.undefined,
    searchDisableIndexingEncryptedItems: js.UndefOr[scala.Boolean] = js.undefined,
    searchDisableIndexingRemovableDrive: js.UndefOr[scala.Boolean] = js.undefined,
    searchEnableAutomaticIndexSizeManangement: js.UndefOr[scala.Boolean] = js.undefined,
    searchEnableRemoteQueries: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockAccountsPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockAddProvisioningPackage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockAppsPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockChangeLanguage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockChangePowerSleep: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockChangeRegion: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockChangeSystemTime: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockDevicesPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockEaseOfAccessPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockEditDeviceName: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockGamingPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockNetworkInternetPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockPersonalizationPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockPrivacyPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockRemoveProvisioningPackage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockSettingsApp: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockSystemPage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockTimeLanguagePage: js.UndefOr[scala.Boolean] = js.undefined,
    settingsBlockUpdateSecurityPage: js.UndefOr[scala.Boolean] = js.undefined,
    sharedUserAppDataAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    smartScreenBlockPromptOverride: js.UndefOr[scala.Boolean] = js.undefined,
    smartScreenBlockPromptOverrideForFiles: js.UndefOr[scala.Boolean] = js.undefined,
    smartScreenEnableAppInstallControl: js.UndefOr[scala.Boolean] = js.undefined,
    startBlockUnpinningAppsFromTaskbar: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuAppListVisibility: WindowsStartMenuAppListVisibilityType = null,
    startMenuHideChangeAccountSettings: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideFrequentlyUsedApps: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideHibernate: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideLock: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHidePowerButton: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideRecentJumpLists: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideRecentlyAddedApps: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideRestartOptions: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideShutDown: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideSignOut: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideSleep: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideSwitchAccount: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuHideUserTile: js.UndefOr[scala.Boolean] = js.undefined,
    startMenuLayoutEdgeAssetsXml: scala.Int | scala.Double = null,
    startMenuLayoutXml: scala.Int | scala.Double = null,
    startMenuMode: WindowsStartMenuModeType = null,
    startMenuPinnedFolderDocuments: VisibilitySetting = null,
    startMenuPinnedFolderDownloads: VisibilitySetting = null,
    startMenuPinnedFolderFileExplorer: VisibilitySetting = null,
    startMenuPinnedFolderHomeGroup: VisibilitySetting = null,
    startMenuPinnedFolderMusic: VisibilitySetting = null,
    startMenuPinnedFolderNetwork: VisibilitySetting = null,
    startMenuPinnedFolderPersonalFolder: VisibilitySetting = null,
    startMenuPinnedFolderPictures: VisibilitySetting = null,
    startMenuPinnedFolderSettings: VisibilitySetting = null,
    startMenuPinnedFolderVideos: VisibilitySetting = null,
    storageBlockRemovableStorage: js.UndefOr[scala.Boolean] = js.undefined,
    storageRequireMobileDeviceEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    storageRestrictAppDataToSystemVolume: js.UndefOr[scala.Boolean] = js.undefined,
    storageRestrictAppInstallToSystemVolume: js.UndefOr[scala.Boolean] = js.undefined,
    tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[scala.Boolean] = js.undefined,
    usbBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null,
    voiceRecordingBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    webRtcBlockLocalhostIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    wiFiBlockAutomaticConnectHotspots: js.UndefOr[scala.Boolean] = js.undefined,
    wiFiBlockManualConfiguration: js.UndefOr[scala.Boolean] = js.undefined,
    wiFiBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    wiFiScanInterval: scala.Int | scala.Double = null,
    windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlockOnActionCenter: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlockTailoredExperiences: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlockWelcomeExperience: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlockWindowsTips: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    windowsSpotlightConfigureOnLockScreen: WindowsSpotlightEnablementSettings = null,
    windowsStoreBlockAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    windowsStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    windowsStoreEnablePrivateStoreOnly: js.UndefOr[scala.Boolean] = js.undefined,
    wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[scala.Boolean] = js.undefined,
    wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[scala.Boolean] = js.undefined,
    wirelessDisplayRequirePinForPairing: js.UndefOr[scala.Boolean] = js.undefined
  ): Windows10GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsBlockAddingNonMicrosoftAccountEmail)) __obj.updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(accountsBlockAddingNonMicrosoftAccountEmail)
    if (!js.isUndefined(antiTheftModeBlocked)) __obj.updateDynamic("antiTheftModeBlocked")(antiTheftModeBlocked)
    if (appsAllowTrustedAppsSideloading != null) __obj.updateDynamic("appsAllowTrustedAppsSideloading")(appsAllowTrustedAppsSideloading)
    if (!js.isUndefined(appsBlockWindowsStoreOriginatedApps)) __obj.updateDynamic("appsBlockWindowsStoreOriginatedApps")(appsBlockWindowsStoreOriginatedApps)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (bluetoothAllowedServices != null) __obj.updateDynamic("bluetoothAllowedServices")(bluetoothAllowedServices)
    if (!js.isUndefined(bluetoothBlockAdvertising)) __obj.updateDynamic("bluetoothBlockAdvertising")(bluetoothBlockAdvertising)
    if (!js.isUndefined(bluetoothBlockDiscoverableMode)) __obj.updateDynamic("bluetoothBlockDiscoverableMode")(bluetoothBlockDiscoverableMode)
    if (!js.isUndefined(bluetoothBlockPrePairing)) __obj.updateDynamic("bluetoothBlockPrePairing")(bluetoothBlockPrePairing)
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked)
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked)
    if (!js.isUndefined(cellularBlockDataWhenRoaming)) __obj.updateDynamic("cellularBlockDataWhenRoaming")(cellularBlockDataWhenRoaming)
    if (!js.isUndefined(cellularBlockVpn)) __obj.updateDynamic("cellularBlockVpn")(cellularBlockVpn)
    if (!js.isUndefined(cellularBlockVpnWhenRoaming)) __obj.updateDynamic("cellularBlockVpnWhenRoaming")(cellularBlockVpnWhenRoaming)
    if (!js.isUndefined(certificatesBlockManualRootCertificateInstallation)) __obj.updateDynamic("certificatesBlockManualRootCertificateInstallation")(certificatesBlockManualRootCertificateInstallation)
    if (!js.isUndefined(connectedDevicesServiceBlocked)) __obj.updateDynamic("connectedDevicesServiceBlocked")(connectedDevicesServiceBlocked)
    if (!js.isUndefined(copyPasteBlocked)) __obj.updateDynamic("copyPasteBlocked")(copyPasteBlocked)
    if (!js.isUndefined(cortanaBlocked)) __obj.updateDynamic("cortanaBlocked")(cortanaBlocked)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (!js.isUndefined(defenderBlockEndUserAccess)) __obj.updateDynamic("defenderBlockEndUserAccess")(defenderBlockEndUserAccess)
    if (defenderCloudBlockLevel != null) __obj.updateDynamic("defenderCloudBlockLevel")(defenderCloudBlockLevel)
    if (defenderDaysBeforeDeletingQuarantinedMalware != null) __obj.updateDynamic("defenderDaysBeforeDeletingQuarantinedMalware")(defenderDaysBeforeDeletingQuarantinedMalware.asInstanceOf[js.Any])
    if (defenderDetectedMalwareActions != null) __obj.updateDynamic("defenderDetectedMalwareActions")(defenderDetectedMalwareActions)
    if (defenderFileExtensionsToExclude != null) __obj.updateDynamic("defenderFileExtensionsToExclude")(defenderFileExtensionsToExclude)
    if (defenderFilesAndFoldersToExclude != null) __obj.updateDynamic("defenderFilesAndFoldersToExclude")(defenderFilesAndFoldersToExclude)
    if (defenderMonitorFileActivity != null) __obj.updateDynamic("defenderMonitorFileActivity")(defenderMonitorFileActivity)
    if (defenderProcessesToExclude != null) __obj.updateDynamic("defenderProcessesToExclude")(defenderProcessesToExclude)
    if (defenderPromptForSampleSubmission != null) __obj.updateDynamic("defenderPromptForSampleSubmission")(defenderPromptForSampleSubmission)
    if (!js.isUndefined(defenderRequireBehaviorMonitoring)) __obj.updateDynamic("defenderRequireBehaviorMonitoring")(defenderRequireBehaviorMonitoring)
    if (!js.isUndefined(defenderRequireCloudProtection)) __obj.updateDynamic("defenderRequireCloudProtection")(defenderRequireCloudProtection)
    if (!js.isUndefined(defenderRequireNetworkInspectionSystem)) __obj.updateDynamic("defenderRequireNetworkInspectionSystem")(defenderRequireNetworkInspectionSystem)
    if (!js.isUndefined(defenderRequireRealTimeMonitoring)) __obj.updateDynamic("defenderRequireRealTimeMonitoring")(defenderRequireRealTimeMonitoring)
    if (!js.isUndefined(defenderScanArchiveFiles)) __obj.updateDynamic("defenderScanArchiveFiles")(defenderScanArchiveFiles)
    if (!js.isUndefined(defenderScanDownloads)) __obj.updateDynamic("defenderScanDownloads")(defenderScanDownloads)
    if (!js.isUndefined(defenderScanIncomingMail)) __obj.updateDynamic("defenderScanIncomingMail")(defenderScanIncomingMail)
    if (!js.isUndefined(defenderScanMappedNetworkDrivesDuringFullScan)) __obj.updateDynamic("defenderScanMappedNetworkDrivesDuringFullScan")(defenderScanMappedNetworkDrivesDuringFullScan)
    if (defenderScanMaxCpu != null) __obj.updateDynamic("defenderScanMaxCpu")(defenderScanMaxCpu.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanNetworkFiles)) __obj.updateDynamic("defenderScanNetworkFiles")(defenderScanNetworkFiles)
    if (!js.isUndefined(defenderScanRemovableDrivesDuringFullScan)) __obj.updateDynamic("defenderScanRemovableDrivesDuringFullScan")(defenderScanRemovableDrivesDuringFullScan)
    if (!js.isUndefined(defenderScanScriptsLoadedInInternetExplorer)) __obj.updateDynamic("defenderScanScriptsLoadedInInternetExplorer")(defenderScanScriptsLoadedInInternetExplorer)
    if (defenderScanType != null) __obj.updateDynamic("defenderScanType")(defenderScanType)
    if (defenderScheduledQuickScanTime != null) __obj.updateDynamic("defenderScheduledQuickScanTime")(defenderScheduledQuickScanTime)
    if (defenderScheduledScanTime != null) __obj.updateDynamic("defenderScheduledScanTime")(defenderScheduledScanTime)
    if (defenderSignatureUpdateIntervalInHours != null) __obj.updateDynamic("defenderSignatureUpdateIntervalInHours")(defenderSignatureUpdateIntervalInHours.asInstanceOf[js.Any])
    if (defenderSystemScanSchedule != null) __obj.updateDynamic("defenderSystemScanSchedule")(defenderSystemScanSchedule)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developerUnlockSetting != null) __obj.updateDynamic("developerUnlockSetting")(developerUnlockSetting)
    if (!js.isUndefined(deviceManagementBlockFactoryResetOnMobile)) __obj.updateDynamic("deviceManagementBlockFactoryResetOnMobile")(deviceManagementBlockFactoryResetOnMobile)
    if (!js.isUndefined(deviceManagementBlockManualUnenroll)) __obj.updateDynamic("deviceManagementBlockManualUnenroll")(deviceManagementBlockManualUnenroll)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (diagnosticsDataSubmissionMode != null) __obj.updateDynamic("diagnosticsDataSubmissionMode")(diagnosticsDataSubmissionMode)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(edgeAllowStartPagesModification)) __obj.updateDynamic("edgeAllowStartPagesModification")(edgeAllowStartPagesModification)
    if (!js.isUndefined(edgeBlockAccessToAboutFlags)) __obj.updateDynamic("edgeBlockAccessToAboutFlags")(edgeBlockAccessToAboutFlags)
    if (!js.isUndefined(edgeBlockAddressBarDropdown)) __obj.updateDynamic("edgeBlockAddressBarDropdown")(edgeBlockAddressBarDropdown)
    if (!js.isUndefined(edgeBlockAutofill)) __obj.updateDynamic("edgeBlockAutofill")(edgeBlockAutofill)
    if (!js.isUndefined(edgeBlockCompatibilityList)) __obj.updateDynamic("edgeBlockCompatibilityList")(edgeBlockCompatibilityList)
    if (!js.isUndefined(edgeBlockDeveloperTools)) __obj.updateDynamic("edgeBlockDeveloperTools")(edgeBlockDeveloperTools)
    if (!js.isUndefined(edgeBlockExtensions)) __obj.updateDynamic("edgeBlockExtensions")(edgeBlockExtensions)
    if (!js.isUndefined(edgeBlockInPrivateBrowsing)) __obj.updateDynamic("edgeBlockInPrivateBrowsing")(edgeBlockInPrivateBrowsing)
    if (!js.isUndefined(edgeBlockJavaScript)) __obj.updateDynamic("edgeBlockJavaScript")(edgeBlockJavaScript)
    if (!js.isUndefined(edgeBlockLiveTileDataCollection)) __obj.updateDynamic("edgeBlockLiveTileDataCollection")(edgeBlockLiveTileDataCollection)
    if (!js.isUndefined(edgeBlockPasswordManager)) __obj.updateDynamic("edgeBlockPasswordManager")(edgeBlockPasswordManager)
    if (!js.isUndefined(edgeBlockPopups)) __obj.updateDynamic("edgeBlockPopups")(edgeBlockPopups)
    if (!js.isUndefined(edgeBlockSearchSuggestions)) __obj.updateDynamic("edgeBlockSearchSuggestions")(edgeBlockSearchSuggestions)
    if (!js.isUndefined(edgeBlockSendingDoNotTrackHeader)) __obj.updateDynamic("edgeBlockSendingDoNotTrackHeader")(edgeBlockSendingDoNotTrackHeader)
    if (!js.isUndefined(edgeBlockSendingIntranetTrafficToInternetExplorer)) __obj.updateDynamic("edgeBlockSendingIntranetTrafficToInternetExplorer")(edgeBlockSendingIntranetTrafficToInternetExplorer)
    if (!js.isUndefined(edgeBlocked)) __obj.updateDynamic("edgeBlocked")(edgeBlocked)
    if (!js.isUndefined(edgeClearBrowsingDataOnExit)) __obj.updateDynamic("edgeClearBrowsingDataOnExit")(edgeClearBrowsingDataOnExit)
    if (edgeCookiePolicy != null) __obj.updateDynamic("edgeCookiePolicy")(edgeCookiePolicy)
    if (!js.isUndefined(edgeDisableFirstRunPage)) __obj.updateDynamic("edgeDisableFirstRunPage")(edgeDisableFirstRunPage)
    if (edgeEnterpriseModeSiteListLocation != null) __obj.updateDynamic("edgeEnterpriseModeSiteListLocation")(edgeEnterpriseModeSiteListLocation)
    if (edgeFirstRunUrl != null) __obj.updateDynamic("edgeFirstRunUrl")(edgeFirstRunUrl)
    if (edgeHomepageUrls != null) __obj.updateDynamic("edgeHomepageUrls")(edgeHomepageUrls)
    if (!js.isUndefined(edgeRequireSmartScreen)) __obj.updateDynamic("edgeRequireSmartScreen")(edgeRequireSmartScreen)
    if (edgeSearchEngine != null) __obj.updateDynamic("edgeSearchEngine")(edgeSearchEngine)
    if (!js.isUndefined(edgeSendIntranetTrafficToInternetExplorer)) __obj.updateDynamic("edgeSendIntranetTrafficToInternetExplorer")(edgeSendIntranetTrafficToInternetExplorer)
    if (!js.isUndefined(edgeSyncFavoritesWithInternetExplorer)) __obj.updateDynamic("edgeSyncFavoritesWithInternetExplorer")(edgeSyncFavoritesWithInternetExplorer)
    if (enterpriseCloudPrintDiscoveryEndPoint != null) __obj.updateDynamic("enterpriseCloudPrintDiscoveryEndPoint")(enterpriseCloudPrintDiscoveryEndPoint)
    if (enterpriseCloudPrintDiscoveryMaxLimit != null) __obj.updateDynamic("enterpriseCloudPrintDiscoveryMaxLimit")(enterpriseCloudPrintDiscoveryMaxLimit.asInstanceOf[js.Any])
    if (enterpriseCloudPrintMopriaDiscoveryResourceIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier")(enterpriseCloudPrintMopriaDiscoveryResourceIdentifier)
    if (enterpriseCloudPrintOAuthAuthority != null) __obj.updateDynamic("enterpriseCloudPrintOAuthAuthority")(enterpriseCloudPrintOAuthAuthority)
    if (enterpriseCloudPrintOAuthClientIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintOAuthClientIdentifier")(enterpriseCloudPrintOAuthClientIdentifier)
    if (enterpriseCloudPrintResourceIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintResourceIdentifier")(enterpriseCloudPrintResourceIdentifier)
    if (!js.isUndefined(experienceBlockDeviceDiscovery)) __obj.updateDynamic("experienceBlockDeviceDiscovery")(experienceBlockDeviceDiscovery)
    if (!js.isUndefined(experienceBlockErrorDialogWhenNoSIM)) __obj.updateDynamic("experienceBlockErrorDialogWhenNoSIM")(experienceBlockErrorDialogWhenNoSIM)
    if (!js.isUndefined(experienceBlockTaskSwitcher)) __obj.updateDynamic("experienceBlockTaskSwitcher")(experienceBlockTaskSwitcher)
    if (!js.isUndefined(gameDvrBlocked)) __obj.updateDynamic("gameDvrBlocked")(gameDvrBlocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(internetSharingBlocked)) __obj.updateDynamic("internetSharingBlocked")(internetSharingBlocked)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked)
    if (!js.isUndefined(lockScreenAllowTimeoutConfiguration)) __obj.updateDynamic("lockScreenAllowTimeoutConfiguration")(lockScreenAllowTimeoutConfiguration)
    if (!js.isUndefined(lockScreenBlockActionCenterNotifications)) __obj.updateDynamic("lockScreenBlockActionCenterNotifications")(lockScreenBlockActionCenterNotifications)
    if (!js.isUndefined(lockScreenBlockCortana)) __obj.updateDynamic("lockScreenBlockCortana")(lockScreenBlockCortana)
    if (!js.isUndefined(lockScreenBlockToastNotifications)) __obj.updateDynamic("lockScreenBlockToastNotifications")(lockScreenBlockToastNotifications)
    if (lockScreenTimeoutInSeconds != null) __obj.updateDynamic("lockScreenTimeoutInSeconds")(lockScreenTimeoutInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(logonBlockFastUserSwitching)) __obj.updateDynamic("logonBlockFastUserSwitching")(logonBlockFastUserSwitching)
    if (!js.isUndefined(microsoftAccountBlockSettingsSync)) __obj.updateDynamic("microsoftAccountBlockSettingsSync")(microsoftAccountBlockSettingsSync)
    if (!js.isUndefined(microsoftAccountBlocked)) __obj.updateDynamic("microsoftAccountBlocked")(microsoftAccountBlocked)
    if (!js.isUndefined(networkProxyApplySettingsDeviceWide)) __obj.updateDynamic("networkProxyApplySettingsDeviceWide")(networkProxyApplySettingsDeviceWide)
    if (networkProxyAutomaticConfigurationUrl != null) __obj.updateDynamic("networkProxyAutomaticConfigurationUrl")(networkProxyAutomaticConfigurationUrl)
    if (!js.isUndefined(networkProxyDisableAutoDetect)) __obj.updateDynamic("networkProxyDisableAutoDetect")(networkProxyDisableAutoDetect)
    if (networkProxyServer != null) __obj.updateDynamic("networkProxyServer")(networkProxyServer)
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked)
    if (!js.isUndefined(oneDriveDisableFileSync)) __obj.updateDynamic("oneDriveDisableFileSync")(oneDriveDisableFileSync)
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple)
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequireWhenResumeFromIdleState)) __obj.updateDynamic("passwordRequireWhenResumeFromIdleState")(passwordRequireWhenResumeFromIdleState)
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired)
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType)
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (personalizationDesktopImageUrl != null) __obj.updateDynamic("personalizationDesktopImageUrl")(personalizationDesktopImageUrl)
    if (personalizationLockScreenImageUrl != null) __obj.updateDynamic("personalizationLockScreenImageUrl")(personalizationLockScreenImageUrl)
    if (privacyAdvertisingId != null) __obj.updateDynamic("privacyAdvertisingId")(privacyAdvertisingId)
    if (!js.isUndefined(privacyAutoAcceptPairingAndConsentPrompts)) __obj.updateDynamic("privacyAutoAcceptPairingAndConsentPrompts")(privacyAutoAcceptPairingAndConsentPrompts)
    if (!js.isUndefined(privacyBlockInputPersonalization)) __obj.updateDynamic("privacyBlockInputPersonalization")(privacyBlockInputPersonalization)
    if (!js.isUndefined(resetProtectionModeBlocked)) __obj.updateDynamic("resetProtectionModeBlocked")(resetProtectionModeBlocked)
    if (safeSearchFilter != null) __obj.updateDynamic("safeSearchFilter")(safeSearchFilter)
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked)
    if (!js.isUndefined(searchBlockDiacritics)) __obj.updateDynamic("searchBlockDiacritics")(searchBlockDiacritics)
    if (!js.isUndefined(searchDisableAutoLanguageDetection)) __obj.updateDynamic("searchDisableAutoLanguageDetection")(searchDisableAutoLanguageDetection)
    if (!js.isUndefined(searchDisableIndexerBackoff)) __obj.updateDynamic("searchDisableIndexerBackoff")(searchDisableIndexerBackoff)
    if (!js.isUndefined(searchDisableIndexingEncryptedItems)) __obj.updateDynamic("searchDisableIndexingEncryptedItems")(searchDisableIndexingEncryptedItems)
    if (!js.isUndefined(searchDisableIndexingRemovableDrive)) __obj.updateDynamic("searchDisableIndexingRemovableDrive")(searchDisableIndexingRemovableDrive)
    if (!js.isUndefined(searchEnableAutomaticIndexSizeManangement)) __obj.updateDynamic("searchEnableAutomaticIndexSizeManangement")(searchEnableAutomaticIndexSizeManangement)
    if (!js.isUndefined(searchEnableRemoteQueries)) __obj.updateDynamic("searchEnableRemoteQueries")(searchEnableRemoteQueries)
    if (!js.isUndefined(settingsBlockAccountsPage)) __obj.updateDynamic("settingsBlockAccountsPage")(settingsBlockAccountsPage)
    if (!js.isUndefined(settingsBlockAddProvisioningPackage)) __obj.updateDynamic("settingsBlockAddProvisioningPackage")(settingsBlockAddProvisioningPackage)
    if (!js.isUndefined(settingsBlockAppsPage)) __obj.updateDynamic("settingsBlockAppsPage")(settingsBlockAppsPage)
    if (!js.isUndefined(settingsBlockChangeLanguage)) __obj.updateDynamic("settingsBlockChangeLanguage")(settingsBlockChangeLanguage)
    if (!js.isUndefined(settingsBlockChangePowerSleep)) __obj.updateDynamic("settingsBlockChangePowerSleep")(settingsBlockChangePowerSleep)
    if (!js.isUndefined(settingsBlockChangeRegion)) __obj.updateDynamic("settingsBlockChangeRegion")(settingsBlockChangeRegion)
    if (!js.isUndefined(settingsBlockChangeSystemTime)) __obj.updateDynamic("settingsBlockChangeSystemTime")(settingsBlockChangeSystemTime)
    if (!js.isUndefined(settingsBlockDevicesPage)) __obj.updateDynamic("settingsBlockDevicesPage")(settingsBlockDevicesPage)
    if (!js.isUndefined(settingsBlockEaseOfAccessPage)) __obj.updateDynamic("settingsBlockEaseOfAccessPage")(settingsBlockEaseOfAccessPage)
    if (!js.isUndefined(settingsBlockEditDeviceName)) __obj.updateDynamic("settingsBlockEditDeviceName")(settingsBlockEditDeviceName)
    if (!js.isUndefined(settingsBlockGamingPage)) __obj.updateDynamic("settingsBlockGamingPage")(settingsBlockGamingPage)
    if (!js.isUndefined(settingsBlockNetworkInternetPage)) __obj.updateDynamic("settingsBlockNetworkInternetPage")(settingsBlockNetworkInternetPage)
    if (!js.isUndefined(settingsBlockPersonalizationPage)) __obj.updateDynamic("settingsBlockPersonalizationPage")(settingsBlockPersonalizationPage)
    if (!js.isUndefined(settingsBlockPrivacyPage)) __obj.updateDynamic("settingsBlockPrivacyPage")(settingsBlockPrivacyPage)
    if (!js.isUndefined(settingsBlockRemoveProvisioningPackage)) __obj.updateDynamic("settingsBlockRemoveProvisioningPackage")(settingsBlockRemoveProvisioningPackage)
    if (!js.isUndefined(settingsBlockSettingsApp)) __obj.updateDynamic("settingsBlockSettingsApp")(settingsBlockSettingsApp)
    if (!js.isUndefined(settingsBlockSystemPage)) __obj.updateDynamic("settingsBlockSystemPage")(settingsBlockSystemPage)
    if (!js.isUndefined(settingsBlockTimeLanguagePage)) __obj.updateDynamic("settingsBlockTimeLanguagePage")(settingsBlockTimeLanguagePage)
    if (!js.isUndefined(settingsBlockUpdateSecurityPage)) __obj.updateDynamic("settingsBlockUpdateSecurityPage")(settingsBlockUpdateSecurityPage)
    if (!js.isUndefined(sharedUserAppDataAllowed)) __obj.updateDynamic("sharedUserAppDataAllowed")(sharedUserAppDataAllowed)
    if (!js.isUndefined(smartScreenBlockPromptOverride)) __obj.updateDynamic("smartScreenBlockPromptOverride")(smartScreenBlockPromptOverride)
    if (!js.isUndefined(smartScreenBlockPromptOverrideForFiles)) __obj.updateDynamic("smartScreenBlockPromptOverrideForFiles")(smartScreenBlockPromptOverrideForFiles)
    if (!js.isUndefined(smartScreenEnableAppInstallControl)) __obj.updateDynamic("smartScreenEnableAppInstallControl")(smartScreenEnableAppInstallControl)
    if (!js.isUndefined(startBlockUnpinningAppsFromTaskbar)) __obj.updateDynamic("startBlockUnpinningAppsFromTaskbar")(startBlockUnpinningAppsFromTaskbar)
    if (startMenuAppListVisibility != null) __obj.updateDynamic("startMenuAppListVisibility")(startMenuAppListVisibility)
    if (!js.isUndefined(startMenuHideChangeAccountSettings)) __obj.updateDynamic("startMenuHideChangeAccountSettings")(startMenuHideChangeAccountSettings)
    if (!js.isUndefined(startMenuHideFrequentlyUsedApps)) __obj.updateDynamic("startMenuHideFrequentlyUsedApps")(startMenuHideFrequentlyUsedApps)
    if (!js.isUndefined(startMenuHideHibernate)) __obj.updateDynamic("startMenuHideHibernate")(startMenuHideHibernate)
    if (!js.isUndefined(startMenuHideLock)) __obj.updateDynamic("startMenuHideLock")(startMenuHideLock)
    if (!js.isUndefined(startMenuHidePowerButton)) __obj.updateDynamic("startMenuHidePowerButton")(startMenuHidePowerButton)
    if (!js.isUndefined(startMenuHideRecentJumpLists)) __obj.updateDynamic("startMenuHideRecentJumpLists")(startMenuHideRecentJumpLists)
    if (!js.isUndefined(startMenuHideRecentlyAddedApps)) __obj.updateDynamic("startMenuHideRecentlyAddedApps")(startMenuHideRecentlyAddedApps)
    if (!js.isUndefined(startMenuHideRestartOptions)) __obj.updateDynamic("startMenuHideRestartOptions")(startMenuHideRestartOptions)
    if (!js.isUndefined(startMenuHideShutDown)) __obj.updateDynamic("startMenuHideShutDown")(startMenuHideShutDown)
    if (!js.isUndefined(startMenuHideSignOut)) __obj.updateDynamic("startMenuHideSignOut")(startMenuHideSignOut)
    if (!js.isUndefined(startMenuHideSleep)) __obj.updateDynamic("startMenuHideSleep")(startMenuHideSleep)
    if (!js.isUndefined(startMenuHideSwitchAccount)) __obj.updateDynamic("startMenuHideSwitchAccount")(startMenuHideSwitchAccount)
    if (!js.isUndefined(startMenuHideUserTile)) __obj.updateDynamic("startMenuHideUserTile")(startMenuHideUserTile)
    if (startMenuLayoutEdgeAssetsXml != null) __obj.updateDynamic("startMenuLayoutEdgeAssetsXml")(startMenuLayoutEdgeAssetsXml.asInstanceOf[js.Any])
    if (startMenuLayoutXml != null) __obj.updateDynamic("startMenuLayoutXml")(startMenuLayoutXml.asInstanceOf[js.Any])
    if (startMenuMode != null) __obj.updateDynamic("startMenuMode")(startMenuMode)
    if (startMenuPinnedFolderDocuments != null) __obj.updateDynamic("startMenuPinnedFolderDocuments")(startMenuPinnedFolderDocuments)
    if (startMenuPinnedFolderDownloads != null) __obj.updateDynamic("startMenuPinnedFolderDownloads")(startMenuPinnedFolderDownloads)
    if (startMenuPinnedFolderFileExplorer != null) __obj.updateDynamic("startMenuPinnedFolderFileExplorer")(startMenuPinnedFolderFileExplorer)
    if (startMenuPinnedFolderHomeGroup != null) __obj.updateDynamic("startMenuPinnedFolderHomeGroup")(startMenuPinnedFolderHomeGroup)
    if (startMenuPinnedFolderMusic != null) __obj.updateDynamic("startMenuPinnedFolderMusic")(startMenuPinnedFolderMusic)
    if (startMenuPinnedFolderNetwork != null) __obj.updateDynamic("startMenuPinnedFolderNetwork")(startMenuPinnedFolderNetwork)
    if (startMenuPinnedFolderPersonalFolder != null) __obj.updateDynamic("startMenuPinnedFolderPersonalFolder")(startMenuPinnedFolderPersonalFolder)
    if (startMenuPinnedFolderPictures != null) __obj.updateDynamic("startMenuPinnedFolderPictures")(startMenuPinnedFolderPictures)
    if (startMenuPinnedFolderSettings != null) __obj.updateDynamic("startMenuPinnedFolderSettings")(startMenuPinnedFolderSettings)
    if (startMenuPinnedFolderVideos != null) __obj.updateDynamic("startMenuPinnedFolderVideos")(startMenuPinnedFolderVideos)
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage)
    if (!js.isUndefined(storageRequireMobileDeviceEncryption)) __obj.updateDynamic("storageRequireMobileDeviceEncryption")(storageRequireMobileDeviceEncryption)
    if (!js.isUndefined(storageRestrictAppDataToSystemVolume)) __obj.updateDynamic("storageRestrictAppDataToSystemVolume")(storageRestrictAppDataToSystemVolume)
    if (!js.isUndefined(storageRestrictAppInstallToSystemVolume)) __obj.updateDynamic("storageRestrictAppInstallToSystemVolume")(storageRestrictAppInstallToSystemVolume)
    if (!js.isUndefined(tenantLockdownRequireNetworkDuringOutOfBoxExperience)) __obj.updateDynamic("tenantLockdownRequireNetworkDuringOutOfBoxExperience")(tenantLockdownRequireNetworkDuringOutOfBoxExperience)
    if (!js.isUndefined(usbBlocked)) __obj.updateDynamic("usbBlocked")(usbBlocked)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceRecordingBlocked)) __obj.updateDynamic("voiceRecordingBlocked")(voiceRecordingBlocked)
    if (!js.isUndefined(webRtcBlockLocalhostIpAddress)) __obj.updateDynamic("webRtcBlockLocalhostIpAddress")(webRtcBlockLocalhostIpAddress)
    if (!js.isUndefined(wiFiBlockAutomaticConnectHotspots)) __obj.updateDynamic("wiFiBlockAutomaticConnectHotspots")(wiFiBlockAutomaticConnectHotspots)
    if (!js.isUndefined(wiFiBlockManualConfiguration)) __obj.updateDynamic("wiFiBlockManualConfiguration")(wiFiBlockManualConfiguration)
    if (!js.isUndefined(wiFiBlocked)) __obj.updateDynamic("wiFiBlocked")(wiFiBlocked)
    if (wiFiScanInterval != null) __obj.updateDynamic("wiFiScanInterval")(wiFiScanInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockConsumerSpecificFeatures)) __obj.updateDynamic("windowsSpotlightBlockConsumerSpecificFeatures")(windowsSpotlightBlockConsumerSpecificFeatures)
    if (!js.isUndefined(windowsSpotlightBlockOnActionCenter)) __obj.updateDynamic("windowsSpotlightBlockOnActionCenter")(windowsSpotlightBlockOnActionCenter)
    if (!js.isUndefined(windowsSpotlightBlockTailoredExperiences)) __obj.updateDynamic("windowsSpotlightBlockTailoredExperiences")(windowsSpotlightBlockTailoredExperiences)
    if (!js.isUndefined(windowsSpotlightBlockThirdPartyNotifications)) __obj.updateDynamic("windowsSpotlightBlockThirdPartyNotifications")(windowsSpotlightBlockThirdPartyNotifications)
    if (!js.isUndefined(windowsSpotlightBlockWelcomeExperience)) __obj.updateDynamic("windowsSpotlightBlockWelcomeExperience")(windowsSpotlightBlockWelcomeExperience)
    if (!js.isUndefined(windowsSpotlightBlockWindowsTips)) __obj.updateDynamic("windowsSpotlightBlockWindowsTips")(windowsSpotlightBlockWindowsTips)
    if (!js.isUndefined(windowsSpotlightBlocked)) __obj.updateDynamic("windowsSpotlightBlocked")(windowsSpotlightBlocked)
    if (windowsSpotlightConfigureOnLockScreen != null) __obj.updateDynamic("windowsSpotlightConfigureOnLockScreen")(windowsSpotlightConfigureOnLockScreen)
    if (!js.isUndefined(windowsStoreBlockAutoUpdate)) __obj.updateDynamic("windowsStoreBlockAutoUpdate")(windowsStoreBlockAutoUpdate)
    if (!js.isUndefined(windowsStoreBlocked)) __obj.updateDynamic("windowsStoreBlocked")(windowsStoreBlocked)
    if (!js.isUndefined(windowsStoreEnablePrivateStoreOnly)) __obj.updateDynamic("windowsStoreEnablePrivateStoreOnly")(windowsStoreEnablePrivateStoreOnly)
    if (!js.isUndefined(wirelessDisplayBlockProjectionToThisDevice)) __obj.updateDynamic("wirelessDisplayBlockProjectionToThisDevice")(wirelessDisplayBlockProjectionToThisDevice)
    if (!js.isUndefined(wirelessDisplayBlockUserInputFromReceiver)) __obj.updateDynamic("wirelessDisplayBlockUserInputFromReceiver")(wirelessDisplayBlockUserInputFromReceiver)
    if (!js.isUndefined(wirelessDisplayRequirePinForPairing)) __obj.updateDynamic("wirelessDisplayRequirePinForPairing")(wirelessDisplayRequirePinForPairing)
    __obj.asInstanceOf[Windows10GeneralConfiguration]
  }
}


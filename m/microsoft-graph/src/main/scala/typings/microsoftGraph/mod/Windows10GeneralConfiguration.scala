package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10GeneralConfiguration extends DeviceConfiguration {
  /**
    * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a
    * Microsoft account.
    */
  var accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
  var antiTheftModeBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether apps from AppX packages signed with a trusted certificate can be side loaded. Possible values are:
    * notConfigured, blocked, allowed.
    */
  var appsAllowTrustedAppsSideloading: js.UndefOr[StateManagementSetting] = js.undefined
  /**
    * Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were
    * downloaded.
    */
  var appsBlockWindowsStoreOriginatedApps: js.UndefOr[Boolean] = js.undefined
  // Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
  var bluetoothAllowedServices: js.UndefOr[js.Array[String]] = js.undefined
  // Whether or not to Block the user from using bluetooth advertising.
  var bluetoothBlockAdvertising: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using bluetooth discoverable mode.
  var bluetoothBlockDiscoverableMode: js.UndefOr[Boolean] = js.undefined
  // Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
  var bluetoothBlockPrePairing: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using data over cellular while roaming.
  var cellularBlockDataWhenRoaming: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using VPN over cellular.
  var cellularBlockVpn: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using VPN when roaming over cellular.
  var cellularBlockVpnWhenRoaming: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from doing manual root certificate installation.
  var certificatesBlockManualRootCertificateInstallation: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote
    * messaging, remote app sessions and other cross-device experiences.
    */
  var connectedDevicesServiceBlocked: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using copy paste.
  var copyPasteBlocked: js.UndefOr[Boolean] = js.undefined
  // Whether or not to Block the user from using Cortana.
  var cortanaBlocked: js.UndefOr[Boolean] = js.undefined
  // Whether or not to block end user access to Defender.
  var defenderBlockEndUserAccess: js.UndefOr[Boolean] = js.undefined
  // Specifies the level of cloud-delivered protection. Possible values are: notConfigured, high, highPlus, zeroTolerance.
  var defenderCloudBlockLevel: js.UndefOr[DefenderCloudBlockLevelType] = js.undefined
  // Number of days before deleting quarantined malware. Valid values 0 to 90
  var defenderDaysBeforeDeletingQuarantinedMalware: js.UndefOr[Double] = js.undefined
  // Gets or sets Defender’s actions to take on detected Malware per threat level.
  var defenderDetectedMalwareActions: js.UndefOr[DefenderDetectedMalwareActions] = js.undefined
  // File extensions to exclude from scans and real time protection.
  var defenderFileExtensionsToExclude: js.UndefOr[js.Array[String]] = js.undefined
  // Files and folder to exclude from scans and real time protection.
  var defenderFilesAndFoldersToExclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Value for monitoring file activity. Possible values are: userDefined, disable, monitorAllFiles,
    * monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
    */
  var defenderMonitorFileActivity: js.UndefOr[DefenderMonitorFileActivity] = js.undefined
  // Processes to exclude from scans and real time protection.
  var defenderProcessesToExclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The configuration for how to prompt user for sample submission. Possible values are: userDefined, alwaysPrompt,
    * promptBeforeSendingPersonalData, neverSendData, sendAllDataWithoutPrompting.
    */
  var defenderPromptForSampleSubmission: js.UndefOr[DefenderPromptForSampleSubmission] = js.undefined
  // Indicates whether or not to require behavior monitoring.
  var defenderRequireBehaviorMonitoring: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require cloud protection.
  var defenderRequireCloudProtection: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require network inspection system.
  var defenderRequireNetworkInspectionSystem: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require real time monitoring.
  var defenderRequireRealTimeMonitoring: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan archive files.
  var defenderScanArchiveFiles: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan downloads.
  var defenderScanDownloads: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan incoming mail messages.
  var defenderScanIncomingMail: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan mapped network drives during full scan.
  var defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[Boolean] = js.undefined
  // Max CPU usage percentage during scan. Valid values 0 to 100
  var defenderScanMaxCpu: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to scan files opened from a network folder.
  var defenderScanNetworkFiles: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan removable drives during full scan.
  var defenderScanRemovableDrivesDuringFullScan: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to scan scripts loaded in Internet Explorer browser.
  var defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[Boolean] = js.undefined
  // The defender system scan type. Possible values are: userDefined, disabled, quick, full.
  var defenderScanType: js.UndefOr[DefenderScanType] = js.undefined
  // The time to perform a daily quick scan.
  var defenderScheduledQuickScanTime: js.UndefOr[String] = js.undefined
  // The defender time for the system scan.
  var defenderScheduledScanTime: js.UndefOr[String] = js.undefined
  // The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
  var defenderSignatureUpdateIntervalInHours: js.UndefOr[Double] = js.undefined
  /**
    * Defender day of the week for the system scan. Possible values are: userDefined, everyday, sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday.
    */
  var defenderSystemScanSchedule: js.UndefOr[WeeklySchedule] = js.undefined
  // Indicates whether or not to allow developer unlock. Possible values are: notConfigured, blocked, allowed.
  var developerUnlockSetting: js.UndefOr[StateManagementSetting] = js.undefined
  // Indicates whether or not to Block the user from resetting their phone.
  var deviceManagementBlockFactoryResetOnMobile: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from doing manual un-enrollment from device management.
  var deviceManagementBlockManualUnenroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets a value allowing the device to send diagnostic and usage telemetry data, such as Watson. Possible values
    * are: userDefined, none, basic, enhanced, full.
    */
  var diagnosticsDataSubmissionMode: js.UndefOr[DiagnosticDataSubmissionMode] = js.undefined
  /**
    * Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see
    * by default when they open Edge.
    */
  var edgeAllowStartPagesModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to prevent access to about flags on Edge browser.
  var edgeBlockAccessToAboutFlags: js.UndefOr[Boolean] = js.undefined
  /**
    * Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections
    * from Microsoft Edge to Microsoft services.
    */
  var edgeBlockAddressBarDropdown: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block auto fill.
  var edgeBlockAutofill: js.UndefOr[Boolean] = js.undefined
  /**
    * Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with
    * known compatibility issues.
    */
  var edgeBlockCompatibilityList: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block developer tools in the Edge browser.
  var edgeBlockDeveloperTools: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block extensions in the Edge browser.
  var edgeBlockExtensions: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
  var edgeBlockInPrivateBrowsing: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using JavaScript.
  var edgeBlockJavaScript: js.UndefOr[Boolean] = js.undefined
  /**
    * Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft
    * Edge.
    */
  var edgeBlockLiveTileDataCollection: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block password manager.
  var edgeBlockPasswordManager: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block popups.
  var edgeBlockPopups: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using the search suggestions in the address bar.
  var edgeBlockSearchSuggestions: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from sending the do not track header.
  var edgeBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property
    * is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
    */
  var edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using the Edge browser.
  var edgeBlocked: js.UndefOr[Boolean] = js.undefined
  // Clear browsing data on exiting Microsoft Edge.
  var edgeClearBrowsingDataOnExit: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates which cookies to block in the Edge browser. Possible values are: userDefined, allow, blockThirdParty,
    * blockAll.
    */
  var edgeCookiePolicy: js.UndefOr[EdgeCookiePolicy] = js.undefined
  /**
    * Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those
    * enrolled in zero emissions configurations, to block this page.
    */
  var edgeDisableFirstRunPage: js.UndefOr[Boolean] = js.undefined
  // Indicates the enterprise mode site list location. Could be a local file, local network or http location.
  var edgeEnterpriseModeSiteListLocation: js.UndefOr[String] = js.undefined
  // The first run URL for when Edge browser is opened for the first time.
  var edgeFirstRunUrl: js.UndefOr[String] = js.undefined
  // The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
  var edgeHomepageUrls: js.UndefOr[js.Array[String]] = js.undefined
  // Indicates whether or not to Require the user to use the smart screen filter.
  var edgeRequireSmartScreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their
    * default search engine provided the AllowSearchEngineCustomization policy is not set.
    */
  var edgeSearchEngine: js.UndefOr[EdgeSearchEngineBase] = js.undefined
  // Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
  var edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order
    * changes to favorites are shared between browsers.
    */
  var edgeSyncFavoritesWithInternetExplorer: js.UndefOr[Boolean] = js.undefined
  // Endpoint for discovering cloud printers.
  var enterpriseCloudPrintDiscoveryEndPoint: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid
    * values 1 to 65535
    */
  var enterpriseCloudPrintDiscoveryMaxLimit: js.UndefOr[Double] = js.undefined
  // OAuth resource URI for printer discovery service as configured in Azure portal.
  var enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: js.UndefOr[String] = js.undefined
  // Authentication endpoint for acquiring OAuth tokens.
  var enterpriseCloudPrintOAuthAuthority: js.UndefOr[String] = js.undefined
  // GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
  var enterpriseCloudPrintOAuthClientIdentifier: js.UndefOr[String] = js.undefined
  // OAuth resource URI for print service as configured in the Azure portal.
  var enterpriseCloudPrintResourceIdentifier: js.UndefOr[String] = js.undefined
  // Indicates whether or not to enable device discovery UX.
  var experienceBlockDeviceDiscovery: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
  var experienceBlockErrorDialogWhenNoSIM: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to enable task switching on the device.
  var experienceBlockTaskSwitcher: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block DVR and broadcasting.
  var gameDvrBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using internet sharing.
  var internetSharingBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows
    * 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
    */
  var lockScreenAllowTimeoutConfiguration: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block action center notifications over lock screen.
  var lockScreenBlockActionCenterNotifications: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not the user can interact with Cortana using speech while the system is locked.
  var lockScreenBlockCortana: js.UndefOr[Boolean] = js.undefined
  // Indicates whether to allow toast notifications above the device lock screen.
  var lockScreenBlockToastNotifications: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices.
    * Supported values are 11-1800. Valid values 11 to 1800
    */
  var lockScreenTimeoutInSeconds: js.UndefOr[Double] = js.undefined
  // Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
  var logonBlockFastUserSwitching: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block Microsoft account settings sync.
  var microsoftAccountBlockSettingsSync: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block a Microsoft account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to
    * the user account that’s enrolled into MDM.
    */
  var networkProxyApplySettingsDeviceWide: js.UndefOr[Boolean] = js.undefined
  // Address to the proxy auto-config (PAC) script you want to use.
  var networkProxyAutomaticConfigurationUrl: js.UndefOr[String] = js.undefined
  /**
    * Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC)
    * script.
    */
  var networkProxyDisableAutoDetect: js.UndefOr[Boolean] = js.undefined
  // Specifies manual proxy server settings.
  var networkProxyServer: js.UndefOr[Windows10NetworkProxyServer] = js.undefined
  // Indicates whether or not to Block the user from using near field communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.undefined
  // Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
  var oneDriveDisableFileSync: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the
    * use of picture passwords.
    */
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  // The password expiration in days. Valid values 0 to 730
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // The number of character sets required in the password.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // The minimum password length. Valid values 4 to 16
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // The minutes of inactivity before the screen times out.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // The number of previous passwords to prevent reuse of. Valid values 0 to 50
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require a password upon resuming from an idle state.
  var passwordRequireWhenResumeFromIdleState: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require the user to have a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  // The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // The number of sign in failures before factory reset. Valid values 0 to 999
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
  /**
    * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url
    * to a local image on the file system that needs to used as the Desktop Image.
    */
  var personalizationDesktopImageUrl: js.UndefOr[String] = js.undefined
  /**
    * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a
    * file Url to a local image on the file system that needs to be used as the Lock Screen Image.
    */
  var personalizationLockScreenImageUrl: js.UndefOr[String] = js.undefined
  /**
    * Enables or disables the use of advertising ID. Added in Windows 10, version 1607. Possible values are: notConfigured,
    * blocked, allowed.
    */
  var privacyAdvertisingId: js.UndefOr[StateManagementSetting] = js.undefined
  /**
    * Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when
    * launching apps.
    */
  var privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store
    * applications.
    */
  var privacyBlockInputPersonalization: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from reset protection mode.
  var resetProtectionModeBlocked: js.UndefOr[Boolean] = js.undefined
  // Specifies what filter level of safe search is required. Possible values are: userDefined, strict, moderate.
  var safeSearchFilter: js.UndefOr[SafeSearchFilterType] = js.undefined
  // Indicates whether or not to Block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
  // Specifies if search can use diacritics.
  var searchBlockDiacritics: js.UndefOr[Boolean] = js.undefined
  // Specifies whether to use automatic language detection when indexing content and properties.
  var searchDisableAutoLanguageDetection: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to disable the search indexer backoff feature.
  var searchDisableIndexerBackoff: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for
    * Cortana or Explorer.
    */
  var searchDisableIndexingEncryptedItems: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
  var searchDisableIndexingRemovableDrive: js.UndefOr[Boolean] = js.undefined
  // Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
  var searchEnableAutomaticIndexSizeManangement: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block remote queries of this computer’s index.
  var searchEnableRemoteQueries: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Accounts in Settings app.
  var settingsBlockAccountsPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from installing provisioning packages.
  var settingsBlockAddProvisioningPackage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Apps in Settings app.
  var settingsBlockAppsPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from changing the language settings.
  var settingsBlockChangeLanguage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from changing power and sleep settings.
  var settingsBlockChangePowerSleep: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from changing the region settings.
  var settingsBlockChangeRegion: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from changing date and time settings.
  var settingsBlockChangeSystemTime: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Devices in Settings app.
  var settingsBlockDevicesPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Ease of Access in Settings app.
  var settingsBlockEaseOfAccessPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from editing the device name.
  var settingsBlockEditDeviceName: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Gaming in Settings app.
  var settingsBlockGamingPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Network &amp; Internet in Settings app.
  var settingsBlockNetworkInternetPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Personalization in Settings app.
  var settingsBlockPersonalizationPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Privacy in Settings app.
  var settingsBlockPrivacyPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
  var settingsBlockRemoveProvisioningPackage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Settings app.
  var settingsBlockSettingsApp: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to System in Settings app.
  var settingsBlockSystemPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Time &amp; Language in Settings app.
  var settingsBlockTimeLanguagePage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block access to Update &amp; Security in Settings app.
  var settingsBlockUpdateSecurityPage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block multiple users of the same app to share data.
  var sharedUserAppDataAllowed: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
  var smartScreenBlockPromptOverride: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
  var smartScreenBlockPromptOverrideForFiles: js.UndefOr[Boolean] = js.undefined
  // Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
  var smartScreenEnableAppInstallControl: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from unpinning apps from taskbar.
  var startBlockUnpinningAppsFromTaskbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting the value of this collapses the app list, removes the app list entirely, or disables the corresponding toggle
    * in the Settings app. Possible values are: userDefined, collapse, remove, disableSettingsApp.
    */
  var startMenuAppListVisibility: js.UndefOr[WindowsStartMenuAppListVisibilityType] = js.undefined
  // Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
  var startMenuHideChangeAccountSettings: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in
    * the Settings app.
    */
  var startMenuHideFrequentlyUsedApps: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides hibernate from appearing in the power button in the start menu.
  var startMenuHideHibernate: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides lock from appearing in the user tile in the start menu.
  var startMenuHideLock: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides the power button from appearing in the start menu.
  var startMenuHidePowerButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding
    * toggle in the Settings app.
    */
  var startMenuHideRecentJumpLists: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle
    * in the Settings app.
    */
  var startMenuHideRecentlyAddedApps: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
  var startMenuHideRestartOptions: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
  var startMenuHideShutDown: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides sign out from appearing in the user tile in the start menu.
  var startMenuHideSignOut: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides sleep from appearing in the power button in the start menu.
  var startMenuHideSleep: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides switch account from appearing in the user tile in the start menu.
  var startMenuHideSwitchAccount: js.UndefOr[Boolean] = js.undefined
  // Enabling this policy hides the user tile from appearing in the start menu.
  var startMenuHideUserTile: js.UndefOr[Boolean] = js.undefined
  /**
    * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can
    * contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause
    * Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is
    * modified. The value should be a UTF-8 Base64 encoded byte array.
    */
  var startMenuLayoutEdgeAssetsXml: js.UndefOr[Double] = js.undefined
  /**
    * Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified
    * by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
    */
  var startMenuLayoutXml: js.UndefOr[Double] = js.undefined
  // Allows admins to decide how the Start menu is displayed. Possible values are: userDefined, fullScreen, nonFullScreen.
  var startMenuMode: js.UndefOr[WindowsStartMenuModeType] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Documents folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDocuments: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Downloads folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderDownloads: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the FileExplorer shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderFileExplorer: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the HomeGroup folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderHomeGroup: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Music folder shortcut on the Start menu. Possible values are: notConfigured,
    * hide, show.
    */
  var startMenuPinnedFolderMusic: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Network folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderNetwork: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the PersonalFolder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPersonalFolder: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Pictures folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderPictures: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Settings folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderSettings: js.UndefOr[VisibilitySetting] = js.undefined
  /**
    * Enforces the visibility (Show/Hide) of the Videos folder shortcut on the Start menu. Possible values are:
    * notConfigured, hide, show.
    */
  var startMenuPinnedFolderVideos: js.UndefOr[VisibilitySetting] = js.undefined
  // Indicates whether or not to Block the user from using removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined
  // Indicating whether or not to require encryption on a mobile device.
  var storageRequireMobileDeviceEncryption: js.UndefOr[Boolean] = js.undefined
  // Indicates whether application data is restricted to the system drive.
  var storageRestrictAppDataToSystemVolume: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the installation of applications is restricted to the system drive.
  var storageRestrictAppInstallToSystemVolume: js.UndefOr[Boolean] = js.undefined
  // Whether the device is required to connect to the network.
  var tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from USB connection.
  var usbBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from voice recording.
  var voiceRecordingBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
  var webRtcBlockLocalhostIpAddress: js.UndefOr[Boolean] = js.undefined
  // Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wiFiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using Wi-Fi manual configuration.
  var wiFiBlockManualConfiguration: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using Wi-Fi.
  var wiFiBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low
    * frequency. Valid values 1 to 500
    */
  var wiFiScanInterval: js.UndefOr[Double] = js.undefined
  /**
    * Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership
    * notifications, Post-OOBE app install and redirect tiles.
    */
  var windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[Boolean] = js.undefined
  /**
    * Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce
    * users to what is new or changed
    */
  var windowsSpotlightBlockOnActionCenter: js.UndefOr[Boolean] = js.undefined
  // Block personalized content in Windows spotlight based on user’s device usage.
  var windowsSpotlightBlockTailoredExperiences: js.UndefOr[Boolean] = js.undefined
  // Block third party content delivered via Windows Spotlight
  var windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[Boolean] = js.undefined
  // Block Windows Spotlight Windows welcome experience
  var windowsSpotlightBlockWelcomeExperience: js.UndefOr[Boolean] = js.undefined
  // Allows IT admins to turn off the popup of Windows Tips.
  var windowsSpotlightBlockWindowsTips: js.UndefOr[Boolean] = js.undefined
  // Allows IT admins to turn off all Windows Spotlight features
  var windowsSpotlightBlocked: js.UndefOr[Boolean] = js.undefined
  // Specifies the type of Spotlight. Possible values are: notConfigured, disabled, enabled.
  var windowsSpotlightConfigureOnLockScreen: js.UndefOr[WindowsSpotlightEnablementSettings] = js.undefined
  // Indicates whether or not to block automatic update of apps from Windows Store.
  var windowsStoreBlockAutoUpdate: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block the user from using the Windows store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to enable Private Store Only.
  var windowsStoreEnablePrivateStoreOnly: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow other devices from discovering this PC for projection.
  var wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow user input from wireless display receiver.
  var wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require a PIN for new devices to initiate pairing.
  var wirelessDisplayRequirePinForPairing: js.UndefOr[Boolean] = js.undefined
}

object Windows10GeneralConfiguration {
  @scala.inline
  def apply(
    accountsBlockAddingNonMicrosoftAccountEmail: js.UndefOr[Boolean] = js.undefined,
    antiTheftModeBlocked: js.UndefOr[Boolean] = js.undefined,
    appsAllowTrustedAppsSideloading: StateManagementSetting = null,
    appsBlockWindowsStoreOriginatedApps: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothAllowedServices: js.Array[String] = null,
    bluetoothBlockAdvertising: js.UndefOr[Boolean] = js.undefined,
    bluetoothBlockDiscoverableMode: js.UndefOr[Boolean] = js.undefined,
    bluetoothBlockPrePairing: js.UndefOr[Boolean] = js.undefined,
    bluetoothBlocked: js.UndefOr[Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[Boolean] = js.undefined,
    cellularBlockDataWhenRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularBlockVpn: js.UndefOr[Boolean] = js.undefined,
    cellularBlockVpnWhenRoaming: js.UndefOr[Boolean] = js.undefined,
    certificatesBlockManualRootCertificateInstallation: js.UndefOr[Boolean] = js.undefined,
    connectedDevicesServiceBlocked: js.UndefOr[Boolean] = js.undefined,
    copyPasteBlocked: js.UndefOr[Boolean] = js.undefined,
    cortanaBlocked: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    defenderBlockEndUserAccess: js.UndefOr[Boolean] = js.undefined,
    defenderCloudBlockLevel: DefenderCloudBlockLevelType = null,
    defenderDaysBeforeDeletingQuarantinedMalware: Int | Double = null,
    defenderDetectedMalwareActions: DefenderDetectedMalwareActions = null,
    defenderFileExtensionsToExclude: js.Array[String] = null,
    defenderFilesAndFoldersToExclude: js.Array[String] = null,
    defenderMonitorFileActivity: DefenderMonitorFileActivity = null,
    defenderProcessesToExclude: js.Array[String] = null,
    defenderPromptForSampleSubmission: DefenderPromptForSampleSubmission = null,
    defenderRequireBehaviorMonitoring: js.UndefOr[Boolean] = js.undefined,
    defenderRequireCloudProtection: js.UndefOr[Boolean] = js.undefined,
    defenderRequireNetworkInspectionSystem: js.UndefOr[Boolean] = js.undefined,
    defenderRequireRealTimeMonitoring: js.UndefOr[Boolean] = js.undefined,
    defenderScanArchiveFiles: js.UndefOr[Boolean] = js.undefined,
    defenderScanDownloads: js.UndefOr[Boolean] = js.undefined,
    defenderScanIncomingMail: js.UndefOr[Boolean] = js.undefined,
    defenderScanMappedNetworkDrivesDuringFullScan: js.UndefOr[Boolean] = js.undefined,
    defenderScanMaxCpu: Int | Double = null,
    defenderScanNetworkFiles: js.UndefOr[Boolean] = js.undefined,
    defenderScanRemovableDrivesDuringFullScan: js.UndefOr[Boolean] = js.undefined,
    defenderScanScriptsLoadedInInternetExplorer: js.UndefOr[Boolean] = js.undefined,
    defenderScanType: DefenderScanType = null,
    defenderScheduledQuickScanTime: String = null,
    defenderScheduledScanTime: String = null,
    defenderSignatureUpdateIntervalInHours: Int | Double = null,
    defenderSystemScanSchedule: WeeklySchedule = null,
    description: String = null,
    developerUnlockSetting: StateManagementSetting = null,
    deviceManagementBlockFactoryResetOnMobile: js.UndefOr[Boolean] = js.undefined,
    deviceManagementBlockManualUnenroll: js.UndefOr[Boolean] = js.undefined,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticsDataSubmissionMode: DiagnosticDataSubmissionMode = null,
    displayName: String = null,
    edgeAllowStartPagesModification: js.UndefOr[Boolean] = js.undefined,
    edgeBlockAccessToAboutFlags: js.UndefOr[Boolean] = js.undefined,
    edgeBlockAddressBarDropdown: js.UndefOr[Boolean] = js.undefined,
    edgeBlockAutofill: js.UndefOr[Boolean] = js.undefined,
    edgeBlockCompatibilityList: js.UndefOr[Boolean] = js.undefined,
    edgeBlockDeveloperTools: js.UndefOr[Boolean] = js.undefined,
    edgeBlockExtensions: js.UndefOr[Boolean] = js.undefined,
    edgeBlockInPrivateBrowsing: js.UndefOr[Boolean] = js.undefined,
    edgeBlockJavaScript: js.UndefOr[Boolean] = js.undefined,
    edgeBlockLiveTileDataCollection: js.UndefOr[Boolean] = js.undefined,
    edgeBlockPasswordManager: js.UndefOr[Boolean] = js.undefined,
    edgeBlockPopups: js.UndefOr[Boolean] = js.undefined,
    edgeBlockSearchSuggestions: js.UndefOr[Boolean] = js.undefined,
    edgeBlockSendingDoNotTrackHeader: js.UndefOr[Boolean] = js.undefined,
    edgeBlockSendingIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.undefined,
    edgeBlocked: js.UndefOr[Boolean] = js.undefined,
    edgeClearBrowsingDataOnExit: js.UndefOr[Boolean] = js.undefined,
    edgeCookiePolicy: EdgeCookiePolicy = null,
    edgeDisableFirstRunPage: js.UndefOr[Boolean] = js.undefined,
    edgeEnterpriseModeSiteListLocation: String = null,
    edgeFirstRunUrl: String = null,
    edgeHomepageUrls: js.Array[String] = null,
    edgeRequireSmartScreen: js.UndefOr[Boolean] = js.undefined,
    edgeSearchEngine: EdgeSearchEngineBase = null,
    edgeSendIntranetTrafficToInternetExplorer: js.UndefOr[Boolean] = js.undefined,
    edgeSyncFavoritesWithInternetExplorer: js.UndefOr[Boolean] = js.undefined,
    enterpriseCloudPrintDiscoveryEndPoint: String = null,
    enterpriseCloudPrintDiscoveryMaxLimit: Int | Double = null,
    enterpriseCloudPrintMopriaDiscoveryResourceIdentifier: String = null,
    enterpriseCloudPrintOAuthAuthority: String = null,
    enterpriseCloudPrintOAuthClientIdentifier: String = null,
    enterpriseCloudPrintResourceIdentifier: String = null,
    experienceBlockDeviceDiscovery: js.UndefOr[Boolean] = js.undefined,
    experienceBlockErrorDialogWhenNoSIM: js.UndefOr[Boolean] = js.undefined,
    experienceBlockTaskSwitcher: js.UndefOr[Boolean] = js.undefined,
    gameDvrBlocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    internetSharingBlocked: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    locationServicesBlocked: js.UndefOr[Boolean] = js.undefined,
    lockScreenAllowTimeoutConfiguration: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockActionCenterNotifications: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockCortana: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockToastNotifications: js.UndefOr[Boolean] = js.undefined,
    lockScreenTimeoutInSeconds: Int | Double = null,
    logonBlockFastUserSwitching: js.UndefOr[Boolean] = js.undefined,
    microsoftAccountBlockSettingsSync: js.UndefOr[Boolean] = js.undefined,
    microsoftAccountBlocked: js.UndefOr[Boolean] = js.undefined,
    networkProxyApplySettingsDeviceWide: js.UndefOr[Boolean] = js.undefined,
    networkProxyAutomaticConfigurationUrl: String = null,
    networkProxyDisableAutoDetect: js.UndefOr[Boolean] = js.undefined,
    networkProxyServer: Windows10NetworkProxyServer = null,
    nfcBlocked: js.UndefOr[Boolean] = js.undefined,
    oneDriveDisableFileSync: js.UndefOr[Boolean] = js.undefined,
    passwordBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: Int | Double = null,
    passwordMinimumCharacterSetCount: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinutesOfInactivityBeforeScreenTimeout: Int | Double = null,
    passwordPreviousPasswordBlockCount: Int | Double = null,
    passwordRequireWhenResumeFromIdleState: js.UndefOr[Boolean] = js.undefined,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: Int | Double = null,
    personalizationDesktopImageUrl: String = null,
    personalizationLockScreenImageUrl: String = null,
    privacyAdvertisingId: StateManagementSetting = null,
    privacyAutoAcceptPairingAndConsentPrompts: js.UndefOr[Boolean] = js.undefined,
    privacyBlockInputPersonalization: js.UndefOr[Boolean] = js.undefined,
    resetProtectionModeBlocked: js.UndefOr[Boolean] = js.undefined,
    safeSearchFilter: SafeSearchFilterType = null,
    screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined,
    searchBlockDiacritics: js.UndefOr[Boolean] = js.undefined,
    searchDisableAutoLanguageDetection: js.UndefOr[Boolean] = js.undefined,
    searchDisableIndexerBackoff: js.UndefOr[Boolean] = js.undefined,
    searchDisableIndexingEncryptedItems: js.UndefOr[Boolean] = js.undefined,
    searchDisableIndexingRemovableDrive: js.UndefOr[Boolean] = js.undefined,
    searchEnableAutomaticIndexSizeManangement: js.UndefOr[Boolean] = js.undefined,
    searchEnableRemoteQueries: js.UndefOr[Boolean] = js.undefined,
    settingsBlockAccountsPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockAddProvisioningPackage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockAppsPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockChangeLanguage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockChangePowerSleep: js.UndefOr[Boolean] = js.undefined,
    settingsBlockChangeRegion: js.UndefOr[Boolean] = js.undefined,
    settingsBlockChangeSystemTime: js.UndefOr[Boolean] = js.undefined,
    settingsBlockDevicesPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockEaseOfAccessPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockEditDeviceName: js.UndefOr[Boolean] = js.undefined,
    settingsBlockGamingPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockNetworkInternetPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockPersonalizationPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockPrivacyPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockRemoveProvisioningPackage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockSettingsApp: js.UndefOr[Boolean] = js.undefined,
    settingsBlockSystemPage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockTimeLanguagePage: js.UndefOr[Boolean] = js.undefined,
    settingsBlockUpdateSecurityPage: js.UndefOr[Boolean] = js.undefined,
    sharedUserAppDataAllowed: js.UndefOr[Boolean] = js.undefined,
    smartScreenBlockPromptOverride: js.UndefOr[Boolean] = js.undefined,
    smartScreenBlockPromptOverrideForFiles: js.UndefOr[Boolean] = js.undefined,
    smartScreenEnableAppInstallControl: js.UndefOr[Boolean] = js.undefined,
    startBlockUnpinningAppsFromTaskbar: js.UndefOr[Boolean] = js.undefined,
    startMenuAppListVisibility: WindowsStartMenuAppListVisibilityType = null,
    startMenuHideChangeAccountSettings: js.UndefOr[Boolean] = js.undefined,
    startMenuHideFrequentlyUsedApps: js.UndefOr[Boolean] = js.undefined,
    startMenuHideHibernate: js.UndefOr[Boolean] = js.undefined,
    startMenuHideLock: js.UndefOr[Boolean] = js.undefined,
    startMenuHidePowerButton: js.UndefOr[Boolean] = js.undefined,
    startMenuHideRecentJumpLists: js.UndefOr[Boolean] = js.undefined,
    startMenuHideRecentlyAddedApps: js.UndefOr[Boolean] = js.undefined,
    startMenuHideRestartOptions: js.UndefOr[Boolean] = js.undefined,
    startMenuHideShutDown: js.UndefOr[Boolean] = js.undefined,
    startMenuHideSignOut: js.UndefOr[Boolean] = js.undefined,
    startMenuHideSleep: js.UndefOr[Boolean] = js.undefined,
    startMenuHideSwitchAccount: js.UndefOr[Boolean] = js.undefined,
    startMenuHideUserTile: js.UndefOr[Boolean] = js.undefined,
    startMenuLayoutEdgeAssetsXml: Int | Double = null,
    startMenuLayoutXml: Int | Double = null,
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
    storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined,
    storageRequireMobileDeviceEncryption: js.UndefOr[Boolean] = js.undefined,
    storageRestrictAppDataToSystemVolume: js.UndefOr[Boolean] = js.undefined,
    storageRestrictAppInstallToSystemVolume: js.UndefOr[Boolean] = js.undefined,
    tenantLockdownRequireNetworkDuringOutOfBoxExperience: js.UndefOr[Boolean] = js.undefined,
    usbBlocked: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null,
    voiceRecordingBlocked: js.UndefOr[Boolean] = js.undefined,
    webRtcBlockLocalhostIpAddress: js.UndefOr[Boolean] = js.undefined,
    wiFiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.undefined,
    wiFiBlockManualConfiguration: js.UndefOr[Boolean] = js.undefined,
    wiFiBlocked: js.UndefOr[Boolean] = js.undefined,
    wiFiScanInterval: Int | Double = null,
    windowsSpotlightBlockConsumerSpecificFeatures: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlockOnActionCenter: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlockTailoredExperiences: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlockThirdPartyNotifications: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlockWelcomeExperience: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlockWindowsTips: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightBlocked: js.UndefOr[Boolean] = js.undefined,
    windowsSpotlightConfigureOnLockScreen: WindowsSpotlightEnablementSettings = null,
    windowsStoreBlockAutoUpdate: js.UndefOr[Boolean] = js.undefined,
    windowsStoreBlocked: js.UndefOr[Boolean] = js.undefined,
    windowsStoreEnablePrivateStoreOnly: js.UndefOr[Boolean] = js.undefined,
    wirelessDisplayBlockProjectionToThisDevice: js.UndefOr[Boolean] = js.undefined,
    wirelessDisplayBlockUserInputFromReceiver: js.UndefOr[Boolean] = js.undefined,
    wirelessDisplayRequirePinForPairing: js.UndefOr[Boolean] = js.undefined
  ): Windows10GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountsBlockAddingNonMicrosoftAccountEmail)) __obj.updateDynamic("accountsBlockAddingNonMicrosoftAccountEmail")(accountsBlockAddingNonMicrosoftAccountEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(antiTheftModeBlocked)) __obj.updateDynamic("antiTheftModeBlocked")(antiTheftModeBlocked.asInstanceOf[js.Any])
    if (appsAllowTrustedAppsSideloading != null) __obj.updateDynamic("appsAllowTrustedAppsSideloading")(appsAllowTrustedAppsSideloading.asInstanceOf[js.Any])
    if (!js.isUndefined(appsBlockWindowsStoreOriginatedApps)) __obj.updateDynamic("appsBlockWindowsStoreOriginatedApps")(appsBlockWindowsStoreOriginatedApps.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (bluetoothAllowedServices != null) __obj.updateDynamic("bluetoothAllowedServices")(bluetoothAllowedServices.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlockAdvertising)) __obj.updateDynamic("bluetoothBlockAdvertising")(bluetoothBlockAdvertising.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlockDiscoverableMode)) __obj.updateDynamic("bluetoothBlockDiscoverableMode")(bluetoothBlockDiscoverableMode.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlockPrePairing)) __obj.updateDynamic("bluetoothBlockPrePairing")(bluetoothBlockPrePairing.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockDataWhenRoaming)) __obj.updateDynamic("cellularBlockDataWhenRoaming")(cellularBlockDataWhenRoaming.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockVpn)) __obj.updateDynamic("cellularBlockVpn")(cellularBlockVpn.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockVpnWhenRoaming)) __obj.updateDynamic("cellularBlockVpnWhenRoaming")(cellularBlockVpnWhenRoaming.asInstanceOf[js.Any])
    if (!js.isUndefined(certificatesBlockManualRootCertificateInstallation)) __obj.updateDynamic("certificatesBlockManualRootCertificateInstallation")(certificatesBlockManualRootCertificateInstallation.asInstanceOf[js.Any])
    if (!js.isUndefined(connectedDevicesServiceBlocked)) __obj.updateDynamic("connectedDevicesServiceBlocked")(connectedDevicesServiceBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(copyPasteBlocked)) __obj.updateDynamic("copyPasteBlocked")(copyPasteBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(cortanaBlocked)) __obj.updateDynamic("cortanaBlocked")(cortanaBlocked.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderBlockEndUserAccess)) __obj.updateDynamic("defenderBlockEndUserAccess")(defenderBlockEndUserAccess.asInstanceOf[js.Any])
    if (defenderCloudBlockLevel != null) __obj.updateDynamic("defenderCloudBlockLevel")(defenderCloudBlockLevel.asInstanceOf[js.Any])
    if (defenderDaysBeforeDeletingQuarantinedMalware != null) __obj.updateDynamic("defenderDaysBeforeDeletingQuarantinedMalware")(defenderDaysBeforeDeletingQuarantinedMalware.asInstanceOf[js.Any])
    if (defenderDetectedMalwareActions != null) __obj.updateDynamic("defenderDetectedMalwareActions")(defenderDetectedMalwareActions.asInstanceOf[js.Any])
    if (defenderFileExtensionsToExclude != null) __obj.updateDynamic("defenderFileExtensionsToExclude")(defenderFileExtensionsToExclude.asInstanceOf[js.Any])
    if (defenderFilesAndFoldersToExclude != null) __obj.updateDynamic("defenderFilesAndFoldersToExclude")(defenderFilesAndFoldersToExclude.asInstanceOf[js.Any])
    if (defenderMonitorFileActivity != null) __obj.updateDynamic("defenderMonitorFileActivity")(defenderMonitorFileActivity.asInstanceOf[js.Any])
    if (defenderProcessesToExclude != null) __obj.updateDynamic("defenderProcessesToExclude")(defenderProcessesToExclude.asInstanceOf[js.Any])
    if (defenderPromptForSampleSubmission != null) __obj.updateDynamic("defenderPromptForSampleSubmission")(defenderPromptForSampleSubmission.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderRequireBehaviorMonitoring)) __obj.updateDynamic("defenderRequireBehaviorMonitoring")(defenderRequireBehaviorMonitoring.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderRequireCloudProtection)) __obj.updateDynamic("defenderRequireCloudProtection")(defenderRequireCloudProtection.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderRequireNetworkInspectionSystem)) __obj.updateDynamic("defenderRequireNetworkInspectionSystem")(defenderRequireNetworkInspectionSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderRequireRealTimeMonitoring)) __obj.updateDynamic("defenderRequireRealTimeMonitoring")(defenderRequireRealTimeMonitoring.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanArchiveFiles)) __obj.updateDynamic("defenderScanArchiveFiles")(defenderScanArchiveFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanDownloads)) __obj.updateDynamic("defenderScanDownloads")(defenderScanDownloads.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanIncomingMail)) __obj.updateDynamic("defenderScanIncomingMail")(defenderScanIncomingMail.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanMappedNetworkDrivesDuringFullScan)) __obj.updateDynamic("defenderScanMappedNetworkDrivesDuringFullScan")(defenderScanMappedNetworkDrivesDuringFullScan.asInstanceOf[js.Any])
    if (defenderScanMaxCpu != null) __obj.updateDynamic("defenderScanMaxCpu")(defenderScanMaxCpu.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanNetworkFiles)) __obj.updateDynamic("defenderScanNetworkFiles")(defenderScanNetworkFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanRemovableDrivesDuringFullScan)) __obj.updateDynamic("defenderScanRemovableDrivesDuringFullScan")(defenderScanRemovableDrivesDuringFullScan.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderScanScriptsLoadedInInternetExplorer)) __obj.updateDynamic("defenderScanScriptsLoadedInInternetExplorer")(defenderScanScriptsLoadedInInternetExplorer.asInstanceOf[js.Any])
    if (defenderScanType != null) __obj.updateDynamic("defenderScanType")(defenderScanType.asInstanceOf[js.Any])
    if (defenderScheduledQuickScanTime != null) __obj.updateDynamic("defenderScheduledQuickScanTime")(defenderScheduledQuickScanTime.asInstanceOf[js.Any])
    if (defenderScheduledScanTime != null) __obj.updateDynamic("defenderScheduledScanTime")(defenderScheduledScanTime.asInstanceOf[js.Any])
    if (defenderSignatureUpdateIntervalInHours != null) __obj.updateDynamic("defenderSignatureUpdateIntervalInHours")(defenderSignatureUpdateIntervalInHours.asInstanceOf[js.Any])
    if (defenderSystemScanSchedule != null) __obj.updateDynamic("defenderSystemScanSchedule")(defenderSystemScanSchedule.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developerUnlockSetting != null) __obj.updateDynamic("developerUnlockSetting")(developerUnlockSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceManagementBlockFactoryResetOnMobile)) __obj.updateDynamic("deviceManagementBlockFactoryResetOnMobile")(deviceManagementBlockFactoryResetOnMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceManagementBlockManualUnenroll)) __obj.updateDynamic("deviceManagementBlockManualUnenroll")(deviceManagementBlockManualUnenroll.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (diagnosticsDataSubmissionMode != null) __obj.updateDynamic("diagnosticsDataSubmissionMode")(diagnosticsDataSubmissionMode.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeAllowStartPagesModification)) __obj.updateDynamic("edgeAllowStartPagesModification")(edgeAllowStartPagesModification.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockAccessToAboutFlags)) __obj.updateDynamic("edgeBlockAccessToAboutFlags")(edgeBlockAccessToAboutFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockAddressBarDropdown)) __obj.updateDynamic("edgeBlockAddressBarDropdown")(edgeBlockAddressBarDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockAutofill)) __obj.updateDynamic("edgeBlockAutofill")(edgeBlockAutofill.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockCompatibilityList)) __obj.updateDynamic("edgeBlockCompatibilityList")(edgeBlockCompatibilityList.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockDeveloperTools)) __obj.updateDynamic("edgeBlockDeveloperTools")(edgeBlockDeveloperTools.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockExtensions)) __obj.updateDynamic("edgeBlockExtensions")(edgeBlockExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockInPrivateBrowsing)) __obj.updateDynamic("edgeBlockInPrivateBrowsing")(edgeBlockInPrivateBrowsing.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockJavaScript)) __obj.updateDynamic("edgeBlockJavaScript")(edgeBlockJavaScript.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockLiveTileDataCollection)) __obj.updateDynamic("edgeBlockLiveTileDataCollection")(edgeBlockLiveTileDataCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockPasswordManager)) __obj.updateDynamic("edgeBlockPasswordManager")(edgeBlockPasswordManager.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockPopups)) __obj.updateDynamic("edgeBlockPopups")(edgeBlockPopups.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockSearchSuggestions)) __obj.updateDynamic("edgeBlockSearchSuggestions")(edgeBlockSearchSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockSendingDoNotTrackHeader)) __obj.updateDynamic("edgeBlockSendingDoNotTrackHeader")(edgeBlockSendingDoNotTrackHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlockSendingIntranetTrafficToInternetExplorer)) __obj.updateDynamic("edgeBlockSendingIntranetTrafficToInternetExplorer")(edgeBlockSendingIntranetTrafficToInternetExplorer.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeBlocked)) __obj.updateDynamic("edgeBlocked")(edgeBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeClearBrowsingDataOnExit)) __obj.updateDynamic("edgeClearBrowsingDataOnExit")(edgeClearBrowsingDataOnExit.asInstanceOf[js.Any])
    if (edgeCookiePolicy != null) __obj.updateDynamic("edgeCookiePolicy")(edgeCookiePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeDisableFirstRunPage)) __obj.updateDynamic("edgeDisableFirstRunPage")(edgeDisableFirstRunPage.asInstanceOf[js.Any])
    if (edgeEnterpriseModeSiteListLocation != null) __obj.updateDynamic("edgeEnterpriseModeSiteListLocation")(edgeEnterpriseModeSiteListLocation.asInstanceOf[js.Any])
    if (edgeFirstRunUrl != null) __obj.updateDynamic("edgeFirstRunUrl")(edgeFirstRunUrl.asInstanceOf[js.Any])
    if (edgeHomepageUrls != null) __obj.updateDynamic("edgeHomepageUrls")(edgeHomepageUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeRequireSmartScreen)) __obj.updateDynamic("edgeRequireSmartScreen")(edgeRequireSmartScreen.asInstanceOf[js.Any])
    if (edgeSearchEngine != null) __obj.updateDynamic("edgeSearchEngine")(edgeSearchEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeSendIntranetTrafficToInternetExplorer)) __obj.updateDynamic("edgeSendIntranetTrafficToInternetExplorer")(edgeSendIntranetTrafficToInternetExplorer.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeSyncFavoritesWithInternetExplorer)) __obj.updateDynamic("edgeSyncFavoritesWithInternetExplorer")(edgeSyncFavoritesWithInternetExplorer.asInstanceOf[js.Any])
    if (enterpriseCloudPrintDiscoveryEndPoint != null) __obj.updateDynamic("enterpriseCloudPrintDiscoveryEndPoint")(enterpriseCloudPrintDiscoveryEndPoint.asInstanceOf[js.Any])
    if (enterpriseCloudPrintDiscoveryMaxLimit != null) __obj.updateDynamic("enterpriseCloudPrintDiscoveryMaxLimit")(enterpriseCloudPrintDiscoveryMaxLimit.asInstanceOf[js.Any])
    if (enterpriseCloudPrintMopriaDiscoveryResourceIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier")(enterpriseCloudPrintMopriaDiscoveryResourceIdentifier.asInstanceOf[js.Any])
    if (enterpriseCloudPrintOAuthAuthority != null) __obj.updateDynamic("enterpriseCloudPrintOAuthAuthority")(enterpriseCloudPrintOAuthAuthority.asInstanceOf[js.Any])
    if (enterpriseCloudPrintOAuthClientIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintOAuthClientIdentifier")(enterpriseCloudPrintOAuthClientIdentifier.asInstanceOf[js.Any])
    if (enterpriseCloudPrintResourceIdentifier != null) __obj.updateDynamic("enterpriseCloudPrintResourceIdentifier")(enterpriseCloudPrintResourceIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(experienceBlockDeviceDiscovery)) __obj.updateDynamic("experienceBlockDeviceDiscovery")(experienceBlockDeviceDiscovery.asInstanceOf[js.Any])
    if (!js.isUndefined(experienceBlockErrorDialogWhenNoSIM)) __obj.updateDynamic("experienceBlockErrorDialogWhenNoSIM")(experienceBlockErrorDialogWhenNoSIM.asInstanceOf[js.Any])
    if (!js.isUndefined(experienceBlockTaskSwitcher)) __obj.updateDynamic("experienceBlockTaskSwitcher")(experienceBlockTaskSwitcher.asInstanceOf[js.Any])
    if (!js.isUndefined(gameDvrBlocked)) __obj.updateDynamic("gameDvrBlocked")(gameDvrBlocked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(internetSharingBlocked)) __obj.updateDynamic("internetSharingBlocked")(internetSharingBlocked.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenAllowTimeoutConfiguration)) __obj.updateDynamic("lockScreenAllowTimeoutConfiguration")(lockScreenAllowTimeoutConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockActionCenterNotifications)) __obj.updateDynamic("lockScreenBlockActionCenterNotifications")(lockScreenBlockActionCenterNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockCortana)) __obj.updateDynamic("lockScreenBlockCortana")(lockScreenBlockCortana.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockToastNotifications)) __obj.updateDynamic("lockScreenBlockToastNotifications")(lockScreenBlockToastNotifications.asInstanceOf[js.Any])
    if (lockScreenTimeoutInSeconds != null) __obj.updateDynamic("lockScreenTimeoutInSeconds")(lockScreenTimeoutInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(logonBlockFastUserSwitching)) __obj.updateDynamic("logonBlockFastUserSwitching")(logonBlockFastUserSwitching.asInstanceOf[js.Any])
    if (!js.isUndefined(microsoftAccountBlockSettingsSync)) __obj.updateDynamic("microsoftAccountBlockSettingsSync")(microsoftAccountBlockSettingsSync.asInstanceOf[js.Any])
    if (!js.isUndefined(microsoftAccountBlocked)) __obj.updateDynamic("microsoftAccountBlocked")(microsoftAccountBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(networkProxyApplySettingsDeviceWide)) __obj.updateDynamic("networkProxyApplySettingsDeviceWide")(networkProxyApplySettingsDeviceWide.asInstanceOf[js.Any])
    if (networkProxyAutomaticConfigurationUrl != null) __obj.updateDynamic("networkProxyAutomaticConfigurationUrl")(networkProxyAutomaticConfigurationUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(networkProxyDisableAutoDetect)) __obj.updateDynamic("networkProxyDisableAutoDetect")(networkProxyDisableAutoDetect.asInstanceOf[js.Any])
    if (networkProxyServer != null) __obj.updateDynamic("networkProxyServer")(networkProxyServer.asInstanceOf[js.Any])
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(oneDriveDisableFileSync)) __obj.updateDynamic("oneDriveDisableFileSync")(oneDriveDisableFileSync.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple.asInstanceOf[js.Any])
    if (passwordExpirationDays != null) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.asInstanceOf[js.Any])
    if (passwordMinimumCharacterSetCount != null) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passwordPreviousPasswordBlockCount != null) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequireWhenResumeFromIdleState)) __obj.updateDynamic("passwordRequireWhenResumeFromIdleState")(passwordRequireWhenResumeFromIdleState.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (passwordSignInFailureCountBeforeFactoryReset != null) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.asInstanceOf[js.Any])
    if (personalizationDesktopImageUrl != null) __obj.updateDynamic("personalizationDesktopImageUrl")(personalizationDesktopImageUrl.asInstanceOf[js.Any])
    if (personalizationLockScreenImageUrl != null) __obj.updateDynamic("personalizationLockScreenImageUrl")(personalizationLockScreenImageUrl.asInstanceOf[js.Any])
    if (privacyAdvertisingId != null) __obj.updateDynamic("privacyAdvertisingId")(privacyAdvertisingId.asInstanceOf[js.Any])
    if (!js.isUndefined(privacyAutoAcceptPairingAndConsentPrompts)) __obj.updateDynamic("privacyAutoAcceptPairingAndConsentPrompts")(privacyAutoAcceptPairingAndConsentPrompts.asInstanceOf[js.Any])
    if (!js.isUndefined(privacyBlockInputPersonalization)) __obj.updateDynamic("privacyBlockInputPersonalization")(privacyBlockInputPersonalization.asInstanceOf[js.Any])
    if (!js.isUndefined(resetProtectionModeBlocked)) __obj.updateDynamic("resetProtectionModeBlocked")(resetProtectionModeBlocked.asInstanceOf[js.Any])
    if (safeSearchFilter != null) __obj.updateDynamic("safeSearchFilter")(safeSearchFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(searchBlockDiacritics)) __obj.updateDynamic("searchBlockDiacritics")(searchBlockDiacritics.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDisableAutoLanguageDetection)) __obj.updateDynamic("searchDisableAutoLanguageDetection")(searchDisableAutoLanguageDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDisableIndexerBackoff)) __obj.updateDynamic("searchDisableIndexerBackoff")(searchDisableIndexerBackoff.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDisableIndexingEncryptedItems)) __obj.updateDynamic("searchDisableIndexingEncryptedItems")(searchDisableIndexingEncryptedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDisableIndexingRemovableDrive)) __obj.updateDynamic("searchDisableIndexingRemovableDrive")(searchDisableIndexingRemovableDrive.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnableAutomaticIndexSizeManangement)) __obj.updateDynamic("searchEnableAutomaticIndexSizeManangement")(searchEnableAutomaticIndexSizeManangement.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnableRemoteQueries)) __obj.updateDynamic("searchEnableRemoteQueries")(searchEnableRemoteQueries.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockAccountsPage)) __obj.updateDynamic("settingsBlockAccountsPage")(settingsBlockAccountsPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockAddProvisioningPackage)) __obj.updateDynamic("settingsBlockAddProvisioningPackage")(settingsBlockAddProvisioningPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockAppsPage)) __obj.updateDynamic("settingsBlockAppsPage")(settingsBlockAppsPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockChangeLanguage)) __obj.updateDynamic("settingsBlockChangeLanguage")(settingsBlockChangeLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockChangePowerSleep)) __obj.updateDynamic("settingsBlockChangePowerSleep")(settingsBlockChangePowerSleep.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockChangeRegion)) __obj.updateDynamic("settingsBlockChangeRegion")(settingsBlockChangeRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockChangeSystemTime)) __obj.updateDynamic("settingsBlockChangeSystemTime")(settingsBlockChangeSystemTime.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockDevicesPage)) __obj.updateDynamic("settingsBlockDevicesPage")(settingsBlockDevicesPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockEaseOfAccessPage)) __obj.updateDynamic("settingsBlockEaseOfAccessPage")(settingsBlockEaseOfAccessPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockEditDeviceName)) __obj.updateDynamic("settingsBlockEditDeviceName")(settingsBlockEditDeviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockGamingPage)) __obj.updateDynamic("settingsBlockGamingPage")(settingsBlockGamingPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockNetworkInternetPage)) __obj.updateDynamic("settingsBlockNetworkInternetPage")(settingsBlockNetworkInternetPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockPersonalizationPage)) __obj.updateDynamic("settingsBlockPersonalizationPage")(settingsBlockPersonalizationPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockPrivacyPage)) __obj.updateDynamic("settingsBlockPrivacyPage")(settingsBlockPrivacyPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockRemoveProvisioningPackage)) __obj.updateDynamic("settingsBlockRemoveProvisioningPackage")(settingsBlockRemoveProvisioningPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockSettingsApp)) __obj.updateDynamic("settingsBlockSettingsApp")(settingsBlockSettingsApp.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockSystemPage)) __obj.updateDynamic("settingsBlockSystemPage")(settingsBlockSystemPage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockTimeLanguagePage)) __obj.updateDynamic("settingsBlockTimeLanguagePage")(settingsBlockTimeLanguagePage.asInstanceOf[js.Any])
    if (!js.isUndefined(settingsBlockUpdateSecurityPage)) __obj.updateDynamic("settingsBlockUpdateSecurityPage")(settingsBlockUpdateSecurityPage.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedUserAppDataAllowed)) __obj.updateDynamic("sharedUserAppDataAllowed")(sharedUserAppDataAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(smartScreenBlockPromptOverride)) __obj.updateDynamic("smartScreenBlockPromptOverride")(smartScreenBlockPromptOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(smartScreenBlockPromptOverrideForFiles)) __obj.updateDynamic("smartScreenBlockPromptOverrideForFiles")(smartScreenBlockPromptOverrideForFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(smartScreenEnableAppInstallControl)) __obj.updateDynamic("smartScreenEnableAppInstallControl")(smartScreenEnableAppInstallControl.asInstanceOf[js.Any])
    if (!js.isUndefined(startBlockUnpinningAppsFromTaskbar)) __obj.updateDynamic("startBlockUnpinningAppsFromTaskbar")(startBlockUnpinningAppsFromTaskbar.asInstanceOf[js.Any])
    if (startMenuAppListVisibility != null) __obj.updateDynamic("startMenuAppListVisibility")(startMenuAppListVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideChangeAccountSettings)) __obj.updateDynamic("startMenuHideChangeAccountSettings")(startMenuHideChangeAccountSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideFrequentlyUsedApps)) __obj.updateDynamic("startMenuHideFrequentlyUsedApps")(startMenuHideFrequentlyUsedApps.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideHibernate)) __obj.updateDynamic("startMenuHideHibernate")(startMenuHideHibernate.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideLock)) __obj.updateDynamic("startMenuHideLock")(startMenuHideLock.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHidePowerButton)) __obj.updateDynamic("startMenuHidePowerButton")(startMenuHidePowerButton.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideRecentJumpLists)) __obj.updateDynamic("startMenuHideRecentJumpLists")(startMenuHideRecentJumpLists.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideRecentlyAddedApps)) __obj.updateDynamic("startMenuHideRecentlyAddedApps")(startMenuHideRecentlyAddedApps.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideRestartOptions)) __obj.updateDynamic("startMenuHideRestartOptions")(startMenuHideRestartOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideShutDown)) __obj.updateDynamic("startMenuHideShutDown")(startMenuHideShutDown.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideSignOut)) __obj.updateDynamic("startMenuHideSignOut")(startMenuHideSignOut.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideSleep)) __obj.updateDynamic("startMenuHideSleep")(startMenuHideSleep.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideSwitchAccount)) __obj.updateDynamic("startMenuHideSwitchAccount")(startMenuHideSwitchAccount.asInstanceOf[js.Any])
    if (!js.isUndefined(startMenuHideUserTile)) __obj.updateDynamic("startMenuHideUserTile")(startMenuHideUserTile.asInstanceOf[js.Any])
    if (startMenuLayoutEdgeAssetsXml != null) __obj.updateDynamic("startMenuLayoutEdgeAssetsXml")(startMenuLayoutEdgeAssetsXml.asInstanceOf[js.Any])
    if (startMenuLayoutXml != null) __obj.updateDynamic("startMenuLayoutXml")(startMenuLayoutXml.asInstanceOf[js.Any])
    if (startMenuMode != null) __obj.updateDynamic("startMenuMode")(startMenuMode.asInstanceOf[js.Any])
    if (startMenuPinnedFolderDocuments != null) __obj.updateDynamic("startMenuPinnedFolderDocuments")(startMenuPinnedFolderDocuments.asInstanceOf[js.Any])
    if (startMenuPinnedFolderDownloads != null) __obj.updateDynamic("startMenuPinnedFolderDownloads")(startMenuPinnedFolderDownloads.asInstanceOf[js.Any])
    if (startMenuPinnedFolderFileExplorer != null) __obj.updateDynamic("startMenuPinnedFolderFileExplorer")(startMenuPinnedFolderFileExplorer.asInstanceOf[js.Any])
    if (startMenuPinnedFolderHomeGroup != null) __obj.updateDynamic("startMenuPinnedFolderHomeGroup")(startMenuPinnedFolderHomeGroup.asInstanceOf[js.Any])
    if (startMenuPinnedFolderMusic != null) __obj.updateDynamic("startMenuPinnedFolderMusic")(startMenuPinnedFolderMusic.asInstanceOf[js.Any])
    if (startMenuPinnedFolderNetwork != null) __obj.updateDynamic("startMenuPinnedFolderNetwork")(startMenuPinnedFolderNetwork.asInstanceOf[js.Any])
    if (startMenuPinnedFolderPersonalFolder != null) __obj.updateDynamic("startMenuPinnedFolderPersonalFolder")(startMenuPinnedFolderPersonalFolder.asInstanceOf[js.Any])
    if (startMenuPinnedFolderPictures != null) __obj.updateDynamic("startMenuPinnedFolderPictures")(startMenuPinnedFolderPictures.asInstanceOf[js.Any])
    if (startMenuPinnedFolderSettings != null) __obj.updateDynamic("startMenuPinnedFolderSettings")(startMenuPinnedFolderSettings.asInstanceOf[js.Any])
    if (startMenuPinnedFolderVideos != null) __obj.updateDynamic("startMenuPinnedFolderVideos")(startMenuPinnedFolderVideos.asInstanceOf[js.Any])
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireMobileDeviceEncryption)) __obj.updateDynamic("storageRequireMobileDeviceEncryption")(storageRequireMobileDeviceEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRestrictAppDataToSystemVolume)) __obj.updateDynamic("storageRestrictAppDataToSystemVolume")(storageRestrictAppDataToSystemVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRestrictAppInstallToSystemVolume)) __obj.updateDynamic("storageRestrictAppInstallToSystemVolume")(storageRestrictAppInstallToSystemVolume.asInstanceOf[js.Any])
    if (!js.isUndefined(tenantLockdownRequireNetworkDuringOutOfBoxExperience)) __obj.updateDynamic("tenantLockdownRequireNetworkDuringOutOfBoxExperience")(tenantLockdownRequireNetworkDuringOutOfBoxExperience.asInstanceOf[js.Any])
    if (!js.isUndefined(usbBlocked)) __obj.updateDynamic("usbBlocked")(usbBlocked.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceRecordingBlocked)) __obj.updateDynamic("voiceRecordingBlocked")(voiceRecordingBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(webRtcBlockLocalhostIpAddress)) __obj.updateDynamic("webRtcBlockLocalhostIpAddress")(webRtcBlockLocalhostIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(wiFiBlockAutomaticConnectHotspots)) __obj.updateDynamic("wiFiBlockAutomaticConnectHotspots")(wiFiBlockAutomaticConnectHotspots.asInstanceOf[js.Any])
    if (!js.isUndefined(wiFiBlockManualConfiguration)) __obj.updateDynamic("wiFiBlockManualConfiguration")(wiFiBlockManualConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(wiFiBlocked)) __obj.updateDynamic("wiFiBlocked")(wiFiBlocked.asInstanceOf[js.Any])
    if (wiFiScanInterval != null) __obj.updateDynamic("wiFiScanInterval")(wiFiScanInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockConsumerSpecificFeatures)) __obj.updateDynamic("windowsSpotlightBlockConsumerSpecificFeatures")(windowsSpotlightBlockConsumerSpecificFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockOnActionCenter)) __obj.updateDynamic("windowsSpotlightBlockOnActionCenter")(windowsSpotlightBlockOnActionCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockTailoredExperiences)) __obj.updateDynamic("windowsSpotlightBlockTailoredExperiences")(windowsSpotlightBlockTailoredExperiences.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockThirdPartyNotifications)) __obj.updateDynamic("windowsSpotlightBlockThirdPartyNotifications")(windowsSpotlightBlockThirdPartyNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockWelcomeExperience)) __obj.updateDynamic("windowsSpotlightBlockWelcomeExperience")(windowsSpotlightBlockWelcomeExperience.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlockWindowsTips)) __obj.updateDynamic("windowsSpotlightBlockWindowsTips")(windowsSpotlightBlockWindowsTips.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsSpotlightBlocked)) __obj.updateDynamic("windowsSpotlightBlocked")(windowsSpotlightBlocked.asInstanceOf[js.Any])
    if (windowsSpotlightConfigureOnLockScreen != null) __obj.updateDynamic("windowsSpotlightConfigureOnLockScreen")(windowsSpotlightConfigureOnLockScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsStoreBlockAutoUpdate)) __obj.updateDynamic("windowsStoreBlockAutoUpdate")(windowsStoreBlockAutoUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsStoreBlocked)) __obj.updateDynamic("windowsStoreBlocked")(windowsStoreBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsStoreEnablePrivateStoreOnly)) __obj.updateDynamic("windowsStoreEnablePrivateStoreOnly")(windowsStoreEnablePrivateStoreOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(wirelessDisplayBlockProjectionToThisDevice)) __obj.updateDynamic("wirelessDisplayBlockProjectionToThisDevice")(wirelessDisplayBlockProjectionToThisDevice.asInstanceOf[js.Any])
    if (!js.isUndefined(wirelessDisplayBlockUserInputFromReceiver)) __obj.updateDynamic("wirelessDisplayBlockUserInputFromReceiver")(wirelessDisplayBlockUserInputFromReceiver.asInstanceOf[js.Any])
    if (!js.isUndefined(wirelessDisplayRequirePinForPairing)) __obj.updateDynamic("wirelessDisplayRequirePinForPairing")(wirelessDisplayRequirePinForPairing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10GeneralConfiguration]
  }
}


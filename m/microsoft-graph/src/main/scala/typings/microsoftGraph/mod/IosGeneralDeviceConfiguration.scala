package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow account modification when the device is in supervised mode.
  var accountBlockModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow activation lock when the device is in the supervised mode.
  var activationLockAllowWhenSupervised: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow AirDrop when the device is in supervised mode.
  var airDropBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
  var airDropForceUnmanagedDropTarget: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
  var airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in
    * supervised mode (iOS 9.0 and later).
    */
  var appStoreBlockAutomaticDownloads: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from making in app purchases.
  var appStoreBlockInAppPurchases: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to
    * supervised mode only (iOS 9.0 and later).
    */
  var appStoreBlockUIAppInstallation: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using the App Store.
  var appStoreBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require a password when using the app store.
  var appStoreRequirePassword: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
  var appleNewsBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
  var appleWatchBlockPairing: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
  var appleWatchForceWristDetection: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later.
    * This collection can contain a maximum of 500 elements.
    */
  var appsSingleAppModeList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /**
    * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled
    * by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
    */
  var appsVisibilityList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  // Type of list that is in the AppsVisibilityList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var appsVisibilityListType: js.UndefOr[AppListType] = js.undefined
  /**
    * Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0
    * and later).
    */
  var bluetoothBlockModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block global background fetch while roaming.
  var cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
  var cellularBlockPerAppDataModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Personal Hotspot.
  var cellularBlockPersonalHotspot: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block untrusted TLS certificates.
  var certificatesBlockUntrustedTlsCertificates: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS
    * 9.3 and later).
    */
  var classroomAppBlockRemoteScreenObservation: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to
    * view a student's screen without prompting when the device is in supervised mode.
    */
  var classroomAppForceUnpromptedScreenObservation: js.UndefOr[Boolean] = js.undefined
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /**
    * Indicates whether or not to block the user from installing configuration profiles and certificates interactively when
    * the device is in supervised mode.
    */
  var configurationProfileBlockChanges: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
  var definitionLookupBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in
    * supervised mode.
    */
  var deviceBlockEnableRestrictions: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device
    * is in supervised mode.
    */
  var deviceBlockEraseContentAndSettings: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
  var deviceBlockNameModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode
    * (iOS 9.3.2 and later).
    */
  var diagnosticDataBlockSubmissionModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
  var documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
  var documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[Boolean] = js.undefined
  // An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
  var emailInDomainSuffixes: js.UndefOr[js.Array[String]] = js.undefined
  // Indicates whether or not to block the user from trusting an enterprise app.
  var enterpriseAppBlockTrust: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from modifying the enterprise app trust settings.
  var enterpriseAppBlockTrustModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using FaceTime.
  var faceTimeBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Find My Friends when the device is in supervised mode.
  var findMyFriendsBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
  var gameCenterBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from having friends in Game Center.
  var gamingBlockGameCenterFriends: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using multiplayer gaming.
  var gamingBlockMultiplayer: js.UndefOr[Boolean] = js.undefined
  /**
    * indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device
    * is in supervised mode.
    */
  var hostPairingBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
  var iBooksStoreBlockErotica: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
  var iBooksStoreBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS
    * device.
    */
  var iCloudBlockActivityContinuation: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block iCloud backup.
  var iCloudBlockBackup: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block iCloud document sync.
  var iCloudBlockDocumentSync: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Managed Apps Cloud Sync.
  var iCloudBlockManagedAppsSync: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block iCloud Photo Library.
  var iCloudBlockPhotoLibrary: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block iCloud Photo Stream Sync.
  var iCloudBlockPhotoStreamSync: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Shared Photo Stream.
  var iCloudBlockSharedPhotoStream: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require backups to iCloud be encrypted.
  var iCloudRequireEncryptedBackup: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store.
  var iTunesBlockExplicitContent: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised
    * mode (iOS 9.3 and later and macOS 10.12 and later).
    */
  var iTunesBlockMusicService: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and
    * later).
    */
  var iTunesBlockRadio: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockAutoCorrect: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
  var keyboardBlockDictation: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockPredictive: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
  var keyboardBlockShortcuts: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockSpellCheck: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow assistive speak while in kiosk mode.
  var kioskModeAllowAssistiveSpeak: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
  var kioskModeAllowAssistiveTouchSettings: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow device auto lock while in kiosk mode.
  var kioskModeAllowAutoLock: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
  var kioskModeAllowColorInversionSettings: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow use of the ringer switch while in kiosk mode.
  var kioskModeAllowRingerSwitch: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow screen rotation while in kiosk mode.
  var kioskModeAllowScreenRotation: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow use of the sleep button while in kiosk mode.
  var kioskModeAllowSleepButton: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow use of the touchscreen while in kiosk mode.
  var kioskModeAllowTouchscreen: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow access to the voice over settings while in kiosk mode.
  var kioskModeAllowVoiceOverSettings: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow use of the volume buttons while in kiosk mode.
  var kioskModeAllowVolumeButtons: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow access to the zoom settings while in kiosk mode.
  var kioskModeAllowZoomSettings: js.UndefOr[Boolean] = js.undefined
  // URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
  var kioskModeAppStoreUrl: js.UndefOr[String] = js.undefined
  // ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
  var kioskModeBuiltInAppId: js.UndefOr[String] = js.undefined
  /**
    * Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will
    * be ignored.
    */
  var kioskModeManagedAppId: js.UndefOr[String] = js.undefined
  // Indicates whether or not to require assistive touch while in kiosk mode.
  var kioskModeRequireAssistiveTouch: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require color inversion while in kiosk mode.
  var kioskModeRequireColorInversion: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require mono audio while in kiosk mode.
  var kioskModeRequireMonoAudio: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require voice over while in kiosk mode.
  var kioskModeRequireVoiceOver: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require zoom while in kiosk mode.
  var kioskModeRequireZoom: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using control center on the lock screen.
  var lockScreenBlockControlCenter: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using the notification view on the lock screen.
  var lockScreenBlockNotificationView: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using passbook when the device is locked.
  var lockScreenBlockPassbook: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using the Today View on the lock screen.
  var lockScreenBlockTodayView: js.UndefOr[Boolean] = js.undefined
  /**
    * Media content rating settings for Apps. Possible values are: allAllowed, allBlocked, agesAbove4, agesAbove9,
    * agesAbove12, agesAbove17.
    */
  var mediaContentRatingApps: js.UndefOr[RatingAppsType] = js.undefined
  // Media content rating settings for Australia
  var mediaContentRatingAustralia: js.UndefOr[MediaContentRatingAustralia] = js.undefined
  // Media content rating settings for Canada
  var mediaContentRatingCanada: js.UndefOr[MediaContentRatingCanada] = js.undefined
  // Media content rating settings for France
  var mediaContentRatingFrance: js.UndefOr[MediaContentRatingFrance] = js.undefined
  // Media content rating settings for Germany
  var mediaContentRatingGermany: js.UndefOr[MediaContentRatingGermany] = js.undefined
  // Media content rating settings for Ireland
  var mediaContentRatingIreland: js.UndefOr[MediaContentRatingIreland] = js.undefined
  // Media content rating settings for Japan
  var mediaContentRatingJapan: js.UndefOr[MediaContentRatingJapan] = js.undefined
  // Media content rating settings for New Zealand
  var mediaContentRatingNewZealand: js.UndefOr[MediaContentRatingNewZealand] = js.undefined
  // Media content rating settings for United Kingdom
  var mediaContentRatingUnitedKingdom: js.UndefOr[MediaContentRatingUnitedKingdom] = js.undefined
  // Media content rating settings for United States
  var mediaContentRatingUnitedStates: js.UndefOr[MediaContentRatingUnitedStates] = js.undefined
  // Indicates whether or not to block the user from using the Messages app on the supervised device.
  var messagesBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000
    * elements.
    */
  var networkUsageRules: js.UndefOr[js.Array[IosNetworkUsageRule]] = js.undefined
  // Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
  var notificationsBlockSettingsModification: js.UndefOr[Boolean] = js.undefined
  // Block modification of registered Touch ID fingerprints when in supervised mode.
  var passcodeBlockFingerprintModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block fingerprint unlock.
  var passcodeBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
  var passcodeBlockModification: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.undefined
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.undefined
  // Number of character sets a passcode must contain. Valid values 0 to 4
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before the screen times out.
  var passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.undefined
  // Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before wiping the device. Valid values 4 to 11
  var passcodeSignInFailureCountBeforeWipe: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
  var podcastsBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using Auto fill in Safari.
  var safariBlockAutofill: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block JavaScript in Safari.
  var safariBlockJavaScript: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block popups in Safari.
  var safariBlockPopups: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using Safari.
  var safariBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Cookie settings for Safari. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var safariCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.undefined
  // URLs matching the patterns listed here will be considered managed.
  var safariManagedDomains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised
    * mode (iOS 9.3 and later).
    */
  var safariPasswordAutoFillDomains: js.UndefOr[js.Array[String]] = js.undefined
  // Indicates whether or not to require fraud warning in Safari.
  var safariRequireFraudWarning: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
  var siriBlockUserGeneratedContent: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using Siri.
  var siriBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the user from using Siri when locked.
  var siriBlockedWhenLocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
  var siriRequireProfanityFilter: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Spotlight search from returning internet results on supervised device.
  var spotlightBlockInternetResults: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
  var wallpaperBlockModification: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is
    * in supervised mode.
    */
  var wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[Boolean] = js.undefined
}

object IosGeneralDeviceConfiguration {
  @scala.inline
  def apply(
    accountBlockModification: js.UndefOr[Boolean] = js.undefined,
    activationLockAllowWhenSupervised: js.UndefOr[Boolean] = js.undefined,
    airDropBlocked: js.UndefOr[Boolean] = js.undefined,
    airDropForceUnmanagedDropTarget: js.UndefOr[Boolean] = js.undefined,
    airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[Boolean] = js.undefined,
    appStoreBlockAutomaticDownloads: js.UndefOr[Boolean] = js.undefined,
    appStoreBlockInAppPurchases: js.UndefOr[Boolean] = js.undefined,
    appStoreBlockUIAppInstallation: js.UndefOr[Boolean] = js.undefined,
    appStoreBlocked: js.UndefOr[Boolean] = js.undefined,
    appStoreRequirePassword: js.UndefOr[Boolean] = js.undefined,
    appleNewsBlocked: js.UndefOr[Boolean] = js.undefined,
    appleWatchBlockPairing: js.UndefOr[Boolean] = js.undefined,
    appleWatchForceWristDetection: js.UndefOr[Boolean] = js.undefined,
    appsSingleAppModeList: js.Array[AppListItem] = null,
    appsVisibilityList: js.Array[AppListItem] = null,
    appsVisibilityListType: AppListType = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlockModification: js.UndefOr[Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[Boolean] = js.undefined,
    cellularBlockDataRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[Boolean] = js.undefined,
    cellularBlockPerAppDataModification: js.UndefOr[Boolean] = js.undefined,
    cellularBlockPersonalHotspot: js.UndefOr[Boolean] = js.undefined,
    cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.undefined,
    certificatesBlockUntrustedTlsCertificates: js.UndefOr[Boolean] = js.undefined,
    classroomAppBlockRemoteScreenObservation: js.UndefOr[Boolean] = js.undefined,
    classroomAppForceUnpromptedScreenObservation: js.UndefOr[Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    configurationProfileBlockChanges: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    definitionLookupBlocked: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceBlockEnableRestrictions: js.UndefOr[Boolean] = js.undefined,
    deviceBlockEraseContentAndSettings: js.UndefOr[Boolean] = js.undefined,
    deviceBlockNameModification: js.UndefOr[Boolean] = js.undefined,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined,
    diagnosticDataBlockSubmissionModification: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[Boolean] = js.undefined,
    documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[Boolean] = js.undefined,
    emailInDomainSuffixes: js.Array[String] = null,
    enterpriseAppBlockTrust: js.UndefOr[Boolean] = js.undefined,
    enterpriseAppBlockTrustModification: js.UndefOr[Boolean] = js.undefined,
    faceTimeBlocked: js.UndefOr[Boolean] = js.undefined,
    findMyFriendsBlocked: js.UndefOr[Boolean] = js.undefined,
    gameCenterBlocked: js.UndefOr[Boolean] = js.undefined,
    gamingBlockGameCenterFriends: js.UndefOr[Boolean] = js.undefined,
    gamingBlockMultiplayer: js.UndefOr[Boolean] = js.undefined,
    hostPairingBlocked: js.UndefOr[Boolean] = js.undefined,
    iBooksStoreBlockErotica: js.UndefOr[Boolean] = js.undefined,
    iBooksStoreBlocked: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockActivityContinuation: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockBackup: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockDocumentSync: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockManagedAppsSync: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockPhotoLibrary: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockPhotoStreamSync: js.UndefOr[Boolean] = js.undefined,
    iCloudBlockSharedPhotoStream: js.UndefOr[Boolean] = js.undefined,
    iCloudRequireEncryptedBackup: js.UndefOr[Boolean] = js.undefined,
    iTunesBlockExplicitContent: js.UndefOr[Boolean] = js.undefined,
    iTunesBlockMusicService: js.UndefOr[Boolean] = js.undefined,
    iTunesBlockRadio: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    keyboardBlockAutoCorrect: js.UndefOr[Boolean] = js.undefined,
    keyboardBlockDictation: js.UndefOr[Boolean] = js.undefined,
    keyboardBlockPredictive: js.UndefOr[Boolean] = js.undefined,
    keyboardBlockShortcuts: js.UndefOr[Boolean] = js.undefined,
    keyboardBlockSpellCheck: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowAssistiveSpeak: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowAssistiveTouchSettings: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowAutoLock: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowColorInversionSettings: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowRingerSwitch: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowScreenRotation: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowSleepButton: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowTouchscreen: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowVoiceOverSettings: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowVolumeButtons: js.UndefOr[Boolean] = js.undefined,
    kioskModeAllowZoomSettings: js.UndefOr[Boolean] = js.undefined,
    kioskModeAppStoreUrl: String = null,
    kioskModeBuiltInAppId: String = null,
    kioskModeManagedAppId: String = null,
    kioskModeRequireAssistiveTouch: js.UndefOr[Boolean] = js.undefined,
    kioskModeRequireColorInversion: js.UndefOr[Boolean] = js.undefined,
    kioskModeRequireMonoAudio: js.UndefOr[Boolean] = js.undefined,
    kioskModeRequireVoiceOver: js.UndefOr[Boolean] = js.undefined,
    kioskModeRequireZoom: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    lockScreenBlockControlCenter: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockNotificationView: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockPassbook: js.UndefOr[Boolean] = js.undefined,
    lockScreenBlockTodayView: js.UndefOr[Boolean] = js.undefined,
    mediaContentRatingApps: RatingAppsType = null,
    mediaContentRatingAustralia: MediaContentRatingAustralia = null,
    mediaContentRatingCanada: MediaContentRatingCanada = null,
    mediaContentRatingFrance: MediaContentRatingFrance = null,
    mediaContentRatingGermany: MediaContentRatingGermany = null,
    mediaContentRatingIreland: MediaContentRatingIreland = null,
    mediaContentRatingJapan: MediaContentRatingJapan = null,
    mediaContentRatingNewZealand: MediaContentRatingNewZealand = null,
    mediaContentRatingUnitedKingdom: MediaContentRatingUnitedKingdom = null,
    mediaContentRatingUnitedStates: MediaContentRatingUnitedStates = null,
    messagesBlocked: js.UndefOr[Boolean] = js.undefined,
    networkUsageRules: js.Array[IosNetworkUsageRule] = null,
    notificationsBlockSettingsModification: js.UndefOr[Boolean] = js.undefined,
    passcodeBlockFingerprintModification: js.UndefOr[Boolean] = js.undefined,
    passcodeBlockFingerprintUnlock: js.UndefOr[Boolean] = js.undefined,
    passcodeBlockModification: js.UndefOr[Boolean] = js.undefined,
    passcodeBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passcodeExpirationDays: js.UndefOr[Double] = js.undefined,
    passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passcodeMinimumLength: js.UndefOr[Double] = js.undefined,
    passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.undefined,
    passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.undefined,
    passcodeRequired: js.UndefOr[Boolean] = js.undefined,
    passcodeRequiredType: RequiredPasswordType = null,
    passcodeSignInFailureCountBeforeWipe: js.UndefOr[Double] = js.undefined,
    podcastsBlocked: js.UndefOr[Boolean] = js.undefined,
    safariBlockAutofill: js.UndefOr[Boolean] = js.undefined,
    safariBlockJavaScript: js.UndefOr[Boolean] = js.undefined,
    safariBlockPopups: js.UndefOr[Boolean] = js.undefined,
    safariBlocked: js.UndefOr[Boolean] = js.undefined,
    safariCookieSettings: WebBrowserCookieSettings = null,
    safariManagedDomains: js.Array[String] = null,
    safariPasswordAutoFillDomains: js.Array[String] = null,
    safariRequireFraudWarning: js.UndefOr[Boolean] = js.undefined,
    screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined,
    siriBlockUserGeneratedContent: js.UndefOr[Boolean] = js.undefined,
    siriBlocked: js.UndefOr[Boolean] = js.undefined,
    siriBlockedWhenLocked: js.UndefOr[Boolean] = js.undefined,
    siriRequireProfanityFilter: js.UndefOr[Boolean] = js.undefined,
    spotlightBlockInternetResults: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined,
    voiceDialingBlocked: js.UndefOr[Boolean] = js.undefined,
    wallpaperBlockModification: js.UndefOr[Boolean] = js.undefined,
    wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[Boolean] = js.undefined
  ): IosGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountBlockModification)) __obj.updateDynamic("accountBlockModification")(accountBlockModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(activationLockAllowWhenSupervised)) __obj.updateDynamic("activationLockAllowWhenSupervised")(activationLockAllowWhenSupervised.get.asInstanceOf[js.Any])
    if (!js.isUndefined(airDropBlocked)) __obj.updateDynamic("airDropBlocked")(airDropBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(airDropForceUnmanagedDropTarget)) __obj.updateDynamic("airDropForceUnmanagedDropTarget")(airDropForceUnmanagedDropTarget.get.asInstanceOf[js.Any])
    if (!js.isUndefined(airPlayForcePairingPasswordForOutgoingRequests)) __obj.updateDynamic("airPlayForcePairingPasswordForOutgoingRequests")(airPlayForcePairingPasswordForOutgoingRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appStoreBlockAutomaticDownloads)) __obj.updateDynamic("appStoreBlockAutomaticDownloads")(appStoreBlockAutomaticDownloads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appStoreBlockInAppPurchases)) __obj.updateDynamic("appStoreBlockInAppPurchases")(appStoreBlockInAppPurchases.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appStoreBlockUIAppInstallation)) __obj.updateDynamic("appStoreBlockUIAppInstallation")(appStoreBlockUIAppInstallation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appStoreBlocked)) __obj.updateDynamic("appStoreBlocked")(appStoreBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appStoreRequirePassword)) __obj.updateDynamic("appStoreRequirePassword")(appStoreRequirePassword.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appleNewsBlocked)) __obj.updateDynamic("appleNewsBlocked")(appleNewsBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appleWatchBlockPairing)) __obj.updateDynamic("appleWatchBlockPairing")(appleWatchBlockPairing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appleWatchForceWristDetection)) __obj.updateDynamic("appleWatchForceWristDetection")(appleWatchForceWristDetection.get.asInstanceOf[js.Any])
    if (appsSingleAppModeList != null) __obj.updateDynamic("appsSingleAppModeList")(appsSingleAppModeList.asInstanceOf[js.Any])
    if (appsVisibilityList != null) __obj.updateDynamic("appsVisibilityList")(appsVisibilityList.asInstanceOf[js.Any])
    if (appsVisibilityListType != null) __obj.updateDynamic("appsVisibilityListType")(appsVisibilityListType.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlockModification)) __obj.updateDynamic("bluetoothBlockModification")(bluetoothBlockModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockGlobalBackgroundFetchWhileRoaming)) __obj.updateDynamic("cellularBlockGlobalBackgroundFetchWhileRoaming")(cellularBlockGlobalBackgroundFetchWhileRoaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockPerAppDataModification)) __obj.updateDynamic("cellularBlockPerAppDataModification")(cellularBlockPerAppDataModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockPersonalHotspot)) __obj.updateDynamic("cellularBlockPersonalHotspot")(cellularBlockPersonalHotspot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockVoiceRoaming)) __obj.updateDynamic("cellularBlockVoiceRoaming")(cellularBlockVoiceRoaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(certificatesBlockUntrustedTlsCertificates)) __obj.updateDynamic("certificatesBlockUntrustedTlsCertificates")(certificatesBlockUntrustedTlsCertificates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(classroomAppBlockRemoteScreenObservation)) __obj.updateDynamic("classroomAppBlockRemoteScreenObservation")(classroomAppBlockRemoteScreenObservation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(classroomAppForceUnpromptedScreenObservation)) __obj.updateDynamic("classroomAppForceUnpromptedScreenObservation")(classroomAppForceUnpromptedScreenObservation.get.asInstanceOf[js.Any])
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType.asInstanceOf[js.Any])
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList.asInstanceOf[js.Any])
    if (!js.isUndefined(configurationProfileBlockChanges)) __obj.updateDynamic("configurationProfileBlockChanges")(configurationProfileBlockChanges.get.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(definitionLookupBlocked)) __obj.updateDynamic("definitionLookupBlocked")(definitionLookupBlocked.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceBlockEnableRestrictions)) __obj.updateDynamic("deviceBlockEnableRestrictions")(deviceBlockEnableRestrictions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceBlockEraseContentAndSettings)) __obj.updateDynamic("deviceBlockEraseContentAndSettings")(deviceBlockEraseContentAndSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceBlockNameModification)) __obj.updateDynamic("deviceBlockNameModification")(deviceBlockNameModification.get.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticDataBlockSubmissionModification)) __obj.updateDynamic("diagnosticDataBlockSubmissionModification")(diagnosticDataBlockSubmissionModification.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(documentsBlockManagedDocumentsInUnmanagedApps)) __obj.updateDynamic("documentsBlockManagedDocumentsInUnmanagedApps")(documentsBlockManagedDocumentsInUnmanagedApps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(documentsBlockUnmanagedDocumentsInManagedApps)) __obj.updateDynamic("documentsBlockUnmanagedDocumentsInManagedApps")(documentsBlockUnmanagedDocumentsInManagedApps.get.asInstanceOf[js.Any])
    if (emailInDomainSuffixes != null) __obj.updateDynamic("emailInDomainSuffixes")(emailInDomainSuffixes.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseAppBlockTrust)) __obj.updateDynamic("enterpriseAppBlockTrust")(enterpriseAppBlockTrust.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseAppBlockTrustModification)) __obj.updateDynamic("enterpriseAppBlockTrustModification")(enterpriseAppBlockTrustModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(faceTimeBlocked)) __obj.updateDynamic("faceTimeBlocked")(faceTimeBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(findMyFriendsBlocked)) __obj.updateDynamic("findMyFriendsBlocked")(findMyFriendsBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gameCenterBlocked)) __obj.updateDynamic("gameCenterBlocked")(gameCenterBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gamingBlockGameCenterFriends)) __obj.updateDynamic("gamingBlockGameCenterFriends")(gamingBlockGameCenterFriends.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gamingBlockMultiplayer)) __obj.updateDynamic("gamingBlockMultiplayer")(gamingBlockMultiplayer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPairingBlocked)) __obj.updateDynamic("hostPairingBlocked")(hostPairingBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iBooksStoreBlockErotica)) __obj.updateDynamic("iBooksStoreBlockErotica")(iBooksStoreBlockErotica.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iBooksStoreBlocked)) __obj.updateDynamic("iBooksStoreBlocked")(iBooksStoreBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockActivityContinuation)) __obj.updateDynamic("iCloudBlockActivityContinuation")(iCloudBlockActivityContinuation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockBackup)) __obj.updateDynamic("iCloudBlockBackup")(iCloudBlockBackup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockDocumentSync)) __obj.updateDynamic("iCloudBlockDocumentSync")(iCloudBlockDocumentSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockManagedAppsSync)) __obj.updateDynamic("iCloudBlockManagedAppsSync")(iCloudBlockManagedAppsSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockPhotoLibrary)) __obj.updateDynamic("iCloudBlockPhotoLibrary")(iCloudBlockPhotoLibrary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockPhotoStreamSync)) __obj.updateDynamic("iCloudBlockPhotoStreamSync")(iCloudBlockPhotoStreamSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudBlockSharedPhotoStream)) __obj.updateDynamic("iCloudBlockSharedPhotoStream")(iCloudBlockSharedPhotoStream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iCloudRequireEncryptedBackup)) __obj.updateDynamic("iCloudRequireEncryptedBackup")(iCloudRequireEncryptedBackup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iTunesBlockExplicitContent)) __obj.updateDynamic("iTunesBlockExplicitContent")(iTunesBlockExplicitContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iTunesBlockMusicService)) __obj.updateDynamic("iTunesBlockMusicService")(iTunesBlockMusicService.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iTunesBlockRadio)) __obj.updateDynamic("iTunesBlockRadio")(iTunesBlockRadio.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardBlockAutoCorrect)) __obj.updateDynamic("keyboardBlockAutoCorrect")(keyboardBlockAutoCorrect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardBlockDictation)) __obj.updateDynamic("keyboardBlockDictation")(keyboardBlockDictation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardBlockPredictive)) __obj.updateDynamic("keyboardBlockPredictive")(keyboardBlockPredictive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardBlockShortcuts)) __obj.updateDynamic("keyboardBlockShortcuts")(keyboardBlockShortcuts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardBlockSpellCheck)) __obj.updateDynamic("keyboardBlockSpellCheck")(keyboardBlockSpellCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowAssistiveSpeak)) __obj.updateDynamic("kioskModeAllowAssistiveSpeak")(kioskModeAllowAssistiveSpeak.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowAssistiveTouchSettings)) __obj.updateDynamic("kioskModeAllowAssistiveTouchSettings")(kioskModeAllowAssistiveTouchSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowAutoLock)) __obj.updateDynamic("kioskModeAllowAutoLock")(kioskModeAllowAutoLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowColorInversionSettings)) __obj.updateDynamic("kioskModeAllowColorInversionSettings")(kioskModeAllowColorInversionSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowRingerSwitch)) __obj.updateDynamic("kioskModeAllowRingerSwitch")(kioskModeAllowRingerSwitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowScreenRotation)) __obj.updateDynamic("kioskModeAllowScreenRotation")(kioskModeAllowScreenRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowSleepButton)) __obj.updateDynamic("kioskModeAllowSleepButton")(kioskModeAllowSleepButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowTouchscreen)) __obj.updateDynamic("kioskModeAllowTouchscreen")(kioskModeAllowTouchscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowVoiceOverSettings)) __obj.updateDynamic("kioskModeAllowVoiceOverSettings")(kioskModeAllowVoiceOverSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowVolumeButtons)) __obj.updateDynamic("kioskModeAllowVolumeButtons")(kioskModeAllowVolumeButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeAllowZoomSettings)) __obj.updateDynamic("kioskModeAllowZoomSettings")(kioskModeAllowZoomSettings.get.asInstanceOf[js.Any])
    if (kioskModeAppStoreUrl != null) __obj.updateDynamic("kioskModeAppStoreUrl")(kioskModeAppStoreUrl.asInstanceOf[js.Any])
    if (kioskModeBuiltInAppId != null) __obj.updateDynamic("kioskModeBuiltInAppId")(kioskModeBuiltInAppId.asInstanceOf[js.Any])
    if (kioskModeManagedAppId != null) __obj.updateDynamic("kioskModeManagedAppId")(kioskModeManagedAppId.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeRequireAssistiveTouch)) __obj.updateDynamic("kioskModeRequireAssistiveTouch")(kioskModeRequireAssistiveTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeRequireColorInversion)) __obj.updateDynamic("kioskModeRequireColorInversion")(kioskModeRequireColorInversion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeRequireMonoAudio)) __obj.updateDynamic("kioskModeRequireMonoAudio")(kioskModeRequireMonoAudio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeRequireVoiceOver)) __obj.updateDynamic("kioskModeRequireVoiceOver")(kioskModeRequireVoiceOver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskModeRequireZoom)) __obj.updateDynamic("kioskModeRequireZoom")(kioskModeRequireZoom.get.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockControlCenter)) __obj.updateDynamic("lockScreenBlockControlCenter")(lockScreenBlockControlCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockNotificationView)) __obj.updateDynamic("lockScreenBlockNotificationView")(lockScreenBlockNotificationView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockPassbook)) __obj.updateDynamic("lockScreenBlockPassbook")(lockScreenBlockPassbook.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScreenBlockTodayView)) __obj.updateDynamic("lockScreenBlockTodayView")(lockScreenBlockTodayView.get.asInstanceOf[js.Any])
    if (mediaContentRatingApps != null) __obj.updateDynamic("mediaContentRatingApps")(mediaContentRatingApps.asInstanceOf[js.Any])
    if (mediaContentRatingAustralia != null) __obj.updateDynamic("mediaContentRatingAustralia")(mediaContentRatingAustralia.asInstanceOf[js.Any])
    if (mediaContentRatingCanada != null) __obj.updateDynamic("mediaContentRatingCanada")(mediaContentRatingCanada.asInstanceOf[js.Any])
    if (mediaContentRatingFrance != null) __obj.updateDynamic("mediaContentRatingFrance")(mediaContentRatingFrance.asInstanceOf[js.Any])
    if (mediaContentRatingGermany != null) __obj.updateDynamic("mediaContentRatingGermany")(mediaContentRatingGermany.asInstanceOf[js.Any])
    if (mediaContentRatingIreland != null) __obj.updateDynamic("mediaContentRatingIreland")(mediaContentRatingIreland.asInstanceOf[js.Any])
    if (mediaContentRatingJapan != null) __obj.updateDynamic("mediaContentRatingJapan")(mediaContentRatingJapan.asInstanceOf[js.Any])
    if (mediaContentRatingNewZealand != null) __obj.updateDynamic("mediaContentRatingNewZealand")(mediaContentRatingNewZealand.asInstanceOf[js.Any])
    if (mediaContentRatingUnitedKingdom != null) __obj.updateDynamic("mediaContentRatingUnitedKingdom")(mediaContentRatingUnitedKingdom.asInstanceOf[js.Any])
    if (mediaContentRatingUnitedStates != null) __obj.updateDynamic("mediaContentRatingUnitedStates")(mediaContentRatingUnitedStates.asInstanceOf[js.Any])
    if (!js.isUndefined(messagesBlocked)) __obj.updateDynamic("messagesBlocked")(messagesBlocked.get.asInstanceOf[js.Any])
    if (networkUsageRules != null) __obj.updateDynamic("networkUsageRules")(networkUsageRules.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationsBlockSettingsModification)) __obj.updateDynamic("notificationsBlockSettingsModification")(notificationsBlockSettingsModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeBlockFingerprintModification)) __obj.updateDynamic("passcodeBlockFingerprintModification")(passcodeBlockFingerprintModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeBlockFingerprintUnlock)) __obj.updateDynamic("passcodeBlockFingerprintUnlock")(passcodeBlockFingerprintUnlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeBlockModification)) __obj.updateDynamic("passcodeBlockModification")(passcodeBlockModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeBlockSimple)) __obj.updateDynamic("passcodeBlockSimple")(passcodeBlockSimple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeExpirationDays)) __obj.updateDynamic("passcodeExpirationDays")(passcodeExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinimumCharacterSetCount)) __obj.updateDynamic("passcodeMinimumCharacterSetCount")(passcodeMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinimumLength)) __obj.updateDynamic("passcodeMinimumLength")(passcodeMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinutesOfInactivityBeforeLock)) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeLock")(passcodeMinutesOfInactivityBeforeLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeScreenTimeout")(passcodeMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodePreviousPasscodeBlockCount)) __obj.updateDynamic("passcodePreviousPasscodeBlockCount")(passcodePreviousPasscodeBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeRequired)) __obj.updateDynamic("passcodeRequired")(passcodeRequired.get.asInstanceOf[js.Any])
    if (passcodeRequiredType != null) __obj.updateDynamic("passcodeRequiredType")(passcodeRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeSignInFailureCountBeforeWipe)) __obj.updateDynamic("passcodeSignInFailureCountBeforeWipe")(passcodeSignInFailureCountBeforeWipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(podcastsBlocked)) __obj.updateDynamic("podcastsBlocked")(podcastsBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safariBlockAutofill)) __obj.updateDynamic("safariBlockAutofill")(safariBlockAutofill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safariBlockJavaScript)) __obj.updateDynamic("safariBlockJavaScript")(safariBlockJavaScript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safariBlockPopups)) __obj.updateDynamic("safariBlockPopups")(safariBlockPopups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safariBlocked)) __obj.updateDynamic("safariBlocked")(safariBlocked.get.asInstanceOf[js.Any])
    if (safariCookieSettings != null) __obj.updateDynamic("safariCookieSettings")(safariCookieSettings.asInstanceOf[js.Any])
    if (safariManagedDomains != null) __obj.updateDynamic("safariManagedDomains")(safariManagedDomains.asInstanceOf[js.Any])
    if (safariPasswordAutoFillDomains != null) __obj.updateDynamic("safariPasswordAutoFillDomains")(safariPasswordAutoFillDomains.asInstanceOf[js.Any])
    if (!js.isUndefined(safariRequireFraudWarning)) __obj.updateDynamic("safariRequireFraudWarning")(safariRequireFraudWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siriBlockUserGeneratedContent)) __obj.updateDynamic("siriBlockUserGeneratedContent")(siriBlockUserGeneratedContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siriBlocked)) __obj.updateDynamic("siriBlocked")(siriBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siriBlockedWhenLocked)) __obj.updateDynamic("siriBlockedWhenLocked")(siriBlockedWhenLocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(siriRequireProfanityFilter)) __obj.updateDynamic("siriRequireProfanityFilter")(siriRequireProfanityFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spotlightBlockInternetResults)) __obj.updateDynamic("spotlightBlockInternetResults")(spotlightBlockInternetResults.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceDialingBlocked)) __obj.updateDynamic("voiceDialingBlocked")(voiceDialingBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wallpaperBlockModification)) __obj.updateDynamic("wallpaperBlockModification")(wallpaperBlockModification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wiFiConnectOnlyToConfiguredNetworks)) __obj.updateDynamic("wiFiConnectOnlyToConfiguredNetworks")(wiFiConnectOnlyToConfiguredNetworks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosGeneralDeviceConfiguration]
  }
}


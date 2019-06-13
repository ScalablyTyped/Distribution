package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosGeneralDeviceConfiguration extends DeviceConfiguration {
  /** Indicates whether or not to allow account modification when the device is in supervised mode. */
  var accountBlockModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow activation lock when the device is in the supervised mode. */
  var activationLockAllowWhenSupervised: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow AirDrop when the device is in supervised mode. */
  var airDropBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later). */
  var airDropForceUnmanagedDropTarget: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password. */
  var airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later). */
  var appStoreBlockAutomaticDownloads: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from making in app purchases. */
  var appStoreBlockInAppPurchases: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later). */
  var appStoreBlockUIAppInstallation: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using the App Store. */
  var appStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require a password when using the app store. */
  var appStoreRequirePassword: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later). */
  var appleNewsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later). */
  var appleWatchBlockPairing: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later). */
  var appleWatchForceWristDetection: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements. */
  var appsSingleAppModeList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /**
    * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later).
    * This collection can contain a maximum of 10000 elements.
    */
  var appsVisibilityList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /** Type of list that is in the AppsVisibilityList. Possible values are: none, appsInListCompliant, appsNotInListCompliant. */
  var appsVisibilityListType: js.UndefOr[AppListType] = js.undefined
  /** Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later). */
  var bluetoothBlockModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from accessing the camera of the device. */
  var cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block data roaming. */
  var cellularBlockDataRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block global background fetch while roaming. */
  var cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode. */
  var cellularBlockPerAppDataModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Personal Hotspot. */
  var cellularBlockPersonalHotspot: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block voice roaming. */
  var cellularBlockVoiceRoaming: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block untrusted TLS certificates. */
  var certificatesBlockUntrustedTlsCertificates: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later). */
  var classroomAppBlockRemoteScreenObservation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether or not to automatically give permission to the teacher of a managed course on the
    * Classroom app to view a student's screen without prompting when the device is in supervised mode.
    */
  var classroomAppForceUnpromptedScreenObservation: js.UndefOr[scala.Boolean] = js.undefined
  /** List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant. */
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  /** List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements. */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  /** Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode. */
  var configurationProfileBlockChanges: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ). */
  var definitionLookupBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode. */
  var deviceBlockEnableRestrictions: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode. */
  var deviceBlockEraseContentAndSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later). */
  var deviceBlockNameModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block diagnostic data submission. */
  var diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later). */
  var diagnosticDataBlockSubmissionModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from viewing managed documents in unmanaged apps. */
  var documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from viewing unmanaged documents in managed apps. */
  var documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[scala.Boolean] = js.undefined
  /** An email address lacking a suffix that matches any of these strings will be considered out-of-domain. */
  var emailInDomainSuffixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Indicates whether or not to block the user from trusting an enterprise app. */
  var enterpriseAppBlockTrust: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from modifying the enterprise app trust settings. */
  var enterpriseAppBlockTrustModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using FaceTime. */
  var faceTimeBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Find My Friends when the device is in supervised mode. */
  var findMyFriendsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using Game Center when the device is in supervised mode. */
  var gameCenterBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from having friends in Game Center. */
  var gamingBlockGameCenterFriends: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using multiplayer gaming. */
  var gamingBlockMultiplayer: js.UndefOr[scala.Boolean] = js.undefined
  /** indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode. */
  var hostPairingBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica. */
  var iBooksStoreBlockErotica: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode. */
  var iBooksStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block  the the user from continuing work they started on iOS device to another iOS or macOS device. */
  var iCloudBlockActivityContinuation: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block iCloud backup. */
  var iCloudBlockBackup: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block iCloud document sync. */
  var iCloudBlockDocumentSync: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Managed Apps Cloud Sync. */
  var iCloudBlockManagedAppsSync: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block iCloud Photo Library. */
  var iCloudBlockPhotoLibrary: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block iCloud Photo Stream Sync. */
  var iCloudBlockPhotoStreamSync: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Shared Photo Stream. */
  var iCloudBlockSharedPhotoStream: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require backups to iCloud be encrypted. */
  var iCloudRequireEncryptedBackup: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. */
  var iTunesBlockExplicitContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later). */
  var iTunesBlockMusicService: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later). */
  var iTunesBlockRadio: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later). */
  var keyboardBlockAutoCorrect: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using dictation input when the device is in supervised mode. */
  var keyboardBlockDictation: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later). */
  var keyboardBlockPredictive: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later). */
  var keyboardBlockShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later). */
  var keyboardBlockSpellCheck: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow assistive speak while in kiosk mode. */
  var kioskModeAllowAssistiveSpeak: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode. */
  var kioskModeAllowAssistiveTouchSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow device auto lock while in kiosk mode. */
  var kioskModeAllowAutoLock: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode. */
  var kioskModeAllowColorInversionSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow use of the ringer switch while in kiosk mode. */
  var kioskModeAllowRingerSwitch: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow screen rotation while in kiosk mode. */
  var kioskModeAllowScreenRotation: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow use of the sleep button while in kiosk mode. */
  var kioskModeAllowSleepButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow use of the touchscreen while in kiosk mode. */
  var kioskModeAllowTouchscreen: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow access to the voice over settings while in kiosk mode. */
  var kioskModeAllowVoiceOverSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow use of the volume buttons while in kiosk mode. */
  var kioskModeAllowVolumeButtons: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow access to the zoom settings while in kiosk mode. */
  var kioskModeAllowZoomSettings: js.UndefOr[scala.Boolean] = js.undefined
  /** URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known. */
  var kioskModeAppStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  /** ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set. */
  var kioskModeBuiltInAppId: js.UndefOr[java.lang.String] = js.undefined
  /** Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored. */
  var kioskModeManagedAppId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether or not to require assistive touch while in kiosk mode. */
  var kioskModeRequireAssistiveTouch: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require color inversion while in kiosk mode. */
  var kioskModeRequireColorInversion: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require mono audio while in kiosk mode. */
  var kioskModeRequireMonoAudio: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require voice over while in kiosk mode. */
  var kioskModeRequireVoiceOver: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to require zoom while in kiosk mode. */
  var kioskModeRequireZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using control center on the lock screen. */
  var lockScreenBlockControlCenter: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using the notification view on the lock screen. */
  var lockScreenBlockNotificationView: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using passbook when the device is locked. */
  var lockScreenBlockPassbook: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using the Today View on the lock screen. */
  var lockScreenBlockTodayView: js.UndefOr[scala.Boolean] = js.undefined
  /** Media content rating settings for Apps. Possible values are: allAllowed, allBlocked, agesAbove4, agesAbove9, agesAbove12, agesAbove17. */
  var mediaContentRatingApps: js.UndefOr[RatingAppsType] = js.undefined
  /** Media content rating settings for Australia */
  var mediaContentRatingAustralia: js.UndefOr[MediaContentRatingAustralia] = js.undefined
  /** Media content rating settings for Canada */
  var mediaContentRatingCanada: js.UndefOr[MediaContentRatingCanada] = js.undefined
  /** Media content rating settings for France */
  var mediaContentRatingFrance: js.UndefOr[MediaContentRatingFrance] = js.undefined
  /** Media content rating settings for Germany */
  var mediaContentRatingGermany: js.UndefOr[MediaContentRatingGermany] = js.undefined
  /** Media content rating settings for Ireland */
  var mediaContentRatingIreland: js.UndefOr[MediaContentRatingIreland] = js.undefined
  /** Media content rating settings for Japan */
  var mediaContentRatingJapan: js.UndefOr[MediaContentRatingJapan] = js.undefined
  /** Media content rating settings for New Zealand */
  var mediaContentRatingNewZealand: js.UndefOr[MediaContentRatingNewZealand] = js.undefined
  /** Media content rating settings for United Kingdom */
  var mediaContentRatingUnitedKingdom: js.UndefOr[MediaContentRatingUnitedKingdom] = js.undefined
  /** Media content rating settings for United States */
  var mediaContentRatingUnitedStates: js.UndefOr[MediaContentRatingUnitedStates] = js.undefined
  /** Indicates whether or not to block the user from using the Messages app on the supervised device. */
  var messagesBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements. */
  var networkUsageRules: js.UndefOr[js.Array[IosNetworkUsageRule]] = js.undefined
  /** Indicates whether or not to allow notifications settings modification (iOS 9.3 and later). */
  var notificationsBlockSettingsModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Block modification of registered Touch ID fingerprints when in supervised mode. */
  var passcodeBlockFingerprintModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block fingerprint unlock. */
  var passcodeBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later). */
  var passcodeBlockModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block simple passcodes. */
  var passcodeBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of days before the passcode expires. Valid values 1 to 65535 */
  var passcodeExpirationDays: js.UndefOr[scala.Double] = js.undefined
  /** Number of character sets a passcode must contain. Valid values 0 to 4 */
  var passcodeMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  /** Minimum length of passcode. Valid values 4 to 14 */
  var passcodeMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /** Minutes of inactivity before a passcode is required. */
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[scala.Double] = js.undefined
  /** Minutes of inactivity before the screen times out. */
  var passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Number of previous passcodes to block. Valid values 1 to 24 */
  var passcodePreviousPasscodeBlockCount: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to require a passcode. */
  var passcodeRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric. */
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  /** Number of sign in failures allowed before wiping the device. Valid values 4 to 11 */
  var passcodeSignInFailureCountBeforeWipe: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later). */
  var podcastsBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using Auto fill in Safari. */
  var safariBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block JavaScript in Safari. */
  var safariBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block popups in Safari. */
  var safariBlockPopups: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using Safari. */
  var safariBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Cookie settings for Safari. Possible values are: browserDefault, blockAlways, allowCurrentWebSite, allowFromWebsitesVisited, allowAlways. */
  var safariCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.undefined
  /** URLs matching the patterns listed here will be considered managed. */
  var safariManagedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later). */
  var safariPasswordAutoFillDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Indicates whether or not to require fraud warning in Safari. */
  var safariRequireFraudWarning: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from taking Screenshots. */
  var screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Siri from querying user-generated content when used on a supervised device. */
  var siriBlockUserGeneratedContent: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using Siri. */
  var siriBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block the user from using Siri when locked. */
  var siriBlockedWhenLocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device. */
  var siriRequireProfanityFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block Spotlight search from returning internet results on supervised device. */
  var spotlightBlockInternetResults: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to block voice dialing. */
  var voiceDialingBlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) . */
  var wallpaperBlockModification: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. */
  var wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[scala.Boolean] = js.undefined
}

object IosGeneralDeviceConfiguration {
  @scala.inline
  def apply(
    accountBlockModification: js.UndefOr[scala.Boolean] = js.undefined,
    activationLockAllowWhenSupervised: js.UndefOr[scala.Boolean] = js.undefined,
    airDropBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    airDropForceUnmanagedDropTarget: js.UndefOr[scala.Boolean] = js.undefined,
    airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[scala.Boolean] = js.undefined,
    appStoreBlockAutomaticDownloads: js.UndefOr[scala.Boolean] = js.undefined,
    appStoreBlockInAppPurchases: js.UndefOr[scala.Boolean] = js.undefined,
    appStoreBlockUIAppInstallation: js.UndefOr[scala.Boolean] = js.undefined,
    appStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    appStoreRequirePassword: js.UndefOr[scala.Boolean] = js.undefined,
    appleNewsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    appleWatchBlockPairing: js.UndefOr[scala.Boolean] = js.undefined,
    appleWatchForceWristDetection: js.UndefOr[scala.Boolean] = js.undefined,
    appsSingleAppModeList: js.Array[AppListItem] = null,
    appsVisibilityList: js.Array[AppListItem] = null,
    appsVisibilityListType: AppListType = null,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlockModification: js.UndefOr[scala.Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockDataRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockPerAppDataModification: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockPersonalHotspot: js.UndefOr[scala.Boolean] = js.undefined,
    cellularBlockVoiceRoaming: js.UndefOr[scala.Boolean] = js.undefined,
    certificatesBlockUntrustedTlsCertificates: js.UndefOr[scala.Boolean] = js.undefined,
    classroomAppBlockRemoteScreenObservation: js.UndefOr[scala.Boolean] = js.undefined,
    classroomAppForceUnpromptedScreenObservation: js.UndefOr[scala.Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    configurationProfileBlockChanges: js.UndefOr[scala.Boolean] = js.undefined,
    createdDateTime: java.lang.String = null,
    definitionLookupBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    deviceBlockEnableRestrictions: js.UndefOr[scala.Boolean] = js.undefined,
    deviceBlockEraseContentAndSettings: js.UndefOr[scala.Boolean] = js.undefined,
    deviceBlockNameModification: js.UndefOr[scala.Boolean] = js.undefined,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[scala.Boolean] = js.undefined,
    diagnosticDataBlockSubmissionModification: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[scala.Boolean] = js.undefined,
    documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[scala.Boolean] = js.undefined,
    emailInDomainSuffixes: js.Array[java.lang.String] = null,
    enterpriseAppBlockTrust: js.UndefOr[scala.Boolean] = js.undefined,
    enterpriseAppBlockTrustModification: js.UndefOr[scala.Boolean] = js.undefined,
    faceTimeBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    findMyFriendsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    gameCenterBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    gamingBlockGameCenterFriends: js.UndefOr[scala.Boolean] = js.undefined,
    gamingBlockMultiplayer: js.UndefOr[scala.Boolean] = js.undefined,
    hostPairingBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    iBooksStoreBlockErotica: js.UndefOr[scala.Boolean] = js.undefined,
    iBooksStoreBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockActivityContinuation: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockBackup: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockDocumentSync: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockManagedAppsSync: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockPhotoLibrary: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockPhotoStreamSync: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudBlockSharedPhotoStream: js.UndefOr[scala.Boolean] = js.undefined,
    iCloudRequireEncryptedBackup: js.UndefOr[scala.Boolean] = js.undefined,
    iTunesBlockExplicitContent: js.UndefOr[scala.Boolean] = js.undefined,
    iTunesBlockMusicService: js.UndefOr[scala.Boolean] = js.undefined,
    iTunesBlockRadio: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    keyboardBlockAutoCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardBlockDictation: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardBlockPredictive: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardBlockShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardBlockSpellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowAssistiveSpeak: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowAssistiveTouchSettings: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowAutoLock: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowColorInversionSettings: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowRingerSwitch: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowScreenRotation: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowSleepButton: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowTouchscreen: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowVoiceOverSettings: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowVolumeButtons: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAllowZoomSettings: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeAppStoreUrl: java.lang.String = null,
    kioskModeBuiltInAppId: java.lang.String = null,
    kioskModeManagedAppId: java.lang.String = null,
    kioskModeRequireAssistiveTouch: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeRequireColorInversion: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeRequireMonoAudio: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeRequireVoiceOver: js.UndefOr[scala.Boolean] = js.undefined,
    kioskModeRequireZoom: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    lockScreenBlockControlCenter: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockNotificationView: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockPassbook: js.UndefOr[scala.Boolean] = js.undefined,
    lockScreenBlockTodayView: js.UndefOr[scala.Boolean] = js.undefined,
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
    messagesBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    networkUsageRules: js.Array[IosNetworkUsageRule] = null,
    notificationsBlockSettingsModification: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeBlockFingerprintModification: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeBlockFingerprintUnlock: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeBlockModification: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeBlockSimple: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeExpirationDays: scala.Int | scala.Double = null,
    passcodeMinimumCharacterSetCount: scala.Int | scala.Double = null,
    passcodeMinimumLength: scala.Int | scala.Double = null,
    passcodeMinutesOfInactivityBeforeLock: scala.Int | scala.Double = null,
    passcodeMinutesOfInactivityBeforeScreenTimeout: scala.Int | scala.Double = null,
    passcodePreviousPasscodeBlockCount: scala.Int | scala.Double = null,
    passcodeRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeRequiredType: RequiredPasswordType = null,
    passcodeSignInFailureCountBeforeWipe: scala.Int | scala.Double = null,
    podcastsBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    safariBlockAutofill: js.UndefOr[scala.Boolean] = js.undefined,
    safariBlockJavaScript: js.UndefOr[scala.Boolean] = js.undefined,
    safariBlockPopups: js.UndefOr[scala.Boolean] = js.undefined,
    safariBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    safariCookieSettings: WebBrowserCookieSettings = null,
    safariManagedDomains: js.Array[java.lang.String] = null,
    safariPasswordAutoFillDomains: js.Array[java.lang.String] = null,
    safariRequireFraudWarning: js.UndefOr[scala.Boolean] = js.undefined,
    screenCaptureBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    siriBlockUserGeneratedContent: js.UndefOr[scala.Boolean] = js.undefined,
    siriBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    siriBlockedWhenLocked: js.UndefOr[scala.Boolean] = js.undefined,
    siriRequireProfanityFilter: js.UndefOr[scala.Boolean] = js.undefined,
    spotlightBlockInternetResults: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: scala.Int | scala.Double = null,
    voiceDialingBlocked: js.UndefOr[scala.Boolean] = js.undefined,
    wallpaperBlockModification: js.UndefOr[scala.Boolean] = js.undefined,
    wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[scala.Boolean] = js.undefined
  ): IosGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountBlockModification)) __obj.updateDynamic("accountBlockModification")(accountBlockModification)
    if (!js.isUndefined(activationLockAllowWhenSupervised)) __obj.updateDynamic("activationLockAllowWhenSupervised")(activationLockAllowWhenSupervised)
    if (!js.isUndefined(airDropBlocked)) __obj.updateDynamic("airDropBlocked")(airDropBlocked)
    if (!js.isUndefined(airDropForceUnmanagedDropTarget)) __obj.updateDynamic("airDropForceUnmanagedDropTarget")(airDropForceUnmanagedDropTarget)
    if (!js.isUndefined(airPlayForcePairingPasswordForOutgoingRequests)) __obj.updateDynamic("airPlayForcePairingPasswordForOutgoingRequests")(airPlayForcePairingPasswordForOutgoingRequests)
    if (!js.isUndefined(appStoreBlockAutomaticDownloads)) __obj.updateDynamic("appStoreBlockAutomaticDownloads")(appStoreBlockAutomaticDownloads)
    if (!js.isUndefined(appStoreBlockInAppPurchases)) __obj.updateDynamic("appStoreBlockInAppPurchases")(appStoreBlockInAppPurchases)
    if (!js.isUndefined(appStoreBlockUIAppInstallation)) __obj.updateDynamic("appStoreBlockUIAppInstallation")(appStoreBlockUIAppInstallation)
    if (!js.isUndefined(appStoreBlocked)) __obj.updateDynamic("appStoreBlocked")(appStoreBlocked)
    if (!js.isUndefined(appStoreRequirePassword)) __obj.updateDynamic("appStoreRequirePassword")(appStoreRequirePassword)
    if (!js.isUndefined(appleNewsBlocked)) __obj.updateDynamic("appleNewsBlocked")(appleNewsBlocked)
    if (!js.isUndefined(appleWatchBlockPairing)) __obj.updateDynamic("appleWatchBlockPairing")(appleWatchBlockPairing)
    if (!js.isUndefined(appleWatchForceWristDetection)) __obj.updateDynamic("appleWatchForceWristDetection")(appleWatchForceWristDetection)
    if (appsSingleAppModeList != null) __obj.updateDynamic("appsSingleAppModeList")(appsSingleAppModeList)
    if (appsVisibilityList != null) __obj.updateDynamic("appsVisibilityList")(appsVisibilityList)
    if (appsVisibilityListType != null) __obj.updateDynamic("appsVisibilityListType")(appsVisibilityListType)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(bluetoothBlockModification)) __obj.updateDynamic("bluetoothBlockModification")(bluetoothBlockModification)
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked)
    if (!js.isUndefined(cellularBlockDataRoaming)) __obj.updateDynamic("cellularBlockDataRoaming")(cellularBlockDataRoaming)
    if (!js.isUndefined(cellularBlockGlobalBackgroundFetchWhileRoaming)) __obj.updateDynamic("cellularBlockGlobalBackgroundFetchWhileRoaming")(cellularBlockGlobalBackgroundFetchWhileRoaming)
    if (!js.isUndefined(cellularBlockPerAppDataModification)) __obj.updateDynamic("cellularBlockPerAppDataModification")(cellularBlockPerAppDataModification)
    if (!js.isUndefined(cellularBlockPersonalHotspot)) __obj.updateDynamic("cellularBlockPersonalHotspot")(cellularBlockPersonalHotspot)
    if (!js.isUndefined(cellularBlockVoiceRoaming)) __obj.updateDynamic("cellularBlockVoiceRoaming")(cellularBlockVoiceRoaming)
    if (!js.isUndefined(certificatesBlockUntrustedTlsCertificates)) __obj.updateDynamic("certificatesBlockUntrustedTlsCertificates")(certificatesBlockUntrustedTlsCertificates)
    if (!js.isUndefined(classroomAppBlockRemoteScreenObservation)) __obj.updateDynamic("classroomAppBlockRemoteScreenObservation")(classroomAppBlockRemoteScreenObservation)
    if (!js.isUndefined(classroomAppForceUnpromptedScreenObservation)) __obj.updateDynamic("classroomAppForceUnpromptedScreenObservation")(classroomAppForceUnpromptedScreenObservation)
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType)
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList)
    if (!js.isUndefined(configurationProfileBlockChanges)) __obj.updateDynamic("configurationProfileBlockChanges")(configurationProfileBlockChanges)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (!js.isUndefined(definitionLookupBlocked)) __obj.updateDynamic("definitionLookupBlocked")(definitionLookupBlocked)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(deviceBlockEnableRestrictions)) __obj.updateDynamic("deviceBlockEnableRestrictions")(deviceBlockEnableRestrictions)
    if (!js.isUndefined(deviceBlockEraseContentAndSettings)) __obj.updateDynamic("deviceBlockEraseContentAndSettings")(deviceBlockEraseContentAndSettings)
    if (!js.isUndefined(deviceBlockNameModification)) __obj.updateDynamic("deviceBlockNameModification")(deviceBlockNameModification)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission)
    if (!js.isUndefined(diagnosticDataBlockSubmissionModification)) __obj.updateDynamic("diagnosticDataBlockSubmissionModification")(diagnosticDataBlockSubmissionModification)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(documentsBlockManagedDocumentsInUnmanagedApps)) __obj.updateDynamic("documentsBlockManagedDocumentsInUnmanagedApps")(documentsBlockManagedDocumentsInUnmanagedApps)
    if (!js.isUndefined(documentsBlockUnmanagedDocumentsInManagedApps)) __obj.updateDynamic("documentsBlockUnmanagedDocumentsInManagedApps")(documentsBlockUnmanagedDocumentsInManagedApps)
    if (emailInDomainSuffixes != null) __obj.updateDynamic("emailInDomainSuffixes")(emailInDomainSuffixes)
    if (!js.isUndefined(enterpriseAppBlockTrust)) __obj.updateDynamic("enterpriseAppBlockTrust")(enterpriseAppBlockTrust)
    if (!js.isUndefined(enterpriseAppBlockTrustModification)) __obj.updateDynamic("enterpriseAppBlockTrustModification")(enterpriseAppBlockTrustModification)
    if (!js.isUndefined(faceTimeBlocked)) __obj.updateDynamic("faceTimeBlocked")(faceTimeBlocked)
    if (!js.isUndefined(findMyFriendsBlocked)) __obj.updateDynamic("findMyFriendsBlocked")(findMyFriendsBlocked)
    if (!js.isUndefined(gameCenterBlocked)) __obj.updateDynamic("gameCenterBlocked")(gameCenterBlocked)
    if (!js.isUndefined(gamingBlockGameCenterFriends)) __obj.updateDynamic("gamingBlockGameCenterFriends")(gamingBlockGameCenterFriends)
    if (!js.isUndefined(gamingBlockMultiplayer)) __obj.updateDynamic("gamingBlockMultiplayer")(gamingBlockMultiplayer)
    if (!js.isUndefined(hostPairingBlocked)) __obj.updateDynamic("hostPairingBlocked")(hostPairingBlocked)
    if (!js.isUndefined(iBooksStoreBlockErotica)) __obj.updateDynamic("iBooksStoreBlockErotica")(iBooksStoreBlockErotica)
    if (!js.isUndefined(iBooksStoreBlocked)) __obj.updateDynamic("iBooksStoreBlocked")(iBooksStoreBlocked)
    if (!js.isUndefined(iCloudBlockActivityContinuation)) __obj.updateDynamic("iCloudBlockActivityContinuation")(iCloudBlockActivityContinuation)
    if (!js.isUndefined(iCloudBlockBackup)) __obj.updateDynamic("iCloudBlockBackup")(iCloudBlockBackup)
    if (!js.isUndefined(iCloudBlockDocumentSync)) __obj.updateDynamic("iCloudBlockDocumentSync")(iCloudBlockDocumentSync)
    if (!js.isUndefined(iCloudBlockManagedAppsSync)) __obj.updateDynamic("iCloudBlockManagedAppsSync")(iCloudBlockManagedAppsSync)
    if (!js.isUndefined(iCloudBlockPhotoLibrary)) __obj.updateDynamic("iCloudBlockPhotoLibrary")(iCloudBlockPhotoLibrary)
    if (!js.isUndefined(iCloudBlockPhotoStreamSync)) __obj.updateDynamic("iCloudBlockPhotoStreamSync")(iCloudBlockPhotoStreamSync)
    if (!js.isUndefined(iCloudBlockSharedPhotoStream)) __obj.updateDynamic("iCloudBlockSharedPhotoStream")(iCloudBlockSharedPhotoStream)
    if (!js.isUndefined(iCloudRequireEncryptedBackup)) __obj.updateDynamic("iCloudRequireEncryptedBackup")(iCloudRequireEncryptedBackup)
    if (!js.isUndefined(iTunesBlockExplicitContent)) __obj.updateDynamic("iTunesBlockExplicitContent")(iTunesBlockExplicitContent)
    if (!js.isUndefined(iTunesBlockMusicService)) __obj.updateDynamic("iTunesBlockMusicService")(iTunesBlockMusicService)
    if (!js.isUndefined(iTunesBlockRadio)) __obj.updateDynamic("iTunesBlockRadio")(iTunesBlockRadio)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardBlockAutoCorrect)) __obj.updateDynamic("keyboardBlockAutoCorrect")(keyboardBlockAutoCorrect)
    if (!js.isUndefined(keyboardBlockDictation)) __obj.updateDynamic("keyboardBlockDictation")(keyboardBlockDictation)
    if (!js.isUndefined(keyboardBlockPredictive)) __obj.updateDynamic("keyboardBlockPredictive")(keyboardBlockPredictive)
    if (!js.isUndefined(keyboardBlockShortcuts)) __obj.updateDynamic("keyboardBlockShortcuts")(keyboardBlockShortcuts)
    if (!js.isUndefined(keyboardBlockSpellCheck)) __obj.updateDynamic("keyboardBlockSpellCheck")(keyboardBlockSpellCheck)
    if (!js.isUndefined(kioskModeAllowAssistiveSpeak)) __obj.updateDynamic("kioskModeAllowAssistiveSpeak")(kioskModeAllowAssistiveSpeak)
    if (!js.isUndefined(kioskModeAllowAssistiveTouchSettings)) __obj.updateDynamic("kioskModeAllowAssistiveTouchSettings")(kioskModeAllowAssistiveTouchSettings)
    if (!js.isUndefined(kioskModeAllowAutoLock)) __obj.updateDynamic("kioskModeAllowAutoLock")(kioskModeAllowAutoLock)
    if (!js.isUndefined(kioskModeAllowColorInversionSettings)) __obj.updateDynamic("kioskModeAllowColorInversionSettings")(kioskModeAllowColorInversionSettings)
    if (!js.isUndefined(kioskModeAllowRingerSwitch)) __obj.updateDynamic("kioskModeAllowRingerSwitch")(kioskModeAllowRingerSwitch)
    if (!js.isUndefined(kioskModeAllowScreenRotation)) __obj.updateDynamic("kioskModeAllowScreenRotation")(kioskModeAllowScreenRotation)
    if (!js.isUndefined(kioskModeAllowSleepButton)) __obj.updateDynamic("kioskModeAllowSleepButton")(kioskModeAllowSleepButton)
    if (!js.isUndefined(kioskModeAllowTouchscreen)) __obj.updateDynamic("kioskModeAllowTouchscreen")(kioskModeAllowTouchscreen)
    if (!js.isUndefined(kioskModeAllowVoiceOverSettings)) __obj.updateDynamic("kioskModeAllowVoiceOverSettings")(kioskModeAllowVoiceOverSettings)
    if (!js.isUndefined(kioskModeAllowVolumeButtons)) __obj.updateDynamic("kioskModeAllowVolumeButtons")(kioskModeAllowVolumeButtons)
    if (!js.isUndefined(kioskModeAllowZoomSettings)) __obj.updateDynamic("kioskModeAllowZoomSettings")(kioskModeAllowZoomSettings)
    if (kioskModeAppStoreUrl != null) __obj.updateDynamic("kioskModeAppStoreUrl")(kioskModeAppStoreUrl)
    if (kioskModeBuiltInAppId != null) __obj.updateDynamic("kioskModeBuiltInAppId")(kioskModeBuiltInAppId)
    if (kioskModeManagedAppId != null) __obj.updateDynamic("kioskModeManagedAppId")(kioskModeManagedAppId)
    if (!js.isUndefined(kioskModeRequireAssistiveTouch)) __obj.updateDynamic("kioskModeRequireAssistiveTouch")(kioskModeRequireAssistiveTouch)
    if (!js.isUndefined(kioskModeRequireColorInversion)) __obj.updateDynamic("kioskModeRequireColorInversion")(kioskModeRequireColorInversion)
    if (!js.isUndefined(kioskModeRequireMonoAudio)) __obj.updateDynamic("kioskModeRequireMonoAudio")(kioskModeRequireMonoAudio)
    if (!js.isUndefined(kioskModeRequireVoiceOver)) __obj.updateDynamic("kioskModeRequireVoiceOver")(kioskModeRequireVoiceOver)
    if (!js.isUndefined(kioskModeRequireZoom)) __obj.updateDynamic("kioskModeRequireZoom")(kioskModeRequireZoom)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(lockScreenBlockControlCenter)) __obj.updateDynamic("lockScreenBlockControlCenter")(lockScreenBlockControlCenter)
    if (!js.isUndefined(lockScreenBlockNotificationView)) __obj.updateDynamic("lockScreenBlockNotificationView")(lockScreenBlockNotificationView)
    if (!js.isUndefined(lockScreenBlockPassbook)) __obj.updateDynamic("lockScreenBlockPassbook")(lockScreenBlockPassbook)
    if (!js.isUndefined(lockScreenBlockTodayView)) __obj.updateDynamic("lockScreenBlockTodayView")(lockScreenBlockTodayView)
    if (mediaContentRatingApps != null) __obj.updateDynamic("mediaContentRatingApps")(mediaContentRatingApps)
    if (mediaContentRatingAustralia != null) __obj.updateDynamic("mediaContentRatingAustralia")(mediaContentRatingAustralia)
    if (mediaContentRatingCanada != null) __obj.updateDynamic("mediaContentRatingCanada")(mediaContentRatingCanada)
    if (mediaContentRatingFrance != null) __obj.updateDynamic("mediaContentRatingFrance")(mediaContentRatingFrance)
    if (mediaContentRatingGermany != null) __obj.updateDynamic("mediaContentRatingGermany")(mediaContentRatingGermany)
    if (mediaContentRatingIreland != null) __obj.updateDynamic("mediaContentRatingIreland")(mediaContentRatingIreland)
    if (mediaContentRatingJapan != null) __obj.updateDynamic("mediaContentRatingJapan")(mediaContentRatingJapan)
    if (mediaContentRatingNewZealand != null) __obj.updateDynamic("mediaContentRatingNewZealand")(mediaContentRatingNewZealand)
    if (mediaContentRatingUnitedKingdom != null) __obj.updateDynamic("mediaContentRatingUnitedKingdom")(mediaContentRatingUnitedKingdom)
    if (mediaContentRatingUnitedStates != null) __obj.updateDynamic("mediaContentRatingUnitedStates")(mediaContentRatingUnitedStates)
    if (!js.isUndefined(messagesBlocked)) __obj.updateDynamic("messagesBlocked")(messagesBlocked)
    if (networkUsageRules != null) __obj.updateDynamic("networkUsageRules")(networkUsageRules)
    if (!js.isUndefined(notificationsBlockSettingsModification)) __obj.updateDynamic("notificationsBlockSettingsModification")(notificationsBlockSettingsModification)
    if (!js.isUndefined(passcodeBlockFingerprintModification)) __obj.updateDynamic("passcodeBlockFingerprintModification")(passcodeBlockFingerprintModification)
    if (!js.isUndefined(passcodeBlockFingerprintUnlock)) __obj.updateDynamic("passcodeBlockFingerprintUnlock")(passcodeBlockFingerprintUnlock)
    if (!js.isUndefined(passcodeBlockModification)) __obj.updateDynamic("passcodeBlockModification")(passcodeBlockModification)
    if (!js.isUndefined(passcodeBlockSimple)) __obj.updateDynamic("passcodeBlockSimple")(passcodeBlockSimple)
    if (passcodeExpirationDays != null) __obj.updateDynamic("passcodeExpirationDays")(passcodeExpirationDays.asInstanceOf[js.Any])
    if (passcodeMinimumCharacterSetCount != null) __obj.updateDynamic("passcodeMinimumCharacterSetCount")(passcodeMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passcodeMinimumLength != null) __obj.updateDynamic("passcodeMinimumLength")(passcodeMinimumLength.asInstanceOf[js.Any])
    if (passcodeMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeLock")(passcodeMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passcodeMinutesOfInactivityBeforeScreenTimeout != null) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeScreenTimeout")(passcodeMinutesOfInactivityBeforeScreenTimeout.asInstanceOf[js.Any])
    if (passcodePreviousPasscodeBlockCount != null) __obj.updateDynamic("passcodePreviousPasscodeBlockCount")(passcodePreviousPasscodeBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeRequired)) __obj.updateDynamic("passcodeRequired")(passcodeRequired)
    if (passcodeRequiredType != null) __obj.updateDynamic("passcodeRequiredType")(passcodeRequiredType)
    if (passcodeSignInFailureCountBeforeWipe != null) __obj.updateDynamic("passcodeSignInFailureCountBeforeWipe")(passcodeSignInFailureCountBeforeWipe.asInstanceOf[js.Any])
    if (!js.isUndefined(podcastsBlocked)) __obj.updateDynamic("podcastsBlocked")(podcastsBlocked)
    if (!js.isUndefined(safariBlockAutofill)) __obj.updateDynamic("safariBlockAutofill")(safariBlockAutofill)
    if (!js.isUndefined(safariBlockJavaScript)) __obj.updateDynamic("safariBlockJavaScript")(safariBlockJavaScript)
    if (!js.isUndefined(safariBlockPopups)) __obj.updateDynamic("safariBlockPopups")(safariBlockPopups)
    if (!js.isUndefined(safariBlocked)) __obj.updateDynamic("safariBlocked")(safariBlocked)
    if (safariCookieSettings != null) __obj.updateDynamic("safariCookieSettings")(safariCookieSettings)
    if (safariManagedDomains != null) __obj.updateDynamic("safariManagedDomains")(safariManagedDomains)
    if (safariPasswordAutoFillDomains != null) __obj.updateDynamic("safariPasswordAutoFillDomains")(safariPasswordAutoFillDomains)
    if (!js.isUndefined(safariRequireFraudWarning)) __obj.updateDynamic("safariRequireFraudWarning")(safariRequireFraudWarning)
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked)
    if (!js.isUndefined(siriBlockUserGeneratedContent)) __obj.updateDynamic("siriBlockUserGeneratedContent")(siriBlockUserGeneratedContent)
    if (!js.isUndefined(siriBlocked)) __obj.updateDynamic("siriBlocked")(siriBlocked)
    if (!js.isUndefined(siriBlockedWhenLocked)) __obj.updateDynamic("siriBlockedWhenLocked")(siriBlockedWhenLocked)
    if (!js.isUndefined(siriRequireProfanityFilter)) __obj.updateDynamic("siriRequireProfanityFilter")(siriRequireProfanityFilter)
    if (!js.isUndefined(spotlightBlockInternetResults)) __obj.updateDynamic("spotlightBlockInternetResults")(spotlightBlockInternetResults)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceDialingBlocked)) __obj.updateDynamic("voiceDialingBlocked")(voiceDialingBlocked)
    if (!js.isUndefined(wallpaperBlockModification)) __obj.updateDynamic("wallpaperBlockModification")(wallpaperBlockModification)
    if (!js.isUndefined(wiFiConnectOnlyToConfiguredNetworks)) __obj.updateDynamic("wiFiConnectOnlyToConfiguredNetworks")(wiFiConnectOnlyToConfiguredNetworks)
    __obj.asInstanceOf[IosGeneralDeviceConfiguration]
  }
}


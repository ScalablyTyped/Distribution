package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosGeneralDeviceConfiguration extends DeviceConfiguration {
  // Indicates whether or not to allow account modification when the device is in supervised mode.
  var accountBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow activation lock when the device is in the supervised mode.
  var activationLockAllowWhenSupervised: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow AirDrop when the device is in supervised mode.
  var airDropBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
  var airDropForceUnmanagedDropTarget: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
  var airPlayForcePairingPasswordForOutgoingRequests: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in
    * supervised mode (iOS 9.0 and later).
    */
  var appStoreBlockAutomaticDownloads: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from making in app purchases.
  var appStoreBlockInAppPurchases: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to
    * supervised mode only (iOS 9.0 and later).
    */
  var appStoreBlockUIAppInstallation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the App Store.
  var appStoreBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require a password when using the app store.
  var appStoreRequirePassword: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
  var appleNewsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
  var appleWatchBlockPairing: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
  var appleWatchForceWristDetection: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later.
    * This collection can contain a maximum of 500 elements.
    */
  var appsSingleAppModeList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled
    * by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
    */
  var appsVisibilityList: js.UndefOr[js.Array[AppListItem]] = js.native
  // Type of list that is in the AppsVisibilityList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var appsVisibilityListType: js.UndefOr[AppListType] = js.native
  /**
    * Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0
    * and later).
    */
  var bluetoothBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from accessing the camera of the device.
  var cameraBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block data roaming.
  var cellularBlockDataRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block global background fetch while roaming.
  var cellularBlockGlobalBackgroundFetchWhileRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
  var cellularBlockPerAppDataModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Personal Hotspot.
  var cellularBlockPersonalHotspot: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice roaming.
  var cellularBlockVoiceRoaming: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block untrusted TLS certificates.
  var certificatesBlockUntrustedTlsCertificates: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS
    * 9.3 and later).
    */
  var classroomAppBlockRemoteScreenObservation: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to
    * view a student's screen without prompting when the device is in supervised mode.
    */
  var classroomAppForceUnpromptedScreenObservation: js.UndefOr[Boolean] = js.native
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.native
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.native
  /**
    * Indicates whether or not to block the user from installing configuration profiles and certificates interactively when
    * the device is in supervised mode.
    */
  var configurationProfileBlockChanges: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
  var definitionLookupBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in
    * supervised mode.
    */
  var deviceBlockEnableRestrictions: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device
    * is in supervised mode.
    */
  var deviceBlockEraseContentAndSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
  var deviceBlockNameModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode
    * (iOS 9.3.2 and later).
    */
  var diagnosticDataBlockSubmissionModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
  var documentsBlockManagedDocumentsInUnmanagedApps: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
  var documentsBlockUnmanagedDocumentsInManagedApps: js.UndefOr[Boolean] = js.native
  // An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
  var emailInDomainSuffixes: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to block the user from trusting an enterprise app.
  var enterpriseAppBlockTrust: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from modifying the enterprise app trust settings.
  var enterpriseAppBlockTrustModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using FaceTime.
  var faceTimeBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Find My Friends when the device is in supervised mode.
  var findMyFriendsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
  var gameCenterBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from having friends in Game Center.
  var gamingBlockGameCenterFriends: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using multiplayer gaming.
  var gamingBlockMultiplayer: js.UndefOr[Boolean] = js.native
  /**
    * indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device
    * is in supervised mode.
    */
  var hostPairingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
  var iBooksStoreBlockErotica: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
  var iBooksStoreBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS
    * device.
    */
  var iCloudBlockActivityContinuation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud backup.
  var iCloudBlockBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud document sync.
  var iCloudBlockDocumentSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Managed Apps Cloud Sync.
  var iCloudBlockManagedAppsSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud Photo Library.
  var iCloudBlockPhotoLibrary: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block iCloud Photo Stream Sync.
  var iCloudBlockPhotoStreamSync: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Shared Photo Stream.
  var iCloudBlockSharedPhotoStream: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require backups to iCloud be encrypted.
  var iCloudRequireEncryptedBackup: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store.
  var iTunesBlockExplicitContent: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised
    * mode (iOS 9.3 and later and macOS 10.12 and later).
    */
  var iTunesBlockMusicService: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and
    * later).
    */
  var iTunesBlockRadio: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockAutoCorrect: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
  var keyboardBlockDictation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockPredictive: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
  var keyboardBlockShortcuts: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
  var keyboardBlockSpellCheck: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow assistive speak while in kiosk mode.
  var kioskModeAllowAssistiveSpeak: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
  var kioskModeAllowAssistiveTouchSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow device auto lock while in kiosk mode.
  var kioskModeAllowAutoLock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
  var kioskModeAllowColorInversionSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the ringer switch while in kiosk mode.
  var kioskModeAllowRingerSwitch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow screen rotation while in kiosk mode.
  var kioskModeAllowScreenRotation: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the sleep button while in kiosk mode.
  var kioskModeAllowSleepButton: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the touchscreen while in kiosk mode.
  var kioskModeAllowTouchscreen: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the voice over settings while in kiosk mode.
  var kioskModeAllowVoiceOverSettings: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow use of the volume buttons while in kiosk mode.
  var kioskModeAllowVolumeButtons: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow access to the zoom settings while in kiosk mode.
  var kioskModeAllowZoomSettings: js.UndefOr[Boolean] = js.native
  // URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
  var kioskModeAppStoreUrl: js.UndefOr[String] = js.native
  // ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
  var kioskModeBuiltInAppId: js.UndefOr[String] = js.native
  /**
    * Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will
    * be ignored.
    */
  var kioskModeManagedAppId: js.UndefOr[String] = js.native
  // Indicates whether or not to require assistive touch while in kiosk mode.
  var kioskModeRequireAssistiveTouch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require color inversion while in kiosk mode.
  var kioskModeRequireColorInversion: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require mono audio while in kiosk mode.
  var kioskModeRequireMonoAudio: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require voice over while in kiosk mode.
  var kioskModeRequireVoiceOver: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to require zoom while in kiosk mode.
  var kioskModeRequireZoom: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using control center on the lock screen.
  var lockScreenBlockControlCenter: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the notification view on the lock screen.
  var lockScreenBlockNotificationView: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using passbook when the device is locked.
  var lockScreenBlockPassbook: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using the Today View on the lock screen.
  var lockScreenBlockTodayView: js.UndefOr[Boolean] = js.native
  /**
    * Media content rating settings for Apps. Possible values are: allAllowed, allBlocked, agesAbove4, agesAbove9,
    * agesAbove12, agesAbove17.
    */
  var mediaContentRatingApps: js.UndefOr[RatingAppsType] = js.native
  // Media content rating settings for Australia
  var mediaContentRatingAustralia: js.UndefOr[MediaContentRatingAustralia] = js.native
  // Media content rating settings for Canada
  var mediaContentRatingCanada: js.UndefOr[MediaContentRatingCanada] = js.native
  // Media content rating settings for France
  var mediaContentRatingFrance: js.UndefOr[MediaContentRatingFrance] = js.native
  // Media content rating settings for Germany
  var mediaContentRatingGermany: js.UndefOr[MediaContentRatingGermany] = js.native
  // Media content rating settings for Ireland
  var mediaContentRatingIreland: js.UndefOr[MediaContentRatingIreland] = js.native
  // Media content rating settings for Japan
  var mediaContentRatingJapan: js.UndefOr[MediaContentRatingJapan] = js.native
  // Media content rating settings for New Zealand
  var mediaContentRatingNewZealand: js.UndefOr[MediaContentRatingNewZealand] = js.native
  // Media content rating settings for United Kingdom
  var mediaContentRatingUnitedKingdom: js.UndefOr[MediaContentRatingUnitedKingdom] = js.native
  // Media content rating settings for United States
  var mediaContentRatingUnitedStates: js.UndefOr[MediaContentRatingUnitedStates] = js.native
  // Indicates whether or not to block the user from using the Messages app on the supervised device.
  var messagesBlocked: js.UndefOr[Boolean] = js.native
  /**
    * List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000
    * elements.
    */
  var networkUsageRules: js.UndefOr[js.Array[IosNetworkUsageRule]] = js.native
  // Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
  var notificationsBlockSettingsModification: js.UndefOr[Boolean] = js.native
  // Block modification of registered Touch ID fingerprints when in supervised mode.
  var passcodeBlockFingerprintModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block fingerprint unlock.
  var passcodeBlockFingerprintUnlock: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
  var passcodeBlockModification: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block simple passcodes.
  var passcodeBlockSimple: js.UndefOr[Boolean] = js.native
  // Number of days before the passcode expires. Valid values 1 to 65535
  var passcodeExpirationDays: js.UndefOr[Double] = js.native
  // Number of character sets a passcode must contain. Valid values 0 to 4
  var passcodeMinimumCharacterSetCount: js.UndefOr[Double] = js.native
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[Double] = js.native
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[Double] = js.native
  // Minutes of inactivity before the screen times out.
  var passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.native
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[Double] = js.native
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.native
  // Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.native
  // Number of sign in failures allowed before wiping the device. Valid values 4 to 11
  var passcodeSignInFailureCountBeforeWipe: js.UndefOr[Double] = js.native
  // Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
  var podcastsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Auto fill in Safari.
  var safariBlockAutofill: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block JavaScript in Safari.
  var safariBlockJavaScript: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block popups in Safari.
  var safariBlockPopups: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Safari.
  var safariBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Cookie settings for Safari. Possible values are: browserDefault, blockAlways, allowCurrentWebSite,
    * allowFromWebsitesVisited, allowAlways.
    */
  var safariCookieSettings: js.UndefOr[WebBrowserCookieSettings] = js.native
  // URLs matching the patterns listed here will be considered managed.
  var safariManagedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised
    * mode (iOS 9.3 and later).
    */
  var safariPasswordAutoFillDomains: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to require fraud warning in Safari.
  var safariRequireFraudWarning: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from taking Screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
  var siriBlockUserGeneratedContent: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Siri.
  var siriBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block the user from using Siri when locked.
  var siriBlockedWhenLocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
  var siriRequireProfanityFilter: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block Spotlight search from returning internet results on supervised device.
  var spotlightBlockInternetResults: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to block voice dialing.
  var voiceDialingBlocked: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
  var wallpaperBlockModification: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is
    * in supervised mode.
    */
  var wiFiConnectOnlyToConfiguredNetworks: js.UndefOr[Boolean] = js.native
}

object IosGeneralDeviceConfiguration {
  @scala.inline
  def apply(): IosGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosGeneralDeviceConfiguration]
  }
  @scala.inline
  implicit class IosGeneralDeviceConfigurationOps[Self <: IosGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
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
    def setAccountBlockModification(value: Boolean): Self = this.set("accountBlockModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountBlockModification: Self = this.set("accountBlockModification", js.undefined)
    @scala.inline
    def setActivationLockAllowWhenSupervised(value: Boolean): Self = this.set("activationLockAllowWhenSupervised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationLockAllowWhenSupervised: Self = this.set("activationLockAllowWhenSupervised", js.undefined)
    @scala.inline
    def setAirDropBlocked(value: Boolean): Self = this.set("airDropBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAirDropBlocked: Self = this.set("airDropBlocked", js.undefined)
    @scala.inline
    def setAirDropForceUnmanagedDropTarget(value: Boolean): Self = this.set("airDropForceUnmanagedDropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAirDropForceUnmanagedDropTarget: Self = this.set("airDropForceUnmanagedDropTarget", js.undefined)
    @scala.inline
    def setAirPlayForcePairingPasswordForOutgoingRequests(value: Boolean): Self = this.set("airPlayForcePairingPasswordForOutgoingRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAirPlayForcePairingPasswordForOutgoingRequests: Self = this.set("airPlayForcePairingPasswordForOutgoingRequests", js.undefined)
    @scala.inline
    def setAppStoreBlockAutomaticDownloads(value: Boolean): Self = this.set("appStoreBlockAutomaticDownloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreBlockAutomaticDownloads: Self = this.set("appStoreBlockAutomaticDownloads", js.undefined)
    @scala.inline
    def setAppStoreBlockInAppPurchases(value: Boolean): Self = this.set("appStoreBlockInAppPurchases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreBlockInAppPurchases: Self = this.set("appStoreBlockInAppPurchases", js.undefined)
    @scala.inline
    def setAppStoreBlockUIAppInstallation(value: Boolean): Self = this.set("appStoreBlockUIAppInstallation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreBlockUIAppInstallation: Self = this.set("appStoreBlockUIAppInstallation", js.undefined)
    @scala.inline
    def setAppStoreBlocked(value: Boolean): Self = this.set("appStoreBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreBlocked: Self = this.set("appStoreBlocked", js.undefined)
    @scala.inline
    def setAppStoreRequirePassword(value: Boolean): Self = this.set("appStoreRequirePassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppStoreRequirePassword: Self = this.set("appStoreRequirePassword", js.undefined)
    @scala.inline
    def setAppleNewsBlocked(value: Boolean): Self = this.set("appleNewsBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleNewsBlocked: Self = this.set("appleNewsBlocked", js.undefined)
    @scala.inline
    def setAppleWatchBlockPairing(value: Boolean): Self = this.set("appleWatchBlockPairing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleWatchBlockPairing: Self = this.set("appleWatchBlockPairing", js.undefined)
    @scala.inline
    def setAppleWatchForceWristDetection(value: Boolean): Self = this.set("appleWatchForceWristDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleWatchForceWristDetection: Self = this.set("appleWatchForceWristDetection", js.undefined)
    @scala.inline
    def setAppsSingleAppModeListVarargs(value: AppListItem*): Self = this.set("appsSingleAppModeList", js.Array(value :_*))
    @scala.inline
    def setAppsSingleAppModeList(value: js.Array[AppListItem]): Self = this.set("appsSingleAppModeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsSingleAppModeList: Self = this.set("appsSingleAppModeList", js.undefined)
    @scala.inline
    def setAppsVisibilityListVarargs(value: AppListItem*): Self = this.set("appsVisibilityList", js.Array(value :_*))
    @scala.inline
    def setAppsVisibilityList(value: js.Array[AppListItem]): Self = this.set("appsVisibilityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsVisibilityList: Self = this.set("appsVisibilityList", js.undefined)
    @scala.inline
    def setAppsVisibilityListType(value: AppListType): Self = this.set("appsVisibilityListType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsVisibilityListType: Self = this.set("appsVisibilityListType", js.undefined)
    @scala.inline
    def setBluetoothBlockModification(value: Boolean): Self = this.set("bluetoothBlockModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBluetoothBlockModification: Self = this.set("bluetoothBlockModification", js.undefined)
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = this.set("cameraBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraBlocked: Self = this.set("cameraBlocked", js.undefined)
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = this.set("cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockDataRoaming: Self = this.set("cellularBlockDataRoaming", js.undefined)
    @scala.inline
    def setCellularBlockGlobalBackgroundFetchWhileRoaming(value: Boolean): Self = this.set("cellularBlockGlobalBackgroundFetchWhileRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockGlobalBackgroundFetchWhileRoaming: Self = this.set("cellularBlockGlobalBackgroundFetchWhileRoaming", js.undefined)
    @scala.inline
    def setCellularBlockPerAppDataModification(value: Boolean): Self = this.set("cellularBlockPerAppDataModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockPerAppDataModification: Self = this.set("cellularBlockPerAppDataModification", js.undefined)
    @scala.inline
    def setCellularBlockPersonalHotspot(value: Boolean): Self = this.set("cellularBlockPersonalHotspot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockPersonalHotspot: Self = this.set("cellularBlockPersonalHotspot", js.undefined)
    @scala.inline
    def setCellularBlockVoiceRoaming(value: Boolean): Self = this.set("cellularBlockVoiceRoaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellularBlockVoiceRoaming: Self = this.set("cellularBlockVoiceRoaming", js.undefined)
    @scala.inline
    def setCertificatesBlockUntrustedTlsCertificates(value: Boolean): Self = this.set("certificatesBlockUntrustedTlsCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatesBlockUntrustedTlsCertificates: Self = this.set("certificatesBlockUntrustedTlsCertificates", js.undefined)
    @scala.inline
    def setClassroomAppBlockRemoteScreenObservation(value: Boolean): Self = this.set("classroomAppBlockRemoteScreenObservation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassroomAppBlockRemoteScreenObservation: Self = this.set("classroomAppBlockRemoteScreenObservation", js.undefined)
    @scala.inline
    def setClassroomAppForceUnpromptedScreenObservation(value: Boolean): Self = this.set("classroomAppForceUnpromptedScreenObservation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassroomAppForceUnpromptedScreenObservation: Self = this.set("classroomAppForceUnpromptedScreenObservation", js.undefined)
    @scala.inline
    def setCompliantAppListType(value: AppListType): Self = this.set("compliantAppListType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantAppListType: Self = this.set("compliantAppListType", js.undefined)
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = this.set("compliantAppsList", js.Array(value :_*))
    @scala.inline
    def setCompliantAppsList(value: js.Array[AppListItem]): Self = this.set("compliantAppsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantAppsList: Self = this.set("compliantAppsList", js.undefined)
    @scala.inline
    def setConfigurationProfileBlockChanges(value: Boolean): Self = this.set("configurationProfileBlockChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationProfileBlockChanges: Self = this.set("configurationProfileBlockChanges", js.undefined)
    @scala.inline
    def setDefinitionLookupBlocked(value: Boolean): Self = this.set("definitionLookupBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionLookupBlocked: Self = this.set("definitionLookupBlocked", js.undefined)
    @scala.inline
    def setDeviceBlockEnableRestrictions(value: Boolean): Self = this.set("deviceBlockEnableRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceBlockEnableRestrictions: Self = this.set("deviceBlockEnableRestrictions", js.undefined)
    @scala.inline
    def setDeviceBlockEraseContentAndSettings(value: Boolean): Self = this.set("deviceBlockEraseContentAndSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceBlockEraseContentAndSettings: Self = this.set("deviceBlockEraseContentAndSettings", js.undefined)
    @scala.inline
    def setDeviceBlockNameModification(value: Boolean): Self = this.set("deviceBlockNameModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceBlockNameModification: Self = this.set("deviceBlockNameModification", js.undefined)
    @scala.inline
    def setDiagnosticDataBlockSubmission(value: Boolean): Self = this.set("diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticDataBlockSubmission: Self = this.set("diagnosticDataBlockSubmission", js.undefined)
    @scala.inline
    def setDiagnosticDataBlockSubmissionModification(value: Boolean): Self = this.set("diagnosticDataBlockSubmissionModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticDataBlockSubmissionModification: Self = this.set("diagnosticDataBlockSubmissionModification", js.undefined)
    @scala.inline
    def setDocumentsBlockManagedDocumentsInUnmanagedApps(value: Boolean): Self = this.set("documentsBlockManagedDocumentsInUnmanagedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsBlockManagedDocumentsInUnmanagedApps: Self = this.set("documentsBlockManagedDocumentsInUnmanagedApps", js.undefined)
    @scala.inline
    def setDocumentsBlockUnmanagedDocumentsInManagedApps(value: Boolean): Self = this.set("documentsBlockUnmanagedDocumentsInManagedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentsBlockUnmanagedDocumentsInManagedApps: Self = this.set("documentsBlockUnmanagedDocumentsInManagedApps", js.undefined)
    @scala.inline
    def setEmailInDomainSuffixesVarargs(value: String*): Self = this.set("emailInDomainSuffixes", js.Array(value :_*))
    @scala.inline
    def setEmailInDomainSuffixes(value: js.Array[String]): Self = this.set("emailInDomainSuffixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailInDomainSuffixes: Self = this.set("emailInDomainSuffixes", js.undefined)
    @scala.inline
    def setEnterpriseAppBlockTrust(value: Boolean): Self = this.set("enterpriseAppBlockTrust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterpriseAppBlockTrust: Self = this.set("enterpriseAppBlockTrust", js.undefined)
    @scala.inline
    def setEnterpriseAppBlockTrustModification(value: Boolean): Self = this.set("enterpriseAppBlockTrustModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterpriseAppBlockTrustModification: Self = this.set("enterpriseAppBlockTrustModification", js.undefined)
    @scala.inline
    def setFaceTimeBlocked(value: Boolean): Self = this.set("faceTimeBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceTimeBlocked: Self = this.set("faceTimeBlocked", js.undefined)
    @scala.inline
    def setFindMyFriendsBlocked(value: Boolean): Self = this.set("findMyFriendsBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindMyFriendsBlocked: Self = this.set("findMyFriendsBlocked", js.undefined)
    @scala.inline
    def setGameCenterBlocked(value: Boolean): Self = this.set("gameCenterBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameCenterBlocked: Self = this.set("gameCenterBlocked", js.undefined)
    @scala.inline
    def setGamingBlockGameCenterFriends(value: Boolean): Self = this.set("gamingBlockGameCenterFriends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamingBlockGameCenterFriends: Self = this.set("gamingBlockGameCenterFriends", js.undefined)
    @scala.inline
    def setGamingBlockMultiplayer(value: Boolean): Self = this.set("gamingBlockMultiplayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamingBlockMultiplayer: Self = this.set("gamingBlockMultiplayer", js.undefined)
    @scala.inline
    def setHostPairingBlocked(value: Boolean): Self = this.set("hostPairingBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPairingBlocked: Self = this.set("hostPairingBlocked", js.undefined)
    @scala.inline
    def setIBooksStoreBlockErotica(value: Boolean): Self = this.set("iBooksStoreBlockErotica", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIBooksStoreBlockErotica: Self = this.set("iBooksStoreBlockErotica", js.undefined)
    @scala.inline
    def setIBooksStoreBlocked(value: Boolean): Self = this.set("iBooksStoreBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIBooksStoreBlocked: Self = this.set("iBooksStoreBlocked", js.undefined)
    @scala.inline
    def setICloudBlockActivityContinuation(value: Boolean): Self = this.set("iCloudBlockActivityContinuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockActivityContinuation: Self = this.set("iCloudBlockActivityContinuation", js.undefined)
    @scala.inline
    def setICloudBlockBackup(value: Boolean): Self = this.set("iCloudBlockBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockBackup: Self = this.set("iCloudBlockBackup", js.undefined)
    @scala.inline
    def setICloudBlockDocumentSync(value: Boolean): Self = this.set("iCloudBlockDocumentSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockDocumentSync: Self = this.set("iCloudBlockDocumentSync", js.undefined)
    @scala.inline
    def setICloudBlockManagedAppsSync(value: Boolean): Self = this.set("iCloudBlockManagedAppsSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockManagedAppsSync: Self = this.set("iCloudBlockManagedAppsSync", js.undefined)
    @scala.inline
    def setICloudBlockPhotoLibrary(value: Boolean): Self = this.set("iCloudBlockPhotoLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockPhotoLibrary: Self = this.set("iCloudBlockPhotoLibrary", js.undefined)
    @scala.inline
    def setICloudBlockPhotoStreamSync(value: Boolean): Self = this.set("iCloudBlockPhotoStreamSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockPhotoStreamSync: Self = this.set("iCloudBlockPhotoStreamSync", js.undefined)
    @scala.inline
    def setICloudBlockSharedPhotoStream(value: Boolean): Self = this.set("iCloudBlockSharedPhotoStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudBlockSharedPhotoStream: Self = this.set("iCloudBlockSharedPhotoStream", js.undefined)
    @scala.inline
    def setICloudRequireEncryptedBackup(value: Boolean): Self = this.set("iCloudRequireEncryptedBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICloudRequireEncryptedBackup: Self = this.set("iCloudRequireEncryptedBackup", js.undefined)
    @scala.inline
    def setITunesBlockExplicitContent(value: Boolean): Self = this.set("iTunesBlockExplicitContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteITunesBlockExplicitContent: Self = this.set("iTunesBlockExplicitContent", js.undefined)
    @scala.inline
    def setITunesBlockMusicService(value: Boolean): Self = this.set("iTunesBlockMusicService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteITunesBlockMusicService: Self = this.set("iTunesBlockMusicService", js.undefined)
    @scala.inline
    def setITunesBlockRadio(value: Boolean): Self = this.set("iTunesBlockRadio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteITunesBlockRadio: Self = this.set("iTunesBlockRadio", js.undefined)
    @scala.inline
    def setKeyboardBlockAutoCorrect(value: Boolean): Self = this.set("keyboardBlockAutoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardBlockAutoCorrect: Self = this.set("keyboardBlockAutoCorrect", js.undefined)
    @scala.inline
    def setKeyboardBlockDictation(value: Boolean): Self = this.set("keyboardBlockDictation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardBlockDictation: Self = this.set("keyboardBlockDictation", js.undefined)
    @scala.inline
    def setKeyboardBlockPredictive(value: Boolean): Self = this.set("keyboardBlockPredictive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardBlockPredictive: Self = this.set("keyboardBlockPredictive", js.undefined)
    @scala.inline
    def setKeyboardBlockShortcuts(value: Boolean): Self = this.set("keyboardBlockShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardBlockShortcuts: Self = this.set("keyboardBlockShortcuts", js.undefined)
    @scala.inline
    def setKeyboardBlockSpellCheck(value: Boolean): Self = this.set("keyboardBlockSpellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardBlockSpellCheck: Self = this.set("keyboardBlockSpellCheck", js.undefined)
    @scala.inline
    def setKioskModeAllowAssistiveSpeak(value: Boolean): Self = this.set("kioskModeAllowAssistiveSpeak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowAssistiveSpeak: Self = this.set("kioskModeAllowAssistiveSpeak", js.undefined)
    @scala.inline
    def setKioskModeAllowAssistiveTouchSettings(value: Boolean): Self = this.set("kioskModeAllowAssistiveTouchSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowAssistiveTouchSettings: Self = this.set("kioskModeAllowAssistiveTouchSettings", js.undefined)
    @scala.inline
    def setKioskModeAllowAutoLock(value: Boolean): Self = this.set("kioskModeAllowAutoLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowAutoLock: Self = this.set("kioskModeAllowAutoLock", js.undefined)
    @scala.inline
    def setKioskModeAllowColorInversionSettings(value: Boolean): Self = this.set("kioskModeAllowColorInversionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowColorInversionSettings: Self = this.set("kioskModeAllowColorInversionSettings", js.undefined)
    @scala.inline
    def setKioskModeAllowRingerSwitch(value: Boolean): Self = this.set("kioskModeAllowRingerSwitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowRingerSwitch: Self = this.set("kioskModeAllowRingerSwitch", js.undefined)
    @scala.inline
    def setKioskModeAllowScreenRotation(value: Boolean): Self = this.set("kioskModeAllowScreenRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowScreenRotation: Self = this.set("kioskModeAllowScreenRotation", js.undefined)
    @scala.inline
    def setKioskModeAllowSleepButton(value: Boolean): Self = this.set("kioskModeAllowSleepButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowSleepButton: Self = this.set("kioskModeAllowSleepButton", js.undefined)
    @scala.inline
    def setKioskModeAllowTouchscreen(value: Boolean): Self = this.set("kioskModeAllowTouchscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowTouchscreen: Self = this.set("kioskModeAllowTouchscreen", js.undefined)
    @scala.inline
    def setKioskModeAllowVoiceOverSettings(value: Boolean): Self = this.set("kioskModeAllowVoiceOverSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowVoiceOverSettings: Self = this.set("kioskModeAllowVoiceOverSettings", js.undefined)
    @scala.inline
    def setKioskModeAllowVolumeButtons(value: Boolean): Self = this.set("kioskModeAllowVolumeButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowVolumeButtons: Self = this.set("kioskModeAllowVolumeButtons", js.undefined)
    @scala.inline
    def setKioskModeAllowZoomSettings(value: Boolean): Self = this.set("kioskModeAllowZoomSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAllowZoomSettings: Self = this.set("kioskModeAllowZoomSettings", js.undefined)
    @scala.inline
    def setKioskModeAppStoreUrl(value: String): Self = this.set("kioskModeAppStoreUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeAppStoreUrl: Self = this.set("kioskModeAppStoreUrl", js.undefined)
    @scala.inline
    def setKioskModeBuiltInAppId(value: String): Self = this.set("kioskModeBuiltInAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeBuiltInAppId: Self = this.set("kioskModeBuiltInAppId", js.undefined)
    @scala.inline
    def setKioskModeManagedAppId(value: String): Self = this.set("kioskModeManagedAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeManagedAppId: Self = this.set("kioskModeManagedAppId", js.undefined)
    @scala.inline
    def setKioskModeRequireAssistiveTouch(value: Boolean): Self = this.set("kioskModeRequireAssistiveTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeRequireAssistiveTouch: Self = this.set("kioskModeRequireAssistiveTouch", js.undefined)
    @scala.inline
    def setKioskModeRequireColorInversion(value: Boolean): Self = this.set("kioskModeRequireColorInversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeRequireColorInversion: Self = this.set("kioskModeRequireColorInversion", js.undefined)
    @scala.inline
    def setKioskModeRequireMonoAudio(value: Boolean): Self = this.set("kioskModeRequireMonoAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeRequireMonoAudio: Self = this.set("kioskModeRequireMonoAudio", js.undefined)
    @scala.inline
    def setKioskModeRequireVoiceOver(value: Boolean): Self = this.set("kioskModeRequireVoiceOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeRequireVoiceOver: Self = this.set("kioskModeRequireVoiceOver", js.undefined)
    @scala.inline
    def setKioskModeRequireZoom(value: Boolean): Self = this.set("kioskModeRequireZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKioskModeRequireZoom: Self = this.set("kioskModeRequireZoom", js.undefined)
    @scala.inline
    def setLockScreenBlockControlCenter(value: Boolean): Self = this.set("lockScreenBlockControlCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenBlockControlCenter: Self = this.set("lockScreenBlockControlCenter", js.undefined)
    @scala.inline
    def setLockScreenBlockNotificationView(value: Boolean): Self = this.set("lockScreenBlockNotificationView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenBlockNotificationView: Self = this.set("lockScreenBlockNotificationView", js.undefined)
    @scala.inline
    def setLockScreenBlockPassbook(value: Boolean): Self = this.set("lockScreenBlockPassbook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenBlockPassbook: Self = this.set("lockScreenBlockPassbook", js.undefined)
    @scala.inline
    def setLockScreenBlockTodayView(value: Boolean): Self = this.set("lockScreenBlockTodayView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScreenBlockTodayView: Self = this.set("lockScreenBlockTodayView", js.undefined)
    @scala.inline
    def setMediaContentRatingApps(value: RatingAppsType): Self = this.set("mediaContentRatingApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingApps: Self = this.set("mediaContentRatingApps", js.undefined)
    @scala.inline
    def setMediaContentRatingAustralia(value: MediaContentRatingAustralia): Self = this.set("mediaContentRatingAustralia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingAustralia: Self = this.set("mediaContentRatingAustralia", js.undefined)
    @scala.inline
    def setMediaContentRatingCanada(value: MediaContentRatingCanada): Self = this.set("mediaContentRatingCanada", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingCanada: Self = this.set("mediaContentRatingCanada", js.undefined)
    @scala.inline
    def setMediaContentRatingFrance(value: MediaContentRatingFrance): Self = this.set("mediaContentRatingFrance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingFrance: Self = this.set("mediaContentRatingFrance", js.undefined)
    @scala.inline
    def setMediaContentRatingGermany(value: MediaContentRatingGermany): Self = this.set("mediaContentRatingGermany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingGermany: Self = this.set("mediaContentRatingGermany", js.undefined)
    @scala.inline
    def setMediaContentRatingIreland(value: MediaContentRatingIreland): Self = this.set("mediaContentRatingIreland", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingIreland: Self = this.set("mediaContentRatingIreland", js.undefined)
    @scala.inline
    def setMediaContentRatingJapan(value: MediaContentRatingJapan): Self = this.set("mediaContentRatingJapan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingJapan: Self = this.set("mediaContentRatingJapan", js.undefined)
    @scala.inline
    def setMediaContentRatingNewZealand(value: MediaContentRatingNewZealand): Self = this.set("mediaContentRatingNewZealand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingNewZealand: Self = this.set("mediaContentRatingNewZealand", js.undefined)
    @scala.inline
    def setMediaContentRatingUnitedKingdom(value: MediaContentRatingUnitedKingdom): Self = this.set("mediaContentRatingUnitedKingdom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingUnitedKingdom: Self = this.set("mediaContentRatingUnitedKingdom", js.undefined)
    @scala.inline
    def setMediaContentRatingUnitedStates(value: MediaContentRatingUnitedStates): Self = this.set("mediaContentRatingUnitedStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaContentRatingUnitedStates: Self = this.set("mediaContentRatingUnitedStates", js.undefined)
    @scala.inline
    def setMessagesBlocked(value: Boolean): Self = this.set("messagesBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesBlocked: Self = this.set("messagesBlocked", js.undefined)
    @scala.inline
    def setNetworkUsageRulesVarargs(value: IosNetworkUsageRule*): Self = this.set("networkUsageRules", js.Array(value :_*))
    @scala.inline
    def setNetworkUsageRules(value: js.Array[IosNetworkUsageRule]): Self = this.set("networkUsageRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkUsageRules: Self = this.set("networkUsageRules", js.undefined)
    @scala.inline
    def setNotificationsBlockSettingsModification(value: Boolean): Self = this.set("notificationsBlockSettingsModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationsBlockSettingsModification: Self = this.set("notificationsBlockSettingsModification", js.undefined)
    @scala.inline
    def setPasscodeBlockFingerprintModification(value: Boolean): Self = this.set("passcodeBlockFingerprintModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeBlockFingerprintModification: Self = this.set("passcodeBlockFingerprintModification", js.undefined)
    @scala.inline
    def setPasscodeBlockFingerprintUnlock(value: Boolean): Self = this.set("passcodeBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeBlockFingerprintUnlock: Self = this.set("passcodeBlockFingerprintUnlock", js.undefined)
    @scala.inline
    def setPasscodeBlockModification(value: Boolean): Self = this.set("passcodeBlockModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeBlockModification: Self = this.set("passcodeBlockModification", js.undefined)
    @scala.inline
    def setPasscodeBlockSimple(value: Boolean): Self = this.set("passcodeBlockSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeBlockSimple: Self = this.set("passcodeBlockSimple", js.undefined)
    @scala.inline
    def setPasscodeExpirationDays(value: Double): Self = this.set("passcodeExpirationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeExpirationDays: Self = this.set("passcodeExpirationDays", js.undefined)
    @scala.inline
    def setPasscodeMinimumCharacterSetCount(value: Double): Self = this.set("passcodeMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinimumCharacterSetCount: Self = this.set("passcodeMinimumCharacterSetCount", js.undefined)
    @scala.inline
    def setPasscodeMinimumLength(value: Double): Self = this.set("passcodeMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinimumLength: Self = this.set("passcodeMinimumLength", js.undefined)
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLock(value: Double): Self = this.set("passcodeMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinutesOfInactivityBeforeLock: Self = this.set("passcodeMinutesOfInactivityBeforeLock", js.undefined)
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeScreenTimeout(value: Double): Self = this.set("passcodeMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeMinutesOfInactivityBeforeScreenTimeout: Self = this.set("passcodeMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    @scala.inline
    def setPasscodePreviousPasscodeBlockCount(value: Double): Self = this.set("passcodePreviousPasscodeBlockCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodePreviousPasscodeBlockCount: Self = this.set("passcodePreviousPasscodeBlockCount", js.undefined)
    @scala.inline
    def setPasscodeRequired(value: Boolean): Self = this.set("passcodeRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeRequired: Self = this.set("passcodeRequired", js.undefined)
    @scala.inline
    def setPasscodeRequiredType(value: RequiredPasswordType): Self = this.set("passcodeRequiredType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeRequiredType: Self = this.set("passcodeRequiredType", js.undefined)
    @scala.inline
    def setPasscodeSignInFailureCountBeforeWipe(value: Double): Self = this.set("passcodeSignInFailureCountBeforeWipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasscodeSignInFailureCountBeforeWipe: Self = this.set("passcodeSignInFailureCountBeforeWipe", js.undefined)
    @scala.inline
    def setPodcastsBlocked(value: Boolean): Self = this.set("podcastsBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePodcastsBlocked: Self = this.set("podcastsBlocked", js.undefined)
    @scala.inline
    def setSafariBlockAutofill(value: Boolean): Self = this.set("safariBlockAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariBlockAutofill: Self = this.set("safariBlockAutofill", js.undefined)
    @scala.inline
    def setSafariBlockJavaScript(value: Boolean): Self = this.set("safariBlockJavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariBlockJavaScript: Self = this.set("safariBlockJavaScript", js.undefined)
    @scala.inline
    def setSafariBlockPopups(value: Boolean): Self = this.set("safariBlockPopups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariBlockPopups: Self = this.set("safariBlockPopups", js.undefined)
    @scala.inline
    def setSafariBlocked(value: Boolean): Self = this.set("safariBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariBlocked: Self = this.set("safariBlocked", js.undefined)
    @scala.inline
    def setSafariCookieSettings(value: WebBrowserCookieSettings): Self = this.set("safariCookieSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariCookieSettings: Self = this.set("safariCookieSettings", js.undefined)
    @scala.inline
    def setSafariManagedDomainsVarargs(value: String*): Self = this.set("safariManagedDomains", js.Array(value :_*))
    @scala.inline
    def setSafariManagedDomains(value: js.Array[String]): Self = this.set("safariManagedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariManagedDomains: Self = this.set("safariManagedDomains", js.undefined)
    @scala.inline
    def setSafariPasswordAutoFillDomainsVarargs(value: String*): Self = this.set("safariPasswordAutoFillDomains", js.Array(value :_*))
    @scala.inline
    def setSafariPasswordAutoFillDomains(value: js.Array[String]): Self = this.set("safariPasswordAutoFillDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariPasswordAutoFillDomains: Self = this.set("safariPasswordAutoFillDomains", js.undefined)
    @scala.inline
    def setSafariRequireFraudWarning(value: Boolean): Self = this.set("safariRequireFraudWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariRequireFraudWarning: Self = this.set("safariRequireFraudWarning", js.undefined)
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
    @scala.inline
    def setSiriBlockUserGeneratedContent(value: Boolean): Self = this.set("siriBlockUserGeneratedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiriBlockUserGeneratedContent: Self = this.set("siriBlockUserGeneratedContent", js.undefined)
    @scala.inline
    def setSiriBlocked(value: Boolean): Self = this.set("siriBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiriBlocked: Self = this.set("siriBlocked", js.undefined)
    @scala.inline
    def setSiriBlockedWhenLocked(value: Boolean): Self = this.set("siriBlockedWhenLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiriBlockedWhenLocked: Self = this.set("siriBlockedWhenLocked", js.undefined)
    @scala.inline
    def setSiriRequireProfanityFilter(value: Boolean): Self = this.set("siriRequireProfanityFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiriRequireProfanityFilter: Self = this.set("siriRequireProfanityFilter", js.undefined)
    @scala.inline
    def setSpotlightBlockInternetResults(value: Boolean): Self = this.set("spotlightBlockInternetResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotlightBlockInternetResults: Self = this.set("spotlightBlockInternetResults", js.undefined)
    @scala.inline
    def setVoiceDialingBlocked(value: Boolean): Self = this.set("voiceDialingBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceDialingBlocked: Self = this.set("voiceDialingBlocked", js.undefined)
    @scala.inline
    def setWallpaperBlockModification(value: Boolean): Self = this.set("wallpaperBlockModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWallpaperBlockModification: Self = this.set("wallpaperBlockModification", js.undefined)
    @scala.inline
    def setWiFiConnectOnlyToConfiguredNetworks(value: Boolean): Self = this.set("wiFiConnectOnlyToConfiguredNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWiFiConnectOnlyToConfiguredNetworks: Self = this.set("wiFiConnectOnlyToConfiguredNetworks", js.undefined)
  }
  
}


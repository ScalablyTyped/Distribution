package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosGeneralDeviceConfiguration
  extends StObject
     with DeviceConfiguration {
  
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
  var appsSingleAppModeList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
  /**
    * List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled
    * by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
    */
  var appsVisibilityList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
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
  var compliantAppsList: js.UndefOr[NullableOption[js.Array[AppListItem]]] = js.undefined
  
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
  var emailInDomainSuffixes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
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
  var kioskModeAppStoreUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
  var kioskModeBuiltInAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will
    * be ignored.
    */
  var kioskModeManagedAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
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
  var mediaContentRatingAustralia: js.UndefOr[NullableOption[MediaContentRatingAustralia]] = js.undefined
  
  // Media content rating settings for Canada
  var mediaContentRatingCanada: js.UndefOr[NullableOption[MediaContentRatingCanada]] = js.undefined
  
  // Media content rating settings for France
  var mediaContentRatingFrance: js.UndefOr[NullableOption[MediaContentRatingFrance]] = js.undefined
  
  // Media content rating settings for Germany
  var mediaContentRatingGermany: js.UndefOr[NullableOption[MediaContentRatingGermany]] = js.undefined
  
  // Media content rating settings for Ireland
  var mediaContentRatingIreland: js.UndefOr[NullableOption[MediaContentRatingIreland]] = js.undefined
  
  // Media content rating settings for Japan
  var mediaContentRatingJapan: js.UndefOr[NullableOption[MediaContentRatingJapan]] = js.undefined
  
  // Media content rating settings for New Zealand
  var mediaContentRatingNewZealand: js.UndefOr[NullableOption[MediaContentRatingNewZealand]] = js.undefined
  
  // Media content rating settings for United Kingdom
  var mediaContentRatingUnitedKingdom: js.UndefOr[NullableOption[MediaContentRatingUnitedKingdom]] = js.undefined
  
  // Media content rating settings for United States
  var mediaContentRatingUnitedStates: js.UndefOr[NullableOption[MediaContentRatingUnitedStates]] = js.undefined
  
  // Indicates whether or not to block the user from using the Messages app on the supervised device.
  var messagesBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000
    * elements.
    */
  var networkUsageRules: js.UndefOr[NullableOption[js.Array[IosNetworkUsageRule]]] = js.undefined
  
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
  var passcodeExpirationDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of character sets a passcode must contain. Valid values 0 to 4
  var passcodeMinimumCharacterSetCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minimum length of passcode. Valid values 4 to 14
  var passcodeMinimumLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before a passcode is required.
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Minutes of inactivity before the screen times out.
  var passcodeMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of previous passcodes to block. Valid values 1 to 24
  var passcodePreviousPasscodeBlockCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether or not to require a passcode.
  var passcodeRequired: js.UndefOr[Boolean] = js.undefined
  
  // Type of passcode that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  
  // Number of sign in failures allowed before wiping the device. Valid values 4 to 11
  var passcodeSignInFailureCountBeforeWipe: js.UndefOr[NullableOption[Double]] = js.undefined
  
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
  var safariManagedDomains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised
    * mode (iOS 9.3 and later).
    */
  var safariPasswordAutoFillDomains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
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
  def apply(): IosGeneralDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosGeneralDeviceConfiguration]
  }
  
  @scala.inline
  implicit class IosGeneralDeviceConfigurationMutableBuilder[Self <: IosGeneralDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountBlockModification(value: Boolean): Self = StObject.set(x, "accountBlockModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountBlockModificationUndefined: Self = StObject.set(x, "accountBlockModification", js.undefined)
    
    @scala.inline
    def setActivationLockAllowWhenSupervised(value: Boolean): Self = StObject.set(x, "activationLockAllowWhenSupervised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationLockAllowWhenSupervisedUndefined: Self = StObject.set(x, "activationLockAllowWhenSupervised", js.undefined)
    
    @scala.inline
    def setAirDropBlocked(value: Boolean): Self = StObject.set(x, "airDropBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirDropBlockedUndefined: Self = StObject.set(x, "airDropBlocked", js.undefined)
    
    @scala.inline
    def setAirDropForceUnmanagedDropTarget(value: Boolean): Self = StObject.set(x, "airDropForceUnmanagedDropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirDropForceUnmanagedDropTargetUndefined: Self = StObject.set(x, "airDropForceUnmanagedDropTarget", js.undefined)
    
    @scala.inline
    def setAirPlayForcePairingPasswordForOutgoingRequests(value: Boolean): Self = StObject.set(x, "airPlayForcePairingPasswordForOutgoingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAirPlayForcePairingPasswordForOutgoingRequestsUndefined: Self = StObject.set(x, "airPlayForcePairingPasswordForOutgoingRequests", js.undefined)
    
    @scala.inline
    def setAppStoreBlockAutomaticDownloads(value: Boolean): Self = StObject.set(x, "appStoreBlockAutomaticDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreBlockAutomaticDownloadsUndefined: Self = StObject.set(x, "appStoreBlockAutomaticDownloads", js.undefined)
    
    @scala.inline
    def setAppStoreBlockInAppPurchases(value: Boolean): Self = StObject.set(x, "appStoreBlockInAppPurchases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreBlockInAppPurchasesUndefined: Self = StObject.set(x, "appStoreBlockInAppPurchases", js.undefined)
    
    @scala.inline
    def setAppStoreBlockUIAppInstallation(value: Boolean): Self = StObject.set(x, "appStoreBlockUIAppInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreBlockUIAppInstallationUndefined: Self = StObject.set(x, "appStoreBlockUIAppInstallation", js.undefined)
    
    @scala.inline
    def setAppStoreBlocked(value: Boolean): Self = StObject.set(x, "appStoreBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreBlockedUndefined: Self = StObject.set(x, "appStoreBlocked", js.undefined)
    
    @scala.inline
    def setAppStoreRequirePassword(value: Boolean): Self = StObject.set(x, "appStoreRequirePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreRequirePasswordUndefined: Self = StObject.set(x, "appStoreRequirePassword", js.undefined)
    
    @scala.inline
    def setAppleNewsBlocked(value: Boolean): Self = StObject.set(x, "appleNewsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleNewsBlockedUndefined: Self = StObject.set(x, "appleNewsBlocked", js.undefined)
    
    @scala.inline
    def setAppleWatchBlockPairing(value: Boolean): Self = StObject.set(x, "appleWatchBlockPairing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleWatchBlockPairingUndefined: Self = StObject.set(x, "appleWatchBlockPairing", js.undefined)
    
    @scala.inline
    def setAppleWatchForceWristDetection(value: Boolean): Self = StObject.set(x, "appleWatchForceWristDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleWatchForceWristDetectionUndefined: Self = StObject.set(x, "appleWatchForceWristDetection", js.undefined)
    
    @scala.inline
    def setAppsSingleAppModeList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsSingleAppModeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsSingleAppModeListNull: Self = StObject.set(x, "appsSingleAppModeList", null)
    
    @scala.inline
    def setAppsSingleAppModeListUndefined: Self = StObject.set(x, "appsSingleAppModeList", js.undefined)
    
    @scala.inline
    def setAppsSingleAppModeListVarargs(value: AppListItem*): Self = StObject.set(x, "appsSingleAppModeList", js.Array(value :_*))
    
    @scala.inline
    def setAppsVisibilityList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "appsVisibilityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsVisibilityListNull: Self = StObject.set(x, "appsVisibilityList", null)
    
    @scala.inline
    def setAppsVisibilityListType(value: AppListType): Self = StObject.set(x, "appsVisibilityListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsVisibilityListTypeUndefined: Self = StObject.set(x, "appsVisibilityListType", js.undefined)
    
    @scala.inline
    def setAppsVisibilityListUndefined: Self = StObject.set(x, "appsVisibilityList", js.undefined)
    
    @scala.inline
    def setAppsVisibilityListVarargs(value: AppListItem*): Self = StObject.set(x, "appsVisibilityList", js.Array(value :_*))
    
    @scala.inline
    def setBluetoothBlockModification(value: Boolean): Self = StObject.set(x, "bluetoothBlockModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothBlockModificationUndefined: Self = StObject.set(x, "bluetoothBlockModification", js.undefined)
    
    @scala.inline
    def setCameraBlocked(value: Boolean): Self = StObject.set(x, "cameraBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraBlockedUndefined: Self = StObject.set(x, "cameraBlocked", js.undefined)
    
    @scala.inline
    def setCellularBlockDataRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockDataRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockDataRoamingUndefined: Self = StObject.set(x, "cellularBlockDataRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockGlobalBackgroundFetchWhileRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockGlobalBackgroundFetchWhileRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockGlobalBackgroundFetchWhileRoamingUndefined: Self = StObject.set(x, "cellularBlockGlobalBackgroundFetchWhileRoaming", js.undefined)
    
    @scala.inline
    def setCellularBlockPerAppDataModification(value: Boolean): Self = StObject.set(x, "cellularBlockPerAppDataModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockPerAppDataModificationUndefined: Self = StObject.set(x, "cellularBlockPerAppDataModification", js.undefined)
    
    @scala.inline
    def setCellularBlockPersonalHotspot(value: Boolean): Self = StObject.set(x, "cellularBlockPersonalHotspot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockPersonalHotspotUndefined: Self = StObject.set(x, "cellularBlockPersonalHotspot", js.undefined)
    
    @scala.inline
    def setCellularBlockVoiceRoaming(value: Boolean): Self = StObject.set(x, "cellularBlockVoiceRoaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellularBlockVoiceRoamingUndefined: Self = StObject.set(x, "cellularBlockVoiceRoaming", js.undefined)
    
    @scala.inline
    def setCertificatesBlockUntrustedTlsCertificates(value: Boolean): Self = StObject.set(x, "certificatesBlockUntrustedTlsCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesBlockUntrustedTlsCertificatesUndefined: Self = StObject.set(x, "certificatesBlockUntrustedTlsCertificates", js.undefined)
    
    @scala.inline
    def setClassroomAppBlockRemoteScreenObservation(value: Boolean): Self = StObject.set(x, "classroomAppBlockRemoteScreenObservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassroomAppBlockRemoteScreenObservationUndefined: Self = StObject.set(x, "classroomAppBlockRemoteScreenObservation", js.undefined)
    
    @scala.inline
    def setClassroomAppForceUnpromptedScreenObservation(value: Boolean): Self = StObject.set(x, "classroomAppForceUnpromptedScreenObservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassroomAppForceUnpromptedScreenObservationUndefined: Self = StObject.set(x, "classroomAppForceUnpromptedScreenObservation", js.undefined)
    
    @scala.inline
    def setCompliantAppListType(value: AppListType): Self = StObject.set(x, "compliantAppListType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppListTypeUndefined: Self = StObject.set(x, "compliantAppListType", js.undefined)
    
    @scala.inline
    def setCompliantAppsList(value: NullableOption[js.Array[AppListItem]]): Self = StObject.set(x, "compliantAppsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompliantAppsListNull: Self = StObject.set(x, "compliantAppsList", null)
    
    @scala.inline
    def setCompliantAppsListUndefined: Self = StObject.set(x, "compliantAppsList", js.undefined)
    
    @scala.inline
    def setCompliantAppsListVarargs(value: AppListItem*): Self = StObject.set(x, "compliantAppsList", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationProfileBlockChanges(value: Boolean): Self = StObject.set(x, "configurationProfileBlockChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileBlockChangesUndefined: Self = StObject.set(x, "configurationProfileBlockChanges", js.undefined)
    
    @scala.inline
    def setDefinitionLookupBlocked(value: Boolean): Self = StObject.set(x, "definitionLookupBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionLookupBlockedUndefined: Self = StObject.set(x, "definitionLookupBlocked", js.undefined)
    
    @scala.inline
    def setDeviceBlockEnableRestrictions(value: Boolean): Self = StObject.set(x, "deviceBlockEnableRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceBlockEnableRestrictionsUndefined: Self = StObject.set(x, "deviceBlockEnableRestrictions", js.undefined)
    
    @scala.inline
    def setDeviceBlockEraseContentAndSettings(value: Boolean): Self = StObject.set(x, "deviceBlockEraseContentAndSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceBlockEraseContentAndSettingsUndefined: Self = StObject.set(x, "deviceBlockEraseContentAndSettings", js.undefined)
    
    @scala.inline
    def setDeviceBlockNameModification(value: Boolean): Self = StObject.set(x, "deviceBlockNameModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceBlockNameModificationUndefined: Self = StObject.set(x, "deviceBlockNameModification", js.undefined)
    
    @scala.inline
    def setDiagnosticDataBlockSubmission(value: Boolean): Self = StObject.set(x, "diagnosticDataBlockSubmission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticDataBlockSubmissionModification(value: Boolean): Self = StObject.set(x, "diagnosticDataBlockSubmissionModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticDataBlockSubmissionModificationUndefined: Self = StObject.set(x, "diagnosticDataBlockSubmissionModification", js.undefined)
    
    @scala.inline
    def setDiagnosticDataBlockSubmissionUndefined: Self = StObject.set(x, "diagnosticDataBlockSubmission", js.undefined)
    
    @scala.inline
    def setDocumentsBlockManagedDocumentsInUnmanagedApps(value: Boolean): Self = StObject.set(x, "documentsBlockManagedDocumentsInUnmanagedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsBlockManagedDocumentsInUnmanagedAppsUndefined: Self = StObject.set(x, "documentsBlockManagedDocumentsInUnmanagedApps", js.undefined)
    
    @scala.inline
    def setDocumentsBlockUnmanagedDocumentsInManagedApps(value: Boolean): Self = StObject.set(x, "documentsBlockUnmanagedDocumentsInManagedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsBlockUnmanagedDocumentsInManagedAppsUndefined: Self = StObject.set(x, "documentsBlockUnmanagedDocumentsInManagedApps", js.undefined)
    
    @scala.inline
    def setEmailInDomainSuffixes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "emailInDomainSuffixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailInDomainSuffixesNull: Self = StObject.set(x, "emailInDomainSuffixes", null)
    
    @scala.inline
    def setEmailInDomainSuffixesUndefined: Self = StObject.set(x, "emailInDomainSuffixes", js.undefined)
    
    @scala.inline
    def setEmailInDomainSuffixesVarargs(value: String*): Self = StObject.set(x, "emailInDomainSuffixes", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseAppBlockTrust(value: Boolean): Self = StObject.set(x, "enterpriseAppBlockTrust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseAppBlockTrustModification(value: Boolean): Self = StObject.set(x, "enterpriseAppBlockTrustModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseAppBlockTrustModificationUndefined: Self = StObject.set(x, "enterpriseAppBlockTrustModification", js.undefined)
    
    @scala.inline
    def setEnterpriseAppBlockTrustUndefined: Self = StObject.set(x, "enterpriseAppBlockTrust", js.undefined)
    
    @scala.inline
    def setFaceTimeBlocked(value: Boolean): Self = StObject.set(x, "faceTimeBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceTimeBlockedUndefined: Self = StObject.set(x, "faceTimeBlocked", js.undefined)
    
    @scala.inline
    def setFindMyFriendsBlocked(value: Boolean): Self = StObject.set(x, "findMyFriendsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindMyFriendsBlockedUndefined: Self = StObject.set(x, "findMyFriendsBlocked", js.undefined)
    
    @scala.inline
    def setGameCenterBlocked(value: Boolean): Self = StObject.set(x, "gameCenterBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameCenterBlockedUndefined: Self = StObject.set(x, "gameCenterBlocked", js.undefined)
    
    @scala.inline
    def setGamingBlockGameCenterFriends(value: Boolean): Self = StObject.set(x, "gamingBlockGameCenterFriends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamingBlockGameCenterFriendsUndefined: Self = StObject.set(x, "gamingBlockGameCenterFriends", js.undefined)
    
    @scala.inline
    def setGamingBlockMultiplayer(value: Boolean): Self = StObject.set(x, "gamingBlockMultiplayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamingBlockMultiplayerUndefined: Self = StObject.set(x, "gamingBlockMultiplayer", js.undefined)
    
    @scala.inline
    def setHostPairingBlocked(value: Boolean): Self = StObject.set(x, "hostPairingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPairingBlockedUndefined: Self = StObject.set(x, "hostPairingBlocked", js.undefined)
    
    @scala.inline
    def setIBooksStoreBlockErotica(value: Boolean): Self = StObject.set(x, "iBooksStoreBlockErotica", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBooksStoreBlockEroticaUndefined: Self = StObject.set(x, "iBooksStoreBlockErotica", js.undefined)
    
    @scala.inline
    def setIBooksStoreBlocked(value: Boolean): Self = StObject.set(x, "iBooksStoreBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBooksStoreBlockedUndefined: Self = StObject.set(x, "iBooksStoreBlocked", js.undefined)
    
    @scala.inline
    def setICloudBlockActivityContinuation(value: Boolean): Self = StObject.set(x, "iCloudBlockActivityContinuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockActivityContinuationUndefined: Self = StObject.set(x, "iCloudBlockActivityContinuation", js.undefined)
    
    @scala.inline
    def setICloudBlockBackup(value: Boolean): Self = StObject.set(x, "iCloudBlockBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockBackupUndefined: Self = StObject.set(x, "iCloudBlockBackup", js.undefined)
    
    @scala.inline
    def setICloudBlockDocumentSync(value: Boolean): Self = StObject.set(x, "iCloudBlockDocumentSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockDocumentSyncUndefined: Self = StObject.set(x, "iCloudBlockDocumentSync", js.undefined)
    
    @scala.inline
    def setICloudBlockManagedAppsSync(value: Boolean): Self = StObject.set(x, "iCloudBlockManagedAppsSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockManagedAppsSyncUndefined: Self = StObject.set(x, "iCloudBlockManagedAppsSync", js.undefined)
    
    @scala.inline
    def setICloudBlockPhotoLibrary(value: Boolean): Self = StObject.set(x, "iCloudBlockPhotoLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockPhotoLibraryUndefined: Self = StObject.set(x, "iCloudBlockPhotoLibrary", js.undefined)
    
    @scala.inline
    def setICloudBlockPhotoStreamSync(value: Boolean): Self = StObject.set(x, "iCloudBlockPhotoStreamSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockPhotoStreamSyncUndefined: Self = StObject.set(x, "iCloudBlockPhotoStreamSync", js.undefined)
    
    @scala.inline
    def setICloudBlockSharedPhotoStream(value: Boolean): Self = StObject.set(x, "iCloudBlockSharedPhotoStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudBlockSharedPhotoStreamUndefined: Self = StObject.set(x, "iCloudBlockSharedPhotoStream", js.undefined)
    
    @scala.inline
    def setICloudRequireEncryptedBackup(value: Boolean): Self = StObject.set(x, "iCloudRequireEncryptedBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICloudRequireEncryptedBackupUndefined: Self = StObject.set(x, "iCloudRequireEncryptedBackup", js.undefined)
    
    @scala.inline
    def setITunesBlockExplicitContent(value: Boolean): Self = StObject.set(x, "iTunesBlockExplicitContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setITunesBlockExplicitContentUndefined: Self = StObject.set(x, "iTunesBlockExplicitContent", js.undefined)
    
    @scala.inline
    def setITunesBlockMusicService(value: Boolean): Self = StObject.set(x, "iTunesBlockMusicService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setITunesBlockMusicServiceUndefined: Self = StObject.set(x, "iTunesBlockMusicService", js.undefined)
    
    @scala.inline
    def setITunesBlockRadio(value: Boolean): Self = StObject.set(x, "iTunesBlockRadio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setITunesBlockRadioUndefined: Self = StObject.set(x, "iTunesBlockRadio", js.undefined)
    
    @scala.inline
    def setKeyboardBlockAutoCorrect(value: Boolean): Self = StObject.set(x, "keyboardBlockAutoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBlockAutoCorrectUndefined: Self = StObject.set(x, "keyboardBlockAutoCorrect", js.undefined)
    
    @scala.inline
    def setKeyboardBlockDictation(value: Boolean): Self = StObject.set(x, "keyboardBlockDictation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBlockDictationUndefined: Self = StObject.set(x, "keyboardBlockDictation", js.undefined)
    
    @scala.inline
    def setKeyboardBlockPredictive(value: Boolean): Self = StObject.set(x, "keyboardBlockPredictive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBlockPredictiveUndefined: Self = StObject.set(x, "keyboardBlockPredictive", js.undefined)
    
    @scala.inline
    def setKeyboardBlockShortcuts(value: Boolean): Self = StObject.set(x, "keyboardBlockShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBlockShortcutsUndefined: Self = StObject.set(x, "keyboardBlockShortcuts", js.undefined)
    
    @scala.inline
    def setKeyboardBlockSpellCheck(value: Boolean): Self = StObject.set(x, "keyboardBlockSpellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardBlockSpellCheckUndefined: Self = StObject.set(x, "keyboardBlockSpellCheck", js.undefined)
    
    @scala.inline
    def setKioskModeAllowAssistiveSpeak(value: Boolean): Self = StObject.set(x, "kioskModeAllowAssistiveSpeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowAssistiveSpeakUndefined: Self = StObject.set(x, "kioskModeAllowAssistiveSpeak", js.undefined)
    
    @scala.inline
    def setKioskModeAllowAssistiveTouchSettings(value: Boolean): Self = StObject.set(x, "kioskModeAllowAssistiveTouchSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowAssistiveTouchSettingsUndefined: Self = StObject.set(x, "kioskModeAllowAssistiveTouchSettings", js.undefined)
    
    @scala.inline
    def setKioskModeAllowAutoLock(value: Boolean): Self = StObject.set(x, "kioskModeAllowAutoLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowAutoLockUndefined: Self = StObject.set(x, "kioskModeAllowAutoLock", js.undefined)
    
    @scala.inline
    def setKioskModeAllowColorInversionSettings(value: Boolean): Self = StObject.set(x, "kioskModeAllowColorInversionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowColorInversionSettingsUndefined: Self = StObject.set(x, "kioskModeAllowColorInversionSettings", js.undefined)
    
    @scala.inline
    def setKioskModeAllowRingerSwitch(value: Boolean): Self = StObject.set(x, "kioskModeAllowRingerSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowRingerSwitchUndefined: Self = StObject.set(x, "kioskModeAllowRingerSwitch", js.undefined)
    
    @scala.inline
    def setKioskModeAllowScreenRotation(value: Boolean): Self = StObject.set(x, "kioskModeAllowScreenRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowScreenRotationUndefined: Self = StObject.set(x, "kioskModeAllowScreenRotation", js.undefined)
    
    @scala.inline
    def setKioskModeAllowSleepButton(value: Boolean): Self = StObject.set(x, "kioskModeAllowSleepButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowSleepButtonUndefined: Self = StObject.set(x, "kioskModeAllowSleepButton", js.undefined)
    
    @scala.inline
    def setKioskModeAllowTouchscreen(value: Boolean): Self = StObject.set(x, "kioskModeAllowTouchscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowTouchscreenUndefined: Self = StObject.set(x, "kioskModeAllowTouchscreen", js.undefined)
    
    @scala.inline
    def setKioskModeAllowVoiceOverSettings(value: Boolean): Self = StObject.set(x, "kioskModeAllowVoiceOverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowVoiceOverSettingsUndefined: Self = StObject.set(x, "kioskModeAllowVoiceOverSettings", js.undefined)
    
    @scala.inline
    def setKioskModeAllowVolumeButtons(value: Boolean): Self = StObject.set(x, "kioskModeAllowVolumeButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowVolumeButtonsUndefined: Self = StObject.set(x, "kioskModeAllowVolumeButtons", js.undefined)
    
    @scala.inline
    def setKioskModeAllowZoomSettings(value: Boolean): Self = StObject.set(x, "kioskModeAllowZoomSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAllowZoomSettingsUndefined: Self = StObject.set(x, "kioskModeAllowZoomSettings", js.undefined)
    
    @scala.inline
    def setKioskModeAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "kioskModeAppStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeAppStoreUrlNull: Self = StObject.set(x, "kioskModeAppStoreUrl", null)
    
    @scala.inline
    def setKioskModeAppStoreUrlUndefined: Self = StObject.set(x, "kioskModeAppStoreUrl", js.undefined)
    
    @scala.inline
    def setKioskModeBuiltInAppId(value: NullableOption[String]): Self = StObject.set(x, "kioskModeBuiltInAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeBuiltInAppIdNull: Self = StObject.set(x, "kioskModeBuiltInAppId", null)
    
    @scala.inline
    def setKioskModeBuiltInAppIdUndefined: Self = StObject.set(x, "kioskModeBuiltInAppId", js.undefined)
    
    @scala.inline
    def setKioskModeManagedAppId(value: NullableOption[String]): Self = StObject.set(x, "kioskModeManagedAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeManagedAppIdNull: Self = StObject.set(x, "kioskModeManagedAppId", null)
    
    @scala.inline
    def setKioskModeManagedAppIdUndefined: Self = StObject.set(x, "kioskModeManagedAppId", js.undefined)
    
    @scala.inline
    def setKioskModeRequireAssistiveTouch(value: Boolean): Self = StObject.set(x, "kioskModeRequireAssistiveTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeRequireAssistiveTouchUndefined: Self = StObject.set(x, "kioskModeRequireAssistiveTouch", js.undefined)
    
    @scala.inline
    def setKioskModeRequireColorInversion(value: Boolean): Self = StObject.set(x, "kioskModeRequireColorInversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeRequireColorInversionUndefined: Self = StObject.set(x, "kioskModeRequireColorInversion", js.undefined)
    
    @scala.inline
    def setKioskModeRequireMonoAudio(value: Boolean): Self = StObject.set(x, "kioskModeRequireMonoAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeRequireMonoAudioUndefined: Self = StObject.set(x, "kioskModeRequireMonoAudio", js.undefined)
    
    @scala.inline
    def setKioskModeRequireVoiceOver(value: Boolean): Self = StObject.set(x, "kioskModeRequireVoiceOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeRequireVoiceOverUndefined: Self = StObject.set(x, "kioskModeRequireVoiceOver", js.undefined)
    
    @scala.inline
    def setKioskModeRequireZoom(value: Boolean): Self = StObject.set(x, "kioskModeRequireZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskModeRequireZoomUndefined: Self = StObject.set(x, "kioskModeRequireZoom", js.undefined)
    
    @scala.inline
    def setLockScreenBlockControlCenter(value: Boolean): Self = StObject.set(x, "lockScreenBlockControlCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockControlCenterUndefined: Self = StObject.set(x, "lockScreenBlockControlCenter", js.undefined)
    
    @scala.inline
    def setLockScreenBlockNotificationView(value: Boolean): Self = StObject.set(x, "lockScreenBlockNotificationView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockNotificationViewUndefined: Self = StObject.set(x, "lockScreenBlockNotificationView", js.undefined)
    
    @scala.inline
    def setLockScreenBlockPassbook(value: Boolean): Self = StObject.set(x, "lockScreenBlockPassbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockPassbookUndefined: Self = StObject.set(x, "lockScreenBlockPassbook", js.undefined)
    
    @scala.inline
    def setLockScreenBlockTodayView(value: Boolean): Self = StObject.set(x, "lockScreenBlockTodayView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenBlockTodayViewUndefined: Self = StObject.set(x, "lockScreenBlockTodayView", js.undefined)
    
    @scala.inline
    def setMediaContentRatingApps(value: RatingAppsType): Self = StObject.set(x, "mediaContentRatingApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingAppsUndefined: Self = StObject.set(x, "mediaContentRatingApps", js.undefined)
    
    @scala.inline
    def setMediaContentRatingAustralia(value: NullableOption[MediaContentRatingAustralia]): Self = StObject.set(x, "mediaContentRatingAustralia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingAustraliaNull: Self = StObject.set(x, "mediaContentRatingAustralia", null)
    
    @scala.inline
    def setMediaContentRatingAustraliaUndefined: Self = StObject.set(x, "mediaContentRatingAustralia", js.undefined)
    
    @scala.inline
    def setMediaContentRatingCanada(value: NullableOption[MediaContentRatingCanada]): Self = StObject.set(x, "mediaContentRatingCanada", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingCanadaNull: Self = StObject.set(x, "mediaContentRatingCanada", null)
    
    @scala.inline
    def setMediaContentRatingCanadaUndefined: Self = StObject.set(x, "mediaContentRatingCanada", js.undefined)
    
    @scala.inline
    def setMediaContentRatingFrance(value: NullableOption[MediaContentRatingFrance]): Self = StObject.set(x, "mediaContentRatingFrance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingFranceNull: Self = StObject.set(x, "mediaContentRatingFrance", null)
    
    @scala.inline
    def setMediaContentRatingFranceUndefined: Self = StObject.set(x, "mediaContentRatingFrance", js.undefined)
    
    @scala.inline
    def setMediaContentRatingGermany(value: NullableOption[MediaContentRatingGermany]): Self = StObject.set(x, "mediaContentRatingGermany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingGermanyNull: Self = StObject.set(x, "mediaContentRatingGermany", null)
    
    @scala.inline
    def setMediaContentRatingGermanyUndefined: Self = StObject.set(x, "mediaContentRatingGermany", js.undefined)
    
    @scala.inline
    def setMediaContentRatingIreland(value: NullableOption[MediaContentRatingIreland]): Self = StObject.set(x, "mediaContentRatingIreland", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingIrelandNull: Self = StObject.set(x, "mediaContentRatingIreland", null)
    
    @scala.inline
    def setMediaContentRatingIrelandUndefined: Self = StObject.set(x, "mediaContentRatingIreland", js.undefined)
    
    @scala.inline
    def setMediaContentRatingJapan(value: NullableOption[MediaContentRatingJapan]): Self = StObject.set(x, "mediaContentRatingJapan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingJapanNull: Self = StObject.set(x, "mediaContentRatingJapan", null)
    
    @scala.inline
    def setMediaContentRatingJapanUndefined: Self = StObject.set(x, "mediaContentRatingJapan", js.undefined)
    
    @scala.inline
    def setMediaContentRatingNewZealand(value: NullableOption[MediaContentRatingNewZealand]): Self = StObject.set(x, "mediaContentRatingNewZealand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingNewZealandNull: Self = StObject.set(x, "mediaContentRatingNewZealand", null)
    
    @scala.inline
    def setMediaContentRatingNewZealandUndefined: Self = StObject.set(x, "mediaContentRatingNewZealand", js.undefined)
    
    @scala.inline
    def setMediaContentRatingUnitedKingdom(value: NullableOption[MediaContentRatingUnitedKingdom]): Self = StObject.set(x, "mediaContentRatingUnitedKingdom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingUnitedKingdomNull: Self = StObject.set(x, "mediaContentRatingUnitedKingdom", null)
    
    @scala.inline
    def setMediaContentRatingUnitedKingdomUndefined: Self = StObject.set(x, "mediaContentRatingUnitedKingdom", js.undefined)
    
    @scala.inline
    def setMediaContentRatingUnitedStates(value: NullableOption[MediaContentRatingUnitedStates]): Self = StObject.set(x, "mediaContentRatingUnitedStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentRatingUnitedStatesNull: Self = StObject.set(x, "mediaContentRatingUnitedStates", null)
    
    @scala.inline
    def setMediaContentRatingUnitedStatesUndefined: Self = StObject.set(x, "mediaContentRatingUnitedStates", js.undefined)
    
    @scala.inline
    def setMessagesBlocked(value: Boolean): Self = StObject.set(x, "messagesBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesBlockedUndefined: Self = StObject.set(x, "messagesBlocked", js.undefined)
    
    @scala.inline
    def setNetworkUsageRules(value: NullableOption[js.Array[IosNetworkUsageRule]]): Self = StObject.set(x, "networkUsageRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUsageRulesNull: Self = StObject.set(x, "networkUsageRules", null)
    
    @scala.inline
    def setNetworkUsageRulesUndefined: Self = StObject.set(x, "networkUsageRules", js.undefined)
    
    @scala.inline
    def setNetworkUsageRulesVarargs(value: IosNetworkUsageRule*): Self = StObject.set(x, "networkUsageRules", js.Array(value :_*))
    
    @scala.inline
    def setNotificationsBlockSettingsModification(value: Boolean): Self = StObject.set(x, "notificationsBlockSettingsModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBlockSettingsModificationUndefined: Self = StObject.set(x, "notificationsBlockSettingsModification", js.undefined)
    
    @scala.inline
    def setPasscodeBlockFingerprintModification(value: Boolean): Self = StObject.set(x, "passcodeBlockFingerprintModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeBlockFingerprintModificationUndefined: Self = StObject.set(x, "passcodeBlockFingerprintModification", js.undefined)
    
    @scala.inline
    def setPasscodeBlockFingerprintUnlock(value: Boolean): Self = StObject.set(x, "passcodeBlockFingerprintUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeBlockFingerprintUnlockUndefined: Self = StObject.set(x, "passcodeBlockFingerprintUnlock", js.undefined)
    
    @scala.inline
    def setPasscodeBlockModification(value: Boolean): Self = StObject.set(x, "passcodeBlockModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeBlockModificationUndefined: Self = StObject.set(x, "passcodeBlockModification", js.undefined)
    
    @scala.inline
    def setPasscodeBlockSimple(value: Boolean): Self = StObject.set(x, "passcodeBlockSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeBlockSimpleUndefined: Self = StObject.set(x, "passcodeBlockSimple", js.undefined)
    
    @scala.inline
    def setPasscodeExpirationDays(value: NullableOption[Double]): Self = StObject.set(x, "passcodeExpirationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeExpirationDaysNull: Self = StObject.set(x, "passcodeExpirationDays", null)
    
    @scala.inline
    def setPasscodeExpirationDaysUndefined: Self = StObject.set(x, "passcodeExpirationDays", js.undefined)
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumCharacterSetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCountNull: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", null)
    
    @scala.inline
    def setPasscodeMinimumCharacterSetCountUndefined: Self = StObject.set(x, "passcodeMinimumCharacterSetCount", js.undefined)
    
    @scala.inline
    def setPasscodeMinimumLength(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinimumLengthNull: Self = StObject.set(x, "passcodeMinimumLength", null)
    
    @scala.inline
    def setPasscodeMinimumLengthUndefined: Self = StObject.set(x, "passcodeMinimumLength", js.undefined)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLock(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLockNull: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", null)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeLockUndefined: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeLock", js.undefined)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeScreenTimeout(value: NullableOption[Double]): Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeScreenTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeScreenTimeoutNull: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeScreenTimeout", null)
    
    @scala.inline
    def setPasscodeMinutesOfInactivityBeforeScreenTimeoutUndefined: Self = StObject.set(x, "passcodeMinutesOfInactivityBeforeScreenTimeout", js.undefined)
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCount(value: NullableOption[Double]): Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCountNull: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", null)
    
    @scala.inline
    def setPasscodePreviousPasscodeBlockCountUndefined: Self = StObject.set(x, "passcodePreviousPasscodeBlockCount", js.undefined)
    
    @scala.inline
    def setPasscodeRequired(value: Boolean): Self = StObject.set(x, "passcodeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeRequiredType(value: RequiredPasswordType): Self = StObject.set(x, "passcodeRequiredType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeRequiredTypeUndefined: Self = StObject.set(x, "passcodeRequiredType", js.undefined)
    
    @scala.inline
    def setPasscodeRequiredUndefined: Self = StObject.set(x, "passcodeRequired", js.undefined)
    
    @scala.inline
    def setPasscodeSignInFailureCountBeforeWipe(value: NullableOption[Double]): Self = StObject.set(x, "passcodeSignInFailureCountBeforeWipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeSignInFailureCountBeforeWipeNull: Self = StObject.set(x, "passcodeSignInFailureCountBeforeWipe", null)
    
    @scala.inline
    def setPasscodeSignInFailureCountBeforeWipeUndefined: Self = StObject.set(x, "passcodeSignInFailureCountBeforeWipe", js.undefined)
    
    @scala.inline
    def setPodcastsBlocked(value: Boolean): Self = StObject.set(x, "podcastsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodcastsBlockedUndefined: Self = StObject.set(x, "podcastsBlocked", js.undefined)
    
    @scala.inline
    def setSafariBlockAutofill(value: Boolean): Self = StObject.set(x, "safariBlockAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariBlockAutofillUndefined: Self = StObject.set(x, "safariBlockAutofill", js.undefined)
    
    @scala.inline
    def setSafariBlockJavaScript(value: Boolean): Self = StObject.set(x, "safariBlockJavaScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariBlockJavaScriptUndefined: Self = StObject.set(x, "safariBlockJavaScript", js.undefined)
    
    @scala.inline
    def setSafariBlockPopups(value: Boolean): Self = StObject.set(x, "safariBlockPopups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariBlockPopupsUndefined: Self = StObject.set(x, "safariBlockPopups", js.undefined)
    
    @scala.inline
    def setSafariBlocked(value: Boolean): Self = StObject.set(x, "safariBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariBlockedUndefined: Self = StObject.set(x, "safariBlocked", js.undefined)
    
    @scala.inline
    def setSafariCookieSettings(value: WebBrowserCookieSettings): Self = StObject.set(x, "safariCookieSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariCookieSettingsUndefined: Self = StObject.set(x, "safariCookieSettings", js.undefined)
    
    @scala.inline
    def setSafariManagedDomains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "safariManagedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariManagedDomainsNull: Self = StObject.set(x, "safariManagedDomains", null)
    
    @scala.inline
    def setSafariManagedDomainsUndefined: Self = StObject.set(x, "safariManagedDomains", js.undefined)
    
    @scala.inline
    def setSafariManagedDomainsVarargs(value: String*): Self = StObject.set(x, "safariManagedDomains", js.Array(value :_*))
    
    @scala.inline
    def setSafariPasswordAutoFillDomains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "safariPasswordAutoFillDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariPasswordAutoFillDomainsNull: Self = StObject.set(x, "safariPasswordAutoFillDomains", null)
    
    @scala.inline
    def setSafariPasswordAutoFillDomainsUndefined: Self = StObject.set(x, "safariPasswordAutoFillDomains", js.undefined)
    
    @scala.inline
    def setSafariPasswordAutoFillDomainsVarargs(value: String*): Self = StObject.set(x, "safariPasswordAutoFillDomains", js.Array(value :_*))
    
    @scala.inline
    def setSafariRequireFraudWarning(value: Boolean): Self = StObject.set(x, "safariRequireFraudWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariRequireFraudWarningUndefined: Self = StObject.set(x, "safariRequireFraudWarning", js.undefined)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
    
    @scala.inline
    def setSiriBlockUserGeneratedContent(value: Boolean): Self = StObject.set(x, "siriBlockUserGeneratedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiriBlockUserGeneratedContentUndefined: Self = StObject.set(x, "siriBlockUserGeneratedContent", js.undefined)
    
    @scala.inline
    def setSiriBlocked(value: Boolean): Self = StObject.set(x, "siriBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiriBlockedUndefined: Self = StObject.set(x, "siriBlocked", js.undefined)
    
    @scala.inline
    def setSiriBlockedWhenLocked(value: Boolean): Self = StObject.set(x, "siriBlockedWhenLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiriBlockedWhenLockedUndefined: Self = StObject.set(x, "siriBlockedWhenLocked", js.undefined)
    
    @scala.inline
    def setSiriRequireProfanityFilter(value: Boolean): Self = StObject.set(x, "siriRequireProfanityFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiriRequireProfanityFilterUndefined: Self = StObject.set(x, "siriRequireProfanityFilter", js.undefined)
    
    @scala.inline
    def setSpotlightBlockInternetResults(value: Boolean): Self = StObject.set(x, "spotlightBlockInternetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotlightBlockInternetResultsUndefined: Self = StObject.set(x, "spotlightBlockInternetResults", js.undefined)
    
    @scala.inline
    def setVoiceDialingBlocked(value: Boolean): Self = StObject.set(x, "voiceDialingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceDialingBlockedUndefined: Self = StObject.set(x, "voiceDialingBlocked", js.undefined)
    
    @scala.inline
    def setWallpaperBlockModification(value: Boolean): Self = StObject.set(x, "wallpaperBlockModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWallpaperBlockModificationUndefined: Self = StObject.set(x, "wallpaperBlockModification", js.undefined)
    
    @scala.inline
    def setWiFiConnectOnlyToConfiguredNetworks(value: Boolean): Self = StObject.set(x, "wiFiConnectOnlyToConfiguredNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWiFiConnectOnlyToConfiguredNetworksUndefined: Self = StObject.set(x, "wiFiConnectOnlyToConfiguredNetworks", js.undefined)
  }
}

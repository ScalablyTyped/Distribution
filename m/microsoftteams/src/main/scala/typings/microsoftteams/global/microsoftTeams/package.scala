package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.global.microsoftTeams.^
import typings.microsoftteams.microsoftTeams.ChatMembersInformation
import typings.microsoftteams.microsoftTeams.Context
import typings.microsoftteams.microsoftTeams.DeepLinkParameters
import typings.microsoftteams.microsoftTeams.FilePreviewParameters
import typings.microsoftteams.microsoftTeams.FrameContext
import typings.microsoftteams.microsoftTeams.LoadContext
import typings.microsoftteams.microsoftTeams.ShowNotificationParameters
import typings.microsoftteams.microsoftTeams.TabInformation
import typings.microsoftteams.microsoftTeams.TabInstance
import typings.microsoftteams.microsoftTeams.TabInstanceParameters
import typings.microsoftteams.microsoftTeams.TeamInstanceParameters
import typings.microsoftteams.microsoftTeams.UserJoinedTeamsInformation
import typings.microsoftteams.microsoftTeams.media.AssembleAttachment
import typings.microsoftteams.microsoftTeams.media.BarCodeConfig
import typings.microsoftteams.microsoftTeams.media.FileFormat
import typings.microsoftteams.microsoftTeams.media.ImageUri
import typings.microsoftteams.microsoftTeams.media.MediaChunk
import typings.microsoftteams.microsoftTeams.media.MediaInputs
import typings.microsoftteams.microsoftTeams.people.PeoplePickerInputs
import typings.microsoftteams.microsoftteamsBooleans.`false`
import typings.microsoftteams.microsoftteamsBooleans.`true`
import typings.std.Blob
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Hide from docs.
  * ------
  * Undocumented function used to set a mock window for unit tests
  */
inline def _initialize(hostWindow: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_initialize")(hostWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def callHandler(name: String): js.Tuple2[`true` | `false`, Any | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callHandler")(name.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[`true` | `false`, Any | Unit]]
inline def callHandler(name: String, args: js.Array[Any]): js.Tuple2[`true` | `false`, Any | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("callHandler")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[`true` | `false`, Any | Unit]]

/**
  * This is the SDK version when captureImage API is supported on mobile.
  */
inline def captureImageMobileSupportVersion: /* "1.7.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("captureImageMobileSupportVersion").asInstanceOf[/* "1.7.0" */ String]

/**
  * Compares SDK versions.
  * @param v1 first version
  * @param v2 second version
  * returns NaN in case inputs are not in right format
  *         -1 if v1 < v2
  *          1 if v1 > v2
  *          0 otherwise
  * For example,
  *    compareSDKVersions('1.2', '1.2.0') returns 0
  *    compareSDKVersions('1.2a', '1.2b') returns NaN
  *    compareSDKVersions('1.2', '1.3') returns -1
  *    compareSDKVersions('2.0', '1.3.2') returns 1
  *    compareSDKVersions('2.0', 2.0) returns NaN
  */
inline def compareSDKVersions(v1: String, v2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSDKVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
  * Helper function to create a blob from media chunks based on their sequence
  */
inline def createFile(assembleAttachment: js.Array[AssembleAttachment], mimeType: String): Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(assembleAttachment.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Blob]

/**
  * Helper function to convert Media chunks into another object type which can be later assemebled
  * Converts base 64 encoded string to byte array and then into an array of blobs
  */
inline def decodeAttachment(attachment: MediaChunk, mimeType: String): AssembleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAttachment")(attachment.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[AssembleAttachment]

/**
  * This is the SDK version when all SDK APIs started to check platform compatibility for the APIs.
  */
inline def defaultSDKVersionForCompatCheck: /* "1.6.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultSDKVersionForCompatCheck").asInstanceOf[/* "1.6.0" */ String]

/**
  * Enable print capability to support printing page using Ctrl+P and cmd+P
  */
inline def enablePrintCapability(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePrintCapability")().asInstanceOf[Unit]

inline def ensureInitialized(expectedFrameContexts: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureInitialized")(expectedFrameContexts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]

/**
  * Hide from docs
  * ------
  * Place the tab into full-screen mode.
  */
inline def enterFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enterFullscreen")().asInstanceOf[Unit]

/**
  * execute deep link API.
  * @param deepLink deep link.
  */
inline def executeDeepLink(deepLink: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeDeepLink")(deepLink.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def executeDeepLink(
  deepLink: String,
  onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeDeepLink")(deepLink.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Hide from docs
  * ------
  * Reverts the tab into normal-screen mode.
  */
inline def exitFullscreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFullscreen")().asInstanceOf[Unit]

/**
  * Generates a GUID
  */
inline def generateGUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateGUID")().asInstanceOf[String]

inline def generateRegExpFromUrls(urls: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRegExpFromUrls")(urls.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]

/**
  * Hide from docs
  * ------
  * Allows an app to retrieve information of all chat members
  * Because a malicious party run your content in a browser, this value should
  * be used only as a hint as to who the members are and never as proof of membership.
  * @param callback The callback to invoke when the {@link ChatMembersInformation} object is retrieved.
  */
inline def getChatMembers(callback: js.Function1[/* chatMembersInformation */ ChatMembersInformation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getChatMembers")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Hide from docs
  * ------
  * Allows an app to get the configuration setting value
  * @param callback The callback to invoke when the value is retrieved.
  * @param key The key for the config setting
  */
inline def getConfigSetting(callback: js.Function1[/* value */ String, Unit], key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigSetting")(callback.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Retrieves the current context the frame is running in.
  * @param callback The callback to invoke when the {@link Context} object is retrieved.
  */
inline def getContext(callback: js.Function1[/* context */ Context, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getGenericOnCompleteHandler(): js.Function2[/* success */ Boolean, /* reason */ js.UndefOr[String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGenericOnCompleteHandler")().asInstanceOf[js.Function2[/* success */ Boolean, /* reason */ js.UndefOr[String], Unit]]
inline def getGenericOnCompleteHandler(errorMessage: String): js.Function2[/* success */ Boolean, /* reason */ js.UndefOr[String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGenericOnCompleteHandler")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* success */ Boolean, /* reason */ js.UndefOr[String], Unit]]

/**
  * This is the SDK version when getMedia API is supported via Callbacks on all three platforms ios, android and web.
  */
inline def getMediaCallbackSupportVersion: /* "2.0.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("getMediaCallbackSupportVersion").asInstanceOf[/* "2.0.0" */ String]

/**
  * Allows an app to retrieve the most recently used tabs for this user.
  * @param callback The callback to invoke when the {@link TabInformation} object is retrieved.
  * @param tabInstanceParameters OPTIONAL Ignored, kept for future use
  */
inline def getMruTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getMruTabInstances")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def getMruTabInstances(
  callback: js.Function1[/* tabInfo */ TabInformation, Unit],
  tabInstanceParameters: TabInstanceParameters
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMruTabInstances")(callback.asInstanceOf[js.Any], tabInstanceParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Allows an app to retrieve for this user tabs that are owned by this app.
  * If no TabInstanceParameters are passed, the app defaults to favorite teams and favorite channels.
  * @param callback The callback to invoke when the {@link TabInstanceParameters} object is retrieved.
  * @param tabInstanceParameters OPTIONAL Flags that specify whether to scope call to favorite teams or channels.
  */
inline def getTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabInstances")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def getTabInstances(
  callback: js.Function1[/* tabInfo */ TabInformation, Unit],
  tabInstanceParameters: TabInstanceParameters
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabInstances")(callback.asInstanceOf[js.Any], tabInstanceParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Hide from docs
  * ------
  * Allows an app to retrieve information of all user joined teams
  * @param callback The callback to invoke when the {@link TeamInstanceParameters} object is retrieved.
  * @param teamInstanceParameters OPTIONAL Flags that specify whether to scope call to favorite teams
  */
inline def getUserJoinedTeams(callback: js.Function1[/* userJoinedTeamsInformation */ UserJoinedTeamsInformation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserJoinedTeams")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def getUserJoinedTeams(
  callback: js.Function1[/* userJoinedTeamsInformation */ UserJoinedTeamsInformation, Unit],
  teamInstanceParameters: TeamInstanceParameters
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserJoinedTeams")(callback.asInstanceOf[js.Any], teamInstanceParameters.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Minimum required client supported version for {@link getUserJoinedTeams} to be supported on {@link HostClientType.android}
  */
inline def getUserJoinedTeamsSupportedAndroidClientVersion: /* "2.0.1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("getUserJoinedTeamsSupportedAndroidClientVersion").asInstanceOf[/* "2.0.1" */ String]

inline def handleThemeChange(theme: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleThemeChange")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Initializes the library. This must be called before any other SDK calls
  * but after the frame is loaded successfully.
  * @param callback Optionally specify a callback to invoke when Teams SDK has successfully initialized
  * @param validMessageOrigins Optionally specify a list of cross frame message origins. There must have
  * https: protocol otherwise they will be ignored. Example: https://www.example.com
  */
inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
inline def initialize(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def initialize(callback: js.Function0[Unit], validMessageOrigins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(callback.asInstanceOf[js.Any], validMessageOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initialize(callback: Unit, validMessageOrigins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(callback.asInstanceOf[js.Any], validMessageOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def initializeCommunication(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeCommunication")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def initializeCommunication(callback: js.Function0[Unit], validMessageOrigins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeCommunication")(callback.asInstanceOf[js.Any], validMessageOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def initializeHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeHandlers")().asInstanceOf[Unit]

inline def initializePrivateApis(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializePrivateApis")().asInstanceOf[Unit]

inline def initializeWithFrameContext(frameContext: FrameContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithFrameContext")(frameContext.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def initializeWithFrameContext(frameContext: FrameContext, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithFrameContext")(frameContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initializeWithFrameContext(frameContext: FrameContext, callback: js.Function0[Unit], validMessageOrigins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithFrameContext")(frameContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], validMessageOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initializeWithFrameContext(frameContext: FrameContext, callback: Unit, validMessageOrigins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeWithFrameContext")(frameContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], validMessageOrigins.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Checks whether the platform has knowledge of this API by doing a comparison
  * on API required version and platform supported version of the SDK
  * @param requiredVersion SDK version required by the API
  */
inline def isAPISupportedByPlatform(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAPISupportedByPlatform")().asInstanceOf[Boolean]
inline def isAPISupportedByPlatform(requiredVersion: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAPISupportedByPlatform")(requiredVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * This is the SDK version when location APIs (getLocation and showLocation) are supported.
  */
inline def locationAPIsRequiredVersion: /* "1.9.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("locationAPIsRequiredVersion").asInstanceOf[/* "1.9.0" */ String]

/**
  * This is the SDK version when media APIs are supported on all three platforms ios, android and web.
  */
inline def mediaAPISupportVersion: /* "1.8.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("mediaAPISupportVersion").asInstanceOf[/* "1.8.0" */ String]

/**
  * Navigates back in the Teams client. See registerBackButtonHandler for more information on when
  * it's appropriate to use this method.
  */
inline def navigateBack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")().asInstanceOf[Unit]
inline def navigateBack(onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")(onComplete.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Navigates the frame to a new cross-domain URL. The domain of this URL must match at least one of the
  * valid domains specified in the validDomains block of the manifest; otherwise, an exception will be
  * thrown. This function needs to be used only when navigating the frame to a URL in a different domain
  * than the current one in a way that keeps the app informed of the change and allows the SDK to
  * continue working.
  * @param url The URL to navigate the frame to.
  */
inline def navigateCrossDomain(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateCrossDomain")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def navigateCrossDomain(url: String, onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateCrossDomain")(url.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Navigates the Microsoft Teams app to the specified tab instance.
  * @param tabInstance The tab instance to navigate to.
  */
inline def navigateToTab(tabInstance: TabInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToTab")(tabInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def navigateToTab(
  tabInstance: TabInstance,
  onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigateToTab")(tabInstance.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Hide from docs.
  * ------
  * Opens a client-friendly preview of the specified file.
  * @param file The file to preview.
  */
inline def openFilePreview(filePreviewParameters: FilePreviewParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openFilePreview")(filePreviewParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * This is the SDK version when people picker API is supported on mobile.
  */
inline def peoplePickerRequiredVersion: /* "2.0.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("peoplePickerRequiredVersion").asInstanceOf[/* "2.0.0" */ String]

/**
  * default print handler
  */
inline def print(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")().asInstanceOf[Unit]

/**
  * Processes the valid origins specifuied by the user, de-duplicates and converts them into a regexp
  * which is used later for message source/origin validation
  */
inline def processAdditionalValidOrigins(validMessageOrigins: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("processAdditionalValidOrigins")(validMessageOrigins.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Registers a handler for clicking the app button.
  * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
  * @param handler The handler to invoke when the personal app button is clicked in the app bar.
  */
inline def registerAppButtonClickHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAppButtonClickHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Registers a handler for entering hover of the app button.
  * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
  * @param handler The handler to invoke when entering hover of the personal app button in the app bar.
  */
inline def registerAppButtonHoverEnterHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAppButtonHoverEnterHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Registers a handler for exiting hover of the app button.
  * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
  * @param handler The handler to invoke when exiting hover of the personal app button in the app bar.
  */
inline def registerAppButtonHoverLeaveHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAppButtonHoverLeaveHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerBackButtonHandler(handler: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBackButtonHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerBeforeUnloadHandler(handler: js.Function1[/* readyToUnload */ js.Function0[Unit], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBeforeUnloadHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Registers a handler for when the user reconfigurated tab
  * @param handler The handler to invoke when the user click on Settings.
  */
inline def registerChangeSettingsHandler(handler: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerChangeSettingsHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Internal use only
  * Adds a handler for an action sent by a child window or parent window
  * @param actionName Specifies name of the action message to handle
  * @param customHandler The callback to invoke when the action message is received. The return value is sent to the child
  */
inline def registerCustomHandler(actionName: String, customHandler: js.Function1[/* repeated */ Any, js.Array[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomHandler")(actionName.asInstanceOf[js.Any], customHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Registers a handler for changes from or to full-screen view for a tab.
  * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
  * @param handler The handler to invoke when the user toggles full-screen view for a tab.
  */
inline def registerFullScreenHandler(handler: js.Function1[/* isFullScreen */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFullScreenHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerHandler(name: String, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerHandler(name: String, handler: js.Function0[Unit], sendMessage: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], sendMessage.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerHandler(name: String, handler: js.Function0[Unit], sendMessage: Boolean, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], sendMessage.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerHandler(name: String, handler: js.Function0[Unit], sendMessage: Unit, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], sendMessage.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerOnLoadHandler(handler: js.Function1[/* context */ LoadContext, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnLoadHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerOnThemeChangeHandler(handler: js.Function1[/* theme */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnThemeChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * register a handler to be called when a user setting changes. The changed setting type & value is provided in the callback.
  * @param settingTypes List of user setting changes to subscribe
  * @param handler When a subscribed setting is updated this handler is called
  */
inline def registerUserSettingsChangeHandler(
  settingTypes: js.Array[typings.microsoftteams.microsoftTeams.UserSettingTypes],
  handler: js.Function2[
  /* settingType */ typings.microsoftteams.microsoftTeams.UserSettingTypes, 
  /* value */ Any, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerUserSettingsChangeHandler")(settingTypes.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Navigation specific part of the SDK.
  */
/**
  * Return focus to the main Teams app. Will focus search bar if navigating foward and app bar if navigating back.
  * @param navigateForward Determines the direction to focus in teams app.
  */
inline def returnFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("returnFocus")().asInstanceOf[Unit]
inline def returnFocus(navigateForward: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("returnFocus")(navigateForward.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * This is the SDK version when scanBarCode API is supported on mobile.
  */
inline def scanBarCodeAPIMobileSupportVersion: /* "1.9.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("scanBarCodeAPIMobileSupportVersion").asInstanceOf[/* "1.9.0" */ String]

/**
  * Internal use only
  * Sends a custom action MessageEvent to a child iframe/window, only if you are not using auth popup.
  * Otherwise it will go to the auth popup (which becomes the child)
  * @param actionName Specifies name of the custom action to be sent
  * @param args Specifies additional arguments passed to the action
  * @returns id of sent message
  */
inline def sendCustomEvent(actionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomEvent")(actionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def sendCustomEvent(actionName: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomEvent")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Internal use only
  * Sends a custom action MessageRequest to Teams or parent window
  * @param actionName Specifies name of the custom action to be sent
  * @param args Specifies additional arguments passed to the action
  * @param callback Optionally specify a callback to receive response parameters from the parent
  * @returns id of sent message
  */
inline def sendCustomMessage(actionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomMessage")(actionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def sendCustomMessage(actionName: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomMessage")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendCustomMessage(actionName: String, args: js.Array[Any], callback: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomMessage")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendCustomMessage(actionName: String, args: Unit, callback: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCustomMessage")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Send a custom message object that can be sent to child window,
  * instead of a response message to a child
  */
inline def sendMessageEventToChild(actionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageEventToChild")(actionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def sendMessageEventToChild(actionName: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageEventToChild")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Send a message to parent. Uses nativeInterface on mobile to communicate with parent context
  */
inline def sendMessageToParent(actionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToParent")(actionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
/**
  * Send a message to parent. Uses nativeInterface on mobile to communicate with parent context
  */
inline def sendMessageToParent(actionName: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToParent")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendMessageToParent(actionName: String, args: js.Array[Any], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToParent")(actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def sendMessageToParent(actionName: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToParent")(actionName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setFrameContext(frameContext: FrameContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrameContext")(frameContext.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Shares a deep link that a user can use to navigate back to a specific state in this page.
  * @param deepLinkParameters ID and label for the link and fallback URL.
  */
inline def shareDeepLink(deepLinkParameters: DeepLinkParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shareDeepLink")(deepLinkParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Hide from docs.
  * ------
  * display notification API.
  * @param message Notification message.
  * @param notificationType Notification type
  */
inline def showNotification(showNotificationParameters: ShowNotificationParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotification")(showNotificationParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Hide from docs.
  * ------
  * Undocumented function used to clear state between unit tests
  */
inline def uninitialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_uninitialize")().asInstanceOf[Unit]

inline def uninitializeCommunication(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninitializeCommunication")().asInstanceOf[Unit]

/**
  * Hide from docs.
  * ------
  * Upload a custom App manifest directly to both team and personal scopes.
  * This method works just for the first party Apps.
  */
inline def uploadCustomApp(manifestBlob: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadCustomApp")(manifestBlob.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def uploadCustomApp(
  manifestBlob: Blob,
  onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadCustomApp")(manifestBlob.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * USer specified message origins should satisfy this test
  */
inline def userOriginUrlValidationRegExp: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("userOriginUrlValidationRegExp").asInstanceOf[js.RegExp]

inline def validOriginRegExp: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("validOriginRegExp").asInstanceOf[js.RegExp]

/**
  * List of supported Host origins
  */
inline def validOrigins: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("validOrigins").asInstanceOf[js.Array[String]]

/**
  * Returns true if the get Media params are valid and false otherwise
  */
inline def validateGetMediaInputs(mimeType: String, format: FileFormat, content: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateGetMediaInputs")(mimeType.asInstanceOf[js.Any], format.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Returns true if the people picker params are valid and false otherwise
  */
inline def validatePeoplePickerInput(peoplePickerInputs: PeoplePickerInputs): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeoplePickerInput")(peoplePickerInputs.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns true if the scan barcode param is valid and false otherwise
  */
inline def validateScanBarCodeInput(barCodeConfig: BarCodeConfig): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateScanBarCodeInput")(barCodeConfig.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns true if the mediaInput params are valid and false otherwise
  */
inline def validateSelectMediaInputs(mediaInputs: MediaInputs): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSelectMediaInputs")(mediaInputs.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns true if the view images param is valid and false otherwise
  */
inline def validateViewImagesInput(uriList: js.Array[ImageUri]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateViewImagesInput")(uriList.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def version: /* "1.10.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[/* "1.10.0" */ String]

inline def waitForMessageQueue(targetWindow: Window, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForMessageQueue")(targetWindow.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

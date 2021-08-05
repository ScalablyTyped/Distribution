package typings.microsoftteams

import typings.microsoftteams.microsoftTeams.Context
import typings.microsoftteams.microsoftTeams.DeepLinkParameters
import typings.microsoftteams.microsoftTeams.TabInformation
import typings.microsoftteams.microsoftTeams.TabInstance
import typings.microsoftteams.microsoftTeams.TabInstanceParameters
import typings.microsoftteams.microsoftTeams.authentication.AuthTokenRequest
import typings.microsoftteams.microsoftTeams.authentication.AuthenticateParameters
import typings.microsoftteams.microsoftTeams.authentication.UserRequest
import typings.microsoftteams.microsoftTeams.settings.RemoveEvent
import typings.microsoftteams.microsoftTeams.settings.SaveEvent
import typings.microsoftteams.microsoftTeams.settings.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * This is the root namespace for the JavaScript SDK.
    */
  object microsoftTeams {
    
    @JSGlobal("microsoftTeams")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Namespace to interact with the authentication-specific part of the SDK.
      * This object is used for starting or completing authentication flows.
      */
    object authentication {
      
      @JSGlobal("microsoftTeams.authentication")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Initiates an authentication request, which opens a new window with the specified settings.
        * @param authenticateParameters A set of values that configure the authentication pop-up.
        */
      inline def authenticate(authenticateParameters: AuthenticateParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authenticateParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Requests an Azure AD token to be issued on behalf of the app. The token is acquired from the cache
        * if it is not expired. Otherwise a request is sent to Azure AD to obtain a new token.
        * @param authTokenRequest A set of values that configure the token request.
        */
      inline def getAuthToken(authTokenRequest: AuthTokenRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(authTokenRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Requests the decoded Azure AD user identity on behalf of the app.
        */
      inline def getUser(userRequest: UserRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(userRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Notifies the frame that initiated this authentication request that the request failed.
        * This function is usable only on the authentication window.
        * This call causes the authentication window to be closed.
        * @param reason Specifies a reason for the authentication failure. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
        */
      inline def notifyFailure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")().asInstanceOf[Unit]
      inline def notifyFailure(reason: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Notifies the frame that initiated this authentication request that the request was successful.
        * This function is usable only on the authentication window.
        * This call causes the authentication window to be closed.
        * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
        */
      inline def notifySuccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")().asInstanceOf[Unit]
      inline def notifySuccess(result: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Retrieves the current context the frame is running in.
      * @param callback The callback to invoke when the {@link Context} object is retrieved.
      */
    inline def getContext(callback: js.Function1[/* context */ Context, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
      * Initializes the library. This must be called before any other SDK calls
      * but after the frame is loaded successfully.
      */
    inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
    
    /**
      * Navigates the frame to a new cross-domain URL. The domain of this URL must match at least one of the
      * valid domains specified in the validDomains block of the manifest; otherwise, an exception will be
      * thrown. This function needs to be used only when navigating the frame to a URL in a different domain
      * than the current one in a way that keeps the app informed of the change and allows the SDK to
      * continue working.
      * @param url The URL to navigate the frame to.
      */
    inline def navigateCrossDomain(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateCrossDomain")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Navigates the Microsoft Teams app to the specified tab instance.
      * @param tabInstance The tab instance to navigate to.
      */
    inline def navigateToTab(tabInstance: TabInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToTab")(tabInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Registers a handler for changes from or to full-screen view for a tab.
      * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
      * @param handler The handler to invoke when the user toggles full-screen view for a tab.
      */
    inline def registerFullScreenHandler(handler: js.Function1[/* isFullScreen */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFullScreenHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Registers a handler for theme changes.
      * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
      * @param handler The handler to invoke when the user changes their theme.
      */
    inline def registerOnThemeChangeHandler(handler: js.Function1[/* theme */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnThemeChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Namespace to interact with the settings-specific part of the SDK.
      * This object is usable only on the settings frame.
      */
    object settings {
      
      @JSGlobal("microsoftTeams.settings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Gets the settings for the current instance.
        * @param callback The callback to invoke when the {@link Settings} object is retrieved.
        */
      inline def getSettings(callback: js.Function1[/* settings */ Settings, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Registers a handler for user attempts to remove content. This handler should be used
        * to remove the underlying resource powering the content.
        * The object passed to the handler must be used to indicate whether to proceed with the removal.
        * Only one handler may be registered at a time. Subsequent registrations will override the first.
        * @param handler The handler to invoke when the user selects the remove button.
        */
      inline def registerOnRemoveHandler(handler: js.Function1[/* evt */ RemoveEvent, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnRemoveHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Registers a handler for when the user attempts to save the settings. This handler should be used
        * to create or update the underlying resource powering the content.
        * The object passed to the handler must be used to notify whether to proceed with the save.
        * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
        * @param handler The handler to invoke when the user selects the save button.
        */
      inline def registerOnSaveHandler(handler: js.Function1[/* evt */ SaveEvent, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnSaveHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Sets the settings for the current instance.
        * This is an asynchronous operation; calls to getSettings are not guaranteed to reflect the changed state.
        * @param settings The desired settings for this instance.
        */
      inline def setSettings(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Sets the validity state for the settings.
        * The initial value is false, so the user cannot save the settings until this is called with true.
        * @param validityState Indicates whether the save or remove button is enabled for the user.
        */
      inline def setValidityState(validityState: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setValidityState")(validityState.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Shares a deep link that a user can use to navigate back to a specific state in this page.
      * @param deepLinkParameters ID and label for the link and fallback URL.
      */
    inline def shareDeepLink(deepLinkParameters: DeepLinkParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shareDeepLink")(deepLinkParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

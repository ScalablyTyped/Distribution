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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * This is the root namespace for the JavaScript SDK.
    */
  object microsoftTeams {
    
    /**
      * Namespace to interact with the authentication-specific part of the SDK.
      * This object is used for starting or completing authentication flows.
      */
    object authentication {
      
      /**
        * Initiates an authentication request, which opens a new window with the specified settings.
        * @param authenticateParameters A set of values that configure the authentication pop-up.
        */
      @JSGlobal("microsoftTeams.authentication.authenticate")
      @js.native
      def authenticate(authenticateParameters: AuthenticateParameters): Unit = js.native
      
      /**
        * Requests an Azure AD token to be issued on behalf of the app. The token is acquired from the cache
        * if it is not expired. Otherwise a request is sent to Azure AD to obtain a new token.
        * @param authTokenRequest A set of values that configure the token request.
        */
      @JSGlobal("microsoftTeams.authentication.getAuthToken")
      @js.native
      def getAuthToken(authTokenRequest: AuthTokenRequest): Unit = js.native
      
      /**
        * Requests the decoded Azure AD user identity on behalf of the app.
        */
      @JSGlobal("microsoftTeams.authentication.getUser")
      @js.native
      def getUser(userRequest: UserRequest): Unit = js.native
      
      /**
        * Notifies the frame that initiated this authentication request that the request failed.
        * This function is usable only on the authentication window.
        * This call causes the authentication window to be closed.
        * @param reason Specifies a reason for the authentication failure. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
        */
      @JSGlobal("microsoftTeams.authentication.notifyFailure")
      @js.native
      def notifyFailure(): Unit = js.native
      @JSGlobal("microsoftTeams.authentication.notifyFailure")
      @js.native
      def notifyFailure(reason: String): Unit = js.native
      
      /**
        * Notifies the frame that initiated this authentication request that the request was successful.
        * This function is usable only on the authentication window.
        * This call causes the authentication window to be closed.
        * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
        */
      @JSGlobal("microsoftTeams.authentication.notifySuccess")
      @js.native
      def notifySuccess(): Unit = js.native
      @JSGlobal("microsoftTeams.authentication.notifySuccess")
      @js.native
      def notifySuccess(result: String): Unit = js.native
    }
    
    /**
      * Retrieves the current context the frame is running in.
      * @param callback The callback to invoke when the {@link Context} object is retrieved.
      */
    @JSGlobal("microsoftTeams.getContext")
    @js.native
    def getContext(callback: js.Function1[/* context */ Context, Unit]): Unit = js.native
    
    /**
      * Allows an app to retrieve the most recently used tabs for this user.
      * @param callback The callback to invoke when the {@link TabInformation} object is retrieved.
      * @param tabInstanceParameters OPTIONAL Ignored, kept for future use
      */
    @JSGlobal("microsoftTeams.getMruTabInstances")
    @js.native
    def getMruTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = js.native
    @JSGlobal("microsoftTeams.getMruTabInstances")
    @js.native
    def getMruTabInstances(
      callback: js.Function1[/* tabInfo */ TabInformation, Unit],
      tabInstanceParameters: TabInstanceParameters
    ): Unit = js.native
    
    /**
      * Allows an app to retrieve for this user tabs that are owned by this app.
      * If no TabInstanceParameters are passed, the app defaults to favorite teams and favorite channels.
      * @param callback The callback to invoke when the {@link TabInstanceParameters} object is retrieved.
      * @param tabInstanceParameters OPTIONAL Flags that specify whether to scope call to favorite teams or channels.
      */
    @JSGlobal("microsoftTeams.getTabInstances")
    @js.native
    def getTabInstances(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = js.native
    @JSGlobal("microsoftTeams.getTabInstances")
    @js.native
    def getTabInstances(
      callback: js.Function1[/* tabInfo */ TabInformation, Unit],
      tabInstanceParameters: TabInstanceParameters
    ): Unit = js.native
    
    /**
      * Initializes the library. This must be called before any other SDK calls
      * but after the frame is loaded successfully.
      */
    @JSGlobal("microsoftTeams.initialize")
    @js.native
    def initialize(): Unit = js.native
    
    /**
      * Navigates the frame to a new cross-domain URL. The domain of this URL must match at least one of the
      * valid domains specified in the validDomains block of the manifest; otherwise, an exception will be
      * thrown. This function needs to be used only when navigating the frame to a URL in a different domain
      * than the current one in a way that keeps the app informed of the change and allows the SDK to
      * continue working.
      * @param url The URL to navigate the frame to.
      */
    @JSGlobal("microsoftTeams.navigateCrossDomain")
    @js.native
    def navigateCrossDomain(url: String): Unit = js.native
    
    /**
      * Navigates the Microsoft Teams app to the specified tab instance.
      * @param tabInstance The tab instance to navigate to.
      */
    @JSGlobal("microsoftTeams.navigateToTab")
    @js.native
    def navigateToTab(tabInstance: TabInstance): Unit = js.native
    
    /**
      * Registers a handler for changes from or to full-screen view for a tab.
      * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
      * @param handler The handler to invoke when the user toggles full-screen view for a tab.
      */
    @JSGlobal("microsoftTeams.registerFullScreenHandler")
    @js.native
    def registerFullScreenHandler(handler: js.Function1[/* isFullScreen */ Boolean, Unit]): Unit = js.native
    
    /**
      * Registers a handler for theme changes.
      * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
      * @param handler The handler to invoke when the user changes their theme.
      */
    @JSGlobal("microsoftTeams.registerOnThemeChangeHandler")
    @js.native
    def registerOnThemeChangeHandler(handler: js.Function1[/* theme */ String, Unit]): Unit = js.native
    
    /**
      * Namespace to interact with the settings-specific part of the SDK.
      * This object is usable only on the settings frame.
      */
    object settings {
      
      /**
        * Gets the settings for the current instance.
        * @param callback The callback to invoke when the {@link Settings} object is retrieved.
        */
      @JSGlobal("microsoftTeams.settings.getSettings")
      @js.native
      def getSettings(callback: js.Function1[/* settings */ Settings, Unit]): Unit = js.native
      
      /**
        * Registers a handler for user attempts to remove content. This handler should be used
        * to remove the underlying resource powering the content.
        * The object passed to the handler must be used to indicate whether to proceed with the removal.
        * Only one handler may be registered at a time. Subsequent registrations will override the first.
        * @param handler The handler to invoke when the user selects the remove button.
        */
      @JSGlobal("microsoftTeams.settings.registerOnRemoveHandler")
      @js.native
      def registerOnRemoveHandler(handler: js.Function1[/* evt */ RemoveEvent, Unit]): Unit = js.native
      
      /**
        * Registers a handler for when the user attempts to save the settings. This handler should be used
        * to create or update the underlying resource powering the content.
        * The object passed to the handler must be used to notify whether to proceed with the save.
        * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
        * @param handler The handler to invoke when the user selects the save button.
        */
      @JSGlobal("microsoftTeams.settings.registerOnSaveHandler")
      @js.native
      def registerOnSaveHandler(handler: js.Function1[/* evt */ SaveEvent, Unit]): Unit = js.native
      
      /**
        * Sets the settings for the current instance.
        * This is an asynchronous operation; calls to getSettings are not guaranteed to reflect the changed state.
        * @param settings The desired settings for this instance.
        */
      @JSGlobal("microsoftTeams.settings.setSettings")
      @js.native
      def setSettings(settings: Settings): Unit = js.native
      
      /**
        * Sets the validity state for the settings.
        * The initial value is false, so the user cannot save the settings until this is called with true.
        * @param validityState Indicates whether the save or remove button is enabled for the user.
        */
      @JSGlobal("microsoftTeams.settings.setValidityState")
      @js.native
      def setValidityState(validityState: Boolean): Unit = js.native
    }
    
    /**
      * Shares a deep link that a user can use to navigate back to a specific state in this page.
      * @param deepLinkParameters ID and label for the link and fallback URL.
      */
    @JSGlobal("microsoftTeams.shareDeepLink")
    @js.native
    def shareDeepLink(deepLinkParameters: DeepLinkParameters): Unit = js.native
  }
}

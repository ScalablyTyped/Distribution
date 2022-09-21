package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.authentication.AuthTokenRequest
import typings.microsoftteams.microsoftTeams.authentication.AuthenticateParameters
import typings.microsoftteams.microsoftTeams.authentication.UserRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    */
  inline def authenticate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")().asInstanceOf[Unit]
  inline def authenticate(authenticateParameters: AuthenticateParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(authenticateParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Requests an Azure AD token to be issued on behalf of the app. The token is acquired from the cache
    * if it is not expired. Otherwise a request is sent to Azure AD to obtain a new token.
    * @param authTokenRequest A set of values that configure the token request.
    */
  inline def getAuthToken(authTokenRequest: AuthTokenRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthToken")(authTokenRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs.
    * ------
    * Requests the decoded Azure AD user identity on behalf of the app.
    */
  inline def getUser(userRequest: UserRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(userRequest.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  
  /**
    * Notifies the frame that initiated this authentication request that the request failed.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    * @param callbackUrl Specifies the url to redirect back to if the client is Win32 Outlook.
    */
  inline def notifyFailure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")().asInstanceOf[Unit]
  inline def notifyFailure(reason: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")(reason.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notifyFailure(reason: String, callbackUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")(reason.asInstanceOf[js.Any], callbackUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notifyFailure(reason: Unit, callbackUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifyFailure")(reason.asInstanceOf[js.Any], callbackUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Notifies the frame that initiated this authentication request that the request was successful.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    * @param callbackUrl Specifies the url to redirect back to if the client is Win32 Outlook.
    */
  inline def notifySuccess(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")().asInstanceOf[Unit]
  inline def notifySuccess(result: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def notifySuccess(result: String, callbackUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")(result.asInstanceOf[js.Any], callbackUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notifySuccess(result: Unit, callbackUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notifySuccess")(result.asInstanceOf[js.Any], callbackUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Registers the authentication Communication.handlers
    * @param authenticateParameters A set of values that configure the authentication pop-up.
    */
  inline def registerAuthenticationHandlers(authenticateParameters: AuthenticateParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationHandlers")(authenticateParameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

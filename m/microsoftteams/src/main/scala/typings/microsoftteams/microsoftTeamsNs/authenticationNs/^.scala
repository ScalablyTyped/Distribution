package typings.microsoftteams.microsoftTeamsNs.authenticationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.authentication")
@js.native
object ^ extends js.Object {
  /**
    * Initiates an authentication request, which opens a new window with the specified settings.
    * @param authenticateParameters A set of values that configure the authentication pop-up.
    */
  def authenticate(authenticateParameters: AuthenticateParameters): Unit = js.native
  /**
    * Requests an Azure AD token to be issued on behalf of the app. The token is acquired from the cache
    * if it is not expired. Otherwise a request is sent to Azure AD to obtain a new token.
    * @param authTokenRequest A set of values that configure the token request.
    */
  def getAuthToken(authTokenRequest: AuthTokenRequest): Unit = js.native
  /**
    * Requests the decoded Azure AD user identity on behalf of the app.
    */
  def getUser(userRequest: UserRequest): Unit = js.native
  /**
    * Notifies the frame that initiated this authentication request that the request failed.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param reason Specifies a reason for the authentication failure. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    */
  def notifyFailure(): Unit = js.native
  def notifyFailure(reason: String): Unit = js.native
  /**
    * Notifies the frame that initiated this authentication request that the request was successful.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    */
  def notifySuccess(): Unit = js.native
  def notifySuccess(result: String): Unit = js.native
}


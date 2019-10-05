package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.authentication.getAuthToken")
@js.native
object getAuthToken extends js.Object {
  /**
    * Requests an Azure AD token to be issued on behalf of the app. The token is acquired from the cache
    * if it is not expired. Otherwise a request is sent to Azure AD to obtain a new token.
    * @param authTokenRequest A set of values that configure the token request.
    */
  def apply(authTokenRequest: AuthTokenRequest): Unit = js.native
}


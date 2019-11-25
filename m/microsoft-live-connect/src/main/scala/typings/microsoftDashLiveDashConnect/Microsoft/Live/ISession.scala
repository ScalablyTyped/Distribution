package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion API Properties Interfaces
/**
  * Represents the user's session.
  */
trait ISession extends js.Object {
  /**
    * The user's access token.
    */
  var access_token: String
  /**
    * The authentication token.
    */
  var authentication_token: String
  /**
    * The exact time when the session will expire. This time is expressed
    * in the number of seconds since 1 January, 1970.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time remaining, in seconds, until the user's access
    * token expires.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires_in: js.UndefOr[Double] = js.undefined
  /**
    * A list of scopes that the app has requested and that the user has
    * consented to.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}

object ISession {
  @scala.inline
  def apply(
    access_token: String,
    authentication_token: String,
    expires: Int | Double = null,
    expires_in: Int | Double = null,
    scope: js.Array[String] = null
  ): ISession = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], authentication_token = authentication_token.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
}


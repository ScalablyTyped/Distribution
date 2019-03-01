package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var access_token: java.lang.String
  /**
    * The authentication token.
    */
  var authentication_token: java.lang.String
  /**
    * The exact time when the session will expire. This time is expressed
    * in the number of seconds since 1 January, 1970.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of time remaining, in seconds, until the user's access
    * token expires.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var expires_in: js.UndefOr[scala.Double] = js.undefined
  /**
    * A list of scopes that the app has requested and that the user has
    * consented to.
    *
    * Note: This property is not available for Windows Store apps using
    * JavaScript.
    */
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ISession {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    authentication_token: java.lang.String,
    expires: scala.Int | scala.Double = null,
    expires_in: scala.Int | scala.Double = null,
    scope: js.Array[java.lang.String] = null
  ): ISession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("authentication_token")(authentication_token)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ISession]
  }
}


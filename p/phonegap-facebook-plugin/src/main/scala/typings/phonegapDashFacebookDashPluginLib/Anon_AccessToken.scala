package typings
package phonegapDashFacebookDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: java.lang.String
  var expiresIn: java.lang.String
  var secret: java.lang.String
  var session_key: scala.Boolean
  var sig: java.lang.String
  var userID: java.lang.String
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expiresIn: java.lang.String,
    secret: java.lang.String,
    session_key: scala.Boolean,
    sig: java.lang.String,
    userID: java.lang.String
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("expiresIn")(expiresIn)
    __obj.updateDynamic("secret")(secret)
    __obj.updateDynamic("session_key")(session_key)
    __obj.updateDynamic("sig")(sig)
    __obj.updateDynamic("userID")(userID)
    __obj.asInstanceOf[Anon_AccessToken]
  }
}


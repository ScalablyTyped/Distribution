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
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, secret = secret, session_key = session_key, sig = sig, userID = userID)
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}


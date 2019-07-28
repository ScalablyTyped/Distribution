package typings.phonegapDashFacebookDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: String
  var expiresIn: String
  var secret: String
  var session_key: Boolean
  var sig: String
  var userID: String
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: String,
    secret: String,
    session_key: Boolean,
    sig: String,
    userID: String
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, secret = secret, session_key = session_key, sig = sig, userID = userID)
  
    __obj.asInstanceOf[Anon_AccessToken]
  }
}


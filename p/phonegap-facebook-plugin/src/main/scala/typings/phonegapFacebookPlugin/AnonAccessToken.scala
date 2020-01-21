package typings.phonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessToken extends js.Object {
  var accessToken: String
  var expiresIn: String
  var secret: String
  var session_key: Boolean
  var sig: String
  var userID: String
}

object AnonAccessToken {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: String,
    secret: String,
    session_key: Boolean,
    sig: String,
    userID: String
  ): AnonAccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], session_key = session_key.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccessToken]
  }
}


package typings.netlifyIdentityWidget.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var access_token: String
  var expires_at: String | Double
  var expires_in: String | Double
  var refresh_token: String
  var token_type: String
}

object Token {
  @scala.inline
  def apply(
    access_token: String,
    expires_at: String | Double,
    expires_in: String | Double,
    refresh_token: String,
    token_type: String
  ): Token = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}


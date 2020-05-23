package typings.passportGoogleOauth2.anon

import typings.passportGoogleOauth2.passportGoogleOauth2Strings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  var access_token: String
  var expires_in: Double
  var id_token: String
  var scope: String
  var token_type: Bearer
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, id_token: String, scope: String, token_type: Bearer): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}


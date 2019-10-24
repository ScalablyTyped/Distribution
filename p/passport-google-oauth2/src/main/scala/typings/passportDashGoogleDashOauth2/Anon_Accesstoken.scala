package typings.passportDashGoogleDashOauth2

import typings.passportDashGoogleDashOauth2.passportDashGoogleDashOauth2Strings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken extends js.Object {
  var access_token: String
  var expires_in: Double
  var id_token: String
  var scope: String
  var token_type: Bearer
}

object Anon_Accesstoken {
  @scala.inline
  def apply(access_token: String, expires_in: Double, id_token: String, scope: String, token_type: Bearer): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, id_token = id_token, scope = scope, token_type = token_type)
  
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}


package typings.passportVkontakte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var accessToken: String
  var email: js.UndefOr[String] = js.undefined
  var expires_in: Double
  var user_id: Double
}

object Params {
  @scala.inline
  def apply(accessToken: String, expires_in: Double, user_id: Double, email: String = null): Params = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}


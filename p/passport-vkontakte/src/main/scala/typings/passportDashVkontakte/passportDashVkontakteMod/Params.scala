package typings.passportDashVkontakte.passportDashVkontakteMod

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
    val __obj = js.Dynamic.literal(accessToken = accessToken, expires_in = expires_in, user_id = user_id)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Params]
  }
}


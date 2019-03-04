package typings
package passportDashVkontakteLib.passportDashVkontakteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var accessToken: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var expires_in: scala.Double
  var user_id: scala.Double
}

object Params {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expires_in: scala.Double,
    user_id: scala.Double,
    email: java.lang.String = null
  ): Params = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expires_in = expires_in, user_id = user_id)
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Params]
  }
}


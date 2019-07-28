package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[js.Object] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(email: String = null, password: String = null, profile: js.Object = null, username: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (password != null) __obj.updateDynamic("password")(password)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Email]
  }
}


package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[js.Object] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonEmail {
  @scala.inline
  def apply(email: String = null, password: String = null, profile: js.Object = null, username: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}


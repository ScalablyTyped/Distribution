package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  var androidId: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(androidId: String = null, email: String = null, password: String = null): LoginOptions = {
    val __obj = js.Dynamic.literal()
    if (androidId != null) __obj.updateDynamic("androidId")(androidId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOptions]
  }
}


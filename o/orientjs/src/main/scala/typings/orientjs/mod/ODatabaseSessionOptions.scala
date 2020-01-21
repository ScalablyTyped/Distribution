package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionOptions extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ODatabaseSessionOptions {
  @scala.inline
  def apply(name: String, password: String = null, username: String = null): ODatabaseSessionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODatabaseSessionOptions]
  }
}


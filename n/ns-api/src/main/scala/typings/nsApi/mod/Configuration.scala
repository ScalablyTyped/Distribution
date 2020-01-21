package typings.nsApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var password: String
  var timeout: js.UndefOr[Double] = js.undefined
  var username: String
}

object Configuration {
  @scala.inline
  def apply(password: String, username: String, timeout: Int | Double = null): Configuration = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}


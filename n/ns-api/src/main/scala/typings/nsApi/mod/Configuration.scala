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
  def apply(password: String, username: String, timeout: js.UndefOr[Double] = js.undefined): Configuration = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}


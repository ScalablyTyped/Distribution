package typings.netconf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var pkey: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var username: String
}

object AnonHost {
  @scala.inline
  def apply(
    host: String,
    username: String,
    password: String = null,
    pkey: String = null,
    port: Int | Double = null
  ): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pkey != null) __obj.updateDynamic("pkey")(pkey.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}


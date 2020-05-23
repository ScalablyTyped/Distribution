package typings.netconf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var pkey: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var username: String
}

object Host {
  @scala.inline
  def apply(
    host: String,
    username: String,
    password: String = null,
    pkey: String = null,
    port: js.UndefOr[Double] = js.undefined
  ): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pkey != null) __obj.updateDynamic("pkey")(pkey.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}


package typings.orientjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Host {
  @scala.inline
  def apply(
    host: String,
    name: String,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    username: String = null
  ): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}


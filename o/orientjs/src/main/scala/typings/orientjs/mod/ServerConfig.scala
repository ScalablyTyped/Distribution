package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  var host: String
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var servers: js.UndefOr[js.Array[ServerConfig]] = js.undefined
  var useToken: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    host: String,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    servers: js.Array[ServerConfig] = null,
    useToken: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): ServerConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (!js.isUndefined(useToken)) __obj.updateDynamic("useToken")(useToken.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
}


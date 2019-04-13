package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  var host: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var servers: js.UndefOr[js.Array[ServerConfig]] = js.undefined
  var useToken: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    servers: js.Array[ServerConfig] = null,
    useToken: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): ServerConfig = {
    val __obj = js.Dynamic.literal(host = host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers)
    if (!js.isUndefined(useToken)) __obj.updateDynamic("useToken")(useToken)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ServerConfig]
  }
}


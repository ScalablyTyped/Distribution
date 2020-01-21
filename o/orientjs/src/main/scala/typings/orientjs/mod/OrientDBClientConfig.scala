package typings.orientjs.mod

import typings.orientjs.AnonMax
import typings.orientjs.AnonMaxNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrientDBClientConfig extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var pool: js.UndefOr[AnonMax] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var servers: js.UndefOr[js.Array[OServerConfig]] = js.undefined
  var subscribePool: js.UndefOr[AnonMaxNumber] = js.undefined
}

object OrientDBClientConfig {
  @scala.inline
  def apply(
    host: String = null,
    logger: js.Any = null,
    pool: AnonMax = null,
    port: Int | Double = null,
    servers: js.Array[OServerConfig] = null,
    subscribePool: AnonMaxNumber = null
  ): OrientDBClientConfig = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (servers != null) __obj.updateDynamic("servers")(servers.asInstanceOf[js.Any])
    if (subscribePool != null) __obj.updateDynamic("subscribePool")(subscribePool.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrientDBClientConfig]
  }
}


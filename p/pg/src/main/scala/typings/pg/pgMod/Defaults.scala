package typings.pg.pgMod

import typings.node.streamMod.Duplex
import typings.pg.pgNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends ConnectionConfig {
  var binary: js.UndefOr[Boolean] = js.undefined
  var parseInt8: js.UndefOr[Boolean] = js.undefined
  var poolIdleTimeout: js.UndefOr[Double] = js.undefined
  var poolSize: js.UndefOr[Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
}

object Defaults {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    connectionString: String = null,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    parseInt8: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    poolIdleTimeout: Int | Double = null,
    poolSize: Int | Double = null,
    port: Int | Double = null,
    reapIntervalMillis: Int | Double = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): Defaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (!js.isUndefined(parseInt8)) __obj.updateDynamic("parseInt8")(parseInt8)
    if (password != null) __obj.updateDynamic("password")(password)
    if (poolIdleTimeout != null) __obj.updateDynamic("poolIdleTimeout")(poolIdleTimeout.asInstanceOf[js.Any])
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (reapIntervalMillis != null) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Defaults]
  }
}


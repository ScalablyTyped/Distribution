package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends ConnectionConfig {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var parseInt8: js.UndefOr[scala.Boolean] = js.undefined
  var poolIdleTimeout: js.UndefOr[scala.Double] = js.undefined
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[scala.Double] = js.undefined
}

object Defaults {
  @scala.inline
  def apply(
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    connectionString: java.lang.String = null,
    database: java.lang.String = null,
    host: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    parseInt8: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    poolIdleTimeout: scala.Int | scala.Double = null,
    poolSize: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    reapIntervalMillis: scala.Int | scala.Double = null,
    statement_timeout: pgLib.pgLibNumbers.`false` | scala.Double = null,
    stream: nodeLib.streamMod.Duplex = null,
    user: java.lang.String = null
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


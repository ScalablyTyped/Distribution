package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionString: js.UndefOr[java.lang.String] = js.undefined
  var database: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var statement_timeout: js.UndefOr[pgLib.pgLibNumbers.`false` | scala.Double] = js.undefined
  var stream: js.UndefOr[nodeLib.streamMod.Duplex] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    connectionString: java.lang.String = null,
    database: java.lang.String = null,
    host: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    statement_timeout: pgLib.pgLibNumbers.`false` | scala.Double = null,
    stream: nodeLib.streamMod.Duplex = null,
    user: java.lang.String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionConfig]
  }
}


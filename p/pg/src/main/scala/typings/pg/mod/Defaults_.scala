package typings.pg.mod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.pgBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults_ extends ClientConfig {
  var binary: js.UndefOr[Boolean] = js.undefined
  var parseInt8: js.UndefOr[Boolean] = js.undefined
  var poolIdleTimeout: js.UndefOr[Double] = js.undefined
  var poolSize: js.UndefOr[Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
}

object Defaults_ {
  @scala.inline
  def apply(
    binary: js.UndefOr[Boolean] = js.undefined,
    connectionString: String = null,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    parseInt8: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    poolIdleTimeout: Int | Double = null,
    poolSize: Int | Double = null,
    port: Int | Double = null,
    query_timeout: Int | Double = null,
    reapIntervalMillis: Int | Double = null,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): Defaults_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInt8)) __obj.updateDynamic("parseInt8")(parseInt8.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (poolIdleTimeout != null) __obj.updateDynamic("poolIdleTimeout")(poolIdleTimeout.asInstanceOf[js.Any])
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query_timeout != null) __obj.updateDynamic("query_timeout")(query_timeout.asInstanceOf[js.Any])
    if (reapIntervalMillis != null) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
}


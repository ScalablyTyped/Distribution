package typings.pg.pgMod

import typings.node.streamMod.Duplex
import typings.pg.pgNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionString: js.UndefOr[String] = js.undefined
  var connectionTimeoutMillis: js.UndefOr[Double] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var statement_timeout: js.UndefOr[`false` | Double] = js.undefined
  var stream: js.UndefOr[Duplex] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    connectionString: String = null,
    connectionTimeoutMillis: Int | Double = null,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (connectionTimeoutMillis != null) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}


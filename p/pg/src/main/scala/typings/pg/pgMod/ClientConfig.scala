package typings.pg.pgMod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.pgNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends ConnectionConfig {
  var ssl: js.UndefOr[Boolean | ConnectionOptions] = js.undefined
}

object ClientConfig {
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
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (connectionTimeoutMillis != null) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}


package typings.pg.pgMod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.pgNumbers.`false`
import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ClientConfig {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  var application_name: js.UndefOr[String] = js.undefined
  var connectionTimeoutMillis: js.UndefOr[Double] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  // properties from module 'node-pool'
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    Promise: PromiseConstructorLike = null,
    application_name: String = null,
    connectionString: String = null,
    connectionTimeoutMillis: Int | Double = null,
    database: String = null,
    host: String = null,
    idleTimeoutMillis: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (application_name != null) __obj.updateDynamic("application_name")(application_name)
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (connectionTimeoutMillis != null) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[PoolConfig]
  }
}


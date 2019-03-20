package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ClientConfig {
  var Promise: js.UndefOr[stdLib.PromiseConstructorLike] = js.undefined
  var application_name: js.UndefOr[java.lang.String] = js.undefined
  var connectionTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var idleTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  // properties from module 'node-pool'
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    Promise: stdLib.PromiseConstructorLike = null,
    application_name: java.lang.String = null,
    connectionString: java.lang.String = null,
    connectionTimeoutMillis: scala.Int | scala.Double = null,
    database: java.lang.String = null,
    host: java.lang.String = null,
    idleTimeoutMillis: scala.Int | scala.Double = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    ssl: scala.Boolean | nodeLib.tlsMod.ConnectionOptions = null,
    statement_timeout: pgLib.pgLibNumbers.`false` | scala.Double = null,
    stream: nodeLib.streamMod.Duplex = null,
    user: java.lang.String = null
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


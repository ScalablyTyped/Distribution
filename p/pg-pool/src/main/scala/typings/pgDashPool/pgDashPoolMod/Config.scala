package typings.pgDashPool.pgDashPoolMod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.pgMod.Client
import typings.pg.pgMod.PoolConfig
import typings.pg.pgNumbers.`false`
import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[T /* <: Client */] extends PoolConfig {
  var Client: js.UndefOr[ClientLikeCtr[T]] = js.undefined
}

object Config {
  @scala.inline
  def apply[T /* <: Client */](
    Client: ClientLikeCtr[T] = null,
    Promise: PromiseConstructorLike = null,
    application_name: String = null,
    connectionString: String = null,
    connectionTimeoutMillis: Int | Double = null,
    database: String = null,
    host: String = null,
    idleTimeoutMillis: Int | Double = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    log: /* repeated */ js.Any => Unit = null,
    max: Int | Double = null,
    min: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): Config[T] = {
    val __obj = js.Dynamic.literal()
    if (Client != null) __obj.updateDynamic("Client")(Client.asInstanceOf[js.Any])
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (application_name != null) __obj.updateDynamic("application_name")(application_name.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (connectionTimeoutMillis != null) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[T]]
  }
}


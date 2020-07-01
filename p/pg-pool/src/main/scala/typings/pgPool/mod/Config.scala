package typings.pgPool.mod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.mod.Client
import typings.pg.mod.PoolConfig
import typings.pg.pgBooleans.`false`
import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[T /* <: Client */] extends PoolConfig {
  var Client: js.UndefOr[ClientLikeCtr[T]] = js.undefined
}

object Config {
  @scala.inline
  def apply[/* <: typings.pg.mod.Client */ T](
    Client: ClientLikeCtr[T] = null,
    Promise: PromiseConstructorLike = null,
    application_name: String = null,
    connectionString: String = null,
    connectionTimeoutMillis: js.UndefOr[Double] = js.undefined,
    database: String = null,
    host: String = null,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    idle_in_transaction_session_timeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined,
    log: /* repeated */ js.Any => Unit = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    query_timeout: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(connectionTimeoutMillis)) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idle_in_transaction_session_timeout)) __obj.updateDynamic("idle_in_transaction_session_timeout")(idle_in_transaction_session_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelayMillis)) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputDatesAsUTC)) __obj.updateDynamic("parseInputDatesAsUTC")(parseInputDatesAsUTC.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(query_timeout)) __obj.updateDynamic("query_timeout")(query_timeout.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[T]]
  }
}


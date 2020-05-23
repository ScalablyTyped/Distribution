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
    idle_in_transaction_session_timeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined,
    parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined,
    parseInt8: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    poolIdleTimeout: js.UndefOr[Double] = js.undefined,
    poolSize: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    query_timeout: js.UndefOr[Double] = js.undefined,
    reapIntervalMillis: js.UndefOr[Double] = js.undefined,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): Defaults_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(idle_in_transaction_session_timeout)) __obj.updateDynamic("idle_in_transaction_session_timeout")(idle_in_transaction_session_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelayMillis)) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputDatesAsUTC)) __obj.updateDynamic("parseInputDatesAsUTC")(parseInputDatesAsUTC.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInt8)) __obj.updateDynamic("parseInt8")(parseInt8.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(poolIdleTimeout)) __obj.updateDynamic("poolIdleTimeout")(poolIdleTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(query_timeout)) __obj.updateDynamic("query_timeout")(query_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reapIntervalMillis)) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults_]
  }
}


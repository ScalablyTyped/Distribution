package typings.pg.mod

import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.pg.pgBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var connectionString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var idle_in_transaction_session_timeout: js.UndefOr[Double] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var query_timeout: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean | ConnectionOptions] = js.undefined
  var statement_timeout: js.UndefOr[`false` | Double] = js.undefined
  var stream: js.UndefOr[Duplex] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    connectionString: String = null,
    database: String = null,
    host: String = null,
    idle_in_transaction_session_timeout: js.UndefOr[Double] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined,
    parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    query_timeout: js.UndefOr[Double] = js.undefined,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(idle_in_transaction_session_timeout)) __obj.updateDynamic("idle_in_transaction_session_timeout")(idle_in_transaction_session_timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelayMillis)) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputDatesAsUTC)) __obj.updateDynamic("parseInputDatesAsUTC")(parseInputDatesAsUTC.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(query_timeout)) __obj.updateDynamic("query_timeout")(query_timeout.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}


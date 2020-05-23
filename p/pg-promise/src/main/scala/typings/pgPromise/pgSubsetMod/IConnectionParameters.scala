package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
trait IConnectionParameters[C /* <: IClient */] extends js.Object {
  var Client: js.UndefOr[Instantiable1[/* config */ String | IConnectionParameters[IClient], C]] = js.undefined
  var application_name: js.UndefOr[String] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var client_encoding: js.UndefOr[String] = js.undefined
  var connectionString: js.UndefOr[String] = js.undefined
  var connectionTimeoutMillis: js.UndefOr[Double] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fallback_application_name: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var isDomainSocket: js.UndefOr[Boolean] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined
  var keepalives: js.UndefOr[Double] = js.undefined
  var keepalives_idle: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[DynamicPassword] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var query_timeout: js.UndefOr[Boolean | Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean | ISSLConfig] = js.undefined
  var statement_timeout: js.UndefOr[Boolean | Double] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object IConnectionParameters {
  @scala.inline
  def apply[C](
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], C] = null,
    application_name: String = null,
    binary: js.UndefOr[Boolean] = js.undefined,
    client_encoding: String = null,
    connectionString: String = null,
    connectionTimeoutMillis: js.UndefOr[Double] = js.undefined,
    database: String = null,
    encoding: String = null,
    fallback_application_name: String = null,
    host: String = null,
    idleTimeoutMillis: js.UndefOr[Double] = js.undefined,
    isDomainSocket: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined,
    keepalives: js.UndefOr[Double] = js.undefined,
    keepalives_idle: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined,
    password: DynamicPassword = null,
    port: js.UndefOr[Double] = js.undefined,
    query_timeout: Boolean | Double = null,
    rows: js.UndefOr[Double] = js.undefined,
    ssl: Boolean | ISSLConfig = null,
    statement_timeout: Boolean | Double = null,
    user: String = null
  ): IConnectionParameters[C] = {
    val __obj = js.Dynamic.literal()
    if (Client != null) __obj.updateDynamic("Client")(Client.asInstanceOf[js.Any])
    if (application_name != null) __obj.updateDynamic("application_name")(application_name.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.get.asInstanceOf[js.Any])
    if (client_encoding != null) __obj.updateDynamic("client_encoding")(client_encoding.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeoutMillis)) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fallback_application_name != null) __obj.updateDynamic("fallback_application_name")(fallback_application_name.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeoutMillis)) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDomainSocket)) __obj.updateDynamic("isDomainSocket")(isDomainSocket.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelayMillis)) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalives)) __obj.updateDynamic("keepalives")(keepalives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalives_idle)) __obj.updateDynamic("keepalives_idle")(keepalives_idle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputDatesAsUTC)) __obj.updateDynamic("parseInputDatesAsUTC")(parseInputDatesAsUTC.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (query_timeout != null) __obj.updateDynamic("query_timeout")(query_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionParameters[C]]
  }
}


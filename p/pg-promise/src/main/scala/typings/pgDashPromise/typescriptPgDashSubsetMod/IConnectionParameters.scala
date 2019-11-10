package typings.pgDashPromise.typescriptPgDashSubsetMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See:
// 1) https://github.com/brianc/node-postgres/blob/master/lib/defaults.js
// 2) https://github.com/brianc/node-pg-pool
trait IConnectionParameters[C /* <: IClient */] extends js.Object {
  var Client: js.UndefOr[Instantiable1[/* config */ String | IConnectionParameters[IClient], C]] = js.undefined
  var application_name: js.UndefOr[String] = js.undefined
  var binary: js.UndefOr[Boolean] = js.undefined
  var client_encoding: js.UndefOr[String] = js.undefined
  var connect_timeout: js.UndefOr[Double] = js.undefined
  var connectionString: js.UndefOr[String] = js.undefined
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
  var min: js.UndefOr[Double] = js.undefined
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
  def apply[C /* <: IClient */](
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], C] = null,
    application_name: String = null,
    binary: js.UndefOr[Boolean] = js.undefined,
    client_encoding: String = null,
    connect_timeout: Int | Double = null,
    connectionString: String = null,
    database: String = null,
    encoding: String = null,
    fallback_application_name: String = null,
    host: String = null,
    idleTimeoutMillis: Int | Double = null,
    isDomainSocket: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    keepalives: Int | Double = null,
    keepalives_idle: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    parseInputDatesAsUTC: js.UndefOr[Boolean] = js.undefined,
    password: DynamicPassword = null,
    port: Int | Double = null,
    query_timeout: Boolean | Double = null,
    rows: Int | Double = null,
    ssl: Boolean | ISSLConfig = null,
    statement_timeout: Boolean | Double = null,
    user: String = null
  ): IConnectionParameters[C] = {
    val __obj = js.Dynamic.literal()
    if (Client != null) __obj.updateDynamic("Client")(Client)
    if (application_name != null) __obj.updateDynamic("application_name")(application_name)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (client_encoding != null) __obj.updateDynamic("client_encoding")(client_encoding)
    if (connect_timeout != null) __obj.updateDynamic("connect_timeout")(connect_timeout.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (database != null) __obj.updateDynamic("database")(database)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (fallback_application_name != null) __obj.updateDynamic("fallback_application_name")(fallback_application_name)
    if (host != null) __obj.updateDynamic("host")(host)
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(isDomainSocket)) __obj.updateDynamic("isDomainSocket")(isDomainSocket)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (keepalives != null) __obj.updateDynamic("keepalives")(keepalives.asInstanceOf[js.Any])
    if (keepalives_idle != null) __obj.updateDynamic("keepalives_idle")(keepalives_idle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(parseInputDatesAsUTC)) __obj.updateDynamic("parseInputDatesAsUTC")(parseInputDatesAsUTC)
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query_timeout != null) __obj.updateDynamic("query_timeout")(query_timeout.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[IConnectionParameters[C]]
  }
}


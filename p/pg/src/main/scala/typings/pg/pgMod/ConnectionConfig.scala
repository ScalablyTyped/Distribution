package typings.pg.pgMod

import typings.node.streamMod.Duplex
import typings.pg.pgNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
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
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: Int | Double = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionConfig]
  }
}


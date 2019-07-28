package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends ConnectionConfig {
  var ssl: js.UndefOr[Boolean | TlsOptions] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    connectionString: String = null,
    database: String = null,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    ssl: Boolean | TlsOptions = null,
    user: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (database != null) __obj.updateDynamic("database")(database)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ClientConfig]
  }
}


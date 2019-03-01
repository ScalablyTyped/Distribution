package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends ConnectionConfig {
  var ssl: js.UndefOr[scala.Boolean | nodeLib.tlsMod.TlsOptions] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    connectionString: java.lang.String = null,
    database: java.lang.String = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    ssl: scala.Boolean | nodeLib.tlsMod.TlsOptions = null,
    user: java.lang.String = null
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


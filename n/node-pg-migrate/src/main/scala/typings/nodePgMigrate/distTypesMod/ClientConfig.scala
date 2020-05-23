package typings.nodePgMigrate.distTypesMod

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
    port: js.UndefOr[Double] = js.undefined,
    ssl: Boolean | TlsOptions = null,
    user: String = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}


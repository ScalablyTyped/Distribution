package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionString: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    connectionString: String = null,
    database: String = null,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    user: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}


package typings.pgConnectionString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var application_name: js.UndefOr[String] = js.undefined
  var client_encoding: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String | Null] = js.undefined
  var fallback_application_name: js.UndefOr[String] = js.undefined
  var host: String | Null
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String | Null] = js.undefined
  var ssl: js.UndefOr[Boolean | String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    application_name: String = null,
    client_encoding: String = null,
    database: js.UndefOr[Null | String] = js.undefined,
    fallback_application_name: String = null,
    host: String = null,
    password: String = null,
    port: js.UndefOr[Null | String] = js.undefined,
    ssl: Boolean | String = null,
    user: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (application_name != null) __obj.updateDynamic("application_name")(application_name.asInstanceOf[js.Any])
    if (client_encoding != null) __obj.updateDynamic("client_encoding")(client_encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(database)) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (fallback_application_name != null) __obj.updateDynamic("fallback_application_name")(fallback_application_name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}


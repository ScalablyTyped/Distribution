package typings
package pgDashConnectionDashStringLib.pgDashConnectionDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var application_name: java.lang.String | scala.Null
  var client_encoding: java.lang.String | scala.Null
  var database: java.lang.String | scala.Null
  var fallback_application_name: java.lang.String | scala.Null
  var host: java.lang.String | scala.Null
  var password: java.lang.String | scala.Null
  var port: scala.Double | scala.Null
  var ssl: scala.Boolean | scala.Null
  var user: java.lang.String | scala.Null
}

object ConnectionOptions {
  @scala.inline
  def apply(
    application_name: java.lang.String = null,
    client_encoding: java.lang.String = null,
    database: java.lang.String = null,
    fallback_application_name: java.lang.String = null,
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (application_name != null) __obj.updateDynamic("application_name")(application_name)
    if (client_encoding != null) __obj.updateDynamic("client_encoding")(client_encoding)
    if (database != null) __obj.updateDynamic("database")(database)
    if (fallback_application_name != null) __obj.updateDynamic("fallback_application_name")(fallback_application_name)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionOptions]
  }
}


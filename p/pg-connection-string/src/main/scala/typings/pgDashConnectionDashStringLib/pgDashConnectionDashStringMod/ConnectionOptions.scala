package typings
package pgDashConnectionDashStringLib.pgDashConnectionDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var application_name: js.UndefOr[java.lang.String] = js.undefined
  var client_encoding: js.UndefOr[java.lang.String] = js.undefined
  var database: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fallback_application_name: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String | scala.Null
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var ssl: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
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
    port: java.lang.String = null,
    ssl: scala.Boolean | java.lang.String = null,
    user: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (application_name != null) __obj.updateDynamic("application_name")(application_name)
    if (client_encoding != null) __obj.updateDynamic("client_encoding")(client_encoding)
    if (database != null) __obj.updateDynamic("database")(database)
    if (fallback_application_name != null) __obj.updateDynamic("fallback_application_name")(fallback_application_name)
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[ConnectionOptions]
  }
}


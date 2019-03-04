package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var authorize_url: js.UndefOr[java.lang.String] = js.undefined
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var headers: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var logout_url: js.UndefOr[java.lang.String] = js.undefined
  var mode: java.lang.String
  var openid_connect_host: js.UndefOr[java.lang.String] = js.undefined
  var openid_connect_port: js.UndefOr[java.lang.String] = js.undefined
  var openid_connect_schema: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var schema: js.UndefOr[java.lang.String] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    mode: java.lang.String,
    authorize_url: java.lang.String = null,
    headers: js.Any = null,
    host: java.lang.String = null,
    logout_url: java.lang.String = null,
    openid_connect_host: java.lang.String = null,
    openid_connect_port: java.lang.String = null,
    openid_connect_schema: java.lang.String = null,
    port: java.lang.String = null,
    schema: java.lang.String = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, mode = mode)
    if (authorize_url != null) __obj.updateDynamic("authorize_url")(authorize_url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (logout_url != null) __obj.updateDynamic("logout_url")(logout_url)
    if (openid_connect_host != null) __obj.updateDynamic("openid_connect_host")(openid_connect_host)
    if (openid_connect_port != null) __obj.updateDynamic("openid_connect_port")(openid_connect_port)
    if (openid_connect_schema != null) __obj.updateDynamic("openid_connect_schema")(openid_connect_schema)
    if (port != null) __obj.updateDynamic("port")(port)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ConfigureOptions]
  }
}


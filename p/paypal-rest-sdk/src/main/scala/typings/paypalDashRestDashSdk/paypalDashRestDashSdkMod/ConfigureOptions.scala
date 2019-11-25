package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var authorize_url: js.UndefOr[String] = js.undefined
  var client_id: String
  var client_secret: String
  var headers: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var logout_url: js.UndefOr[String] = js.undefined
  var mode: String
  var openid_connect_host: js.UndefOr[String] = js.undefined
  var openid_connect_port: js.UndefOr[String] = js.undefined
  var openid_connect_schema: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[String] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    mode: String,
    authorize_url: String = null,
    headers: js.Any = null,
    host: String = null,
    logout_url: String = null,
    openid_connect_host: String = null,
    openid_connect_port: String = null,
    openid_connect_schema: String = null,
    port: String = null,
    schema: String = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    if (authorize_url != null) __obj.updateDynamic("authorize_url")(authorize_url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (logout_url != null) __obj.updateDynamic("logout_url")(logout_url.asInstanceOf[js.Any])
    if (openid_connect_host != null) __obj.updateDynamic("openid_connect_host")(openid_connect_host.asInstanceOf[js.Any])
    if (openid_connect_port != null) __obj.updateDynamic("openid_connect_port")(openid_connect_port.asInstanceOf[js.Any])
    if (openid_connect_schema != null) __obj.updateDynamic("openid_connect_schema")(openid_connect_schema.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
}


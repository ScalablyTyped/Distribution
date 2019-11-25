package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookOptions extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var cert: js.UndefOr[String] = js.undefined
  var healthEndpoint: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var https: js.UndefOr[ServerOptions] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object WebHookOptions {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    cert: String = null,
    healthEndpoint: String = null,
    host: String = null,
    https: ServerOptions = null,
    key: String = null,
    pfx: String = null,
    port: Int | Double = null
  ): WebHookOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (healthEndpoint != null) __obj.updateDynamic("healthEndpoint")(healthEndpoint.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
}


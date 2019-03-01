package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookOptions extends js.Object {
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var cert: java.lang.String
  var healthEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var https: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  var key: java.lang.String
  var pfx: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
}

object WebHookOptions {
  @scala.inline
  def apply(
    cert: java.lang.String,
    key: java.lang.String,
    pfx: java.lang.String,
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    healthEndpoint: java.lang.String = null,
    host: java.lang.String = null,
    https: nodeLib.httpsMod.ServerOptions = null,
    port: scala.Int | scala.Double = null
  ): WebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cert")(cert)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("pfx")(pfx)
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (healthEndpoint != null) __obj.updateDynamic("healthEndpoint")(healthEndpoint)
    if (host != null) __obj.updateDynamic("host")(host)
    if (https != null) __obj.updateDynamic("https")(https)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
}


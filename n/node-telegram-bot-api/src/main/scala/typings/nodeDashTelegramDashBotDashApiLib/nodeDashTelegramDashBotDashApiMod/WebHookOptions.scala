package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookOptions extends js.Object {
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var cert: js.UndefOr[java.lang.String] = js.undefined
  var healthEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var https: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object WebHookOptions {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    cert: java.lang.String = null,
    healthEndpoint: java.lang.String = null,
    host: java.lang.String = null,
    https: nodeLib.httpsMod.ServerOptions = null,
    key: java.lang.String = null,
    pfx: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): WebHookOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (healthEndpoint != null) __obj.updateDynamic("healthEndpoint")(healthEndpoint)
    if (host != null) __obj.updateDynamic("host")(host)
    if (https != null) __obj.updateDynamic("https")(https)
    if (key != null) __obj.updateDynamic("key")(key)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
}


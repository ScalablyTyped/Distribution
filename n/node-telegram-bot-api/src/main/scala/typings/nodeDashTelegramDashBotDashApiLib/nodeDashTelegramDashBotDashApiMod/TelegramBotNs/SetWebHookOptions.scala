package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetWebHookOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var certificate: js.UndefOr[java.lang.String | nodeLib.streamMod.Stream] = js.undefined
  var max_connections: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SetWebHookOptions {
  @scala.inline
  def apply(
    allowed_updates: js.Array[java.lang.String] = null,
    certificate: java.lang.String | nodeLib.streamMod.Stream = null,
    max_connections: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (max_connections != null) __obj.updateDynamic("max_connections")(max_connections.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SetWebHookOptions]
  }
}


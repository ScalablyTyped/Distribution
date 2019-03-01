package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// METHODS OPTIONS ///
trait PollingOptions extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var params: js.UndefOr[GetUpdatesOptions] = js.undefined
}

object PollingOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    interval: java.lang.String | scala.Double = null,
    params: GetUpdatesOptions = null
  ): PollingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[PollingOptions]
  }
}


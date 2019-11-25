package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// METHODS OPTIONS ///
trait PollingOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[String | Double] = js.undefined
  var params: js.UndefOr[GetUpdatesOptions] = js.undefined
}

object PollingOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    interval: String | Double = null,
    params: GetUpdatesOptions = null
  ): PollingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollingOptions]
  }
}


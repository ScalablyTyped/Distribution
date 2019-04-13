package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpdatesOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object GetUpdatesOptions {
  @scala.inline
  def apply(
    allowed_updates: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): GetUpdatesOptions = {
    val __obj = js.Dynamic.literal()
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpdatesOptions]
  }
}


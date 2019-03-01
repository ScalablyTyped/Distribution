package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceReply extends js.Object {
  var force_reply: scala.Boolean
  var selective: js.UndefOr[scala.Boolean] = js.undefined
}

object ForceReply {
  @scala.inline
  def apply(force_reply: scala.Boolean, selective: js.UndefOr[scala.Boolean] = js.undefined): ForceReply = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("force_reply")(force_reply)
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective)
    __obj.asInstanceOf[ForceReply]
  }
}


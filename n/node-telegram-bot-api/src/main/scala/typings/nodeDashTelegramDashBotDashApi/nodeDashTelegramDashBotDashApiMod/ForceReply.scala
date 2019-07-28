package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceReply extends js.Object {
  var force_reply: Boolean
  var selective: js.UndefOr[Boolean] = js.undefined
}

object ForceReply {
  @scala.inline
  def apply(force_reply: Boolean, selective: js.UndefOr[Boolean] = js.undefined): ForceReply = {
    val __obj = js.Dynamic.literal(force_reply = force_reply)
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective)
    __obj.asInstanceOf[ForceReply]
  }
}


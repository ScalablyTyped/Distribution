package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardMessageOptions extends js.Object {
  var disable_notification: js.UndefOr[scala.Boolean] = js.undefined
}

object ForwardMessageOptions {
  @scala.inline
  def apply(disable_notification: js.UndefOr[scala.Boolean] = js.undefined): ForwardMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification)
    __obj.asInstanceOf[ForwardMessageOptions]
  }
}


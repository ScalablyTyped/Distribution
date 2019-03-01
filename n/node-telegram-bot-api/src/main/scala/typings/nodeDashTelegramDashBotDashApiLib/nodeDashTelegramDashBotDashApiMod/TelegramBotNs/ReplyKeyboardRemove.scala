package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyKeyboardRemove extends js.Object {
  var remove_keyboard: scala.Boolean
  var selective: js.UndefOr[scala.Boolean] = js.undefined
}

object ReplyKeyboardRemove {
  @scala.inline
  def apply(remove_keyboard: scala.Boolean, selective: js.UndefOr[scala.Boolean] = js.undefined): ReplyKeyboardRemove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove_keyboard")(remove_keyboard)
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective)
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
}


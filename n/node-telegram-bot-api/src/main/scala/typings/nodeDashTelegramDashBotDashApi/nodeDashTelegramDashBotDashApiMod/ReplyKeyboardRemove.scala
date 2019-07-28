package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyKeyboardRemove extends js.Object {
  var remove_keyboard: Boolean
  var selective: js.UndefOr[Boolean] = js.undefined
}

object ReplyKeyboardRemove {
  @scala.inline
  def apply(remove_keyboard: Boolean, selective: js.UndefOr[Boolean] = js.undefined): ReplyKeyboardRemove = {
    val __obj = js.Dynamic.literal(remove_keyboard = remove_keyboard)
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective)
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
}


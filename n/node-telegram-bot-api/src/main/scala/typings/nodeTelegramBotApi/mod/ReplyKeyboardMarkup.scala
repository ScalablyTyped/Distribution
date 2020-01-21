package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplyKeyboardMarkup extends js.Object {
  var keyboard: js.Array[js.Array[KeyboardButton]]
  var one_time_keyboard: js.UndefOr[Boolean] = js.undefined
  var resize_keyboard: js.UndefOr[Boolean] = js.undefined
  var selective: js.UndefOr[Boolean] = js.undefined
}

object ReplyKeyboardMarkup {
  @scala.inline
  def apply(
    keyboard: js.Array[js.Array[KeyboardButton]],
    one_time_keyboard: js.UndefOr[Boolean] = js.undefined,
    resize_keyboard: js.UndefOr[Boolean] = js.undefined,
    selective: js.UndefOr[Boolean] = js.undefined
  ): ReplyKeyboardMarkup = {
    val __obj = js.Dynamic.literal(keyboard = keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(one_time_keyboard)) __obj.updateDynamic("one_time_keyboard")(one_time_keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_keyboard)) __obj.updateDynamic("resize_keyboard")(resize_keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardMarkup]
  }
}


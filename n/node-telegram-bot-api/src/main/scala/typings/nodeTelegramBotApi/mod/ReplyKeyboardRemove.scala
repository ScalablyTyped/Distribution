package typings.nodeTelegramBotApi.mod

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
    val __obj = js.Dynamic.literal(remove_keyboard = remove_keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(selective)) __obj.updateDynamic("selective")(selective.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyKeyboardRemove]
  }
}


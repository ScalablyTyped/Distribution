package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardButton extends js.Object {
  var request_contact: js.UndefOr[Boolean] = js.undefined
  var request_location: js.UndefOr[Boolean] = js.undefined
  var text: String
}

object KeyboardButton {
  @scala.inline
  def apply(
    text: String,
    request_contact: js.UndefOr[Boolean] = js.undefined,
    request_location: js.UndefOr[Boolean] = js.undefined
  ): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(request_contact)) __obj.updateDynamic("request_contact")(request_contact.asInstanceOf[js.Any])
    if (!js.isUndefined(request_location)) __obj.updateDynamic("request_location")(request_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButton]
  }
}


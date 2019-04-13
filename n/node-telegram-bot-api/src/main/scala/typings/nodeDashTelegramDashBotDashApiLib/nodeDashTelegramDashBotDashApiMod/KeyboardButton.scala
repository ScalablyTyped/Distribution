package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardButton extends js.Object {
  var request_contact: js.UndefOr[scala.Boolean] = js.undefined
  var request_location: js.UndefOr[scala.Boolean] = js.undefined
  var text: java.lang.String
}

object KeyboardButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    request_contact: js.UndefOr[scala.Boolean] = js.undefined,
    request_location: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyboardButton = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(request_contact)) __obj.updateDynamic("request_contact")(request_contact)
    if (!js.isUndefined(request_location)) __obj.updateDynamic("request_location")(request_location)
    __obj.asInstanceOf[KeyboardButton]
  }
}


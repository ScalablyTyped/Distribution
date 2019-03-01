package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGameHighScoresOptions extends js.Object {
  var chat_id: js.UndefOr[scala.Double] = js.undefined
  var inline_message_id: js.UndefOr[java.lang.String] = js.undefined
  var message_id: js.UndefOr[scala.Double] = js.undefined
}

object GetGameHighScoresOptions {
  @scala.inline
  def apply(
    chat_id: scala.Int | scala.Double = null,
    inline_message_id: java.lang.String = null,
    message_id: scala.Int | scala.Double = null
  ): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
}


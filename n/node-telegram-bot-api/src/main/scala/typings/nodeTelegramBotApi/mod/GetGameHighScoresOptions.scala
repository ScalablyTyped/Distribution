package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGameHighScoresOptions extends js.Object {
  var chat_id: js.UndefOr[Double] = js.undefined
  var inline_message_id: js.UndefOr[String] = js.undefined
  var message_id: js.UndefOr[Double] = js.undefined
}

object GetGameHighScoresOptions {
  @scala.inline
  def apply(
    chat_id: js.UndefOr[Double] = js.undefined,
    inline_message_id: String = null,
    message_id: js.UndefOr[Double] = js.undefined
  ): GetGameHighScoresOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chat_id)) __obj.updateDynamic("chat_id")(chat_id.get.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (!js.isUndefined(message_id)) __obj.updateDynamic("message_id")(message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameHighScoresOptions]
  }
}


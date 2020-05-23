package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMessageReplyMarkupOptions extends js.Object {
  var chat_id: js.UndefOr[Double | String] = js.undefined
  var inline_message_id: js.UndefOr[String] = js.undefined
  var message_id: js.UndefOr[Double] = js.undefined
}

object EditMessageReplyMarkupOptions {
  @scala.inline
  def apply(
    chat_id: Double | String = null,
    inline_message_id: String = null,
    message_id: js.UndefOr[Double] = js.undefined
  ): EditMessageReplyMarkupOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (!js.isUndefined(message_id)) __obj.updateDynamic("message_id")(message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditMessageReplyMarkupOptions]
  }
}


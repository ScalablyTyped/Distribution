package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetGameScoreOptions extends js.Object {
  var chat_id: js.UndefOr[Double] = js.undefined
  var disable_edit_message: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var inline_message_id: js.UndefOr[String] = js.undefined
  var message_id: js.UndefOr[Double] = js.undefined
}

object SetGameScoreOptions {
  @scala.inline
  def apply(
    chat_id: js.UndefOr[Double] = js.undefined,
    disable_edit_message: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    inline_message_id: String = null,
    message_id: js.UndefOr[Double] = js.undefined
  ): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chat_id)) __obj.updateDynamic("chat_id")(chat_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_edit_message)) __obj.updateDynamic("disable_edit_message")(disable_edit_message.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (!js.isUndefined(message_id)) __obj.updateDynamic("message_id")(message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGameScoreOptions]
  }
}


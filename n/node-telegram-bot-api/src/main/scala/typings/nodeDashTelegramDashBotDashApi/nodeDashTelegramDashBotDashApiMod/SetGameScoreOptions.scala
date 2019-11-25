package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

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
    chat_id: Int | Double = null,
    disable_edit_message: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    inline_message_id: String = null,
    message_id: Int | Double = null
  ): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_edit_message)) __obj.updateDynamic("disable_edit_message")(disable_edit_message.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGameScoreOptions]
  }
}


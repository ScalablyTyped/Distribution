package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetGameScoreOptions extends js.Object {
  var chat_id: js.UndefOr[scala.Double] = js.undefined
  var disable_edit_message: js.UndefOr[scala.Boolean] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var inline_message_id: js.UndefOr[java.lang.String] = js.undefined
  var message_id: js.UndefOr[scala.Double] = js.undefined
}

object SetGameScoreOptions {
  @scala.inline
  def apply(
    chat_id: scala.Int | scala.Double = null,
    disable_edit_message: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    inline_message_id: java.lang.String = null,
    message_id: scala.Int | scala.Double = null
  ): SetGameScoreOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_edit_message)) __obj.updateDynamic("disable_edit_message")(disable_edit_message)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetGameScoreOptions]
  }
}


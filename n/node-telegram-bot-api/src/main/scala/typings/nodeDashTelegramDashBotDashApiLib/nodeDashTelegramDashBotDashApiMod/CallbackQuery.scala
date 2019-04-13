package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackQuery extends js.Object {
  var chat_instance: java.lang.String
  var data: js.UndefOr[java.lang.String] = js.undefined
  var from: User
  var game_short_name: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var inline_message_id: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object CallbackQuery {
  @scala.inline
  def apply(
    chat_instance: java.lang.String,
    from: User,
    id: java.lang.String,
    data: java.lang.String = null,
    game_short_name: java.lang.String = null,
    inline_message_id: java.lang.String = null,
    message: Message = null
  ): CallbackQuery = {
    val __obj = js.Dynamic.literal(chat_instance = chat_instance, from = from, id = id)
    if (data != null) __obj.updateDynamic("data")(data)
    if (game_short_name != null) __obj.updateDynamic("game_short_name")(game_short_name)
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[CallbackQuery]
  }
}


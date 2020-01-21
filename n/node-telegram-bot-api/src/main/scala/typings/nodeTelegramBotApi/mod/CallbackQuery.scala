package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackQuery extends js.Object {
  var chat_instance: String
  var data: js.UndefOr[String] = js.undefined
  var from: User
  var game_short_name: js.UndefOr[String] = js.undefined
  var id: String
  var inline_message_id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
}

object CallbackQuery {
  @scala.inline
  def apply(
    chat_instance: String,
    from: User,
    id: String,
    data: String = null,
    game_short_name: String = null,
    inline_message_id: String = null,
    message: Message = null
  ): CallbackQuery = {
    val __obj = js.Dynamic.literal(chat_instance = chat_instance.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (game_short_name != null) __obj.updateDynamic("game_short_name")(game_short_name.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackQuery]
  }
}


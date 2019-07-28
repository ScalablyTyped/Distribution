package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChosenInlineResult extends js.Object {
  var from: User
  var inline_message_id: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var query: String
  var result_id: String
}

object ChosenInlineResult {
  @scala.inline
  def apply(
    from: User,
    query: String,
    result_id: String,
    inline_message_id: String = null,
    location: Location = null
  ): ChosenInlineResult = {
    val __obj = js.Dynamic.literal(from = from, query = query, result_id = result_id)
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[ChosenInlineResult]
  }
}


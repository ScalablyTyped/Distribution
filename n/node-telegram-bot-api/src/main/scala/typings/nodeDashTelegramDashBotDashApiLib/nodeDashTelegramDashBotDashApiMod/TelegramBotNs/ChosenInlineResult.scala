package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChosenInlineResult extends js.Object {
  var from: User
  var inline_message_id: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var query: java.lang.String
  var result_id: java.lang.String
}

object ChosenInlineResult {
  @scala.inline
  def apply(
    from: User,
    query: java.lang.String,
    result_id: java.lang.String,
    inline_message_id: java.lang.String = null,
    location: Location = null
  ): ChosenInlineResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result_id")(result_id)
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[ChosenInlineResult]
  }
}


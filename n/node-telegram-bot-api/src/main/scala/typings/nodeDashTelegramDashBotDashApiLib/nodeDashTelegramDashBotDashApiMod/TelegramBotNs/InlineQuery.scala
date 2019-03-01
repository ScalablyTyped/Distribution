package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQuery extends js.Object {
  var from: User
  var id: java.lang.String
  var location: js.UndefOr[Location] = js.undefined
  var offset: java.lang.String
  var query: java.lang.String
}

object InlineQuery {
  @scala.inline
  def apply(
    from: User,
    id: java.lang.String,
    offset: java.lang.String,
    query: java.lang.String,
    location: Location = null
  ): InlineQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("query")(query)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[InlineQuery]
  }
}


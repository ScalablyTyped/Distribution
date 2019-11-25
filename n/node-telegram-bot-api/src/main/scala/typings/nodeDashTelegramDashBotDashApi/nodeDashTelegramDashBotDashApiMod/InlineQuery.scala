package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQuery extends js.Object {
  var from: User
  var id: String
  var location: js.UndefOr[Location] = js.undefined
  var offset: String
  var query: String
}

object InlineQuery {
  @scala.inline
  def apply(from: User, id: String, offset: String, query: String, location: Location = null): InlineQuery = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQuery]
  }
}


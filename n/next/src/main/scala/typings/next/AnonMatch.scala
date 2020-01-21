package typings.next

import typings.next.nextBooleans.`false`
import typings.next.serverRouterMod.Params
import typings.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var `match`: RouteMatch
  var page: String
}

object AnonMatch {
  @scala.inline
  def apply(`match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params, page: String): AnonMatch = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[AnonMatch]
  }
}


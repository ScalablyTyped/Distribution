package typings.next

import typings.next.nextBooleans.`false`
import typings.next.serverRouterMod.Params
import typings.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var `match`: RouteMatch
  var page: String
}

object AnonPage {
  @scala.inline
  def apply(`match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params, page: String): AnonPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[AnonPage]
  }
}


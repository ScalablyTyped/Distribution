package typings.next

import typings.next.distNextDashServerServerRouterMod.Params
import typings.next.distNextDashServerServerRouterMod.RouteMatch
import typings.next.nextNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  var `match`: RouteMatch
  var page: String
}

object Anon_Match {
  @scala.inline
  def apply(`match`: /* pathname */ js.UndefOr[String] => `false` | Params, page: String): Anon_Match = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Anon_Match]
  }
}


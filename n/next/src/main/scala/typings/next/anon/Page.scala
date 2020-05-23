package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.serverRouterMod.RouteMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var `match`: RouteMatch
  var page: String
}

object Page {
  @scala.inline
  def apply(
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | typings.next.serverRouterMod.Params,
    page: String
  ): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Page]
  }
}


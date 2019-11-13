package typings.next.distNextDashServerServerRouterMod

import typings.next.nextNumbers.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var `match`: RouteMatch
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit
}

object Route {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit,
    `match`: /* pathname */ js.UndefOr[String] => `false` | Params
  ): Route = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route]
  }
}

@JSImport("next/dist/next-server/server/router", "route")
@js.native
object route extends js.Object {
  def apply(path: String): js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], _] = js.native
}


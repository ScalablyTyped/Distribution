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
  var name: String
  var statusCode: js.UndefOr[Double] = js.undefined
  var `type`: String
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): js.Promise[RouteResult] | RouteResult
}

object Route {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult,
    `match`: /* pathname */ js.UndefOr[String] => `false` | Params,
    name: String,
    `type`: String,
    statusCode: Int | Double = null
  ): Route = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

@JSImport("next/dist/next-server/server/router", "route")
@js.native
object route extends js.Object {
  def apply(path: String): js.Function2[/* pathname */ js.UndefOr[String], /* params */ js.UndefOr[js.Any], _] = js.native
}


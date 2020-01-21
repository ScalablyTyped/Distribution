package typings.next.serverRouterMod

import typings.next.nextBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route_ extends js.Object {
  var check: js.UndefOr[Boolean] = js.undefined
  var `match`: RouteMatch
  var name: String
  var statusCode: js.UndefOr[Double] = js.undefined
  var `type`: String
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): js.Promise[RouteResult] | RouteResult
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => js.Promise[RouteResult] | RouteResult,
    `match`: /* pathname */ js.UndefOr[String | Null] => `false` | Params,
    name: String,
    `type`: String,
    check: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): Route_ = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route_]
  }
}


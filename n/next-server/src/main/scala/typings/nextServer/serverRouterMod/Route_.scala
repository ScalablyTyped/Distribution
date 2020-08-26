package typings.nextServer.serverRouterMod

import typings.nextServer.nextServerBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route_ extends js.Object {
  var `match`: RouteMatch = js.native
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit = js.native
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit,
    `match`: /* pathname */ js.UndefOr[String] => `false` | Params
  ): Route_ = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route_]
  }
  @scala.inline
  implicit class Route_Ops[Self <: Route_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFn(value: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Unit): Self = this.set("fn", js.Any.fromFunction4(value))
    @scala.inline
    def setMatch(value: /* pathname */ js.UndefOr[String] => `false` | Params): Self = this.set("match", js.Any.fromFunction1(value))
  }
  
}


package typings.nextServer.serverRouterMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var routes: js.Array[Route_]
  def add(route: Route_): Unit
  def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]]
}

object Router {
  @scala.inline
  def apply(
    add: Route_ => Unit,
    `match`: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]],
    routes: js.Array[Route_]
  ): Router = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
    __obj.asInstanceOf[Router]
  }
}


package typings.nextDashServer.distServerRouterMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var routes: js.Array[Route]
  def add(route: Route): Unit
  def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]]
}

object Router {
  @scala.inline
  def apply(
    add: Route => Unit,
    `match`: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.UndefOr[js.Function0[Unit]],
    routes: js.Array[Route]
  ): Router = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes)
    __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
    __obj.asInstanceOf[Router]
  }
}


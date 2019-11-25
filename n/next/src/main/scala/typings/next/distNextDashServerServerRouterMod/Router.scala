package typings.next.distNextDashServerServerRouterMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var routes: js.Array[Route]
  def add(route: Route): Unit
  def execute(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Boolean]
}

object Router {
  @scala.inline
  def apply(
    add: Route => Unit,
    execute: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => js.Promise[Boolean],
    routes: js.Array[Route]
  ): Router = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), execute = js.Any.fromFunction3(execute), routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Router]
  }
}


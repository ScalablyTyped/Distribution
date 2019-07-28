package typings.nextDashServer.nextDashServerMod

import typings.nextDashServer.routerMod.DefaultQuery
import typings.nextDashServer.routerMod.UrlLike
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRouter extends js.Object {
  var routes: js.Array[ServerRoute[DefaultQuery]]
  def add(route: ServerRoute[DefaultQuery]): Unit
  def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlLike): js.UndefOr[js.Function0[js.Promise[Unit]]]
}

object ServerRouter {
  @scala.inline
  def apply(
    add: ServerRoute[DefaultQuery] => Unit,
    `match`: (IncomingMessage, ServerResponse, UrlLike) => js.UndefOr[js.Function0[js.Promise[Unit]]],
    routes: js.Array[ServerRoute[DefaultQuery]]
  ): ServerRouter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes)
    __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
    __obj.asInstanceOf[ServerRouter]
  }
}


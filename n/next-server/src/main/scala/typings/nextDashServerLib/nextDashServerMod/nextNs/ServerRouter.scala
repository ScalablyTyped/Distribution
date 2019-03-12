package typings
package nextDashServerLib.nextDashServerMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRouter extends js.Object {
  var routes: js.Array[ServerRoute[nextDashServerLib.routerMod.DefaultQuery]]
  def add(route: ServerRoute[nextDashServerLib.routerMod.DefaultQuery]): scala.Unit
  def `match`(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): js.UndefOr[js.Function0[js.Promise[scala.Unit]]]
}

object ServerRouter {
  @scala.inline
  def apply(
    add: ServerRoute[nextDashServerLib.routerMod.DefaultQuery] => scala.Unit,
    `match`: (nodeLib.httpMod.IncomingMessage, nodeLib.httpMod.ServerResponse, nextDashServerLib.routerMod.UrlLike) => js.UndefOr[js.Function0[js.Promise[scala.Unit]]],
    routes: js.Array[ServerRoute[nextDashServerLib.routerMod.DefaultQuery]]
  ): ServerRouter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), routes = routes)
    __obj.updateDynamic("match")(js.Any.fromFunction3(`match`))
    __obj.asInstanceOf[ServerRouter]
  }
}


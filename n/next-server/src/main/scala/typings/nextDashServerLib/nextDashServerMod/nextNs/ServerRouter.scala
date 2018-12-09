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


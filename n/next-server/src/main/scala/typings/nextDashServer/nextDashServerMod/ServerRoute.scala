package typings.nextDashServer.nextDashServerMod

import typings.nextDashServer.nextDashServerNumbers.`false`
import typings.nextDashServer.routerMod.UrlLike
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRoute[P] extends js.Object {
  def fn(req: IncomingMessage, res: ServerResponse, params: P, parsedUrl: UrlLike): js.Promise[Unit] = js.native
  def `match`(pathname: String): P | `false` = js.native
  def `match`(pathname: String, params: Partial[P]): P | `false` = js.native
}


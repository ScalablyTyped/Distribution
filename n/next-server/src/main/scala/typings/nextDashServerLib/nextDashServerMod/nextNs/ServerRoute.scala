package typings
package nextDashServerLib.nextDashServerMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRoute[P] extends js.Object {
  def fn(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    params: P,
    parsedUrl: nextDashServerLib.routerMod.UrlLike
  ): js.Promise[scala.Unit] = js.native
  def `match`(pathname: java.lang.String): P | nextDashServerLib.nextDashServerLibNumbers.`false` = js.native
  def `match`(pathname: java.lang.String, params: stdLib.Partial[P]): P | nextDashServerLib.nextDashServerLibNumbers.`false` = js.native
}


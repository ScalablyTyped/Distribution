package typings
package needleLib.needleMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedleResponse
  extends nodeLib.httpMod.IncomingMessage {
  var body: js.Any = js.native
  var bytes: scala.Double = js.native
  var cookies: js.UndefOr[Cookies] = js.native
  var raw: nodeLib.Buffer = js.native
}


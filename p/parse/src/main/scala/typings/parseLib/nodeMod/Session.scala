package typings
package parseLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Session")
@js.native
class Session ()
  extends parseLib.ParseNs.Session

@JSImport("parse/node", "Session")
@js.native
object Session extends js.Object {
  def current(): stdLib.Promise[parseLib.ParseNs.Session] = js.native
}


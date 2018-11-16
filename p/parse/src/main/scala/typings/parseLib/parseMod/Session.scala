package typings
package parseLib.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Session")
@js.native
class Session ()
  extends parseLib.nodeMod.Session

@JSImport("parse", "Session")
@js.native
object Session extends js.Object {
  def current(): parseLib.ParseNs.Promise[parseLib.ParseNs.Session] = js.native
}


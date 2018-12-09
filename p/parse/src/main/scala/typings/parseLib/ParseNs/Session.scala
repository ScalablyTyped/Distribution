package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Session")
@js.native
class Session () extends Object {
  def getSessionToken(): java.lang.String = js.native
  def isCurrentSessionRevocable(): scala.Boolean = js.native
}

@JSGlobal("Parse.Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[parseLib.ParseNs.Session] = js.native
}


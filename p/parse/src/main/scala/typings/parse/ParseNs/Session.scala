package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Session")
@js.native
class Session () extends Object {
  def getSessionToken(): String = js.native
  def isCurrentSessionRevocable(): Boolean = js.native
}

/* static members */
@JSGlobal("Parse.Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[Session] = js.native
}


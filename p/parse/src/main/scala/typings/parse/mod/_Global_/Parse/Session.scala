package typings.parse.mod._Global_.Parse

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session[T /* <: Attributes */] extends Object[T] {
  def getSessionToken(): String = js.native
  def isCurrentSessionRevocable(): Boolean = js.native
}

@JSGlobal("Parse.Session")
@js.native
object Session extends TopLevel[SessionConstructor]


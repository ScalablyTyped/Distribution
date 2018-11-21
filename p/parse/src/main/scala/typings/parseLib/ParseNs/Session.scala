package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSGlobal("Parse.Session")
@js.native
class Session () extends js.Object {
  def getSessionToken(): java.lang.String = js.native
  def isCurrentSessionRevocable(): scala.Boolean = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSGlobal("Parse.Session")
@js.native
object Session extends js.Object {
  def current(): stdLib.Promise[parseLib.ParseNs.Session] = js.native
}


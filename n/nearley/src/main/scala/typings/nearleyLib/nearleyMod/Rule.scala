package typings
package nearleyLib.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nearley", "Rule")
@js.native
class Rule protected () extends js.Object {
  def this(name: java.lang.String, symbols: js.Array[_]) = this()
  def this(name: java.lang.String, symbols: js.Array[_], postprocess: Postprocessor) = this()
  var id: scala.Double = js.native
  var name: java.lang.String = js.native
  var postprocess: js.UndefOr[Postprocessor] = js.native
  var symbols: js.Array[_] = js.native
  def toString(withCursorAt: scala.Double): java.lang.String = js.native
}

@JSImport("nearley", "Rule")
@js.native
object Rule extends js.Object {
  var highestId: scala.Double = js.native
}


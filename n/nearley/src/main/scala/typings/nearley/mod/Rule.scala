package typings.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nearley", "Rule")
@js.native
class Rule protected () extends js.Object {
  def this(name: String, symbols: js.Array[_]) = this()
  def this(name: String, symbols: js.Array[_], postprocess: Postprocessor) = this()
  var id: Double = js.native
  var name: String = js.native
  var postprocess: js.UndefOr[Postprocessor] = js.native
  var symbols: js.Array[_] = js.native
  def toString(withCursorAt: Double): String = js.native
}

/* static members */
@JSImport("nearley", "Rule")
@js.native
object Rule extends js.Object {
  var highestId: Double = js.native
}


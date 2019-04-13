package typings
package nonogramDashSolverLib.nonogramDashSolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nonogram-solver", "Puzzle")
@js.native
class Puzzle protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: Input) = this()
  var columnHints: js.Array[js.Array[scala.Double]] = js.native
  var height: scala.Double = js.native
  val isFinished: scala.Boolean = js.native
  val isSolved: scala.Boolean = js.native
  var rowHints: js.Array[js.Array[scala.Double]] = js.native
  var snapshot: js.Array[scala.Double] = js.native
  val svg: java.lang.String = js.native
  var width: scala.Double = js.native
  def `import`(puzzle: Puzzle): scala.Unit = js.native
  def toJSON(): stdLib.Required[Input] = js.native
}


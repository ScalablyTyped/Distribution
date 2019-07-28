package typings.nonogramDashSolver.nonogramDashSolverMod

import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nonogram-solver", "Puzzle")
@js.native
class Puzzle protected () extends js.Object {
  def this(data: String) = this()
  def this(data: Input) = this()
  var columnHints: js.Array[js.Array[Double]] = js.native
  var height: Double = js.native
  val isFinished: Boolean = js.native
  val isSolved: Boolean = js.native
  var rowHints: js.Array[js.Array[Double]] = js.native
  var snapshot: js.Array[Double] = js.native
  val svg: String = js.native
  var width: Double = js.native
  def `import`(puzzle: Puzzle): Unit = js.native
  def toJSON(): Required[Input] = js.native
}


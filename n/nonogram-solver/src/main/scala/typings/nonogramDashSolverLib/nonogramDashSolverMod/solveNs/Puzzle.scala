package typings
package nonogramDashSolverLib.nonogramDashSolverMod.solveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Puzzle extends js.Object {
  var columnHints: js.Array[js.Array[scala.Double]]
  var height: scala.Double
  val isFinished: scala.Boolean
  val isSolved: scala.Boolean
  var rowHints: js.Array[js.Array[scala.Double]]
  var snapshot: js.Array[scala.Double]
  val svg: java.lang.String
  var width: scala.Double
  def `import`(puzzle: Puzzle): scala.Unit
  def toJSON(): stdLib.Required[Input]
}

object Puzzle {
  @scala.inline
  def apply(
    columnHints: js.Array[js.Array[scala.Double]],
    height: scala.Double,
    `import`: Puzzle => scala.Unit,
    isFinished: scala.Boolean,
    isSolved: scala.Boolean,
    rowHints: js.Array[js.Array[scala.Double]],
    snapshot: js.Array[scala.Double],
    svg: java.lang.String,
    toJSON: () => stdLib.Required[Input],
    width: scala.Double
  ): Puzzle = {
    val __obj = js.Dynamic.literal(columnHints = columnHints, height = height, isFinished = isFinished, isSolved = isSolved, rowHints = rowHints, snapshot = snapshot, svg = svg, toJSON = js.Any.fromFunction0(toJSON), width = width)
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[Puzzle]
  }
}


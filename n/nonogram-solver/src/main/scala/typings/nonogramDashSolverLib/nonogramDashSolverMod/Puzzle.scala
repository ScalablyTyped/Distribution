package typings
package nonogramDashSolverLib.nonogramDashSolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nonogram-solver", "Puzzle")
@js.native
class Puzzle protected ()
  extends nonogramDashSolverLib.nonogramDashSolverMod.solveNs.Puzzle {
  def this(data: java.lang.String) = this()
  def this(data: nonogramDashSolverLib.nonogramDashSolverMod.solveNs.Input) = this()
  /* CompleteClass */
  override var columnHints: js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var height: scala.Double = js.native
  /* CompleteClass */
  override val isFinished: scala.Boolean = js.native
  /* CompleteClass */
  override val isSolved: scala.Boolean = js.native
  /* CompleteClass */
  override var rowHints: js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var snapshot: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override val svg: java.lang.String = js.native
  /* CompleteClass */
  override var width: scala.Double = js.native
  /* CompleteClass */
  override def `import`(puzzle: nonogramDashSolverLib.nonogramDashSolverMod.solveNs.Puzzle): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): stdLib.Required[nonogramDashSolverLib.nonogramDashSolverMod.solveNs.Input] = js.native
}


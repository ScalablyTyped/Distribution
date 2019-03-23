package typings
package nonogramDashSolverLib.nonogramDashSolverMod.solveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var puzzle: Puzzle
  var status: State
}

object Result {
  @scala.inline
  def apply(puzzle: Puzzle, status: State): Result = {
    val __obj = js.Dynamic.literal(puzzle = puzzle, status = status)
  
    __obj.asInstanceOf[Result]
  }
}


package typings.nonogramSolver.mod

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
    val __obj = js.Dynamic.literal(puzzle = puzzle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}


package typings.nonogramSolver

import typings.nonogramSolver.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<nonogram-solver.nonogram-solver.Input> */
trait RequiredInput extends js.Object {
  var columns: js.Array[js.Array[Double]]
  var content: js.Array[State]
  var rows: js.Array[js.Array[Double]]
}

object RequiredInput {
  @scala.inline
  def apply(columns: js.Array[js.Array[Double]], content: js.Array[State], rows: js.Array[js.Array[Double]]): RequiredInput = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredInput]
  }
}


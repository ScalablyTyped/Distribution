package typings.nonogramSolver.anon

import typings.nonogramSolver.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<nonogram-solver.nonogram-solver.Input> */
@js.native
trait RequiredInput extends js.Object {
  var columns: js.Array[js.Array[Double]] = js.native
  var content: js.Array[State] = js.native
  var rows: js.Array[js.Array[Double]] = js.native
}

object RequiredInput {
  @scala.inline
  def apply(columns: js.Array[js.Array[Double]], content: js.Array[State], rows: js.Array[js.Array[Double]]): RequiredInput = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredInput]
  }
  @scala.inline
  implicit class RequiredInputOps[Self <: RequiredInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: js.Array[Double]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[js.Array[Double]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVarargs(value: State*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[State]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Array[Double]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[Double]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}


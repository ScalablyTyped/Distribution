package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableViewCol extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var columns: js.Array[_] = js.native
  var `object`: js.Object = js.native
  def onColumnUpdate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}

object MUIDataTableViewCol {
  @scala.inline
  def apply(columns: js.Array[_], `object`: js.Object, onColumnUpdate: js.Any => js.Any): MUIDataTableViewCol = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableViewCol]
  }
  @scala.inline
  implicit class MUIDataTableViewColOps[Self <: MUIDataTableViewCol] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Object): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnColumnUpdate(value: js.Any => js.Any): Self = this.set("onColumnUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
  }
  
}


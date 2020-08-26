package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MUIDataTableHead extends js.Object {
  var classes: js.UndefOr[js.Object] = js.native
  var columns: js.UndefOr[js.Array[MUIDataTableColumnDef]] = js.native
  var count: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var page: js.UndefOr[js.Any] = js.native
  var selectedRows: js.UndefOr[js.Any] = js.native
  var setCellRef: js.UndefOr[js.Any] = js.native
}

object MUIDataTableHead {
  @scala.inline
  def apply(): MUIDataTableHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableHead]
  }
  @scala.inline
  implicit class MUIDataTableHeadOps[Self <: MUIDataTableHead] (val x: Self) extends AnyVal {
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
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPage(value: js.Any): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setSelectedRows(value: js.Any): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    @scala.inline
    def setSetCellRef(value: js.Any): Self = this.set("setCellRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetCellRef: Self = this.set("setCellRef", js.undefined)
  }
  
}


package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableHead extends js.Object {
  
  var activeColumn: js.UndefOr[js.Any] = js.native
  
  var areAllRowsExpanded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var columnOrder: js.Array[Double] = js.native
  
  var columns: js.UndefOr[js.Array[MUIDataTableColumnDef]] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var draggableHeadCellRefs: js.UndefOr[js.Object] = js.native
  
  var expandedRows: js.UndefOr[MUIDataTableStateRows] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var rowsPerPage: js.UndefOr[Double] = js.native
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var selectedRows: js.UndefOr[MUIDataTableStateRows] = js.native
  
  var setCellRef: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var tableRef: js.UndefOr[js.Function0[_]] = js.native
  
  var tabledId: js.UndefOr[String] = js.native
  
  var timers: js.UndefOr[js.Object] = js.native
  
  var toggleAllExpandableRows: js.UndefOr[js.Function0[_]] = js.native
  
  var toggleSort: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var updateColumnOrder: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object MUIDataTableHead {
  
  @scala.inline
  def apply(columnOrder: js.Array[Double]): MUIDataTableHead = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
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
    def setColumnOrderVarargs(value: Double*): Self = this.set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = this.set("columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColumn(value: js.Any): Self = this.set("activeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveColumn: Self = this.set("activeColumn", js.undefined)
    
    @scala.inline
    def setAreAllRowsExpanded(value: () => Boolean): Self = this.set("areAllRowsExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAreAllRowsExpanded: Self = this.set("areAllRowsExpanded", js.undefined)
    
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
    def setDraggableHeadCellRefs(value: js.Object): Self = this.set("draggableHeadCellRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableHeadCellRefs: Self = this.set("draggableHeadCellRefs", js.undefined)
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = this.set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRows: Self = this.set("expandedRows", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPage: Self = this.set("rowsPerPage", js.undefined)
    
    @scala.inline
    def setSelectRowUpdate(value: /* repeated */ js.Any => _): Self = this.set("selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectRowUpdate: Self = this.set("selectRowUpdate", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    
    @scala.inline
    def setSetCellRef(value: /* repeated */ js.Any => _): Self = this.set("setCellRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCellRef: Self = this.set("setCellRef", js.undefined)
    
    @scala.inline
    def setTableRef(value: () => _): Self = this.set("tableRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTableRef: Self = this.set("tableRef", js.undefined)
    
    @scala.inline
    def setTabledId(value: String): Self = this.set("tabledId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabledId: Self = this.set("tabledId", js.undefined)
    
    @scala.inline
    def setTimers(value: js.Object): Self = this.set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimers: Self = this.set("timers", js.undefined)
    
    @scala.inline
    def setToggleAllExpandableRows(value: () => _): Self = this.set("toggleAllExpandableRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToggleAllExpandableRows: Self = this.set("toggleAllExpandableRows", js.undefined)
    
    @scala.inline
    def setToggleSort(value: /* repeated */ js.Any => _): Self = this.set("toggleSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleSort: Self = this.set("toggleSort", js.undefined)
    
    @scala.inline
    def setUpdateColumnOrder(value: /* repeated */ js.Any => _): Self = this.set("updateColumnOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateColumnOrder: Self = this.set("updateColumnOrder", js.undefined)
  }
}

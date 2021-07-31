package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableHead extends StObject {
  
  var activeColumn: js.UndefOr[js.Any] = js.undefined
  
  var areAllRowsExpanded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var columnOrder: js.Array[Double]
  
  var columns: js.UndefOr[js.Array[MUIDataTableColumnDef]] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var draggableHeadCellRefs: js.UndefOr[js.Object] = js.undefined
  
  var expandedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var selectedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var setCellRef: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var tableRef: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var tabledId: js.UndefOr[String] = js.undefined
  
  var timers: js.UndefOr[js.Object] = js.undefined
  
  var toggleAllExpandableRows: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var toggleSort: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var updateColumnOrder: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object MUIDataTableHead {
  
  @scala.inline
  def apply(columnOrder: js.Array[Double]): MUIDataTableHead = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableHead]
  }
  
  @scala.inline
  implicit class MUIDataTableHeadMutableBuilder[Self <: MUIDataTableHead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveColumn(value: js.Any): Self = StObject.set(x, "activeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColumnUndefined: Self = StObject.set(x, "activeColumn", js.undefined)
    
    @scala.inline
    def setAreAllRowsExpanded(value: () => Boolean): Self = StObject.set(x, "areAllRowsExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAreAllRowsExpandedUndefined: Self = StObject.set(x, "areAllRowsExpanded", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDraggableHeadCellRefs(value: js.Object): Self = StObject.set(x, "draggableHeadCellRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableHeadCellRefsUndefined: Self = StObject.set(x, "draggableHeadCellRefs", js.undefined)
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    @scala.inline
    def setSelectRowUpdate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    @scala.inline
    def setSetCellRef(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setCellRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCellRefUndefined: Self = StObject.set(x, "setCellRef", js.undefined)
    
    @scala.inline
    def setTableRef(value: () => js.Any): Self = StObject.set(x, "tableRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTableRefUndefined: Self = StObject.set(x, "tableRef", js.undefined)
    
    @scala.inline
    def setTabledId(value: String): Self = StObject.set(x, "tabledId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabledIdUndefined: Self = StObject.set(x, "tabledId", js.undefined)
    
    @scala.inline
    def setTimers(value: js.Object): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
    
    @scala.inline
    def setToggleAllExpandableRows(value: () => js.Any): Self = StObject.set(x, "toggleAllExpandableRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleAllExpandableRowsUndefined: Self = StObject.set(x, "toggleAllExpandableRows", js.undefined)
    
    @scala.inline
    def setToggleSort(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "toggleSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSortUndefined: Self = StObject.set(x, "toggleSort", js.undefined)
    
    @scala.inline
    def setUpdateColumnOrder(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "updateColumnOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateColumnOrderUndefined: Self = StObject.set(x, "updateColumnOrder", js.undefined)
  }
}

package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableHead extends StObject {
  
  var activeColumn: js.UndefOr[Any] = js.undefined
  
  var areAllRowsExpanded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var columnOrder: js.Array[Double]
  
  var columns: js.UndefOr[js.Array[MUIDataTableColumnDef]] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var draggableHeadCellRefs: js.UndefOr[js.Object] = js.undefined
  
  var expandedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var options: js.UndefOr[MUIDataTableOptions] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var selectedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var setCellRef: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var tableRef: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var tabledId: js.UndefOr[String] = js.undefined
  
  var timers: js.UndefOr[js.Object] = js.undefined
  
  var toggleAllExpandableRows: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var toggleSort: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var updateColumnOrder: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object MUIDataTableHead {
  
  inline def apply(columnOrder: js.Array[Double]): MUIDataTableHead = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableHead]
  }
  
  extension [Self <: MUIDataTableHead](x: Self) {
    
    inline def setActiveColumn(value: Any): Self = StObject.set(x, "activeColumn", value.asInstanceOf[js.Any])
    
    inline def setActiveColumnUndefined: Self = StObject.set(x, "activeColumn", js.undefined)
    
    inline def setAreAllRowsExpanded(value: () => Boolean): Self = StObject.set(x, "areAllRowsExpanded", js.Any.fromFunction0(value))
    
    inline def setAreAllRowsExpandedUndefined: Self = StObject.set(x, "areAllRowsExpanded", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value*))
    
    inline def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDraggableHeadCellRefs(value: js.Object): Self = StObject.set(x, "draggableHeadCellRefs", value.asInstanceOf[js.Any])
    
    inline def setDraggableHeadCellRefsUndefined: Self = StObject.set(x, "draggableHeadCellRefs", js.undefined)
    
    inline def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    inline def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    inline def setSelectRowUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    inline def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
    
    inline def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSetCellRef(value: /* repeated */ Any => Any): Self = StObject.set(x, "setCellRef", js.Any.fromFunction1(value))
    
    inline def setSetCellRefUndefined: Self = StObject.set(x, "setCellRef", js.undefined)
    
    inline def setTableRef(value: () => Any): Self = StObject.set(x, "tableRef", js.Any.fromFunction0(value))
    
    inline def setTableRefUndefined: Self = StObject.set(x, "tableRef", js.undefined)
    
    inline def setTabledId(value: String): Self = StObject.set(x, "tabledId", value.asInstanceOf[js.Any])
    
    inline def setTabledIdUndefined: Self = StObject.set(x, "tabledId", js.undefined)
    
    inline def setTimers(value: js.Object): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    inline def setTimersUndefined: Self = StObject.set(x, "timers", js.undefined)
    
    inline def setToggleAllExpandableRows(value: () => Any): Self = StObject.set(x, "toggleAllExpandableRows", js.Any.fromFunction0(value))
    
    inline def setToggleAllExpandableRowsUndefined: Self = StObject.set(x, "toggleAllExpandableRows", js.undefined)
    
    inline def setToggleSort(value: /* repeated */ Any => Any): Self = StObject.set(x, "toggleSort", js.Any.fromFunction1(value))
    
    inline def setToggleSortUndefined: Self = StObject.set(x, "toggleSort", js.undefined)
    
    inline def setUpdateColumnOrder(value: /* repeated */ Any => Any): Self = StObject.set(x, "updateColumnOrder", js.Any.fromFunction1(value))
    
    inline def setUpdateColumnOrderUndefined: Self = StObject.set(x, "updateColumnOrder", js.undefined)
  }
}

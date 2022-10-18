package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableBody extends StObject {
  
  var classes: js.Object
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.undefined
  
  var columns: js.Array[MUIDataTableColumnDef]
  
  var count: Double
  
  var data: js.Array[js.Object | (js.Array[Double | String])]
  
  var expandedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ DataIndex, Unit]] = js.undefined
  
  var options: MUIDataTableOptions
  
  var page: js.UndefOr[Double] = js.undefined
  
  var previousSelectedRow: js.UndefOr[Double | Null] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var selectedRows: js.UndefOr[MUIDataTableStateRows] = js.undefined
  
  var tableId: js.UndefOr[String] = js.undefined
  
  var toggleExpandRow: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
}
object MUIDataTableBody {
  
  inline def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions
  ): MUIDataTableBody = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBody]
  }
  
  extension [Self <: MUIDataTableBody](x: Self) {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    inline def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value*))
    
    inline def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    inline def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    inline def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    inline def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value*))
    
    inline def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ DataIndex) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPreviousSelectedRow(value: Double): Self = StObject.set(x, "previousSelectedRow", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectedRowNull: Self = StObject.set(x, "previousSelectedRow", null)
    
    inline def setPreviousSelectedRowUndefined: Self = StObject.set(x, "previousSelectedRow", js.undefined)
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSelectRowUpdate(value: /* args */ Any => Any): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    inline def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
    
    inline def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setToggleExpandRow(value: /* args */ Any => Any): Self = StObject.set(x, "toggleExpandRow", js.Any.fromFunction1(value))
    
    inline def setToggleExpandRowUndefined: Self = StObject.set(x, "toggleExpandRow", js.undefined)
  }
}

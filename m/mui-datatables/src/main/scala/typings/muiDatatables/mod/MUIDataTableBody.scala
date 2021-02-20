package typings.muiDatatables.mod

import typings.muiDatatables.anon.RowIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableBody extends StObject {
  
  var classes: js.Object = js.native
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.native
  
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  
  var count: Double = js.native
  
  var data: js.Array[js.Object | (js.Array[Double | String])] = js.native
  
  var expandedRows: js.UndefOr[MUIDataTableStateRows] = js.native
  
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, Unit]] = js.native
  
  var options: MUIDataTableOptions = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var previousSelectedRow: js.UndefOr[Double | Null] = js.native
  
  var rowsPerPage: js.UndefOr[Double] = js.native
  
  var searchText: js.UndefOr[String] = js.native
  
  var selectRowUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var selectedRows: js.UndefOr[MUIDataTableStateRows] = js.native
  
  var tableId: js.UndefOr[String] = js.native
  
  var toggleExpandRow: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}
object MUIDataTableBody {
  
  @scala.inline
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions
  ): MUIDataTableBody = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBody]
  }
  
  @scala.inline
  implicit class MUIDataTableBodyMutableBuilder[Self <: MUIDataTableBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListUndefined: Self = StObject.set(x, "filterList", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = StObject.set(x, "filterList", js.Array(value :_*))
    
    @scala.inline
    def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPreviousSelectedRow(value: Double): Self = StObject.set(x, "previousSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSelectedRowNull: Self = StObject.set(x, "previousSelectedRow", null)
    
    @scala.inline
    def setPreviousSelectedRowUndefined: Self = StObject.set(x, "previousSelectedRow", js.undefined)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setSelectRowUpdate(value: /* args */ js.Any => _): Self = StObject.set(x, "selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectRowUpdateUndefined: Self = StObject.set(x, "selectRowUpdate", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setToggleExpandRow(value: /* args */ js.Any => _): Self = StObject.set(x, "toggleExpandRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleExpandRowUndefined: Self = StObject.set(x, "toggleExpandRow", js.undefined)
  }
}

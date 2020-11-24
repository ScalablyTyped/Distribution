package typings.muiDatatables.mod

import typings.muiDatatables.anon.RowIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableBody extends js.Object {
  
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
  implicit class MUIDataTableBodyOps[Self <: MUIDataTableBody] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = this.set("columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = this.set("columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnOrder: Self = this.set("columnOrder", js.undefined)
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = this.set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRows: Self = this.set("expandedRows", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = this.set("filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterList: Self = this.set("filterList", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = this.set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPreviousSelectedRow(value: Double): Self = this.set("previousSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSelectedRow: Self = this.set("previousSelectedRow", js.undefined)
    
    @scala.inline
    def setPreviousSelectedRowNull: Self = this.set("previousSelectedRow", null)
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsPerPage: Self = this.set("rowsPerPage", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
    
    @scala.inline
    def setSelectRowUpdate(value: /* args */ js.Any => _): Self = this.set("selectRowUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectRowUpdate: Self = this.set("selectRowUpdate", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    
    @scala.inline
    def setToggleExpandRow(value: /* args */ js.Any => _): Self = this.set("toggleExpandRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleExpandRow: Self = this.set("toggleExpandRow", js.undefined)
  }
}

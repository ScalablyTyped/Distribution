package typings.muiDatatables.mod

import typings.muiDatatables.anon.Data
import typings.muiDatatables.anon.DataIndex
import typings.react.mod.HTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableState extends js.Object {
  
  var activeColumn: String | Null = js.native
  
  var announceText: String | Null = js.native
  
  var columnOrder: js.Array[Double] = js.native
  
  var columns: js.Array[MUIDataTableColumnState] = js.native
  
  var count: Double = js.native
  
  var data: js.Array[_] = js.native
  
  var displayData: DisplayData = js.native
  
  var expandedRows: MUIDataTableStateRows = js.native
  
  var filterData: js.Array[js.Array[String]] = js.native
  
  var filterList: js.Array[js.Array[String]] = js.native
  
  var page: Double = js.native
  
  var previousSelectedRow: Null | DataIndex = js.native
  
  var rowsPerPage: Double = js.native
  
  var rowsPerPageOptions: js.Array[Double] = js.native
  
  var searchProps: HTMLAttributes[HTMLInputElement] | Null = js.native
  
  var searchText: String | Null = js.native
  
  var selectedRows: MUIDataTableStateRows = js.native
  
  var showResponsive: Boolean = js.native
  
  var sortOrder: MUISortOptions = js.native
}
object MUIDataTableState {
  
  @scala.inline
  def apply(
    columnOrder: js.Array[Double],
    columns: js.Array[MUIDataTableColumnState],
    count: Double,
    data: js.Array[_],
    displayData: DisplayData,
    expandedRows: MUIDataTableStateRows,
    filterData: js.Array[js.Array[String]],
    filterList: js.Array[js.Array[String]],
    page: Double,
    rowsPerPage: Double,
    rowsPerPageOptions: js.Array[Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: Boolean,
    sortOrder: MUISortOptions
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], displayData = displayData.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], filterList = filterList.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], rowsPerPageOptions = rowsPerPageOptions.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], showResponsive = showResponsive.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableState]
  }
  
  @scala.inline
  implicit class MUIDataTableStateOps[Self <: MUIDataTableState] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: MUIDataTableColumnState*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnState]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataVarargs(value: Data*): Self = this.set("displayData", js.Array(value :_*))
    
    @scala.inline
    def setDisplayData(value: DisplayData): Self = this.set("displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRows(value: MUIDataTableStateRows): Self = this.set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDataVarargs(value: js.Array[String]*): Self = this.set("filterData", js.Array(value :_*))
    
    @scala.inline
    def setFilterData(value: js.Array[js.Array[String]]): Self = this.set("filterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListVarargs(value: js.Array[String]*): Self = this.set("filterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: js.Array[js.Array[String]]): Self = this.set("filterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = this.set("rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: Double*): Self = this.set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[Double]): Self = this.set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRows(value: MUIDataTableStateRows): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowResponsive(value: Boolean): Self = this.set("showResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColumn(value: String): Self = this.set("activeColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColumnNull: Self = this.set("activeColumn", null)
    
    @scala.inline
    def setAnnounceText(value: String): Self = this.set("announceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceTextNull: Self = this.set("announceText", null)
    
    @scala.inline
    def setPreviousSelectedRow(value: DataIndex): Self = this.set("previousSelectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSelectedRowNull: Self = this.set("previousSelectedRow", null)
    
    @scala.inline
    def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = this.set("searchProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPropsNull: Self = this.set("searchProps", null)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextNull: Self = this.set("searchText", null)
  }
}

package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableMeta extends js.Object {
  
  var columnData: MUIDataTableColumnState = js.native
  
  var columnIndex: Double = js.native
  
  var currentTableData: js.Array[MUIDataTableCurrentData] = js.native
  
  var rowData: js.Array[_] = js.native
  
  var rowIndex: Double = js.native
  
  var tableData: js.Array[MUIDataTableData] = js.native
  
  var tableState: MUIDataTableState = js.native
}
object MUIDataTableMeta {
  
  @scala.inline
  def apply(
    columnData: MUIDataTableColumnState,
    columnIndex: Double,
    currentTableData: js.Array[MUIDataTableCurrentData],
    rowData: js.Array[_],
    rowIndex: Double,
    tableData: js.Array[MUIDataTableData],
    tableState: MUIDataTableState
  ): MUIDataTableMeta = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], currentTableData = currentTableData.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tableData = tableData.asInstanceOf[js.Any], tableState = tableState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableMeta]
  }
  
  @scala.inline
  implicit class MUIDataTableMetaOps[Self <: MUIDataTableMeta] (val x: Self) extends AnyVal {
    
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
    def setColumnData(value: MUIDataTableColumnState): Self = this.set("columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTableDataVarargs(value: MUIDataTableCurrentData*): Self = this.set("currentTableData", js.Array(value :_*))
    
    @scala.inline
    def setCurrentTableData(value: js.Array[MUIDataTableCurrentData]): Self = this.set("currentTableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataVarargs(value: js.Any*): Self = this.set("rowData", js.Array(value :_*))
    
    @scala.inline
    def setRowData(value: js.Array[_]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDataVarargs(value: MUIDataTableData*): Self = this.set("tableData", js.Array(value :_*))
    
    @scala.inline
    def setTableData(value: js.Array[MUIDataTableData]): Self = this.set("tableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableState(value: MUIDataTableState): Self = this.set("tableState", value.asInstanceOf[js.Any])
  }
}

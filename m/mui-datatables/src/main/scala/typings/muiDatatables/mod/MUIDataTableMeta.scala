package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableMeta extends StObject {
  
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
  implicit class MUIDataTableMetaMutableBuilder[Self <: MUIDataTableMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnData(value: MUIDataTableColumnState): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTableData(value: js.Array[MUIDataTableCurrentData]): Self = StObject.set(x, "currentTableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTableDataVarargs(value: MUIDataTableCurrentData*): Self = StObject.set(x, "currentTableData", js.Array(value :_*))
    
    @scala.inline
    def setRowData(value: js.Array[_]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataVarargs(value: js.Any*): Self = StObject.set(x, "rowData", js.Array(value :_*))
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableData(value: js.Array[MUIDataTableData]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableDataVarargs(value: MUIDataTableData*): Self = StObject.set(x, "tableData", js.Array(value :_*))
    
    @scala.inline
    def setTableState(value: MUIDataTableState): Self = StObject.set(x, "tableState", value.asInstanceOf[js.Any])
  }
}

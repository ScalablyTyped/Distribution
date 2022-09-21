package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableMeta extends StObject {
  
  var columnData: MUIDataTableColumnState
  
  var columnIndex: Double
  
  var currentTableData: js.Array[MUIDataTableCurrentData]
  
  var rowData: js.Array[Any]
  
  var rowIndex: Double
  
  var tableData: js.Array[MUIDataTableData]
  
  var tableState: MUIDataTableState
}
object MUIDataTableMeta {
  
  inline def apply(
    columnData: MUIDataTableColumnState,
    columnIndex: Double,
    currentTableData: js.Array[MUIDataTableCurrentData],
    rowData: js.Array[Any],
    rowIndex: Double,
    tableData: js.Array[MUIDataTableData],
    tableState: MUIDataTableState
  ): MUIDataTableMeta = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], currentTableData = currentTableData.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tableData = tableData.asInstanceOf[js.Any], tableState = tableState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableMeta]
  }
  
  extension [Self <: MUIDataTableMeta](x: Self) {
    
    inline def setColumnData(value: MUIDataTableColumnState): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentTableData(value: js.Array[MUIDataTableCurrentData]): Self = StObject.set(x, "currentTableData", value.asInstanceOf[js.Any])
    
    inline def setCurrentTableDataVarargs(value: MUIDataTableCurrentData*): Self = StObject.set(x, "currentTableData", js.Array(value*))
    
    inline def setRowData(value: js.Array[Any]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataVarargs(value: Any*): Self = StObject.set(x, "rowData", js.Array(value*))
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setTableData(value: js.Array[MUIDataTableData]): Self = StObject.set(x, "tableData", value.asInstanceOf[js.Any])
    
    inline def setTableDataVarargs(value: MUIDataTableData*): Self = StObject.set(x, "tableData", js.Array(value*))
    
    inline def setTableState(value: MUIDataTableState): Self = StObject.set(x, "tableState", value.asInstanceOf[js.Any])
  }
}

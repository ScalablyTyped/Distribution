package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableMeta extends js.Object {
  var columnData: MUIDataTableColumnState
  var columnIndex: Double
  var rowData: js.Array[_]
  var rowIndex: Double
  var tableData: js.Array[MUIDataTableData]
  var tableState: MUIDataTableState
}

object MUIDataTableMeta {
  @scala.inline
  def apply(
    columnData: MUIDataTableColumnState,
    columnIndex: Double,
    rowData: js.Array[_],
    rowIndex: Double,
    tableData: js.Array[MUIDataTableData],
    tableState: MUIDataTableState
  ): MUIDataTableMeta = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tableData = tableData.asInstanceOf[js.Any], tableState = tableState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableMeta]
  }
}


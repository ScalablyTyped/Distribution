package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait TableSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the selected area of the table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  /**
    *
    * Indicates if the selection is inside a table, address will be useless if IsInsideTable is false.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isInsideTable: Boolean
  /**
    *
    * Gets the id of the table in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableSelectionChanged
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object TableSelectionChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    isInsideTable: Boolean,
    tableId: String,
    `type`: TableSelectionChanged,
    worksheetId: String
  ): TableSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], isInsideTable = isInsideTable.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSelectionChangedEventArgs]
  }
}


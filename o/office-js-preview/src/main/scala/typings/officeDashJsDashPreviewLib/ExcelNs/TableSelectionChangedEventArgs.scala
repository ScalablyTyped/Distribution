package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var address: java.lang.String
  /**
    *
    * Indicates if the selection is inside a table, address will be useless if IsInsideTable is false.
    *
    * [Api set: ExcelApi 1.7]
    */
  var isInsideTable: scala.Boolean
  /**
    *
    * Gets the id of the table in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableSelectionChanged
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
}

object TableSelectionChangedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    isInsideTable: scala.Boolean,
    tableId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableSelectionChanged,
    worksheetId: java.lang.String
  ): TableSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("isInsideTable")(isInsideTable)
    __obj.updateDynamic("tableId")(tableId)
    __obj.updateDynamic("worksheetId")(worksheetId)
    __obj.asInstanceOf[TableSelectionChangedEventArgs]
  }
}


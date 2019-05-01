package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait TableChangedEventArgs extends js.Object {
  /**
    *
    * Gets the address that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: java.lang.String
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RangeEdited | officeDashJsLib.officeDashJsLibStrings.RowInserted | officeDashJsLib.officeDashJsLibStrings.RowDeleted | officeDashJsLib.officeDashJsLibStrings.ColumnInserted | officeDashJsLib.officeDashJsLibStrings.ColumnDeleted | officeDashJsLib.officeDashJsLibStrings.CellInserted | officeDashJsLib.officeDashJsLibStrings.CellDeleted
  /**
    *
    * Represents the information about the change detail
    *
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
    *
    * Gets the id of the table in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsLib.officeDashJsLibStrings.TableChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range
  /**
    *
    * Gets the range that represents the changed area of a table on a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

object TableChangedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    changeType: DataChangeType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RangeEdited | officeDashJsLib.officeDashJsLibStrings.RowInserted | officeDashJsLib.officeDashJsLibStrings.RowDeleted | officeDashJsLib.officeDashJsLibStrings.ColumnInserted | officeDashJsLib.officeDashJsLibStrings.ColumnDeleted | officeDashJsLib.officeDashJsLibStrings.CellInserted | officeDashJsLib.officeDashJsLibStrings.CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote,
    tableId: java.lang.String,
    `type`: officeDashJsLib.officeDashJsLibStrings.TableChanged,
    worksheetId: java.lang.String
  ): TableChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, changeType = changeType.asInstanceOf[js.Any], details = details, getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], tableId = tableId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableChangedEventArgs]
  }
}


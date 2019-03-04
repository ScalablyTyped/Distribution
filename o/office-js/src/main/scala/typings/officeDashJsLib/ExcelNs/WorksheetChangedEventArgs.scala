package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
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
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range
}

object WorksheetChangedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    changeType: DataChangeType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.RangeEdited | officeDashJsLib.officeDashJsLibStrings.RowInserted | officeDashJsLib.officeDashJsLibStrings.RowDeleted | officeDashJsLib.officeDashJsLibStrings.ColumnInserted | officeDashJsLib.officeDashJsLibStrings.ColumnDeleted | officeDashJsLib.officeDashJsLibStrings.CellInserted | officeDashJsLib.officeDashJsLibStrings.CellDeleted,
    getRange: js.Function1[RequestContext, Range],
    getRangeOrNullObject: js.Function1[RequestContext, Range],
    source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote,
    `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetChanged,
    worksheetId: java.lang.String
  ): WorksheetChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, changeType = changeType.asInstanceOf[js.Any], getRange = getRange, getRangeOrNullObject = getRangeOrNullObject, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetChangedEventArgs]
  }
}


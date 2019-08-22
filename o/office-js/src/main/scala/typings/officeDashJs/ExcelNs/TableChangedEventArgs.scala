package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.CellDeleted
import typings.officeDashJs.officeDashJsStrings.CellInserted
import typings.officeDashJs.officeDashJsStrings.ColumnDeleted
import typings.officeDashJs.officeDashJsStrings.ColumnInserted
import typings.officeDashJs.officeDashJsStrings.Local
import typings.officeDashJs.officeDashJsStrings.RangeEdited
import typings.officeDashJs.officeDashJsStrings.Remote
import typings.officeDashJs.officeDashJsStrings.RowDeleted
import typings.officeDashJs.officeDashJsStrings.RowInserted
import typings.officeDashJs.officeDashJsStrings.TableChanged
import typings.officeDashJs.officeDashJsStrings.Unknown
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
  var address: String
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
  /**
    *
    * Represents the information about the change detail. This property can be retrieved when the Changed event is triggered on single cell. If the Changed event is triggered on multiple cells, this property can not be retrieved.
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
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the id of the table in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tableId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: TableChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
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
    address: String,
    changeType: DataChangeType | Unknown | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    tableId: String,
    `type`: TableChanged,
    worksheetId: String
  ): TableChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, changeType = changeType.asInstanceOf[js.Any], details = details, getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], tableId = tableId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableChangedEventArgs]
  }
}


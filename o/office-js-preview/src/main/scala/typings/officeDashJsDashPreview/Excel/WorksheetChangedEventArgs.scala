package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CellDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CellInserted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColumnDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColumnInserted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RangeEdited
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RowDeleted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RowInserted
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetChanged
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
    * Represents the information about the change detail. This property can be retrieved when the Changed event is triggered on a single cell. If the Changed event is triggered on multiple cells, this property cannot be retrieved.
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
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
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
    address: String,
    changeType: DataChangeType | Unknown | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    `type`: WorksheetChanged,
    worksheetId: String
  ): WorksheetChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, changeType = changeType.asInstanceOf[js.Any], details = details, getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetChangedEventArgs]
  }
}


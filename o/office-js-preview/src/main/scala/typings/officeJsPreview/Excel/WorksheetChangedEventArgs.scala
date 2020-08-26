package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.CellDeleted
import typings.officeJsPreview.officeJsPreviewStrings.CellInserted
import typings.officeJsPreview.officeJsPreviewStrings.ColumnDeleted
import typings.officeJsPreview.officeJsPreviewStrings.ColumnInserted
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.RangeEdited
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.RowDeleted
import typings.officeJsPreview.officeJsPreviewStrings.RowInserted
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Changed event.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorksheetChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String = js.native
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.DataChangeType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted = js.native
  /**
    *
    * Represents the information about the change detail. This property can be retrieved when the Changed event is triggered on a single cell. If the Changed event is triggered on multiple cells, this property cannot be retrieved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var details: ChangedEventDetail = js.native
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | Local | Remote = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetChanged = js.native
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String = js.native
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(ctx: RequestContext): Range = js.native
  /**
    *
    * Gets the range that represents the changed area of a specific worksheet. It might return null object.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRangeOrNullObject(ctx: RequestContext): Range = js.native
}

object WorksheetChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted,
    details: ChangedEventDetail,
    getRange: RequestContext => Range,
    getRangeOrNullObject: RequestContext => Range,
    source: EventSource | Local | Remote,
    `type`: WorksheetChanged,
    worksheetId: String
  ): WorksheetChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], getRange = js.Any.fromFunction1(getRange), getRangeOrNullObject = js.Any.fromFunction1(getRangeOrNullObject), source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetChangedEventArgs]
  }
  @scala.inline
  implicit class WorksheetChangedEventArgsOps[Self <: WorksheetChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeType(
      value: DataChangeType | Unknown_ | RangeEdited | RowInserted | RowDeleted | ColumnInserted | ColumnDeleted | CellInserted | CellDeleted
    ): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: ChangedEventDetail): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRange(value: RequestContext => Range): Self = this.set("getRange", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRangeOrNullObject(value: RequestContext => Range): Self = this.set("getRangeOrNullObject", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WorksheetChanged): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}


package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.Unhidden
import typings.officeJsPreview.officeJsPreviewStrings.WorksheetRowHiddenChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet's row hidden change event.
  *
  * [Api set: ExcelApi 1.11]
  */
trait WorksheetRowHiddenChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.11]
    */
  var address: String
  /**
    *
    * Gets the type of change that represents how the event was triggered. See `Excel.RowHiddenChangeType` for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var changeType: RowHiddenChangeType | Unhidden | Hidden
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.11]
    */
  var `type`: WorksheetRowHiddenChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi 1.11]
    */
  var worksheetId: String
}

object WorksheetRowHiddenChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: RowHiddenChangeType | Unhidden | Hidden,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowHiddenChanged,
    worksheetId: String
  ): WorksheetRowHiddenChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetRowHiddenChangedEventArgs]
  }
}


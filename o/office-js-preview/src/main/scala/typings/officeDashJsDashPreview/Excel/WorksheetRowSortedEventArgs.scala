package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetRowSorted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the row-sorted event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
trait WorksheetRowSortedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet. Only rows changed as a result of the sort operation are returned.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetRowSorted
  /**
    *
    * Gets the id of the worksheet where the sorting happened.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheetId: String
}

object WorksheetRowSortedEventArgs {
  @scala.inline
  def apply(
    address: String,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowSorted,
    worksheetId: String
  ): WorksheetRowSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetRowSortedEventArgs]
  }
}


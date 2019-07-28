package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetColumnSorted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the ColumnSorted event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorksheetColumnSortedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var address: String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: WorksheetColumnSorted
  /**
    *
    * Gets the id of the worksheet where the sorting happened.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object WorksheetColumnSortedEventArgs {
  @scala.inline
  def apply(
    address: String,
    source: EventSource | Local | Remote,
    `type`: WorksheetColumnSorted,
    worksheetId: String
  ): WorksheetColumnSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetColumnSortedEventArgs]
  }
}


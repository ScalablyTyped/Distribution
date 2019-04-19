package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the RowSorted event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorksheetRowSortedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the sorted areas of a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var address: java.lang.String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetRowSorted
  /**
    *
    * Gets the id of the worksheet in which the sorting happened.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: java.lang.String
}

object WorksheetRowSortedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetRowSorted,
    worksheetId: java.lang.String
  ): WorksheetRowSortedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetRowSortedEventArgs]
  }
}


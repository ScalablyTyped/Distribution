package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Deleted event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetDeletedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetDeleted
  /**
    *
    * Gets the id of the worksheet that is deleted from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
}

object WorksheetDeletedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetDeleted,
    worksheetId: java.lang.String
  ): WorksheetDeletedEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.updateDynamic("worksheetId")(worksheetId)
    __obj.asInstanceOf[WorksheetDeletedEventArgs]
  }
}


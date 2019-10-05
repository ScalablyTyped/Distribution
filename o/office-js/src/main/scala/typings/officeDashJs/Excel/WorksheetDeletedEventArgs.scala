package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.Local
import typings.officeDashJs.officeDashJsStrings.Remote
import typings.officeDashJs.officeDashJsStrings.WorksheetDeleted
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
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetDeleted
  /**
    *
    * Gets the id of the worksheet that is deleted from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object WorksheetDeletedEventArgs {
  @scala.inline
  def apply(source: EventSource | Local | Remote, `type`: WorksheetDeleted, worksheetId: String): WorksheetDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetDeletedEventArgs]
  }
}


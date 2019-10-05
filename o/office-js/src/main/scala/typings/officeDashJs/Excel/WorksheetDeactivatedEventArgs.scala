package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.WorksheetDeactivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetDeactivated
  /**
    *
    * Gets the id of the worksheet that is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object WorksheetDeactivatedEventArgs {
  @scala.inline
  def apply(`type`: WorksheetDeactivated, worksheetId: String): WorksheetDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetDeactivatedEventArgs]
  }
}


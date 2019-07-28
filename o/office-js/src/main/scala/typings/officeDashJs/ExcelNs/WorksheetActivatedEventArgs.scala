package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.WorksheetActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Activated event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetActivated
  /**
    *
    * Gets the id of the worksheet that is activated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object WorksheetActivatedEventArgs {
  @scala.inline
  def apply(`type`: WorksheetActivated, worksheetId: String): WorksheetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetActivatedEventArgs]
  }
}


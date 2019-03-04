package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Added event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetAddedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetAdded
  /**
    *
    * Gets the id of the worksheet that is added to the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
}

object WorksheetAddedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote,
    `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetAdded,
    worksheetId: java.lang.String
  ): WorksheetAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetAddedEventArgs]
  }
}


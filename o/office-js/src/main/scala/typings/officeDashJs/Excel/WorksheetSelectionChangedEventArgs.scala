package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.WorksheetSelectionChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the SelectionChanged event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the selected area of a specific worksheet.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: WorksheetSelectionChanged
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: String
}

object WorksheetSelectionChangedEventArgs {
  @scala.inline
  def apply(address: String, `type`: WorksheetSelectionChanged, worksheetId: String): WorksheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetSelectionChangedEventArgs]
  }
}


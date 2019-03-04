package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var address: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetSelectionChanged
  /**
    *
    * Gets the id of the worksheet in which the selection changed.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
}

object WorksheetSelectionChangedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetSelectionChanged,
    worksheetId: java.lang.String
  ): WorksheetSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetSelectionChangedEventArgs]
  }
}


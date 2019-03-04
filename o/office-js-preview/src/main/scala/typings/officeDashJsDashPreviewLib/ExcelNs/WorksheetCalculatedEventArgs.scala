package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Calculated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait WorksheetCalculatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetCalculated
  /**
    *
    * Gets the id of the worksheet that is calculated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: java.lang.String
}

object WorksheetCalculatedEventArgs {
  @scala.inline
  def apply(
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetCalculated,
    worksheetId: java.lang.String
  ): WorksheetCalculatedEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetCalculatedEventArgs]
  }
}


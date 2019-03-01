package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the filter applied event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorksheetFilteredEventArgs extends js.Object {
  /**
    *
    * Represents the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetFiltered
  /**
    *
    * Represents the id of the worksheet in which the filter is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: java.lang.String
}

object WorksheetFilteredEventArgs {
  @scala.inline
  def apply(
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetFiltered,
    worksheetId: java.lang.String
  ): WorksheetFilteredEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("worksheetId")(worksheetId)
    __obj.asInstanceOf[WorksheetFilteredEventArgs]
  }
}


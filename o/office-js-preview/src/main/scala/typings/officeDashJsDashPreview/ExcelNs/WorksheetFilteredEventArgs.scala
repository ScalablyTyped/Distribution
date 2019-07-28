package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetFiltered
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
  var `type`: WorksheetFiltered
  /**
    *
    * Represents the id of the worksheet in which the filter is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object WorksheetFilteredEventArgs {
  @scala.inline
  def apply(`type`: WorksheetFiltered, worksheetId: String): WorksheetFilteredEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetFilteredEventArgs]
  }
}


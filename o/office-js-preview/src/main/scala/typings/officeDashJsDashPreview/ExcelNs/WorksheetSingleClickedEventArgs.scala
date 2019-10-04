package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetSingleClicked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the left-clicked/tapped event and its related worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorksheetSingleClickedEventArgs extends js.Object {
  /**
    *
    * Gets the address that represents the cell which was left-clicked/tapped for a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var address: String
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the left (or right for RTL) gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var offsetX: Double
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the top gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var offsetY: Double
  /**
    *
    * Gets the type of the event.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: WorksheetSingleClicked
  /**
    *
    * Gets the id of the worksheet in which the cell was left-clicked/tapped.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object WorksheetSingleClickedEventArgs {
  @scala.inline
  def apply(
    address: String,
    offsetX: Double,
    offsetY: Double,
    `type`: WorksheetSingleClicked,
    worksheetId: String
  ): WorksheetSingleClickedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, offsetX = offsetX, offsetY = offsetY, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetSingleClickedEventArgs]
  }
}


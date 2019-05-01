package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the left-clicked/tapped event.
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
  var address: java.lang.String
  /**
    *
    * It is a double value that represents the distance, in points, from the left-clicked/tapped point to the left(right for RTL) gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var offsetX: scala.Double
  /**
    *
    * It is a double value that represents the distance, in points, from the left-clicked/tapped point to the top gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var offsetY: scala.Double
  /**
    *
    * Gets the type of the event.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetSingleClicked
  /**
    *
    * Gets the id of the worksheet in which the cell was left-clicked/tapped.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: java.lang.String
}

object WorksheetSingleClickedEventArgs {
  @scala.inline
  def apply(
    address: java.lang.String,
    offsetX: scala.Double,
    offsetY: scala.Double,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorksheetSingleClicked,
    worksheetId: java.lang.String
  ): WorksheetSingleClickedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, offsetX = offsetX, offsetY = offsetY, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetSingleClickedEventArgs]
  }
}


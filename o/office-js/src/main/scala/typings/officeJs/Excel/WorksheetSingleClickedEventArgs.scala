package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.WorksheetSingleClicked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the left-clicked/tapped event and its related worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
trait WorksheetSingleClickedEventArgs extends js.Object {
  /**
    *
    * Gets the address that represents the cell which was left-clicked/tapped for a specific worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var address: String
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the left (or right for right-to-left languages) gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi 1.10]
    */
  var offsetX: Double
  /**
    *
    * The distance, in points, from the left-clicked/tapped point to the top gridline edge of the left-clicked/tapped cell.
    *
    * [Api set: ExcelApi 1.10]
    */
  var offsetY: Double
  /**
    *
    * Gets the type of the event.
    *
    * [Api set: ExcelApi 1.10]
    */
  var `type`: WorksheetSingleClicked
  /**
    *
    * Gets the id of the worksheet in which the cell was left-clicked/tapped.
    *
    * [Api set: ExcelApi 1.10]
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetSingleClickedEventArgs]
  }
}


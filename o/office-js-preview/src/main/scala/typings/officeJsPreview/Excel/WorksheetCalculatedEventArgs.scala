package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetCalculated
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
    * The address of the ranges that completed calculation.
    If multiple ranges completed calculation, the string is a comma-separated list of those range addresses.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  var address: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: WorksheetCalculated
  /**
    *
    * Gets the id of the worksheet in which the calculation occurred.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}

object WorksheetCalculatedEventArgs {
  @scala.inline
  def apply(address: String, `type`: WorksheetCalculated, worksheetId: String): WorksheetCalculatedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCalculatedEventArgs]
  }
}


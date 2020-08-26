package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.WorksheetCalculated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Calculated event.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait WorksheetCalculatedEventArgs extends js.Object {
  /**
    *
    * The address of the range that completed calculation.
    If multiple ranges completed calculation, the string is a comma-separated list of those range addresses.
    *
    * [Api set: ExcelApi 1.11]
    */
  var address: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: WorksheetCalculated = js.native
  /**
    *
    * Gets the id of the worksheet in which the calculation occurred.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String = js.native
}

object WorksheetCalculatedEventArgs {
  @scala.inline
  def apply(address: String, `type`: WorksheetCalculated, worksheetId: String): WorksheetCalculatedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetCalculatedEventArgs]
  }
  @scala.inline
  implicit class WorksheetCalculatedEventArgsOps[Self <: WorksheetCalculatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WorksheetCalculated): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}


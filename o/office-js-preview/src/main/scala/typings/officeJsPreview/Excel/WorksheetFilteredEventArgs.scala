package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorksheetFiltered
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
@js.native
trait WorksheetFilteredEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: WorksheetFiltered = js.native
  /**
    *
    * Gets the id of the worksheet in which the filter is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String = js.native
}

object WorksheetFilteredEventArgs {
  @scala.inline
  def apply(`type`: WorksheetFiltered, worksheetId: String): WorksheetFilteredEventArgs = {
    val __obj = js.Dynamic.literal(worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetFilteredEventArgs]
  }
  @scala.inline
  implicit class WorksheetFilteredEventArgsOps[Self <: WorksheetFilteredEventArgs] (val x: Self) extends AnyVal {
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
    def setType(value: WorksheetFiltered): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}


package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.WorkbookAutoSaveSettingChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the workbook's onAutoSaveSettingChanged event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait WorkbookAutoSaveSettingChangedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: WorkbookAutoSaveSettingChanged = js.native
}

object WorkbookAutoSaveSettingChangedEventArgs {
  @scala.inline
  def apply(`type`: WorkbookAutoSaveSettingChanged): WorkbookAutoSaveSettingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookAutoSaveSettingChangedEventArgs]
  }
  @scala.inline
  implicit class WorkbookAutoSaveSettingChangedEventArgsOps[Self <: WorkbookAutoSaveSettingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setType(value: WorkbookAutoSaveSettingChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


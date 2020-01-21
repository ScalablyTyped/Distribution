package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.WorkbookAutoSaveSettingChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the workbook's onAutoSaveSettingChanged event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait WorkbookAutoSaveSettingChangedEventArgs extends js.Object {
  /**
    *
    * Represents the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: WorkbookAutoSaveSettingChanged
}

object WorkbookAutoSaveSettingChangedEventArgs {
  @scala.inline
  def apply(`type`: WorkbookAutoSaveSettingChanged): WorkbookAutoSaveSettingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookAutoSaveSettingChangedEventArgs]
  }
}


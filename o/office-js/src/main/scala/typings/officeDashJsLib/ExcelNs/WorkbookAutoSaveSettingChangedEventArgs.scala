package typings
package officeDashJsLib.ExcelNs

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
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorkbookAutoSaveSettingChanged
}

object WorkbookAutoSaveSettingChangedEventArgs {
  @scala.inline
  def apply(`type`: officeDashJsLib.officeDashJsLibStrings.WorkbookAutoSaveSettingChanged): WorkbookAutoSaveSettingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkbookAutoSaveSettingChangedEventArgs]
  }
}


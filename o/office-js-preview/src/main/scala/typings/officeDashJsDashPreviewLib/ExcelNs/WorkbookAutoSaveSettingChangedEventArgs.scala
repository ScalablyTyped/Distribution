package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the workbook's onAutoSaveSettingChanged event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorkbookAutoSaveSettingChangedEventArgs extends js.Object {
  /**
    *
    * Represents the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorkbookAutoSaveSettingChanged
}

object WorkbookAutoSaveSettingChangedEventArgs {
  @scala.inline
  def apply(
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WorkbookAutoSaveSettingChanged
  ): WorkbookAutoSaveSettingChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkbookAutoSaveSettingChangedEventArgs]
  }
}


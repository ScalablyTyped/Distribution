package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Hidden
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unhidden
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WorksheetRowHiddenChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet row hidden change event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorksheetRowHiddenChangedEventArgs extends js.Object {
  /**
    *
    * Gets the range address that represents the changed area of a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var address: String
  /**
    *
    * Gets the change type that represents how the Changed event is triggered. See Excel.RowHiddenChangeType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var changeType: RowHiddenChangeType | Unhidden | Hidden
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: WorksheetRowHiddenChanged
  /**
    *
    * Gets the id of the worksheet in which the data changed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object WorksheetRowHiddenChangedEventArgs {
  @scala.inline
  def apply(
    address: String,
    changeType: RowHiddenChangeType | Unhidden | Hidden,
    source: EventSource | Local | Remote,
    `type`: WorksheetRowHiddenChanged,
    worksheetId: String
  ): WorksheetRowHiddenChangedEventArgs = {
    val __obj = js.Dynamic.literal(address = address, changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorksheetRowHiddenChangedEventArgs]
  }
}


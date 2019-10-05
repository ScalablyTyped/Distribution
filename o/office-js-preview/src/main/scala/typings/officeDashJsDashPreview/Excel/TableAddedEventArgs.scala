package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Local
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Remote
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TableAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the OnAdded event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TableAddedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote
  /**
    *
    * Gets the id of the table that is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableAdded
  /**
    *
    * Gets the id of the worksheet in which the table is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}

object TableAddedEventArgs {
  @scala.inline
  def apply(source: EventSource | Local | Remote, tableId: String, `type`: TableAdded, worksheetId: String): TableAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableAddedEventArgs]
  }
}


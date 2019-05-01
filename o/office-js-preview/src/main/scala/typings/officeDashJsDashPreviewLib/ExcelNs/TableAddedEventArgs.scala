package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
    *
    * Gets the id of the table that is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: java.lang.String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableAdded
  /**
    *
    * Gets the id of the worksheet in which the table is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: java.lang.String
}

object TableAddedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote,
    tableId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TableAdded,
    worksheetId: java.lang.String
  ): TableAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableAddedEventArgs]
  }
}


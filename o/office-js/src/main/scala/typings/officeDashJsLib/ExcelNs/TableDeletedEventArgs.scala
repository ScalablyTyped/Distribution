package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the OnDeleted event.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TableDeletedEventArgs extends js.Object {
  /**
    *
    * Specifies the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote
  /**
    *
    * Specifies the id of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: java.lang.String
  /**
    *
    * Specifies the name of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableName: java.lang.String
  /**
    *
    * Specifies the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: officeDashJsLib.officeDashJsLibStrings.TableDeleted
  /**
    *
    * Specifies the id of the worksheet in which the table is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: java.lang.String
}

object TableDeletedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | officeDashJsLib.officeDashJsLibStrings.Local | officeDashJsLib.officeDashJsLibStrings.Remote,
    tableId: java.lang.String,
    tableName: java.lang.String,
    `type`: officeDashJsLib.officeDashJsLibStrings.TableDeleted,
    worksheetId: java.lang.String
  ): TableDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId, tableName = tableName, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableDeletedEventArgs]
  }
}


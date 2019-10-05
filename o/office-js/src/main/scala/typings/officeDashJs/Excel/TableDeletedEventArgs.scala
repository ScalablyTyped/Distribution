package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.Local
import typings.officeDashJs.officeDashJsStrings.Remote
import typings.officeDashJs.officeDashJsStrings.TableDeleted
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
  var source: EventSource | Local | Remote
  /**
    *
    * Specifies the id of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String
  /**
    *
    * Specifies the name of the table that is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableName: String
  /**
    *
    * Specifies the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableDeleted
  /**
    *
    * Specifies the id of the worksheet in which the table is deleted.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String
}

object TableDeletedEventArgs {
  @scala.inline
  def apply(
    source: EventSource | Local | Remote,
    tableId: String,
    tableName: String,
    `type`: TableDeleted,
    worksheetId: String
  ): TableDeletedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId, tableName = tableName, worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableDeletedEventArgs]
  }
}


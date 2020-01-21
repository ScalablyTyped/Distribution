package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.TableFiltered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the filter applied event.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait TableFilteredEventArgs extends js.Object {
  /**
    *
    * Represents the id of the table in which the filter is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tableId: String
  /**
    *
    * Represents the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: TableFiltered
  /**
    *
    * Represents the id of the worksheet which contains the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheetId: String
}

object TableFilteredEventArgs {
  @scala.inline
  def apply(tableId: String, `type`: TableFiltered, worksheetId: String): TableFilteredEventArgs = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilteredEventArgs]
  }
}


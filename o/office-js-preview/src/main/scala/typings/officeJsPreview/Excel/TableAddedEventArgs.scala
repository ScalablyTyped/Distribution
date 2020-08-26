package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.TableAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the table that raised the OnAdded event.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TableAddedEventArgs extends js.Object {
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var source: EventSource | Local | Remote = js.native
  /**
    *
    * Gets the id of the table that is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tableId: String = js.native
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: TableAdded = js.native
  /**
    *
    * Gets the id of the worksheet in which the table is added.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheetId: String = js.native
}

object TableAddedEventArgs {
  @scala.inline
  def apply(source: EventSource | Local | Remote, tableId: String, `type`: TableAdded, worksheetId: String): TableAddedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAddedEventArgs]
  }
  @scala.inline
  implicit class TableAddedEventArgsOps[Self <: TableAddedEventArgs] (val x: Self) extends AnyVal {
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
    def setSource(value: EventSource | Local | Remote): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TableAdded): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorksheetId(value: String): Self = this.set("worksheetId", value.asInstanceOf[js.Any])
  }
  
}


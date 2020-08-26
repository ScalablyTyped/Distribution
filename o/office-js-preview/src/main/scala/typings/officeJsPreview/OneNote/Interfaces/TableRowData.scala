package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRow.toJSON()". */
@js.native
trait TableRowData extends js.Object {
  /**
    *
    * Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[js.Array[TableCellData]] = js.native
  /**
    *
    * Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object TableRowData {
  @scala.inline
  def apply(): TableRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowData]
  }
  @scala.inline
  implicit class TableRowDataOps[Self <: TableRowData] (val x: Self) extends AnyVal {
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
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    @scala.inline
    def setCellsVarargs(value: TableCellData*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[TableCellData]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}


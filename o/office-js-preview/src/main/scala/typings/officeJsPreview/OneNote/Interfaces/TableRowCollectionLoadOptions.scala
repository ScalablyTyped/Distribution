package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableRow objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableRowCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the number of cells in the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the cells in the row.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cells: js.UndefOr[TableCellCollectionLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
}

object TableRowCollectionLoadOptions {
  @scala.inline
  def apply(): TableRowCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowCollectionLoadOptions]
  }
  @scala.inline
  implicit class TableRowCollectionLoadOptionsOps[Self <: TableRowCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setCellCount(value: Boolean): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    @scala.inline
    def setCells(value: TableCellCollectionLoadOptions): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    @scala.inline
    def setRowIndex(value: Boolean): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}


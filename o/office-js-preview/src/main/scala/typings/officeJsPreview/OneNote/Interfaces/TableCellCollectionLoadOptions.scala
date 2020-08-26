package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableCell objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableCellCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell in its row. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the cell. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the collection of Paragraph objects in the TableCell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent row of the cell.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color of the cell
    *
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
}

object TableCellCollectionLoadOptions {
  @scala.inline
  def apply(): TableCellCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionLoadOptions]
  }
  @scala.inline
  implicit class TableCellCollectionLoadOptionsOps[Self <: TableCellCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setCellIndex(value: Boolean): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParagraphs(value: ParagraphCollectionLoadOptions): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
    @scala.inline
    def setParentRow(value: TableRowLoadOptions): Self = this.set("parentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRow: Self = this.set("parentRow", js.undefined)
    @scala.inline
    def setRowIndex(value: Boolean): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setShadingColor(value: Boolean): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
  }
  
}


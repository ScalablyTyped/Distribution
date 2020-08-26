package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's TableCell objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableCellCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the body object of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell in its row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the width of the cell's column in points. This is applicable to uniform tables.
    *
    * [Api set: WordApi 1.3]
    */
  var columnWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the horizontal alignment of the cell. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent row of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent table of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the cell's row in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the shading color of the cell. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the text of the cell.
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the vertical alignment of the cell. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the width of the cell in points. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.native
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
    def setBody(value: BodyLoadOptions): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCellIndex(value: Boolean): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setColumnWidth(value: Boolean): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setParentRow(value: TableRowLoadOptions): Self = this.set("parentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRow: Self = this.set("parentRow", js.undefined)
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    @scala.inline
    def setRowIndex(value: Boolean): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setShadingColor(value: Boolean): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


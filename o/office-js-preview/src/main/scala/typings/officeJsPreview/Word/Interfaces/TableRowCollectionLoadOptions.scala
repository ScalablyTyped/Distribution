package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of the document's TableRow objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableRowCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the number of cells in the row. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var cellCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the horizontal alignment of every cell in the row. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Checks whether the row is a header row. Read-only. To set the number of header rows, use HeaderRowCount on the Table object.
    *
    * [Api set: WordApi 1.3]
    */
  var isHeader: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets parent table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the preferred height of the row in points.
    *
    * [Api set: WordApi 1.3]
    */
  var preferredHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the index of the row in its parent table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowIndex: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the text values in the row, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the vertical alignment of the cells in the row. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
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
    def setFont(value: FontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    @scala.inline
    def setPreferredHeight(value: Boolean): Self = this.set("preferredHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredHeight: Self = this.set("preferredHeight", js.undefined)
    @scala.inline
    def setRowIndex(value: Boolean): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setShadingColor(value: Boolean): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}


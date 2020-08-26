package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Range} objects.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait RangeCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text format of the range. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.3]
    */
  var hyperlink: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Checks whether the range length is zero. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isEmpty: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the range.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the range. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the range. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the range. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the range. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the range. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
}

object RangeCollectionLoadOptions {
  @scala.inline
  def apply(): RangeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeCollectionLoadOptions]
  }
  @scala.inline
  implicit class RangeCollectionLoadOptionsOps[Self <: RangeCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setFont(value: FontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHyperlink(value: Boolean): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEmpty: Self = this.set("isEmpty", js.undefined)
    @scala.inline
    def setParentBody(value: BodyLoadOptions): Self = this.set("parentBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentBody: Self = this.set("parentBody", js.undefined)
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = this.set("parentContentControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentContentControl: Self = this.set("parentContentControl", js.undefined)
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = this.set("parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentContentControlOrNullObject: Self = this.set("parentContentControlOrNullObject", js.undefined)
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = this.set("parentTableCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTableCell: Self = this.set("parentTableCell", js.undefined)
    @scala.inline
    def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = this.set("parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTableCellOrNullObject: Self = this.set("parentTableCellOrNullObject", js.undefined)
    @scala.inline
    def setParentTableOrNullObject(value: TableLoadOptions): Self = this.set("parentTableOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTableOrNullObject: Self = this.set("parentTableOrNullObject", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


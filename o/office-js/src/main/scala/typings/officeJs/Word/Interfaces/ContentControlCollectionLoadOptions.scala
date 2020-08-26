package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.ContentControl} objects. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait ContentControlCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets an integer that represents the content control identifier. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the content control. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the content control. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the content control. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the content control. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the content control. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var subtype: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the text of the content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

object ContentControlCollectionLoadOptions {
  @scala.inline
  def apply(): ContentControlCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionLoadOptions]
  }
  @scala.inline
  implicit class ContentControlCollectionLoadOptionsOps[Self <: ContentControlCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setAppearance(value: Boolean): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setCannotDelete(value: Boolean): Self = this.set("cannotDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannotDelete: Self = this.set("cannotDelete", js.undefined)
    @scala.inline
    def setCannotEdit(value: Boolean): Self = this.set("cannotEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannotEdit: Self = this.set("cannotEdit", js.undefined)
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: FontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    def setPlaceholderText(value: Boolean): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    @scala.inline
    def setRemoveWhenEdited(value: Boolean): Self = this.set("removeWhenEdited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWhenEdited: Self = this.set("removeWhenEdited", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setSubtype(value: Boolean): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


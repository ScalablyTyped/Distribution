package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait ParagraphLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  /**
    *
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.native
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the List to which this paragraph belongs. Throws an error if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var list: js.UndefOr[ListLoadOptions] = js.native
  /**
    *
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemLoadOptions] = js.native
  /**
    *
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemLoadOptions] = js.native
  /**
    *
    * Gets the List to which this paragraph belongs. Returns a null object if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listOrNullObject: js.UndefOr[ListLoadOptions] = js.native
  /**
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the parent body of the paragraph.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the paragraph. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the content control that contains the paragraph. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  /**
    *
    * Gets the table that contains the paragraph. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets the table cell that contains the paragraph. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the table cell that contains the paragraph. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  /**
    *
    * Gets the table that contains the paragraph. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
}

object ParagraphLoadOptions {
  @scala.inline
  def apply(): ParagraphLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphLoadOptions]
  }
  @scala.inline
  implicit class ParagraphLoadOptionsOps[Self <: ParagraphLoadOptions] (val x: Self) extends AnyVal {
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
    def setAlignment(value: Boolean): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setFirstLineIndent(value: Boolean): Self = this.set("firstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstLineIndent: Self = this.set("firstLineIndent", js.undefined)
    @scala.inline
    def setFont(value: FontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setIsLastParagraph(value: Boolean): Self = this.set("isLastParagraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLastParagraph: Self = this.set("isLastParagraph", js.undefined)
    @scala.inline
    def setIsListItem(value: Boolean): Self = this.set("isListItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsListItem: Self = this.set("isListItem", js.undefined)
    @scala.inline
    def setLeftIndent(value: Boolean): Self = this.set("leftIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIndent: Self = this.set("leftIndent", js.undefined)
    @scala.inline
    def setLineSpacing(value: Boolean): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    @scala.inline
    def setLineUnitAfter(value: Boolean): Self = this.set("lineUnitAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineUnitAfter: Self = this.set("lineUnitAfter", js.undefined)
    @scala.inline
    def setLineUnitBefore(value: Boolean): Self = this.set("lineUnitBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineUnitBefore: Self = this.set("lineUnitBefore", js.undefined)
    @scala.inline
    def setList(value: ListLoadOptions): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setListItem(value: ListItemLoadOptions): Self = this.set("listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    @scala.inline
    def setListItemOrNullObject(value: ListItemLoadOptions): Self = this.set("listItemOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemOrNullObject: Self = this.set("listItemOrNullObject", js.undefined)
    @scala.inline
    def setListOrNullObject(value: ListLoadOptions): Self = this.set("listOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListOrNullObject: Self = this.set("listOrNullObject", js.undefined)
    @scala.inline
    def setOutlineLevel(value: Boolean): Self = this.set("outlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineLevel: Self = this.set("outlineLevel", js.undefined)
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
    def setRightIndent(value: Boolean): Self = this.set("rightIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIndent: Self = this.set("rightIndent", js.undefined)
    @scala.inline
    def setSpaceAfter(value: Boolean): Self = this.set("spaceAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceAfter: Self = this.set("spaceAfter", js.undefined)
    @scala.inline
    def setSpaceBefore(value: Boolean): Self = this.set("spaceBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBefore: Self = this.set("spaceBefore", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setTableNestingLevel(value: Boolean): Self = this.set("tableNestingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableNestingLevel: Self = this.set("tableNestingLevel", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


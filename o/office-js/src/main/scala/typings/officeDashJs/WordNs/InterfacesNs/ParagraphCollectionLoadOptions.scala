package typings.officeDashJs.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.1]
  */
trait ParagraphCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the List to which this paragraph belongs. Throws if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var list: js.UndefOr[ListLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ListItem for the paragraph. Throws if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the List to which this paragraph belongs. Returns a null object if the paragraph is not in a list.
    *
    * [Api set: WordApi 1.3]
    */
  var listOrNullObject: js.UndefOr[ListLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the paragraph.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the paragraph. Throws if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the paragraph. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the paragraph. Throws if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the paragraph. Throws if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the paragraph. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the paragraph. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}

object ParagraphCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    alignment: js.UndefOr[Boolean] = js.undefined,
    firstLineIndent: js.UndefOr[Boolean] = js.undefined,
    font: FontLoadOptions = null,
    isLastParagraph: js.UndefOr[Boolean] = js.undefined,
    isListItem: js.UndefOr[Boolean] = js.undefined,
    leftIndent: js.UndefOr[Boolean] = js.undefined,
    lineSpacing: js.UndefOr[Boolean] = js.undefined,
    lineUnitAfter: js.UndefOr[Boolean] = js.undefined,
    lineUnitBefore: js.UndefOr[Boolean] = js.undefined,
    list: ListLoadOptions = null,
    listItem: ListItemLoadOptions = null,
    listItemOrNullObject: ListItemLoadOptions = null,
    listOrNullObject: ListLoadOptions = null,
    outlineLevel: js.UndefOr[Boolean] = js.undefined,
    parentBody: BodyLoadOptions = null,
    parentContentControl: ContentControlLoadOptions = null,
    parentContentControlOrNullObject: ContentControlLoadOptions = null,
    parentTable: TableLoadOptions = null,
    parentTableCell: TableCellLoadOptions = null,
    parentTableCellOrNullObject: TableCellLoadOptions = null,
    parentTableOrNullObject: TableLoadOptions = null,
    rightIndent: js.UndefOr[Boolean] = js.undefined,
    spaceAfter: js.UndefOr[Boolean] = js.undefined,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    styleBuiltIn: js.UndefOr[Boolean] = js.undefined,
    tableNestingLevel: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined
  ): ParagraphCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(firstLineIndent)) __obj.updateDynamic("firstLineIndent")(firstLineIndent)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(isLastParagraph)) __obj.updateDynamic("isLastParagraph")(isLastParagraph)
    if (!js.isUndefined(isListItem)) __obj.updateDynamic("isListItem")(isListItem)
    if (!js.isUndefined(leftIndent)) __obj.updateDynamic("leftIndent")(leftIndent)
    if (!js.isUndefined(lineSpacing)) __obj.updateDynamic("lineSpacing")(lineSpacing)
    if (!js.isUndefined(lineUnitAfter)) __obj.updateDynamic("lineUnitAfter")(lineUnitAfter)
    if (!js.isUndefined(lineUnitBefore)) __obj.updateDynamic("lineUnitBefore")(lineUnitBefore)
    if (list != null) __obj.updateDynamic("list")(list)
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (listItemOrNullObject != null) __obj.updateDynamic("listItemOrNullObject")(listItemOrNullObject)
    if (listOrNullObject != null) __obj.updateDynamic("listOrNullObject")(listOrNullObject)
    if (!js.isUndefined(outlineLevel)) __obj.updateDynamic("outlineLevel")(outlineLevel)
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentTable != null) __obj.updateDynamic("parentTable")(parentTable)
    if (parentTableCell != null) __obj.updateDynamic("parentTableCell")(parentTableCell)
    if (parentTableCellOrNullObject != null) __obj.updateDynamic("parentTableCellOrNullObject")(parentTableCellOrNullObject)
    if (parentTableOrNullObject != null) __obj.updateDynamic("parentTableOrNullObject")(parentTableOrNullObject)
    if (!js.isUndefined(rightIndent)) __obj.updateDynamic("rightIndent")(rightIndent)
    if (!js.isUndefined(spaceAfter)) __obj.updateDynamic("spaceAfter")(spaceAfter)
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(styleBuiltIn)) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (!js.isUndefined(tableNestingLevel)) __obj.updateDynamic("tableNestingLevel")(tableNestingLevel)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ParagraphCollectionLoadOptions]
  }
}


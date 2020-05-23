package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.Alignment
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "paragraph.toJSON()". */
trait ParagraphData extends js.Object {
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  /**
    *
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isLastParagraph: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listItem: js.UndefOr[ListItemData] = js.undefined
  /**
    *
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listItemOrNullObject: js.UndefOr[ListItemData] = js.undefined
  /**
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}

object ParagraphData {
  @scala.inline
  def apply(
    alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = null,
    firstLineIndent: js.UndefOr[Double] = js.undefined,
    font: FontData = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    isLastParagraph: js.UndefOr[Boolean] = js.undefined,
    isListItem: js.UndefOr[Boolean] = js.undefined,
    leftIndent: js.UndefOr[Double] = js.undefined,
    lineSpacing: js.UndefOr[Double] = js.undefined,
    lineUnitAfter: js.UndefOr[Double] = js.undefined,
    lineUnitBefore: js.UndefOr[Double] = js.undefined,
    listItem: ListItemData = null,
    listItemOrNullObject: ListItemData = null,
    outlineLevel: js.UndefOr[Double] = js.undefined,
    rightIndent: js.UndefOr[Double] = js.undefined,
    spaceAfter: js.UndefOr[Double] = js.undefined,
    spaceBefore: js.UndefOr[Double] = js.undefined,
    style: String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null,
    tableNestingLevel: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): ParagraphData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(firstLineIndent)) __obj.updateDynamic("firstLineIndent")(firstLineIndent.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures.asInstanceOf[js.Any])
    if (!js.isUndefined(isLastParagraph)) __obj.updateDynamic("isLastParagraph")(isLastParagraph.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isListItem)) __obj.updateDynamic("isListItem")(isListItem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftIndent)) __obj.updateDynamic("leftIndent")(leftIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSpacing)) __obj.updateDynamic("lineSpacing")(lineSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineUnitAfter)) __obj.updateDynamic("lineUnitAfter")(lineUnitAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineUnitBefore)) __obj.updateDynamic("lineUnitBefore")(lineUnitBefore.get.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (listItemOrNullObject != null) __obj.updateDynamic("listItemOrNullObject")(listItemOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineLevel)) __obj.updateDynamic("outlineLevel")(outlineLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightIndent)) __obj.updateDynamic("rightIndent")(rightIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceAfter)) __obj.updateDynamic("spaceAfter")(spaceAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    if (!js.isUndefined(tableNestingLevel)) __obj.updateDynamic("tableNestingLevel")(tableNestingLevel.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphData]
  }
}


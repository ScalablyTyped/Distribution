package typings
package officeDashJsLib.WordNs.InterfacesNs

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
  var alignment: js.UndefOr[
    officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified
  ] = js.undefined
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: js.UndefOr[scala.Double] = js.undefined
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
  var isLastParagraph: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isListItem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the ListItem for the paragraph. Throws if the paragraph is not part of a list. Read-only.
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
  var outlineLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tableNestingLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ParagraphData {
  @scala.inline
  def apply(
    alignment: officeDashJsLib.WordNs.Alignment | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Centered | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justified = null,
    firstLineIndent: scala.Int | scala.Double = null,
    font: FontData = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    isLastParagraph: js.UndefOr[scala.Boolean] = js.undefined,
    isListItem: js.UndefOr[scala.Boolean] = js.undefined,
    leftIndent: scala.Int | scala.Double = null,
    lineSpacing: scala.Int | scala.Double = null,
    lineUnitAfter: scala.Int | scala.Double = null,
    lineUnitBefore: scala.Int | scala.Double = null,
    listItem: ListItemData = null,
    listItemOrNullObject: ListItemData = null,
    outlineLevel: scala.Int | scala.Double = null,
    rightIndent: scala.Int | scala.Double = null,
    spaceAfter: scala.Int | scala.Double = null,
    spaceBefore: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = null,
    tableNestingLevel: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): ParagraphData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (firstLineIndent != null) __obj.updateDynamic("firstLineIndent")(firstLineIndent.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures)
    if (!js.isUndefined(isLastParagraph)) __obj.updateDynamic("isLastParagraph")(isLastParagraph)
    if (!js.isUndefined(isListItem)) __obj.updateDynamic("isListItem")(isListItem)
    if (leftIndent != null) __obj.updateDynamic("leftIndent")(leftIndent.asInstanceOf[js.Any])
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (lineUnitAfter != null) __obj.updateDynamic("lineUnitAfter")(lineUnitAfter.asInstanceOf[js.Any])
    if (lineUnitBefore != null) __obj.updateDynamic("lineUnitBefore")(lineUnitBefore.asInstanceOf[js.Any])
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (listItemOrNullObject != null) __obj.updateDynamic("listItemOrNullObject")(listItemOrNullObject)
    if (outlineLevel != null) __obj.updateDynamic("outlineLevel")(outlineLevel.asInstanceOf[js.Any])
    if (rightIndent != null) __obj.updateDynamic("rightIndent")(rightIndent.asInstanceOf[js.Any])
    if (spaceAfter != null) __obj.updateDynamic("spaceAfter")(spaceAfter.asInstanceOf[js.Any])
    if (spaceBefore != null) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (tableNestingLevel != null) __obj.updateDynamic("tableNestingLevel")(tableNestingLevel.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ParagraphData]
  }
}


package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /** the alignment of the text (center, justify, left, right) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** the amount of space between each character in the text */
  var characterSpacing: js.UndefOr[scala.Double] = js.undefined
  /** the amount of space between each column (1/4 inch by default) */
  var columnGap: js.UndefOr[scala.Double] = js.undefined
  /**  the number of columns to flow the text into */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /**whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
  var continued: js.UndefOr[scala.Boolean] = js.undefined
  /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
  var ellipsis: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** whether to fill the text (true by default) */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**  The maximum height that text should be clipped to */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The amount in PDF points (72 per inch) to indent each paragraph of text */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /**  Set to false to disable line wrapping all together */
  var lineBreak: js.UndefOr[scala.Boolean] = js.undefined
  /** the amount of space between each line of text */
  var lineGap: js.UndefOr[scala.Double] = js.undefined
  /** A URL to link this text to (shortcut to create an annotation) */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** the amount of space between each paragraph of text */
  var paragraphGap: js.UndefOr[scala.Double] = js.undefined
  /** whether to strike out the text */
  var strike: js.UndefOr[scala.Boolean] = js.undefined
  /**  whether to stroke the text */
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
  /** whether to underline the text */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
  /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** the amount of space between each word in the text */
  var wordSpacing: js.UndefOr[scala.Double] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    characterSpacing: scala.Int | scala.Double = null,
    columnGap: scala.Int | scala.Double = null,
    columns: scala.Int | scala.Double = null,
    continued: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsis: scala.Boolean | java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    indent: scala.Int | scala.Double = null,
    lineBreak: js.UndefOr[scala.Boolean] = js.undefined,
    lineGap: scala.Int | scala.Double = null,
    link: java.lang.String = null,
    paragraphGap: scala.Int | scala.Double = null,
    strike: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wordSpacing: scala.Int | scala.Double = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (characterSpacing != null) __obj.updateDynamic("characterSpacing")(characterSpacing.asInstanceOf[js.Any])
    if (columnGap != null) __obj.updateDynamic("columnGap")(columnGap.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(continued)) __obj.updateDynamic("continued")(continued)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(lineBreak)) __obj.updateDynamic("lineBreak")(lineBreak)
    if (lineGap != null) __obj.updateDynamic("lineGap")(lineGap.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link)
    if (paragraphGap != null) __obj.updateDynamic("paragraphGap")(paragraphGap.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}


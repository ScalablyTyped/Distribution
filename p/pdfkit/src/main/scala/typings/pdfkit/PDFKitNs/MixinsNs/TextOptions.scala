package typings.pdfkit.PDFKitNs.MixinsNs

import typings.pdfkit.pdfkitStrings.`svg-central`
import typings.pdfkit.pdfkitStrings.`svg-middle`
import typings.pdfkit.pdfkitStrings.alphabetic
import typings.pdfkit.pdfkitStrings.bottom
import typings.pdfkit.pdfkitStrings.center
import typings.pdfkit.pdfkitStrings.hanging
import typings.pdfkit.pdfkitStrings.ideographic
import typings.pdfkit.pdfkitStrings.justify
import typings.pdfkit.pdfkitStrings.left
import typings.pdfkit.pdfkitStrings.mathematical
import typings.pdfkit.pdfkitStrings.middle
import typings.pdfkit.pdfkitStrings.right
import typings.pdfkit.pdfkitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  /** the alignment of the text (center, justify, left, right) */
  //TODO check this
  var align: js.UndefOr[center | justify | left | right | String] = js.undefined
  /** the vertical alignment of the text with respect to its insertion point */
  var baseline: js.UndefOr[
    Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
  ] = js.undefined
  /** the amount of space between each character in the text */
  var characterSpacing: js.UndefOr[Double] = js.undefined
  /** the amount of space between each column (1/4 inch by default) */
  var columnGap: js.UndefOr[Double] = js.undefined
  /**  the number of columns to flow the text into */
  var columns: js.UndefOr[Double] = js.undefined
  /** whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
  var continued: js.UndefOr[Boolean] = js.undefined
  /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
  var ellipsis: js.UndefOr[Boolean | String] = js.undefined
  /** whether to fill the text (true by default) */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**  The maximum height that text should be clipped to */
  var height: js.UndefOr[Double] = js.undefined
  /** The amount in PDF points (72 per inch) to indent each paragraph of text */
  var indent: js.UndefOr[Double] = js.undefined
  /**  Set to false to disable line wrapping all together */
  var lineBreak: js.UndefOr[Boolean] = js.undefined
  /** the amount of space between each line of text */
  var lineGap: js.UndefOr[Double] = js.undefined
  /** A URL to link this text to (shortcut to create an annotation) */
  var link: js.UndefOr[String] = js.undefined
  /** whether to slant the text (angle in degrees or true) */
  var oblique: js.UndefOr[Boolean | Double] = js.undefined
  /** the amount of space between each paragraph of text */
  var paragraphGap: js.UndefOr[Double] = js.undefined
  /** whether to strike out the text */
  var strike: js.UndefOr[Boolean] = js.undefined
  /**  whether to stroke the text */
  var stroke: js.UndefOr[Boolean] = js.undefined
  /** whether to underline the text */
  var underline: js.UndefOr[Boolean] = js.undefined
  /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
  var width: js.UndefOr[Double] = js.undefined
  /** the amount of space between each word in the text */
  var wordSpacing: js.UndefOr[Double] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    align: center | justify | left | right | String = null,
    baseline: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top = null,
    characterSpacing: Int | Double = null,
    columnGap: Int | Double = null,
    columns: Int | Double = null,
    continued: js.UndefOr[Boolean] = js.undefined,
    ellipsis: Boolean | String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    indent: Int | Double = null,
    lineBreak: js.UndefOr[Boolean] = js.undefined,
    lineGap: Int | Double = null,
    link: String = null,
    oblique: Boolean | Double = null,
    paragraphGap: Int | Double = null,
    strike: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wordSpacing: Int | Double = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
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
    if (oblique != null) __obj.updateDynamic("oblique")(oblique.asInstanceOf[js.Any])
    if (paragraphGap != null) __obj.updateDynamic("paragraphGap")(paragraphGap.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}


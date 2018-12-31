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


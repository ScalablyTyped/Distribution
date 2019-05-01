package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeFontLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Font name (e.g. "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Font size.
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the strikethrough status of font. A null value indicates that the entire range doesn't have uniform Strikethrough setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the Subscript status of font.
    Returns True if all the fonts of the range are Subscript.
    Returns False if all the fonts of the range are Superscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the Superscript status of font.
    Returns True if all the fonts of the range are Superscript.
    Returns False if all the fonts of the range are Subscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Font, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire range doesn't have uniform font tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object RangeFontLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.UndefOr[scala.Boolean] = js.undefined,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): RangeFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[RangeFontLoadOptions]
  }
}


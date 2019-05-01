package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeFont object, for use in "rangeFont.set({ ... })". */
trait RangeFontUpdateData extends js.Object {
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
  var color: js.UndefOr[java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Font size.
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[scala.Double] = js.undefined
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
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant
  ] = js.undefined
}

object RangeFontUpdateData {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    tintAndShade: scala.Int | scala.Double = null,
    underline: officeDashJsDashPreviewLib.ExcelNs.RangeUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SingleAccountant | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DoubleAccountant = null
  ): RangeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFontUpdateData]
  }
}


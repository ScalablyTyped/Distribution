package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeFont.toJSON()". */
trait ShapeFontData extends js.Object {
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The HTML color code representation of the text color (e.g. "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents font size in points (e.g. 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Heavy | officeDashJsLib.officeDashJsLibStrings.Dotted | officeDashJsLib.officeDashJsLibStrings.DottedHeavy | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashHeavy | officeDashJsLib.officeDashJsLibStrings.DashLong | officeDashJsLib.officeDashJsLibStrings.DashLongHeavy | officeDashJsLib.officeDashJsLibStrings.DotDash | officeDashJsLib.officeDashJsLibStrings.DotDashHeavy | officeDashJsLib.officeDashJsLibStrings.DotDotDash | officeDashJsLib.officeDashJsLibStrings.DotDotDashHeavy | officeDashJsLib.officeDashJsLibStrings.Wavy | officeDashJsLib.officeDashJsLibStrings.WavyHeavy | officeDashJsLib.officeDashJsLibStrings.WavyDouble
  ] = js.undefined
}

object ShapeFontData {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    underline: officeDashJsLib.ExcelNs.ShapeFontUnderlineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Heavy | officeDashJsLib.officeDashJsLibStrings.Dotted | officeDashJsLib.officeDashJsLibStrings.DottedHeavy | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashHeavy | officeDashJsLib.officeDashJsLibStrings.DashLong | officeDashJsLib.officeDashJsLibStrings.DashLongHeavy | officeDashJsLib.officeDashJsLibStrings.DotDash | officeDashJsLib.officeDashJsLibStrings.DotDashHeavy | officeDashJsLib.officeDashJsLibStrings.DotDotDash | officeDashJsLib.officeDashJsLibStrings.DotDotDashHeavy | officeDashJsLib.officeDashJsLibStrings.Wavy | officeDashJsLib.officeDashJsLibStrings.WavyHeavy | officeDashJsLib.officeDashJsLibStrings.WavyDouble = null
  ): ShapeFontData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFontData]
  }
}


package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ShapeFontUnderlineStyle
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.DashHeavy
import typings.officeDashJs.officeDashJsStrings.DashLong
import typings.officeDashJs.officeDashJsStrings.DashLongHeavy
import typings.officeDashJs.officeDashJsStrings.DotDash
import typings.officeDashJs.officeDashJsStrings.DotDashHeavy
import typings.officeDashJs.officeDashJsStrings.DotDotDash
import typings.officeDashJs.officeDashJsStrings.DotDotDashHeavy
import typings.officeDashJs.officeDashJsStrings.Dotted
import typings.officeDashJs.officeDashJsStrings.DottedHeavy
import typings.officeDashJs.officeDashJsStrings.Heavy
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Single
import typings.officeDashJs.officeDashJsStrings.Wavy
import typings.officeDashJs.officeDashJsStrings.WavyDouble
import typings.officeDashJs.officeDashJsStrings.WavyHeavy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeFont.toJSON()`. */
trait ShapeFontData extends js.Object {
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The HTML color code representation of the text color (e.g. "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents font size in points (e.g. 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    ShapeFontUnderlineStyle | None | Single | typings.officeDashJs.officeDashJsStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
  ] = js.undefined
}

object ShapeFontData {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    underline: ShapeFontUnderlineStyle | None | Single | typings.officeDashJs.officeDashJsStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble = null
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


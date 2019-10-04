package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ConditionalRangeFontUnderlineStyle
import typings.officeDashJs.officeDashJsStrings.Double
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeFont.toJSON()`. */
trait ConditionalRangeFontData extends js.Object {
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the strikethrough status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Type of underline applied to the font. See Excel.ConditionalRangeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var underline: js.UndefOr[ConditionalRangeFontUnderlineStyle | None | Single | Double] = js.undefined
}

object ConditionalRangeFontData {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: ConditionalRangeFontUnderlineStyle | None | Single | Double = null
  ): ConditionalRangeFontData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeFontData]
  }
}


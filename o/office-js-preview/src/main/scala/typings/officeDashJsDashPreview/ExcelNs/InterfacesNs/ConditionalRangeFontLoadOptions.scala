package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the font attributes (font style, color, etc.) for an object.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFontLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
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
  var color: js.UndefOr[Boolean] = js.undefined
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
  var underline: js.UndefOr[Boolean] = js.undefined
}

object ConditionalRangeFontLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): ConditionalRangeFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[ConditionalRangeFontLoadOptions]
  }
}


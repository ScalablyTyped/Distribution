package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalRangeFontUnderlineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeFont.toJSON()`. */
trait ConditionalRangeFontData extends js.Object {
  /**
    *
    * Specifies if the font is bold.
    *
    * [Api set: ExcelApi 1.6]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if the font is italic.
    *
    * [Api set: ExcelApi 1.6]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the strikethrough status of the font.
    *
    * [Api set: ExcelApi 1.6]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The type of underline applied to the font. See Excel.ConditionalRangeFontUnderlineStyle for details.
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
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.get.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeFontData]
  }
}


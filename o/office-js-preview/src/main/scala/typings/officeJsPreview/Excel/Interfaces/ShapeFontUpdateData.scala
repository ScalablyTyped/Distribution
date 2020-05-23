package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeFontUnderlineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DashLong
import typings.officeJsPreview.officeJsPreviewStrings.DashLongHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotDash
import typings.officeJsPreview.officeJsPreviewStrings.DotDashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotDotDash
import typings.officeJsPreview.officeJsPreviewStrings.DotDotDashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Dotted
import typings.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Heavy
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.Wavy
import typings.officeJsPreview.officeJsPreviewStrings.WavyDouble
import typings.officeJsPreview.officeJsPreviewStrings.WavyHeavy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeFont object, for use in `shapeFont.set({ ... })`. */
trait ShapeFontUpdateData extends js.Object {
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the text color (e.g., "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
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
    * Represents font name (e.g., "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents font size in points (e.g., 11). Returns null if the TextRange includes text fragments with different font sizes.
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
    ShapeFontUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
  ] = js.undefined
}

object ShapeFontUpdateData {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined,
    underline: ShapeFontUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble = null
  ): ShapeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFontUpdateData]
  }
}


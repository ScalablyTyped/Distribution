package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeLineDashStyle
import typings.officeJsPreview.Excel.ShapeLineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.LongDash
import typings.officeJsPreview.officeJsPreviewStrings.LongDashDot
import typings.officeJsPreview.officeJsPreviewStrings.LongDashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.RoundDot
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import typings.officeJsPreview.officeJsPreviewStrings.SquareDot
import typings.officeJsPreview.officeJsPreviewStrings.SystemDash
import typings.officeJsPreview.officeJsPreviewStrings.SystemDashDot
import typings.officeJsPreview.officeJsPreviewStrings.SystemDot
import typings.officeJsPreview.officeJsPreviewStrings.ThickBetweenThin
import typings.officeJsPreview.officeJsPreviewStrings.ThickThin
import typings.officeJsPreview.officeJsPreviewStrings.ThinThick
import typings.officeJsPreview.officeJsPreviewStrings.ThinThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeLineFormat.toJSON()`. */
trait ShapeLineFormatData extends js.Object {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: js.UndefOr[
    ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
  ] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin] = js.undefined
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents whether or not the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object ShapeLineFormatData {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot = null,
    style: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin = null,
    transparency: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): ShapeLineFormatData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeLineFormatData]
  }
}


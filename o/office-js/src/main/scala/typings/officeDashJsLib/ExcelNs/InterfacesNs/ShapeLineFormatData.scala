package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeLineFormat.toJSON()". */
trait ShapeLineFormatData extends js.Object {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeLineDashStyle | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.LongDash | officeDashJsLib.officeDashJsLibStrings.LongDashDot | officeDashJsLib.officeDashJsLibStrings.RoundDot | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.SquareDot | officeDashJsLib.officeDashJsLibStrings.LongDashDotDot | officeDashJsLib.officeDashJsLibStrings.SystemDash | officeDashJsLib.officeDashJsLibStrings.SystemDot | officeDashJsLib.officeDashJsLibStrings.SystemDashDot
  ] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeLineStyle | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.ThickBetweenThin | officeDashJsLib.officeDashJsLibStrings.ThickThin | officeDashJsLib.officeDashJsLibStrings.ThinThick | officeDashJsLib.officeDashJsLibStrings.ThinThin
  ] = js.undefined
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents whether or not the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object ShapeLineFormatData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashStyle: officeDashJsLib.ExcelNs.ShapeLineDashStyle | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.LongDash | officeDashJsLib.officeDashJsLibStrings.LongDashDot | officeDashJsLib.officeDashJsLibStrings.RoundDot | officeDashJsLib.officeDashJsLibStrings.Solid | officeDashJsLib.officeDashJsLibStrings.SquareDot | officeDashJsLib.officeDashJsLibStrings.LongDashDotDot | officeDashJsLib.officeDashJsLibStrings.SystemDash | officeDashJsLib.officeDashJsLibStrings.SystemDot | officeDashJsLib.officeDashJsLibStrings.SystemDashDot = null,
    style: officeDashJsLib.ExcelNs.ShapeLineStyle | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.ThickBetweenThin | officeDashJsLib.officeDashJsLibStrings.ThickThin | officeDashJsLib.officeDashJsLibStrings.ThinThick | officeDashJsLib.officeDashJsLibStrings.ThinThin = null,
    transparency: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): ShapeLineFormatData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeLineFormatData]
  }
}


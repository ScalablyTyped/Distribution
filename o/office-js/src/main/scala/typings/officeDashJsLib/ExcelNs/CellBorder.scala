package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a single border returned by `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the border property input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellBorder extends js.Object {
  /**
    *
    * Represents the `color` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `style` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[
    BorderLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.SlantDashDot
  ] = js.undefined
  /**
    *
    * Represents the `tintAndShade` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `weight` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[
    BorderWeight | officeDashJsLib.officeDashJsLibStrings.Hairline | officeDashJsLib.officeDashJsLibStrings.Thin | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Thick
  ] = js.undefined
}

object CellBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    style: BorderLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.SlantDashDot = null,
    tintAndShade: scala.Int | scala.Double = null,
    weight: BorderWeight | officeDashJsLib.officeDashJsLibStrings.Hairline | officeDashJsLib.officeDashJsLibStrings.Thin | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Thick = null
  ): CellBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellBorder]
  }
}


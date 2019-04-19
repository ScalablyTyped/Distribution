package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a single border returned by `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the border property input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CellBorder extends js.Object {
  /**
    *
    * Represents the `color` property of a single border.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the `style` property of a single border.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: js.UndefOr[
    BorderLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SlantDashDot
  ] = js.undefined
  /**
    *
    * Represents the `tintAndShade` property of a single border.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `weight` property of a single border.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var weight: js.UndefOr[
    BorderWeight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hairline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick
  ] = js.undefined
}

object CellBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    style: BorderLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SlantDashDot = null,
    tintAndShade: scala.Int | scala.Double = null,
    weight: BorderWeight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hairline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick = null
  ): CellBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellBorder]
  }
}


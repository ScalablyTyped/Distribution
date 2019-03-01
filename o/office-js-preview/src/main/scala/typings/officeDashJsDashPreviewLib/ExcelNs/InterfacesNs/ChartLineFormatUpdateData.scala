package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLineFormat object, for use in "chartLineFormat.set({ ... })". */
trait ChartLineFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of lines in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the line style. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RoundDot
  ] = js.undefined
  /**
    *
    * Represents weight of the line, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object ChartLineFormatUpdateData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    lineStyle: officeDashJsDashPreviewLib.ExcelNs.ChartLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grey75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RoundDot = null,
    weight: scala.Int | scala.Double = null
  ): ChartLineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineFormatUpdateData]
  }
}


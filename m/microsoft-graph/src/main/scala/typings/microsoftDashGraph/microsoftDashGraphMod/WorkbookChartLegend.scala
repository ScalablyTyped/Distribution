package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartLegend extends Entity {
  // Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartLegendFormat] = js.undefined
  // Boolean value for whether the chart legend should overlap with the main body of the chart.
  var overlay: js.UndefOr[Boolean] = js.undefined
  // Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
  var position: js.UndefOr[String] = js.undefined
  // A boolean value the represents the visibility of a ChartLegend object.
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WorkbookChartLegend {
  @scala.inline
  def apply(
    format: WorkbookChartLegendFormat = null,
    id: String = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WorkbookChartLegend = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WorkbookChartLegend]
  }
}


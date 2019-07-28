package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartDataLabels extends Entity {
  // Represents the format of chart data labels, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartDataLabelFormat] = js.undefined
  /**
    * DataLabelPosition value that represents the position of the data label. The possible values are: None, Center,
    * InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
    */
  var position: js.UndefOr[String] = js.undefined
  // String representing the separator used for the data labels on a chart.
  var separator: js.UndefOr[String] = js.undefined
  // Boolean value representing if the data label bubble size is visible or not.
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  // Boolean value representing if the data label category name is visible or not.
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  // Boolean value representing if the data label legend key is visible or not.
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  // Boolean value representing if the data label percentage is visible or not.
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  // Boolean value representing if the data label series name is visible or not.
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  // Boolean value representing if the data label value is visible or not.
  var showValue: js.UndefOr[Boolean] = js.undefined
}

object WorkbookChartDataLabels {
  @scala.inline
  def apply(
    format: WorkbookChartDataLabelFormat = null,
    id: String = null,
    position: String = null,
    separator: String = null,
    showBubbleSize: js.UndefOr[Boolean] = js.undefined,
    showCategoryName: js.UndefOr[Boolean] = js.undefined,
    showLegendKey: js.UndefOr[Boolean] = js.undefined,
    showPercentage: js.UndefOr[Boolean] = js.undefined,
    showSeriesName: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined
  ): WorkbookChartDataLabels = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (position != null) __obj.updateDynamic("position")(position)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(showBubbleSize)) __obj.updateDynamic("showBubbleSize")(showBubbleSize)
    if (!js.isUndefined(showCategoryName)) __obj.updateDynamic("showCategoryName")(showCategoryName)
    if (!js.isUndefined(showLegendKey)) __obj.updateDynamic("showLegendKey")(showLegendKey)
    if (!js.isUndefined(showPercentage)) __obj.updateDynamic("showPercentage")(showPercentage)
    if (!js.isUndefined(showSeriesName)) __obj.updateDynamic("showSeriesName")(showSeriesName)
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue)
    __obj.asInstanceOf[WorkbookChartDataLabels]
  }
}


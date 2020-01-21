package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPivotOptions.toJSON()`. */
trait ChartPivotOptionsData extends js.Object {
  /**
    *
    * Specifies whether or not to display the axis field buttons on a PivotChart. The ShowAxisFieldButtons property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not to display the legend field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not to display the report filter field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not to display the show value field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.undefined
}

object ChartPivotOptionsData {
  @scala.inline
  def apply(
    showAxisFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showLegendFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showReportFilterFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showValueFieldButtons: js.UndefOr[Boolean] = js.undefined
  ): ChartPivotOptionsData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showAxisFieldButtons)) __obj.updateDynamic("showAxisFieldButtons")(showAxisFieldButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegendFieldButtons)) __obj.updateDynamic("showLegendFieldButtons")(showLegendFieldButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showReportFilterFieldButtons)) __obj.updateDynamic("showReportFilterFieldButtons")(showReportFilterFieldButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showValueFieldButtons)) __obj.updateDynamic("showValueFieldButtons")(showValueFieldButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPivotOptionsData]
  }
}


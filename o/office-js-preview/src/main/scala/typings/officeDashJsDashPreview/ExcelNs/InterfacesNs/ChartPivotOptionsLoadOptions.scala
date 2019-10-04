package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the options for the pivot chart.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartPivotOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not to display the axis field buttons on a PivotChart. The ShowAxisFieldButtons property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not to display the legend field buttons on a PivotChart
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
    * Specifies whether or not to display the show value field buttons on a PivotChart
    *
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.undefined
}

object ChartPivotOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    showAxisFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showLegendFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showReportFilterFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showValueFieldButtons: js.UndefOr[Boolean] = js.undefined
  ): ChartPivotOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(showAxisFieldButtons)) __obj.updateDynamic("showAxisFieldButtons")(showAxisFieldButtons)
    if (!js.isUndefined(showLegendFieldButtons)) __obj.updateDynamic("showLegendFieldButtons")(showLegendFieldButtons)
    if (!js.isUndefined(showReportFilterFieldButtons)) __obj.updateDynamic("showReportFilterFieldButtons")(showReportFilterFieldButtons)
    if (!js.isUndefined(showValueFieldButtons)) __obj.updateDynamic("showValueFieldButtons")(showValueFieldButtons)
    __obj.asInstanceOf[ChartPivotOptionsLoadOptions]
  }
}


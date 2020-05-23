package typings.morrisJs.morris

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAreaOptions extends ILineOptions {
  /**  Set to true to overlay the areas on top of each other instead of stacking them.  */
  var behaveLikeLine: js.UndefOr[Boolean] = js.undefined
}

object IAreaOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String],
    axes: js.UndefOr[Boolean] = js.undefined,
    behaveLikeLine: js.UndefOr[Boolean] = js.undefined,
    continuousLine: js.UndefOr[Boolean] = js.undefined,
    dateFormat: /* timestamp */ Double => String = null,
    eventLineColors: js.Array[String] = null,
    eventStrokeWidth: js.UndefOr[Double] = js.undefined,
    events: js.Array[String] = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    goalLineColors: js.Array[String] = null,
    goalStrokeWidth: js.UndefOr[Double] = js.undefined,
    goals: js.Array[Double] = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridStrokeWidth: js.UndefOr[Double] = js.undefined,
    gridTextColor: String = null,
    gridTextFamily: String = null,
    gridTextSize: js.UndefOr[Double] = js.undefined,
    gridTextWeight: String = null,
    hideHover: Boolean | AutoAlways = null,
    hoverCallback: (/* index */ Double, /* options */ ILineOptions, /* content */ String, /* row */ js.Any) => String = null,
    lineColors: js.Array[String] = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    parseTime: js.UndefOr[Boolean] = js.undefined,
    pointFillColors: js.Array[String] = null,
    pointSize: js.UndefOr[Double] = js.undefined,
    pointStrokeColors: js.Array[String] = null,
    postUnits: String = null,
    preUnits: String = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    smooth: js.UndefOr[Boolean] = js.undefined,
    xLabelAngle: js.UndefOr[Double] = js.undefined,
    xLabelFormat: /* date */ Date => String = null,
    xLabels: Interval = null,
    yLabelFormat: /* val */ js.Any => String = null,
    ymax: Double | String = null,
    ymin: Double | String = null
  ): IAreaOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(behaveLikeLine)) __obj.updateDynamic("behaveLikeLine")(behaveLikeLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousLine)) __obj.updateDynamic("continuousLine")(continuousLine.get.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(js.Any.fromFunction1(dateFormat))
    if (eventLineColors != null) __obj.updateDynamic("eventLineColors")(eventLineColors.asInstanceOf[js.Any])
    if (!js.isUndefined(eventStrokeWidth)) __obj.updateDynamic("eventStrokeWidth")(eventStrokeWidth.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (goalLineColors != null) __obj.updateDynamic("goalLineColors")(goalLineColors.asInstanceOf[js.Any])
    if (!js.isUndefined(goalStrokeWidth)) __obj.updateDynamic("goalStrokeWidth")(goalStrokeWidth.get.asInstanceOf[js.Any])
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.get.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(gridStrokeWidth)) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.get.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor.asInstanceOf[js.Any])
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(gridTextSize)) __obj.updateDynamic("gridTextSize")(gridTextSize.get.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight.asInstanceOf[js.Any])
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(js.Any.fromFunction4(hoverCallback))
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parseTime)) __obj.updateDynamic("parseTime")(parseTime.get.asInstanceOf[js.Any])
    if (pointFillColors != null) __obj.updateDynamic("pointFillColors")(pointFillColors.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (pointStrokeColors != null) __obj.updateDynamic("pointStrokeColors")(pointStrokeColors.asInstanceOf[js.Any])
    if (postUnits != null) __obj.updateDynamic("postUnits")(postUnits.asInstanceOf[js.Any])
    if (preUnits != null) __obj.updateDynamic("preUnits")(preUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xLabelAngle)) __obj.updateDynamic("xLabelAngle")(xLabelAngle.get.asInstanceOf[js.Any])
    if (xLabelFormat != null) __obj.updateDynamic("xLabelFormat")(js.Any.fromFunction1(xLabelFormat))
    if (xLabels != null) __obj.updateDynamic("xLabels")(xLabels.asInstanceOf[js.Any])
    if (yLabelFormat != null) __obj.updateDynamic("yLabelFormat")(js.Any.fromFunction1(yLabelFormat))
    if (ymax != null) __obj.updateDynamic("ymax")(ymax.asInstanceOf[js.Any])
    if (ymin != null) __obj.updateDynamic("ymin")(ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAreaOptions]
  }
}


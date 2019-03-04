package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAreaOptions extends ILineOptions {
  /**  Set to true to overlay the areas on top of each other instead of stacking them.  */
  var behaveLikeLine: js.UndefOr[scala.Boolean] = js.undefined
}

object IAreaOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[java.lang.String],
    xkey: java.lang.String,
    ykeys: js.Array[java.lang.String],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    behaveLikeLine: js.UndefOr[scala.Boolean] = js.undefined,
    continuousLine: js.UndefOr[scala.Boolean] = js.undefined,
    dateFormat: js.Function1[/* timestamp */ scala.Double, java.lang.String] = null,
    eventLineColors: js.Array[java.lang.String] = null,
    eventStrokeWidth: scala.Int | scala.Double = null,
    events: js.Array[java.lang.String] = null,
    fillOpacity: scala.Int | scala.Double = null,
    goalLineColors: js.Array[java.lang.String] = null,
    goalStrokeWidth: scala.Int | scala.Double = null,
    goals: js.Array[scala.Double] = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridLineColor: java.lang.String = null,
    gridStrokeWidth: scala.Int | scala.Double = null,
    gridTextColor: java.lang.String = null,
    gridTextFamily: java.lang.String = null,
    gridTextSize: scala.Int | scala.Double = null,
    gridTextWeight: java.lang.String = null,
    hideHover: scala.Boolean | AutoAlways = null,
    hoverCallback: js.Function4[
      /* index */ scala.Double, 
      /* options */ ILineOptions, 
      /* content */ java.lang.String, 
      /* row */ js.Any, 
      java.lang.String
    ] = null,
    lineColors: js.Array[java.lang.String] = null,
    lineWidth: scala.Int | scala.Double = null,
    parseTime: js.UndefOr[scala.Boolean] = js.undefined,
    pointFillColors: js.Array[java.lang.String] = null,
    pointSize: scala.Int | scala.Double = null,
    pointStrokeColors: js.Array[java.lang.String] = null,
    postUnits: java.lang.String = null,
    preUnits: java.lang.String = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    xLabelAngle: scala.Int | scala.Double = null,
    xLabelFormat: js.Function1[/* date */ stdLib.Date, java.lang.String] = null,
    xLabels: Interval = null,
    yLabelFormat: js.Function1[/* val */ js.Any, java.lang.String] = null,
    ymax: scala.Double | java.lang.String = null,
    ymin: scala.Double | java.lang.String = null
  ): IAreaOptions = {
    val __obj = js.Dynamic.literal(data = data, element = element, labels = labels, xkey = xkey, ykeys = ykeys)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (!js.isUndefined(behaveLikeLine)) __obj.updateDynamic("behaveLikeLine")(behaveLikeLine)
    if (!js.isUndefined(continuousLine)) __obj.updateDynamic("continuousLine")(continuousLine)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (eventLineColors != null) __obj.updateDynamic("eventLineColors")(eventLineColors)
    if (eventStrokeWidth != null) __obj.updateDynamic("eventStrokeWidth")(eventStrokeWidth.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (goalLineColors != null) __obj.updateDynamic("goalLineColors")(goalLineColors)
    if (goalStrokeWidth != null) __obj.updateDynamic("goalStrokeWidth")(goalStrokeWidth.asInstanceOf[js.Any])
    if (goals != null) __obj.updateDynamic("goals")(goals)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (gridStrokeWidth != null) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor)
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily)
    if (gridTextSize != null) __obj.updateDynamic("gridTextSize")(gridTextSize.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight)
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(hoverCallback)
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(parseTime)) __obj.updateDynamic("parseTime")(parseTime)
    if (pointFillColors != null) __obj.updateDynamic("pointFillColors")(pointFillColors)
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (pointStrokeColors != null) __obj.updateDynamic("pointStrokeColors")(pointStrokeColors)
    if (postUnits != null) __obj.updateDynamic("postUnits")(postUnits)
    if (preUnits != null) __obj.updateDynamic("preUnits")(preUnits)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (xLabelAngle != null) __obj.updateDynamic("xLabelAngle")(xLabelAngle.asInstanceOf[js.Any])
    if (xLabelFormat != null) __obj.updateDynamic("xLabelFormat")(xLabelFormat)
    if (xLabels != null) __obj.updateDynamic("xLabels")(xLabels)
    if (yLabelFormat != null) __obj.updateDynamic("yLabelFormat")(yLabelFormat)
    if (ymax != null) __obj.updateDynamic("ymax")(ymax.asInstanceOf[js.Any])
    if (ymin != null) __obj.updateDynamic("ymin")(ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAreaOptions]
  }
}


package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* options */ IBarOptions, 
      /* content */ java.lang.String, 
      /* row */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
}

object IBarOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[java.lang.String],
    xkey: java.lang.String,
    ykeys: js.Array[java.lang.String],
    axes: js.UndefOr[scala.Boolean] = js.undefined,
    barColors: js.Array[java.lang.String] = null,
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
      /* options */ IBarOptions, 
      /* content */ java.lang.String, 
      /* row */ js.Any, 
      java.lang.String
    ] = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    stacked: js.UndefOr[scala.Boolean] = js.undefined
  ): IBarOptions = {
    val __obj = js.Dynamic.literal(data = data, element = element, labels = labels, xkey = xkey, ykeys = ykeys)
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes)
    if (barColors != null) __obj.updateDynamic("barColors")(barColors)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor)
    if (gridStrokeWidth != null) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor)
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily)
    if (gridTextSize != null) __obj.updateDynamic("gridTextSize")(gridTextSize.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight)
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(hoverCallback)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    __obj.asInstanceOf[IBarOptions]
  }
}


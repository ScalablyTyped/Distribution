package typings.morrisDotJs.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[String]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ IBarOptions, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.undefined
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[Boolean] = js.undefined
}

object IBarOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String],
    axes: js.UndefOr[Boolean] = js.undefined,
    barColors: js.Array[String] = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridStrokeWidth: Int | Double = null,
    gridTextColor: String = null,
    gridTextFamily: String = null,
    gridTextSize: Int | Double = null,
    gridTextWeight: String = null,
    hideHover: Boolean | AutoAlways = null,
    hoverCallback: (/* index */ Double, /* options */ IBarOptions, /* content */ String, /* row */ js.Any) => String = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
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
    if (hoverCallback != null) __obj.updateDynamic("hoverCallback")(js.Any.fromFunction4(hoverCallback))
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    __obj.asInstanceOf[IBarOptions]
  }
}


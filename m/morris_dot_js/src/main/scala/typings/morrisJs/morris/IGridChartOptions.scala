package typings.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridChartOptions extends IChartOptions {
  /** Set to false to disable drawing the x and y axes. */
  var axes: js.UndefOr[Boolean] = js.undefined
  /** The data to plot. This is an array of objects, containing x and y attributes as described by the xkey and ykeys options. */
  var data: js.Array[_]
  /**  Set to false to disable drawing the horizontal grid lines. */
  var grid: js.UndefOr[Boolean] = js.undefined
  /** Set the line color of the grid. (default: #aaa) */
  var gridLineColor: js.UndefOr[String] = js.undefined
  /** Set the stroke of the grid. (default: 0.5)*/
  var gridStrokeWidth: js.UndefOr[Double] = js.undefined
  /**  Set the color of the axis labels (default: #888). */
  var gridTextColor: js.UndefOr[String] = js.undefined
  /** Set the font family of the axis labels (default: sans-serif). */
  var gridTextFamily: js.UndefOr[String] = js.undefined
  /** Set the point size of the axis labels (default: 12). */
  var gridTextSize: js.UndefOr[Double] = js.undefined
  /** Set the font weight of the axis labels (default: normal). */
  var gridTextWeight: js.UndefOr[String] = js.undefined
  /**  Set the visibility of the hover legend (see documentation). */
  var hideHover: js.UndefOr[Boolean | AutoAlways] = js.undefined
  /** A list of strings containing labels for the data series to be plotted (corresponding to the values in the ykeys option). */
  var labels: js.Array[String]
  /** A string containing the name of the attribute that contains X labels. */
  var xkey: String
  /** A list of strings containing names of attributes that contain Y values (one for each series of data to be plotted). */
  var ykeys: js.Array[String]
}

object IGridChartOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String],
    axes: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridLineColor: String = null,
    gridStrokeWidth: js.UndefOr[Double] = js.undefined,
    gridTextColor: String = null,
    gridTextFamily: String = null,
    gridTextSize: js.UndefOr[Double] = js.undefined,
    gridTextWeight: String = null,
    hideHover: Boolean | AutoAlways = null,
    resize: js.UndefOr[Boolean] = js.undefined
  ): IGridChartOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.get.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(gridStrokeWidth)) __obj.updateDynamic("gridStrokeWidth")(gridStrokeWidth.get.asInstanceOf[js.Any])
    if (gridTextColor != null) __obj.updateDynamic("gridTextColor")(gridTextColor.asInstanceOf[js.Any])
    if (gridTextFamily != null) __obj.updateDynamic("gridTextFamily")(gridTextFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(gridTextSize)) __obj.updateDynamic("gridTextSize")(gridTextSize.get.asInstanceOf[js.Any])
    if (gridTextWeight != null) __obj.updateDynamic("gridTextWeight")(gridTextWeight.asInstanceOf[js.Any])
    if (hideHover != null) __obj.updateDynamic("hideHover")(hideHover.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridChartOptions]
  }
}


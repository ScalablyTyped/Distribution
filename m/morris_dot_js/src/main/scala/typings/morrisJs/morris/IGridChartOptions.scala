package typings.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridChartOptions extends IChartOptions {
  /** Set to false to disable drawing the x and y axes. */
  var axes: js.UndefOr[Boolean] = js.native
  /** The data to plot. This is an array of objects, containing x and y attributes as described by the xkey and ykeys options. */
  var data: js.Array[_] = js.native
  /**  Set to false to disable drawing the horizontal grid lines. */
  var grid: js.UndefOr[Boolean] = js.native
  /** Set the line color of the grid. (default: #aaa) */
  var gridLineColor: js.UndefOr[String] = js.native
  /** Set the stroke of the grid. (default: 0.5)*/
  var gridStrokeWidth: js.UndefOr[Double] = js.native
  /**  Set the color of the axis labels (default: #888). */
  var gridTextColor: js.UndefOr[String] = js.native
  /** Set the font family of the axis labels (default: sans-serif). */
  var gridTextFamily: js.UndefOr[String] = js.native
  /** Set the point size of the axis labels (default: 12). */
  var gridTextSize: js.UndefOr[Double] = js.native
  /** Set the font weight of the axis labels (default: normal). */
  var gridTextWeight: js.UndefOr[String] = js.native
  /**  Set the visibility of the hover legend (see documentation). */
  var hideHover: js.UndefOr[Boolean | AutoAlways] = js.native
  /** A list of strings containing labels for the data series to be plotted (corresponding to the values in the ykeys option). */
  var labels: js.Array[String] = js.native
  /** A string containing the name of the attribute that contains X labels. */
  var xkey: String = js.native
  /** A list of strings containing names of attributes that contain Y values (one for each series of data to be plotted). */
  var ykeys: js.Array[String] = js.native
}

object IGridChartOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): IGridChartOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridChartOptions]
  }
  @scala.inline
  implicit class IGridChartOptionsOps[Self <: IGridChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setXkey(value: String): Self = this.set("xkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setYkeysVarargs(value: String*): Self = this.set("ykeys", js.Array(value :_*))
    @scala.inline
    def setYkeys(value: js.Array[String]): Self = this.set("ykeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxes(value: Boolean): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setGridLineColor(value: String): Self = this.set("gridLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLineColor: Self = this.set("gridLineColor", js.undefined)
    @scala.inline
    def setGridStrokeWidth(value: Double): Self = this.set("gridStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridStrokeWidth: Self = this.set("gridStrokeWidth", js.undefined)
    @scala.inline
    def setGridTextColor(value: String): Self = this.set("gridTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTextColor: Self = this.set("gridTextColor", js.undefined)
    @scala.inline
    def setGridTextFamily(value: String): Self = this.set("gridTextFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTextFamily: Self = this.set("gridTextFamily", js.undefined)
    @scala.inline
    def setGridTextSize(value: Double): Self = this.set("gridTextSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTextSize: Self = this.set("gridTextSize", js.undefined)
    @scala.inline
    def setGridTextWeight(value: String): Self = this.set("gridTextWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTextWeight: Self = this.set("gridTextWeight", js.undefined)
    @scala.inline
    def setHideHover(value: Boolean | AutoAlways): Self = this.set("hideHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideHover: Self = this.set("hideHover", js.undefined)
  }
  
}


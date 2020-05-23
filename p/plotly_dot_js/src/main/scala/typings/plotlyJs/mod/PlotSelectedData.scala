package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotDatum> */
trait PlotSelectedData extends js.Object {
  var curveNumber: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[PlotData] = js.undefined
  var pointIndex: js.UndefOr[Double] = js.undefined
  var pointNumber: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Datum] = js.undefined
  var xaxis: js.UndefOr[LayoutAxis] = js.undefined
  var y: js.UndefOr[Datum] = js.undefined
  var yaxis: js.UndefOr[LayoutAxis] = js.undefined
}

object PlotSelectedData {
  @scala.inline
  def apply(
    curveNumber: js.UndefOr[Double] = js.undefined,
    data: PlotData = null,
    pointIndex: js.UndefOr[Double] = js.undefined,
    pointNumber: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Null | Datum] = js.undefined,
    xaxis: LayoutAxis = null,
    y: js.UndefOr[Null | Datum] = js.undefined,
    yaxis: LayoutAxis = null
  ): PlotSelectedData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(curveNumber)) __obj.updateDynamic("curveNumber")(curveNumber.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(pointIndex)) __obj.updateDynamic("pointIndex")(pointIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointNumber)) __obj.updateDynamic("pointNumber")(pointNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSelectedData]
  }
}


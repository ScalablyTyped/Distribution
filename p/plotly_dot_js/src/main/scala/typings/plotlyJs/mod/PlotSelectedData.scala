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
    curveNumber: Int | Double = null,
    data: PlotData = null,
    pointIndex: Int | Double = null,
    pointNumber: Int | Double = null,
    x: Datum = null,
    xaxis: LayoutAxis = null,
    y: Datum = null,
    yaxis: LayoutAxis = null
  ): PlotSelectedData = {
    val __obj = js.Dynamic.literal()
    if (curveNumber != null) __obj.updateDynamic("curveNumber")(curveNumber.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (pointNumber != null) __obj.updateDynamic("pointNumber")(pointNumber.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSelectedData]
  }
}


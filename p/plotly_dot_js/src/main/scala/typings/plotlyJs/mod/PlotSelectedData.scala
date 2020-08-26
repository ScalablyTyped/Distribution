package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotDatum> */
@js.native
trait PlotSelectedData extends js.Object {
  var curveNumber: js.UndefOr[Double] = js.native
  var customdata: js.UndefOr[Datum] = js.native
  var data: js.UndefOr[PlotData] = js.native
  var pointIndex: js.UndefOr[Double] = js.native
  var pointNumber: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Datum] = js.native
  var xaxis: js.UndefOr[LayoutAxis] = js.native
  var y: js.UndefOr[Datum] = js.native
  var yaxis: js.UndefOr[LayoutAxis] = js.native
}

object PlotSelectedData {
  @scala.inline
  def apply(): PlotSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSelectedData]
  }
  @scala.inline
  implicit class PlotSelectedDataOps[Self <: PlotSelectedData] (val x: Self) extends AnyVal {
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
    def setCurveNumber(value: Double): Self = this.set("curveNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurveNumber: Self = this.set("curveNumber", js.undefined)
    @scala.inline
    def setCustomdata(value: Datum): Self = this.set("customdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomdata: Self = this.set("customdata", js.undefined)
    @scala.inline
    def setCustomdataNull: Self = this.set("customdata", null)
    @scala.inline
    def setData(value: PlotData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointIndex: Self = this.set("pointIndex", js.undefined)
    @scala.inline
    def setPointNumber(value: Double): Self = this.set("pointNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointNumber: Self = this.set("pointNumber", js.undefined)
    @scala.inline
    def setX(value: Datum): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXNull: Self = this.set("x", null)
    @scala.inline
    def setXaxis(value: LayoutAxis): Self = this.set("xaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXaxis: Self = this.set("xaxis", js.undefined)
    @scala.inline
    def setY(value: Datum): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYNull: Self = this.set("y", null)
    @scala.inline
    def setYaxis(value: LayoutAxis): Self = this.set("yaxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYaxis: Self = this.set("yaxis", js.undefined)
  }
  
}


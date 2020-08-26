package typings.plotlyJs.anon

import typings.plotlyJs.mod.Dash
import typings.plotlyJs.plotlyJsStrings.hv
import typings.plotlyJs.plotlyJsStrings.hvh
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.spline
import typings.plotlyJs.plotlyJsStrings.vh
import typings.plotlyJs.plotlyJsStrings.vhv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.ScatterLine> */
@js.native
trait PartialScatterLine extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  var dash: js.UndefOr[Dash] = js.native
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.native
  var simplify: js.UndefOr[Boolean] = js.native
  var smoothing: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialScatterLine {
  @scala.inline
  def apply(): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterLine]
  }
  @scala.inline
  implicit class PartialScatterLineOps[Self <: PartialScatterLine] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDash(value: Dash): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    @scala.inline
    def setShape(value: linear | spline | hv | vh | hvh | vhv): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSimplify(value: Boolean): Self = this.set("simplify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplify: Self = this.set("simplify", js.undefined)
    @scala.inline
    def setSmoothing(value: Double): Self = this.set("smoothing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothing: Self = this.set("smoothing", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


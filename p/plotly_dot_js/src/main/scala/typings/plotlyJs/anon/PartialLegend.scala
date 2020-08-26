package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.grouped
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Legend> */
@js.native
trait PartialLegend extends js.Object {
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var font: js.UndefOr[PartialFont] = js.native
  var orientation: js.UndefOr[v | h] = js.native
  var tracegroupgap: js.UndefOr[Double] = js.native
  var traceorder: js.UndefOr[grouped | normal | reversed] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}

object PartialLegend {
  @scala.inline
  def apply(): PartialLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLegend]
  }
  @scala.inline
  implicit class PartialLegendOps[Self <: PartialLegend] (val x: Self) extends AnyVal {
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
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    @scala.inline
    def setBordercolor(value: String): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setOrientation(value: v | h): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setTracegroupgap(value: Double): Self = this.set("tracegroupgap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracegroupgap: Self = this.set("tracegroupgap", js.undefined)
    @scala.inline
    def setTraceorder(value: grouped | normal | reversed): Self = this.set("traceorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceorder: Self = this.set("traceorder", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
  }
  
}


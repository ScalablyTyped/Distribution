package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
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

@js.native
trait Legend extends Label {
  var borderwidth: Double = js.native
  var orientation: v | h = js.native
  var tracegroupgap: Double = js.native
  var traceorder: grouped | normal | reversed = js.native
  var x: Double = js.native
  var xanchor: auto | left | center | right = js.native
  var y: Double = js.native
  var yanchor: auto | top | middle | bottom = js.native
}

object Legend {
  @scala.inline
  def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    font: PartialFont,
    orientation: v | h,
    tracegroupgap: Double,
    traceorder: grouped | normal | reversed,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Legend = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], tracegroupgap = tracegroupgap.asInstanceOf[js.Any], traceorder = traceorder.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  @scala.inline
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
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
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: v | h): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracegroupgap(value: Double): Self = this.set("tracegroupgap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceorder(value: grouped | normal | reversed): Self = this.set("traceorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
  }
  
}


package typings.ol.canvasMod

import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeState extends js.Object {
  var lineCap: CanvasLineCap = js.native
  var lineDash: js.Array[Double] = js.native
  var lineDashOffset: Double = js.native
  var lineJoin: CanvasLineJoin = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  var strokeStyle: ColorLike = js.native
}

object StrokeState {
  @scala.inline
  def apply(
    lineCap: CanvasLineCap,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: CanvasLineJoin,
    lineWidth: Double,
    miterLimit: Double,
    strokeStyle: ColorLike
  ): StrokeState = {
    val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeState]
  }
  @scala.inline
  implicit class StrokeStateOps[Self <: StrokeState] (val x: Self) extends AnyVal {
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
    def setLineCap(value: CanvasLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoin(value: CanvasLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeStyle(value: ColorLike): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
  }
  
}


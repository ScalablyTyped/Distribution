package typings.ol.canvasMod

import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillStrokeState extends js.Object {
  var currentFillStyle: js.UndefOr[ColorLike] = js.native
  var currentLineCap: js.UndefOr[CanvasLineCap] = js.native
  var currentLineDash: js.Array[Double] = js.native
  var currentLineDashOffset: js.UndefOr[Double] = js.native
  var currentLineJoin: js.UndefOr[CanvasLineJoin] = js.native
  var currentLineWidth: js.UndefOr[Double] = js.native
  var currentMiterLimit: js.UndefOr[Double] = js.native
  var currentStrokeStyle: js.UndefOr[ColorLike] = js.native
  var fillStyle: js.UndefOr[ColorLike] = js.native
  var lastStroke: js.UndefOr[Double] = js.native
  var lineCap: js.UndefOr[CanvasLineCap] = js.native
  var lineDash: js.Array[Double] = js.native
  var lineDashOffset: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[ColorLike] = js.native
}

object FillStrokeState {
  @scala.inline
  def apply(currentLineDash: js.Array[Double], lineDash: js.Array[Double]): FillStrokeState = {
    val __obj = js.Dynamic.literal(currentLineDash = currentLineDash.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStrokeState]
  }
  @scala.inline
  implicit class FillStrokeStateOps[Self <: FillStrokeState] (val x: Self) extends AnyVal {
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
    def setCurrentLineDashVarargs(value: Double*): Self = this.set("currentLineDash", js.Array(value :_*))
    @scala.inline
    def setCurrentLineDash(value: js.Array[Double]): Self = this.set("currentLineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentFillStyle(value: ColorLike): Self = this.set("currentFillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentFillStyle: Self = this.set("currentFillStyle", js.undefined)
    @scala.inline
    def setCurrentLineCap(value: CanvasLineCap): Self = this.set("currentLineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLineCap: Self = this.set("currentLineCap", js.undefined)
    @scala.inline
    def setCurrentLineDashOffset(value: Double): Self = this.set("currentLineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLineDashOffset: Self = this.set("currentLineDashOffset", js.undefined)
    @scala.inline
    def setCurrentLineJoin(value: CanvasLineJoin): Self = this.set("currentLineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLineJoin: Self = this.set("currentLineJoin", js.undefined)
    @scala.inline
    def setCurrentLineWidth(value: Double): Self = this.set("currentLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLineWidth: Self = this.set("currentLineWidth", js.undefined)
    @scala.inline
    def setCurrentMiterLimit(value: Double): Self = this.set("currentMiterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMiterLimit: Self = this.set("currentMiterLimit", js.undefined)
    @scala.inline
    def setCurrentStrokeStyle(value: ColorLike): Self = this.set("currentStrokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentStrokeStyle: Self = this.set("currentStrokeStyle", js.undefined)
    @scala.inline
    def setFillStyle(value: ColorLike): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillStyle: Self = this.set("fillStyle", js.undefined)
    @scala.inline
    def setLastStroke(value: Double): Self = this.set("lastStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStroke: Self = this.set("lastStroke", js.undefined)
    @scala.inline
    def setLineCap(value: CanvasLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDashOffset: Self = this.set("lineDashOffset", js.undefined)
    @scala.inline
    def setLineJoin(value: CanvasLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    @scala.inline
    def setStrokeStyle(value: ColorLike): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
  }
  
}


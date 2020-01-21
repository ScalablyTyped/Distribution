package typings.ol.canvasMod

import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillStrokeState extends js.Object {
  var currentFillStyle: js.UndefOr[ColorLike] = js.undefined
  var currentLineCap: js.UndefOr[CanvasLineCap] = js.undefined
  var currentLineDash: js.Array[Double]
  var currentLineDashOffset: js.UndefOr[Double] = js.undefined
  var currentLineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  var currentLineWidth: js.UndefOr[Double] = js.undefined
  var currentMiterLimit: js.UndefOr[Double] = js.undefined
  var currentStrokeStyle: js.UndefOr[ColorLike] = js.undefined
  var fillStyle: js.UndefOr[ColorLike] = js.undefined
  var lastStroke: js.UndefOr[Double] = js.undefined
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  var lineDash: js.Array[Double]
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var strokeStyle: js.UndefOr[ColorLike] = js.undefined
}

object FillStrokeState {
  @scala.inline
  def apply(
    currentLineDash: js.Array[Double],
    lineDash: js.Array[Double],
    currentFillStyle: ColorLike = null,
    currentLineCap: CanvasLineCap = null,
    currentLineDashOffset: Int | Double = null,
    currentLineJoin: CanvasLineJoin = null,
    currentLineWidth: Int | Double = null,
    currentMiterLimit: Int | Double = null,
    currentStrokeStyle: ColorLike = null,
    fillStyle: ColorLike = null,
    lastStroke: Int | Double = null,
    lineCap: CanvasLineCap = null,
    lineDashOffset: Int | Double = null,
    lineJoin: CanvasLineJoin = null,
    lineWidth: Int | Double = null,
    miterLimit: Int | Double = null,
    strokeStyle: ColorLike = null
  ): FillStrokeState = {
    val __obj = js.Dynamic.literal(currentLineDash = currentLineDash.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any])
    if (currentFillStyle != null) __obj.updateDynamic("currentFillStyle")(currentFillStyle.asInstanceOf[js.Any])
    if (currentLineCap != null) __obj.updateDynamic("currentLineCap")(currentLineCap.asInstanceOf[js.Any])
    if (currentLineDashOffset != null) __obj.updateDynamic("currentLineDashOffset")(currentLineDashOffset.asInstanceOf[js.Any])
    if (currentLineJoin != null) __obj.updateDynamic("currentLineJoin")(currentLineJoin.asInstanceOf[js.Any])
    if (currentLineWidth != null) __obj.updateDynamic("currentLineWidth")(currentLineWidth.asInstanceOf[js.Any])
    if (currentMiterLimit != null) __obj.updateDynamic("currentMiterLimit")(currentMiterLimit.asInstanceOf[js.Any])
    if (currentStrokeStyle != null) __obj.updateDynamic("currentStrokeStyle")(currentStrokeStyle.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (lastStroke != null) __obj.updateDynamic("lastStroke")(lastStroke.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStrokeState]
  }
}


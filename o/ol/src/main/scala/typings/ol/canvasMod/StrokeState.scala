package typings.ol.canvasMod

import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeState extends js.Object {
  var lineCap: CanvasLineCap
  var lineDash: js.Array[Double]
  var lineDashOffset: Double
  var lineJoin: CanvasLineJoin
  var lineWidth: Double
  var miterLimit: Double
  var strokeStyle: ColorLike
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
}


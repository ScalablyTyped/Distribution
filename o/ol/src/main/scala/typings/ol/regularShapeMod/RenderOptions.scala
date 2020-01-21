package typings.ol.regularShapeMod

import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var lineCap: CanvasLineCap
  var lineDash: js.Array[Double]
  var lineDashOffset: Double
  var lineJoin: CanvasLineJoin
  var miterLimit: Double
  var size: Double
  var strokeStyle: js.UndefOr[ColorLike] = js.undefined
  var strokeWidth: Double
}

object RenderOptions {
  @scala.inline
  def apply(
    lineCap: CanvasLineCap,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: CanvasLineJoin,
    miterLimit: Double,
    size: Double,
    strokeWidth: Double,
    strokeStyle: ColorLike = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}


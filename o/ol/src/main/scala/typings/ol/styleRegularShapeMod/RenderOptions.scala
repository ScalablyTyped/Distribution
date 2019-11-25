package typings.ol.styleRegularShapeMod

import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var lineCap: String
  var lineDash: js.Array[Double]
  var lineDashOffset: Double
  var lineJoin: String
  var miterLimit: Double
  var size: Double
  var strokeStyle: js.UndefOr[ColorLike] = js.undefined
  var strokeWidth: Double
}

object RenderOptions {
  @scala.inline
  def apply(
    lineCap: String,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: String,
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


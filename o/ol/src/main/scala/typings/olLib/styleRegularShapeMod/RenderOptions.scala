package typings
package olLib.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var lineCap: java.lang.String
  var lineDash: js.Array[scala.Double]
  var lineDashOffset: scala.Double
  var lineJoin: java.lang.String
  var miterLimit: scala.Double
  var size: scala.Double
  var strokeStyle: js.UndefOr[olLib.colorlikeMod.ColorLike] = js.undefined
  var strokeWidth: scala.Double
}

object RenderOptions {
  @scala.inline
  def apply(
    lineCap: java.lang.String,
    lineDash: js.Array[scala.Double],
    lineDashOffset: scala.Double,
    lineJoin: java.lang.String,
    miterLimit: scala.Double,
    size: scala.Double,
    strokeWidth: scala.Double,
    strokeStyle: olLib.colorlikeMod.ColorLike = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(lineCap = lineCap, lineDash = lineDash, lineDashOffset = lineDashOffset, lineJoin = lineJoin, miterLimit = miterLimit, size = size, strokeWidth = strokeWidth)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}


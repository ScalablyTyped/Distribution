package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeState extends js.Object {
  var lineCap: java.lang.String
  var lineDash: js.Array[scala.Double]
  var lineDashOffset: scala.Double
  var lineJoin: java.lang.String
  var lineWidth: scala.Double
  var miterLimit: scala.Double
  var strokeStyle: olLib.colorlikeMod.ColorLike
}

object StrokeState {
  @scala.inline
  def apply(
    lineCap: java.lang.String,
    lineDash: js.Array[scala.Double],
    lineDashOffset: scala.Double,
    lineJoin: java.lang.String,
    lineWidth: scala.Double,
    miterLimit: scala.Double,
    strokeStyle: olLib.colorlikeMod.ColorLike
  ): StrokeState = {
    val __obj = js.Dynamic.literal(lineCap = lineCap, lineDash = lineDash, lineDashOffset = lineDashOffset, lineJoin = lineJoin, lineWidth = lineWidth, miterLimit = miterLimit, strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StrokeState]
  }
}


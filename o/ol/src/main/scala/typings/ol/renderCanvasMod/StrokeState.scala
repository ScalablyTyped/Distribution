package typings.ol.renderCanvasMod

import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeState extends js.Object {
  var lineCap: String
  var lineDash: js.Array[Double]
  var lineDashOffset: Double
  var lineJoin: String
  var lineWidth: Double
  var miterLimit: Double
  var strokeStyle: ColorLike
}

object StrokeState {
  @scala.inline
  def apply(
    lineCap: String,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: String,
    lineWidth: Double,
    miterLimit: Double,
    strokeStyle: ColorLike
  ): StrokeState = {
    val __obj = js.Dynamic.literal(lineCap = lineCap, lineDash = lineDash, lineDashOffset = lineDashOffset, lineJoin = lineJoin, lineWidth = lineWidth, miterLimit = miterLimit, strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StrokeState]
  }
}


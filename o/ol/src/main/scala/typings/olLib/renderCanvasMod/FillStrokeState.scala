package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillStrokeState extends js.Object {
  var currentFillStyle: js.UndefOr[olLib.colorlikeMod.ColorLike] = js.undefined
  var currentLineCap: js.UndefOr[java.lang.String] = js.undefined
  var currentLineDash: js.Array[scala.Double]
  var currentLineDashOffset: js.UndefOr[scala.Double] = js.undefined
  var currentLineJoin: js.UndefOr[java.lang.String] = js.undefined
  var currentLineWidth: js.UndefOr[scala.Double] = js.undefined
  var currentMiterLimit: js.UndefOr[scala.Double] = js.undefined
  var currentStrokeStyle: js.UndefOr[olLib.colorlikeMod.ColorLike] = js.undefined
  var fillStyle: js.UndefOr[olLib.colorlikeMod.ColorLike] = js.undefined
  var lastStroke: js.UndefOr[scala.Double] = js.undefined
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  var lineDash: js.Array[scala.Double]
  var lineDashOffset: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[olLib.colorlikeMod.ColorLike] = js.undefined
}

object FillStrokeState {
  @scala.inline
  def apply(
    currentLineDash: js.Array[scala.Double],
    lineDash: js.Array[scala.Double],
    currentFillStyle: olLib.colorlikeMod.ColorLike = null,
    currentLineCap: java.lang.String = null,
    currentLineDashOffset: scala.Int | scala.Double = null,
    currentLineJoin: java.lang.String = null,
    currentLineWidth: scala.Int | scala.Double = null,
    currentMiterLimit: scala.Int | scala.Double = null,
    currentStrokeStyle: olLib.colorlikeMod.ColorLike = null,
    fillStyle: olLib.colorlikeMod.ColorLike = null,
    lastStroke: scala.Int | scala.Double = null,
    lineCap: java.lang.String = null,
    lineDashOffset: scala.Int | scala.Double = null,
    lineJoin: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    miterLimit: scala.Int | scala.Double = null,
    strokeStyle: olLib.colorlikeMod.ColorLike = null
  ): FillStrokeState = {
    val __obj = js.Dynamic.literal(currentLineDash = currentLineDash, lineDash = lineDash)
    if (currentFillStyle != null) __obj.updateDynamic("currentFillStyle")(currentFillStyle.asInstanceOf[js.Any])
    if (currentLineCap != null) __obj.updateDynamic("currentLineCap")(currentLineCap)
    if (currentLineDashOffset != null) __obj.updateDynamic("currentLineDashOffset")(currentLineDashOffset.asInstanceOf[js.Any])
    if (currentLineJoin != null) __obj.updateDynamic("currentLineJoin")(currentLineJoin)
    if (currentLineWidth != null) __obj.updateDynamic("currentLineWidth")(currentLineWidth.asInstanceOf[js.Any])
    if (currentMiterLimit != null) __obj.updateDynamic("currentMiterLimit")(currentMiterLimit.asInstanceOf[js.Any])
    if (currentStrokeStyle != null) __obj.updateDynamic("currentStrokeStyle")(currentStrokeStyle.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (lastStroke != null) __obj.updateDynamic("lastStroke")(lastStroke.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStrokeState]
  }
}


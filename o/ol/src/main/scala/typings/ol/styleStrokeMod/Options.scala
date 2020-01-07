package typings.ol.styleStrokeMod

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[Color | ColorLike] = js.undefined
  var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: Color | ColorLike = null,
    lineCap: CanvasLineCap = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: Int | Double = null,
    lineJoin: CanvasLineJoin = null,
    miterLimit: Int | Double = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash.asInstanceOf[js.Any])
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


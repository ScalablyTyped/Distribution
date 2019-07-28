package typings.openlayers.openlayersMod.olxNs.styleNs

import typings.openlayers.openlayersMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeOptions extends js.Object {
  var color: js.UndefOr[Color | String] = js.undefined
  var lineCap: js.UndefOr[String] = js.undefined
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var miterLimit: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StrokeOptions {
  @scala.inline
  def apply(
    color: Color | String = null,
    lineCap: String = null,
    lineDash: js.Array[Double] = null,
    lineDashOffset: Int | Double = null,
    lineJoin: String = null,
    miterLimit: Int | Double = null,
    width: Int | Double = null
  ): StrokeOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineDash != null) __obj.updateDynamic("lineDash")(lineDash)
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeOptions]
  }
}


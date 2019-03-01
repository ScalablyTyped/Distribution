package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeOptions extends js.Object {
  var color: js.UndefOr[openlayersLib.openlayersMod.Color | java.lang.String] = js.undefined
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  var lineDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineDashOffset: js.UndefOr[scala.Double] = js.undefined
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object StrokeOptions {
  @scala.inline
  def apply(
    color: openlayersLib.openlayersMod.Color | java.lang.String = null,
    lineCap: java.lang.String = null,
    lineDash: js.Array[scala.Double] = null,
    lineDashOffset: scala.Int | scala.Double = null,
    lineJoin: java.lang.String = null,
    miterLimit: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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


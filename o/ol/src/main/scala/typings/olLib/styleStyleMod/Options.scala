package typings
package olLib.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var geometry: js.UndefOr[java.lang.String | olLib.geomGeometryMod.default | GeometryFunction] = js.undefined
  var image: js.UndefOr[olLib.styleImageMod.default] = js.undefined
  var renderer: js.UndefOr[RenderFunction] = js.undefined
  var stroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
  var text: js.UndefOr[olLib.styleTextMod.default] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fill: olLib.styleFillMod.default = null,
    geometry: java.lang.String | olLib.geomGeometryMod.default | GeometryFunction = null,
    image: olLib.styleImageMod.default = null,
    renderer: RenderFunction = null,
    stroke: olLib.styleStrokeMod.default = null,
    text: olLib.styleTextMod.default = null,
    zIndex: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (text != null) __obj.updateDynamic("text")(text)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


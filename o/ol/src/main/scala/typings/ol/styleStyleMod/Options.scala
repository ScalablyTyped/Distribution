package typings.ol.styleStyleMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.renderMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
  var geometry: js.UndefOr[String | typings.ol.geometryMod.default | GeometryFunction] = js.undefined
  var image: js.UndefOr[typings.ol.styleImageMod.default] = js.undefined
  var renderer: js.UndefOr[RenderFunction] = js.undefined
  var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
  var text: js.UndefOr[typings.ol.textMod.default] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fill: typings.ol.fillMod.default = null,
    geometry: String | typings.ol.geometryMod.default | GeometryFunction = null,
    image: typings.ol.styleImageMod.default = null,
    renderer: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Unit = null,
    stroke: typings.ol.strokeMod.default = null,
    text: typings.ol.textMod.default = null,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction2(renderer))
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


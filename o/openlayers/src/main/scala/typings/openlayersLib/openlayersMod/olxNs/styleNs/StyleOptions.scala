package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var fill: js.UndefOr[openlayersLib.openlayersMod.styleNs.Fill] = js.undefined
  var geometry: js.UndefOr[
    java.lang.String | openlayersLib.openlayersMod.geomNs.Geometry | openlayersLib.openlayersMod.StyleGeometryFunction
  ] = js.undefined
  var image: js.UndefOr[openlayersLib.openlayersMod.styleNs.Image] = js.undefined
  var stroke: js.UndefOr[openlayersLib.openlayersMod.styleNs.Stroke] = js.undefined
  var text: js.UndefOr[openlayersLib.openlayersMod.styleNs.Text] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    fill: openlayersLib.openlayersMod.styleNs.Fill = null,
    geometry: java.lang.String | openlayersLib.openlayersMod.geomNs.Geometry | openlayersLib.openlayersMod.StyleGeometryFunction = null,
    image: openlayersLib.openlayersMod.styleNs.Image = null,
    stroke: openlayersLib.openlayersMod.styleNs.Stroke = null,
    text: openlayersLib.openlayersMod.styleNs.Text = null,
    zIndex: scala.Int | scala.Double = null
  ): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (text != null) __obj.updateDynamic("text")(text)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleOptions]
  }
}


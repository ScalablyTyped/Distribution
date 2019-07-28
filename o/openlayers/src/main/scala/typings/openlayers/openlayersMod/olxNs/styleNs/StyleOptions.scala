package typings.openlayers.openlayersMod.olxNs.styleNs

import typings.openlayers.openlayersMod.StyleGeometryFunction
import typings.openlayers.openlayersMod.geomNs.Geometry
import typings.openlayers.openlayersMod.styleNs.Fill
import typings.openlayers.openlayersMod.styleNs.Stroke
import typings.openlayers.openlayersMod.styleNs.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var fill: js.UndefOr[Fill] = js.undefined
  var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.undefined
  var image: js.UndefOr[typings.openlayers.openlayersMod.styleNs.Image] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    fill: Fill = null,
    geometry: String | Geometry | StyleGeometryFunction = null,
    image: typings.openlayers.openlayersMod.styleNs.Image = null,
    stroke: Stroke = null,
    text: Text = null,
    zIndex: Int | Double = null
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


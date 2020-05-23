package typings.openlayers.mod.olx.style

import typings.openlayers.mod.StyleGeometryFunction
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Image
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var fill: js.UndefOr[Fill] = js.undefined
  var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(
    fill: Fill = null,
    geometry: String | Geometry | StyleGeometryFunction = null,
    image: Image = null,
    stroke: Stroke = null,
    text: Text = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleOptions]
  }
}


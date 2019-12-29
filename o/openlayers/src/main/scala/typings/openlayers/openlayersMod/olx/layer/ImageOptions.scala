package typings.openlayers.openlayersMod.olx.layer

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Map
import typings.openlayers.openlayersMod.source.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: Image
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    source: Image,
    extent: Extent = null,
    map: Map = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): ImageOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}


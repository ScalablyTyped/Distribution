package typings.openlayers.openlayersMod.olx.layer

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptions extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object LayerOptions {
  @scala.inline
  def apply(
    extent: Extent = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    source: Source = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): LayerOptions = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptions]
  }
}


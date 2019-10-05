package typings.openlayers.openlayersMod.olx.layer

import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.Map
import typings.openlayers.openlayersMod.StyleFunction
import typings.openlayers.openlayersMod.source.Vector
import typings.openlayers.openlayersMod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorOptions extends js.Object {
  var declutter: js.UndefOr[Boolean] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var maxResolution: js.UndefOr[Double] = js.undefined
  var minResolution: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderBuffer: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[VectorRenderType | String] = js.undefined
  var renderOrder: js.UndefOr[js.Function2[/* feature1 */ Feature, /* feature2 */ Feature, Double]] = js.undefined
  var source: Vector
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var updateWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object VectorOptions {
  @scala.inline
  def apply(
    source: Vector,
    declutter: js.UndefOr[Boolean] = js.undefined,
    extent: Extent = null,
    map: Map = null,
    maxResolution: Int | Double = null,
    minResolution: Int | Double = null,
    opacity: Int | Double = null,
    renderBuffer: Int | Double = null,
    renderMode: VectorRenderType | String = null,
    renderOrder: (/* feature1 */ Feature, /* feature2 */ Feature) => Double = null,
    style: Style | js.Array[Style] | StyleFunction = null,
    updateWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    updateWhileInteracting: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): VectorOptions = {
    val __obj = js.Dynamic.literal(source = source)
    if (!js.isUndefined(declutter)) __obj.updateDynamic("declutter")(declutter)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResolution != null) __obj.updateDynamic("maxResolution")(maxResolution.asInstanceOf[js.Any])
    if (minResolution != null) __obj.updateDynamic("minResolution")(minResolution.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (renderOrder != null) __obj.updateDynamic("renderOrder")(js.Any.fromFunction2(renderOrder))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhileAnimating)) __obj.updateDynamic("updateWhileAnimating")(updateWhileAnimating)
    if (!js.isUndefined(updateWhileInteracting)) __obj.updateDynamic("updateWhileInteracting")(updateWhileInteracting)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorOptions]
  }
}


package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.StyleFunction
import typings.openlayers.openlayersMod.olx.LogoOptions
import typings.openlayers.openlayersMod.source.Vector
import typings.openlayers.openlayersMod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVectorOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var ratio: js.UndefOr[Double] = js.undefined
  var renderBuffer: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var source: Vector
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
}

object ImageVectorOptions {
  @scala.inline
  def apply(
    source: Vector,
    attributions: AttributionLike = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null,
    ratio: Int | Double = null,
    renderBuffer: Int | Double = null,
    resolutions: js.Array[Double] = null,
    style: Style | js.Array[Style] | StyleFunction = null
  ): ImageVectorOptions = {
    val __obj = js.Dynamic.literal(source = source)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVectorOptions]
  }
}


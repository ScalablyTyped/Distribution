package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVectorOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var renderBuffer: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var source: openlayersLib.openlayersMod.sourceNs.Vector
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
}

object ImageVectorOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    source: openlayersLib.openlayersMod.sourceNs.Vector,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    ratio: scala.Int | scala.Double = null,
    renderBuffer: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    style: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null
  ): ImageVectorOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any], source = source)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (renderBuffer != null) __obj.updateDynamic("renderBuffer")(renderBuffer.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVectorOptions]
  }
}


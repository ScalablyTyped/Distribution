package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageWMSOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[openlayersLib.openlayersMod.ImageLoadFunctionType] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var params: org.scalablytyped.runtime.StringDictionary[js.Any]
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var serverType: js.UndefOr[openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType | java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImageWMSOptions {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    projection: openlayersLib.openlayersMod.ProjectionLike,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    crossOrigin: java.lang.String = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    imageLoadFunction: openlayersLib.openlayersMod.ImageLoadFunctionType = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    ratio: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    serverType: openlayersLib.openlayersMod.sourceNs.wmsNs.ServerType | java.lang.String = null,
    url: java.lang.String = null
  ): ImageWMSOptions = {
    val __obj = js.Dynamic.literal(params = params, projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageWMSOptions]
  }
}


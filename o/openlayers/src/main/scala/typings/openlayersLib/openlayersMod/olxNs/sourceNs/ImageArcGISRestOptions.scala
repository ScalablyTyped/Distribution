package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageArcGISRestOptions extends js.Object {
  var attributions: js.UndefOr[js.Array[openlayersLib.openlayersMod.Attribution]] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[openlayersLib.openlayersMod.ImageLoadFunctionType] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImageArcGISRestOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    attributions: js.Array[openlayersLib.openlayersMod.Attribution] = null,
    crossOrigin: java.lang.String = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    imageLoadFunction: openlayersLib.openlayersMod.ImageLoadFunctionType = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ratio: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    url: java.lang.String = null
  ): ImageArcGISRestOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageArcGISRestOptions]
  }
}


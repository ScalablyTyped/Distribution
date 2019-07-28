package typings.openlayers.openlayersMod.olxNs.sourceNs

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.openlayersMod.Attribution
import typings.openlayers.openlayersMod.ImageLoadFunctionType
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.olxNs.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageArcGISRestOptions extends js.Object {
  var attributions: js.UndefOr[js.Array[Attribution]] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var projection: ProjectionLike
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ImageArcGISRestOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    attributions: js.Array[Attribution] = null,
    crossOrigin: String = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: ImageLoadFunctionType = null,
    logo: String | LogoOptions = null,
    params: StringDictionary[js.Any] = null,
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    url: String = null
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


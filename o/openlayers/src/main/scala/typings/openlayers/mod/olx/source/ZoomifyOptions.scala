package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomifyOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var size: Size
  var tierSizeCalculation: js.UndefOr[String] = js.undefined
  var url: String
}

object ZoomifyOptions {
  @scala.inline
  def apply(
    size: Size,
    url: String,
    attributions: AttributionLike = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    crossOrigin: String = null,
    logo: String | LogoOptions = null,
    reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined,
    tierSizeCalculation: String = null
  ): ZoomifyOptions = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(reprojectionErrorThreshold)) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.get.asInstanceOf[js.Any])
    if (tierSizeCalculation != null) __obj.updateDynamic("tierSizeCalculation")(tierSizeCalculation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomifyOptions]
  }
}


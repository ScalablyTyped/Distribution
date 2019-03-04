package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomifyOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var size: openlayersLib.openlayersMod.Size
  var tierSizeCalculation: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ZoomifyOptions {
  @scala.inline
  def apply(
    size: openlayersLib.openlayersMod.Size,
    url: java.lang.String,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    tierSizeCalculation: java.lang.String = null
  ): ZoomifyOptions = {
    val __obj = js.Dynamic.literal(size = size, url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tierSizeCalculation != null) __obj.updateDynamic("tierSizeCalculation")(tierSizeCalculation)
    __obj.asInstanceOf[ZoomifyOptions]
  }
}


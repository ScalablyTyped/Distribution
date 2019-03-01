package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStaticOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var imageExtent: openlayersLib.openlayersMod.Extent
  var imageLoadFunction: js.UndefOr[openlayersLib.openlayersMod.ImageLoadFunctionType] = js.undefined
  var imageSize: js.UndefOr[openlayersLib.openlayersMod.Size] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var url: java.lang.String
}

object ImageStaticOptions {
  @scala.inline
  def apply(
    imageExtent: openlayersLib.openlayersMod.Extent,
    projection: openlayersLib.openlayersMod.ProjectionLike,
    url: java.lang.String,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    crossOrigin: java.lang.String = null,
    imageLoadFunction: openlayersLib.openlayersMod.ImageLoadFunctionType = null,
    imageSize: openlayersLib.openlayersMod.Size = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null
  ): ImageStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageExtent")(imageExtent)
    __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
}


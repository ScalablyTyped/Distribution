package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Image
import typings.openlayers.openlayersMod.ImageLoadFunctionType
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.Size
import typings.openlayers.openlayersMod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStaticOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var imageExtent: Extent
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var url: String
}

object ImageStaticOptions {
  @scala.inline
  def apply(
    imageExtent: Extent,
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Unit = null,
    imageSize: Size = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null
  ): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent, url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
}


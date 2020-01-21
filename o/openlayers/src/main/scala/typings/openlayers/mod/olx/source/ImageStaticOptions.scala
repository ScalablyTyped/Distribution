package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStaticOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var imageExtent: Extent_
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var projection: ProjectionLike
  var url: String
}

object ImageStaticOptions {
  @scala.inline
  def apply(
    imageExtent: Extent_,
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Unit = null,
    imageSize: Size = null,
    logo: String | LogoOptions = null,
    projection: ProjectionLike = null
  ): ImageStaticOptions = {
    val __obj = js.Dynamic.literal(imageExtent = imageExtent.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageStaticOptions]
  }
}


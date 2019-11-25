package typings.ol.sourceImageStaticMod

import typings.ol.extentMod.Extent
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var imageExtent: js.UndefOr[Extent] = js.undefined
  var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var url: String
}

object Options {
  @scala.inline
  def apply(
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    imageExtent: Extent = null,
    imageLoadFunction: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit = null,
    imageSize: Size = null,
    projection: ProjectionLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (imageExtent != null) __obj.updateDynamic("imageExtent")(imageExtent.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


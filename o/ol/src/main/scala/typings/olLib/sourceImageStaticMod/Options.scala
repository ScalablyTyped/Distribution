package typings
package olLib.sourceImageStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var imageExtent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var imageLoadFunction: js.UndefOr[olLib.imageMod.LoadFunction] = js.undefined
  var imageSize: js.UndefOr[olLib.sizeMod.Size] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var url: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    url: java.lang.String,
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    crossOrigin: java.lang.String = null,
    imageExtent: olLib.extentMod.Extent = null,
    imageLoadFunction: olLib.imageMod.LoadFunction = null,
    imageSize: olLib.sizeMod.Size = null,
    projection: olLib.projMod.ProjectionLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (imageExtent != null) __obj.updateDynamic("imageExtent")(imageExtent)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


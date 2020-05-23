package typings.ol.imageMapGuideMod

import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var crossOrigin: js.UndefOr[String] = js.undefined
  var displayDpi: js.UndefOr[Double] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useOverlay: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    crossOrigin: String = null,
    displayDpi: js.UndefOr[Double] = js.undefined,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit = null,
    metersPerUnit: js.UndefOr[Double] = js.undefined,
    params: js.Any = null,
    projection: ProjectionLike = null,
    ratio: js.UndefOr[Double] = js.undefined,
    resolutions: js.Array[Double] = null,
    url: String = null,
    useOverlay: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDpi)) __obj.updateDynamic("displayDpi")(displayDpi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.get.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (!js.isUndefined(metersPerUnit)) __obj.updateDynamic("metersPerUnit")(metersPerUnit.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useOverlay)) __obj.updateDynamic("useOverlay")(useOverlay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


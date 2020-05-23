package typings.openlayers.mod.olx.source

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.Image
import typings.openlayers.mod.ImageLoadFunctionType
import typings.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapGuideOptions extends js.Object {
  var displayDpi: js.UndefOr[Double] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[ImageLoadFunctionType] = js.undefined
  var metersPerUnit: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[GlobalObject] = js.undefined
  var projection: ProjectionLike
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useOverlay: js.UndefOr[Boolean] = js.undefined
}

object ImageMapGuideOptions {
  @scala.inline
  def apply(
    displayDpi: js.UndefOr[Double] = js.undefined,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: (/* image */ Image, /* url */ String) => Unit = null,
    metersPerUnit: js.UndefOr[Double] = js.undefined,
    params: GlobalObject = null,
    projection: ProjectionLike = null,
    ratio: js.UndefOr[Double] = js.undefined,
    resolutions: js.Array[Double] = null,
    url: String = null,
    useOverlay: js.UndefOr[Boolean] = js.undefined
  ): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
}


package typings.openlayers.openlayersMod.olxNs.sourceNs

import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.ImageLoadFunctionType
import typings.openlayers.openlayersMod.ProjectionLike
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
    projection: ProjectionLike,
    displayDpi: Int | Double = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: ImageLoadFunctionType = null,
    metersPerUnit: Int | Double = null,
    params: GlobalObject = null,
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    url: String = null,
    useOverlay: js.UndefOr[Boolean] = js.undefined
  ): ImageMapGuideOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (displayDpi != null) __obj.updateDynamic("displayDpi")(displayDpi.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useOverlay)) __obj.updateDynamic("useOverlay")(useOverlay)
    __obj.asInstanceOf[ImageMapGuideOptions]
  }
}


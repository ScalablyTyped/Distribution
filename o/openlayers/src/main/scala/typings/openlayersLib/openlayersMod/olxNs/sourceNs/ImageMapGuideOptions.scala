package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMapGuideOptions extends js.Object {
  var displayDpi: js.UndefOr[scala.Double] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[openlayersLib.openlayersMod.ImageLoadFunctionType] = js.undefined
  var metersPerUnit: js.UndefOr[scala.Double] = js.undefined
  var params: js.UndefOr[openlayersLib.openlayersMod.GlobalObject] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useOverlay: js.UndefOr[scala.Boolean] = js.undefined
}

object ImageMapGuideOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    displayDpi: scala.Int | scala.Double = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    imageLoadFunction: openlayersLib.openlayersMod.ImageLoadFunctionType = null,
    metersPerUnit: scala.Int | scala.Double = null,
    params: openlayersLib.openlayersMod.GlobalObject = null,
    ratio: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    url: java.lang.String = null,
    useOverlay: js.UndefOr[scala.Boolean] = js.undefined
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


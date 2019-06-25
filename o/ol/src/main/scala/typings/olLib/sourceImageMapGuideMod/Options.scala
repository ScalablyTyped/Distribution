package typings
package olLib.sourceImageMapGuideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var displayDpi: js.UndefOr[scala.Double] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[olLib.imageMod.LoadFunction] = js.undefined
  var metersPerUnit: js.UndefOr[scala.Double] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useOverlay: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    crossOrigin: java.lang.String = null,
    displayDpi: scala.Int | scala.Double = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    imageLoadFunction: olLib.imageMod.LoadFunction = null,
    metersPerUnit: scala.Int | scala.Double = null,
    params: js.Any = null,
    projection: olLib.projMod.ProjectionLike = null,
    ratio: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    url: java.lang.String = null,
    useOverlay: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (displayDpi != null) __obj.updateDynamic("displayDpi")(displayDpi.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (metersPerUnit != null) __obj.updateDynamic("metersPerUnit")(metersPerUnit.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useOverlay)) __obj.updateDynamic("useOverlay")(useOverlay)
    __obj.asInstanceOf[Options]
  }
}


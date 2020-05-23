package typings.ol.imageWMSMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.olImageMod.ImageWrapper
import typings.ol.olImageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.wmsservertypeMod.WMSServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var hidpi: js.UndefOr[Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[LoadFunction] = js.undefined
  var params: StringDictionary[js.Any]
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var serverType: js.UndefOr[WMSServerType | String] = js.undefined
  var url: String
}

object Options {
  @scala.inline
  def apply(
    params: StringDictionary[js.Any],
    url: String,
    attributions: AttributionLike = null,
    crossOrigin: String = null,
    hidpi: js.UndefOr[Boolean] = js.undefined,
    imageLoadFunction: (/* p0 */ ImageWrapper, /* p1 */ String) => Unit = null,
    projection: ProjectionLike = null,
    ratio: js.UndefOr[Double] = js.undefined,
    resolutions: js.Array[Double] = null,
    serverType: WMSServerType | String = null
  ): Options = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi.get.asInstanceOf[js.Any])
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


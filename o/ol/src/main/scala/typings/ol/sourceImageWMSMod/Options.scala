package typings.ol.sourceImageWMSMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.imageMod.ImageWrapper
import typings.ol.imageMod.LoadFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceWMSServerTypeMod.WMSServerType
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
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    serverType: WMSServerType | String = null
  ): Options = {
    val __obj = js.Dynamic.literal(params = params, url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(js.Any.fromFunction2(imageLoadFunction))
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


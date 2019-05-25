package typings
package olLib.sourceImageWMSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var hidpi: js.UndefOr[scala.Boolean] = js.undefined
  var imageLoadFunction: js.UndefOr[olLib.imageMod.LoadFunction] = js.undefined
  var params: org.scalablytyped.runtime.StringDictionary[js.Any]
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var serverType: js.UndefOr[olLib.sourceWMSServerTypeMod.WMSServerType | java.lang.String] = js.undefined
  var url: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    url: java.lang.String,
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    crossOrigin: java.lang.String = null,
    hidpi: js.UndefOr[scala.Boolean] = js.undefined,
    imageLoadFunction: olLib.imageMod.LoadFunction = null,
    projection: olLib.projMod.ProjectionLike = null,
    ratio: scala.Int | scala.Double = null,
    resolutions: js.Array[scala.Double] = null,
    serverType: olLib.sourceWMSServerTypeMod.WMSServerType | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(params = params, url = url)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(hidpi)) __obj.updateDynamic("hidpi")(hidpi)
    if (imageLoadFunction != null) __obj.updateDynamic("imageLoadFunction")(imageLoadFunction)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


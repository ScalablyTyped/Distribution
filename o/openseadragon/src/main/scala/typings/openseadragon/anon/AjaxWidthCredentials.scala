package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxWidthCredentials extends js.Object {
  var ajaxWidthCredentials: js.UndefOr[String | Boolean] = js.undefined
  var buildPyramid: js.UndefOr[Boolean] = js.undefined
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.undefined
  var url: String
  var useCanvas: js.UndefOr[Boolean] = js.undefined
}

object AjaxWidthCredentials {
  @scala.inline
  def apply(
    url: String,
    ajaxWidthCredentials: String | Boolean = null,
    buildPyramid: js.UndefOr[Boolean] = js.undefined,
    crossOriginPolicy: String | Boolean = null,
    useCanvas: js.UndefOr[Boolean] = js.undefined
  ): AjaxWidthCredentials = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (ajaxWidthCredentials != null) __obj.updateDynamic("ajaxWidthCredentials")(ajaxWidthCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(buildPyramid)) __obj.updateDynamic("buildPyramid")(buildPyramid.get.asInstanceOf[js.Any])
    if (crossOriginPolicy != null) __obj.updateDynamic("crossOriginPolicy")(crossOriginPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxWidthCredentials]
  }
}


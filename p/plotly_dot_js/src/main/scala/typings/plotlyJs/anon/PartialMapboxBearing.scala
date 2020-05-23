package typings.plotlyJs.anon

import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.MapboxCenter
import typings.plotlyJs.mod.MapboxLayers
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Mapbox> */
trait PartialMapboxBearing extends js.Object {
  var accesstoken: js.UndefOr[String] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var center: js.UndefOr[Partial[MapboxCenter]] = js.undefined
  var domain: js.UndefOr[Partial[Domain]] = js.undefined
  var layers: js.UndefOr[js.Array[Partial[MapboxLayers]]] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Double | String] = js.undefined
  var uirevision: js.UndefOr[Double | String] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object PartialMapboxBearing {
  @scala.inline
  def apply(
    accesstoken: String = null,
    bearing: js.UndefOr[Double] = js.undefined,
    center: Partial[MapboxCenter] = null,
    domain: Partial[Domain] = null,
    layers: js.Array[Partial[MapboxLayers]] = null,
    pitch: js.UndefOr[Double] = js.undefined,
    style: Double | String = null,
    uirevision: Double | String = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): PartialMapboxBearing = {
    val __obj = js.Dynamic.literal()
    if (accesstoken != null) __obj.updateDynamic("accesstoken")(accesstoken.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uirevision != null) __obj.updateDynamic("uirevision")(uirevision.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapboxBearing]
  }
}


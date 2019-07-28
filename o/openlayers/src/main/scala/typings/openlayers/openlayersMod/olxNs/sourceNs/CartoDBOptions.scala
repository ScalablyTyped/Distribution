package typings.openlayers.openlayersMod.olxNs.sourceNs

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.olxNs.LogoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartoDBOptions extends js.Object {
  var account: String
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var config: js.UndefOr[GlobalObject] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  var map: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var projection: ProjectionLike
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object CartoDBOptions {
  @scala.inline
  def apply(
    account: String,
    projection: ProjectionLike,
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    config: GlobalObject = null,
    crossOrigin: String = null,
    logo: String | LogoOptions = null,
    map: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): CartoDBOptions = {
    val __obj = js.Dynamic.literal(account = account, projection = projection.asInstanceOf[js.Any])
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[CartoDBOptions]
  }
}


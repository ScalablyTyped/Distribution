package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartoDBOptions extends js.Object {
  var account: java.lang.String
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var config: js.UndefOr[openlayersLib.openlayersMod.GlobalObject] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var map: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object CartoDBOptions {
  @scala.inline
  def apply(
    account: java.lang.String,
    projection: openlayersLib.openlayersMod.ProjectionLike,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    config: openlayersLib.openlayersMod.GlobalObject = null,
    crossOrigin: java.lang.String = null,
    logo: java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions = null,
    map: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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


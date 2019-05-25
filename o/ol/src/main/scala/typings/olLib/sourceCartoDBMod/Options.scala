package typings
package olLib.sourceCartoDBMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var account: java.lang.String
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var config: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    account: java.lang.String,
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    cacheSize: scala.Int | scala.Double = null,
    config: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    crossOrigin: java.lang.String = null,
    map: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    projection: olLib.projMod.ProjectionLike = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(account = account)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}


package typings
package olLib.sourceTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var attributionsCollapsible: js.UndefOr[scala.Boolean] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var state: js.UndefOr[olLib.sourceStateMod.State] = js.undefined
  var tileGrid: js.UndefOr[olLib.tilegridTileGridMod.default] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    attributionsCollapsible: js.UndefOr[scala.Boolean] = js.undefined,
    cacheSize: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    projection: olLib.projMod.ProjectionLike = null,
    state: olLib.sourceStateMod.State = null,
    tileGrid: olLib.tilegridTileGridMod.default = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    transition: scala.Int | scala.Double = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionsCollapsible)) __obj.updateDynamic("attributionsCollapsible")(attributionsCollapsible)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}


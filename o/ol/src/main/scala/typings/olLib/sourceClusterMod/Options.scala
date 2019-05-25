package typings
package olLib.sourceClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var geometryFunction: js.UndefOr[js.Function1[/* param0 */ olLib.featureMod.default, olLib.geomPointMod.default]] = js.undefined
  var source: olLib.sourceVectorMod.default
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    source: olLib.sourceVectorMod.default,
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    distance: scala.Int | scala.Double = null,
    geometryFunction: /* param0 */ olLib.featureMod.default => olLib.geomPointMod.default = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(source = source)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}


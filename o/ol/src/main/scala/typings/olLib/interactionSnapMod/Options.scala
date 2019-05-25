package typings
package olLib.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var edge: js.UndefOr[scala.Boolean] = js.undefined
  var features: js.UndefOr[olLib.collectionMod.default[olLib.featureMod.default]] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var vertex: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    edge: js.UndefOr[scala.Boolean] = js.undefined,
    features: olLib.collectionMod.default[olLib.featureMod.default] = null,
    pixelTolerance: scala.Int | scala.Double = null,
    source: olLib.sourceVectorMod.default = null,
    vertex: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge)
    if (features != null) __obj.updateDynamic("features")(features)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex)
    __obj.asInstanceOf[Options]
  }
}


package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for snap
  */
trait SnapOptions extends js.Object {
  var edge: js.UndefOr[scala.Boolean] = js.undefined
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.Vector] = js.undefined
  var vertex: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapOptions {
  @scala.inline
  def apply(
    edge: js.UndefOr[scala.Boolean] = js.undefined,
    features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    pixelTolerance: scala.Int | scala.Double = null,
    source: openlayersLib.openlayersMod.sourceNs.Vector = null,
    vertex: js.UndefOr[scala.Boolean] = js.undefined
  ): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge)
    if (features != null) __obj.updateDynamic("features")(features)
    if (pixelTolerance != null) __obj.updateDynamic("pixelTolerance")(pixelTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex)
    __obj.asInstanceOf[SnapOptions]
  }
}


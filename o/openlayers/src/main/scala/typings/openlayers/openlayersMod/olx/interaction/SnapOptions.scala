package typings.openlayers.openlayersMod.olx.interaction

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for snap
  */
trait SnapOptions extends js.Object {
  var edge: js.UndefOr[Boolean] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var vertex: js.UndefOr[Boolean] = js.undefined
}

object SnapOptions {
  @scala.inline
  def apply(
    edge: js.UndefOr[Boolean] = js.undefined,
    features: Collection[Feature] = null,
    pixelTolerance: Int | Double = null,
    source: Vector = null,
    vertex: js.UndefOr[Boolean] = js.undefined
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


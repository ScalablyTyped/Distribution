package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.source.Vector
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
    pixelTolerance: js.UndefOr[Double] = js.undefined,
    source: Vector = null,
    vertex: js.UndefOr[Boolean] = js.undefined
  ): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edge)) __obj.updateDynamic("edge")(edge.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelTolerance)) __obj.updateDynamic("pixelTolerance")(pixelTolerance.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(vertex)) __obj.updateDynamic("vertex")(vertex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapOptions]
  }
}


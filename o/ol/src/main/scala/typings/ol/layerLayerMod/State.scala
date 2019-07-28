package typings.ol.layerLayerMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var extent: js.UndefOr[Extent] = js.undefined
  var layer: typings.ol.layerBaseMod.default
  var managed: Boolean
  var maxResolution: Double
  var minResolution: Double
  var opacity: Double
  var sourceState: typings.ol.sourceStateMod.State
  var visible: Boolean
  var zIndex: Double
}

object State {
  @scala.inline
  def apply(
    layer: typings.ol.layerBaseMod.default,
    managed: Boolean,
    maxResolution: Double,
    minResolution: Double,
    opacity: Double,
    sourceState: typings.ol.sourceStateMod.State,
    visible: Boolean,
    zIndex: Double,
    extent: Extent = null
  ): State = {
    val __obj = js.Dynamic.literal(layer = layer, managed = managed, maxResolution = maxResolution, minResolution = minResolution, opacity = opacity, sourceState = sourceState, visible = visible, zIndex = zIndex)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[State]
  }
}


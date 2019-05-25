package typings
package olLib.layerLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var layer: olLib.layerBaseMod.default
  var managed: scala.Boolean
  var maxResolution: scala.Double
  var minResolution: scala.Double
  var opacity: scala.Double
  var sourceState: olLib.sourceStateMod.State
  var visible: scala.Boolean
  var zIndex: scala.Double
}

object State {
  @scala.inline
  def apply(
    layer: olLib.layerBaseMod.default,
    managed: scala.Boolean,
    maxResolution: scala.Double,
    minResolution: scala.Double,
    opacity: scala.Double,
    sourceState: olLib.sourceStateMod.State,
    visible: scala.Boolean,
    zIndex: scala.Double,
    extent: olLib.extentMod.Extent = null
  ): State = {
    val __obj = js.Dynamic.literal(layer = layer, managed = managed, maxResolution = maxResolution, minResolution = minResolution, opacity = opacity, sourceState = sourceState, visible = visible, zIndex = zIndex)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[State]
  }
}


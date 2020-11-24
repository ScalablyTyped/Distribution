package typings.ol.interactionInteractionMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Interaction", "zoomByDelta")
@js.native
object zoomByDelta extends js.Object {
  
  def apply(view: typings.ol.viewMod.default, delta: Double): Unit = js.native
  def apply(
    view: typings.ol.viewMod.default,
    delta: Double,
    opt_anchor: js.UndefOr[scala.Nothing],
    opt_duration: Double
  ): Unit = js.native
  def apply(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate): Unit = js.native
  def apply(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
}

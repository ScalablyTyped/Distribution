package typings.ol.interactionInteractionMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", "rotate")
@js.native
object rotate extends js.Object {
  def apply(view: typings.ol.viewMod.default): Unit = js.native
  def apply(view: typings.ol.viewMod.default, rotation: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def apply(
    view: typings.ol.viewMod.default,
    rotation: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def apply(view: typings.ol.viewMod.default, rotation: Double): Unit = js.native
  def apply(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate): Unit = js.native
  def apply(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
}


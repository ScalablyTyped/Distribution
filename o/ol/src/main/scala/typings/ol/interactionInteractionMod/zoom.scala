package typings.ol.interactionInteractionMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", "zoom")
@js.native
object zoom extends js.Object {
  def apply(view: typings.ol.viewMod.default): Unit = js.native
  def apply(view: typings.ol.viewMod.default, resolution: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def apply(
    view: typings.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def apply(
    view: typings.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double,
    opt_direction: Double
  ): Unit = js.native
  def apply(view: typings.ol.viewMod.default, resolution: Double): Unit = js.native
  def apply(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate): Unit = js.native
  def apply(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  def apply(
    view: typings.ol.viewMod.default,
    resolution: Double,
    opt_anchor: Coordinate,
    opt_duration: Double,
    opt_direction: Double
  ): Unit = js.native
}


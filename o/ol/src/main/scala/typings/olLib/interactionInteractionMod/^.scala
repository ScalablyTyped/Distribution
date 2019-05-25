package typings
package olLib.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pan(view: olLib.viewMod.default, delta: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def pan(view: olLib.viewMod.default, delta: olLib.coordinateMod.Coordinate, opt_duration: scala.Double): scala.Unit = js.native
  def rotate(view: olLib.viewMod.default, rotation: scala.Double): scala.Unit = js.native
  def rotate(view: olLib.viewMod.default, rotation: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def rotate(
    view: olLib.viewMod.default,
    rotation: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double
  ): scala.Unit = js.native
  def rotateWithoutConstraints(view: olLib.viewMod.default, rotation: scala.Double): scala.Unit = js.native
  def rotateWithoutConstraints(view: olLib.viewMod.default, rotation: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def rotateWithoutConstraints(
    view: olLib.viewMod.default,
    rotation: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double
  ): scala.Unit = js.native
  def zoom(view: olLib.viewMod.default, resolution: scala.Double): scala.Unit = js.native
  def zoom(view: olLib.viewMod.default, resolution: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def zoom(
    view: olLib.viewMod.default,
    resolution: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double
  ): scala.Unit = js.native
  def zoom(
    view: olLib.viewMod.default,
    resolution: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double,
    opt_direction: scala.Double
  ): scala.Unit = js.native
  def zoomByDelta(view: olLib.viewMod.default, delta: scala.Double): scala.Unit = js.native
  def zoomByDelta(view: olLib.viewMod.default, delta: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def zoomByDelta(
    view: olLib.viewMod.default,
    delta: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double
  ): scala.Unit = js.native
  def zoomWithoutConstraints(view: olLib.viewMod.default, resolution: scala.Double): scala.Unit = js.native
  def zoomWithoutConstraints(view: olLib.viewMod.default, resolution: scala.Double, opt_anchor: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def zoomWithoutConstraints(
    view: olLib.viewMod.default,
    resolution: scala.Double,
    opt_anchor: olLib.coordinateMod.Coordinate,
    opt_duration: scala.Double
  ): scala.Unit = js.native
}


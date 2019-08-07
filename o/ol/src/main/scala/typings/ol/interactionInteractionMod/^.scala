package typings.ol.interactionInteractionMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Interaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def pan(view: typings.ol.viewMod.default, delta: Coordinate): Unit = js.native
  def pan(view: typings.ol.viewMod.default, delta: Coordinate, opt_duration: Double): Unit = js.native
  def rotate(view: typings.ol.viewMod.default): Unit = js.native
  def rotate(view: typings.ol.viewMod.default, rotation: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def rotate(
    view: typings.ol.viewMod.default,
    rotation: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def rotate(view: typings.ol.viewMod.default, rotation: Double): Unit = js.native
  def rotate(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate): Unit = js.native
  def rotate(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  def rotateWithoutConstraints(view: typings.ol.viewMod.default): Unit = js.native
  def rotateWithoutConstraints(view: typings.ol.viewMod.default, rotation: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def rotateWithoutConstraints(
    view: typings.ol.viewMod.default,
    rotation: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def rotateWithoutConstraints(view: typings.ol.viewMod.default, rotation: Double): Unit = js.native
  def rotateWithoutConstraints(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate): Unit = js.native
  def rotateWithoutConstraints(view: typings.ol.viewMod.default, rotation: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  def zoom(view: typings.ol.viewMod.default): Unit = js.native
  def zoom(view: typings.ol.viewMod.default, resolution: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def zoom(
    view: typings.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def zoom(
    view: typings.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double,
    opt_direction: Double
  ): Unit = js.native
  def zoom(view: typings.ol.viewMod.default, resolution: Double): Unit = js.native
  def zoom(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate): Unit = js.native
  def zoom(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  def zoom(
    view: typings.ol.viewMod.default,
    resolution: Double,
    opt_anchor: Coordinate,
    opt_duration: Double,
    opt_direction: Double
  ): Unit = js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double): Unit = js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate): Unit = js.native
  def zoomByDelta(view: typings.ol.viewMod.default, delta: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
  def zoomWithoutConstraints(view: typings.ol.viewMod.default): Unit = js.native
  def zoomWithoutConstraints(view: typings.ol.viewMod.default, resolution: js.UndefOr[scala.Nothing], opt_anchor: Coordinate): Unit = js.native
  def zoomWithoutConstraints(
    view: typings.ol.viewMod.default,
    resolution: js.UndefOr[scala.Nothing],
    opt_anchor: Coordinate,
    opt_duration: Double
  ): Unit = js.native
  def zoomWithoutConstraints(view: typings.ol.viewMod.default, resolution: Double): Unit = js.native
  def zoomWithoutConstraints(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate): Unit = js.native
  def zoomWithoutConstraints(view: typings.ol.viewMod.default, resolution: Double, opt_anchor: Coordinate, opt_duration: Double): Unit = js.native
}


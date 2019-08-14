package typings.ol.viewMod

import typings.ol.centerconstraintMod.Type
import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraints extends js.Object {
  @JSName("center")
  var center_Original: Type = js.native
  @JSName("resolution")
  var resolution_Original: typings.ol.resolutionconstraintMod.Type = js.native
  @JSName("rotation")
  var rotation_Original: typings.ol.rotationconstraintMod.Type = js.native
  def center(): js.UndefOr[Coordinate] = js.native
  def center(p0: Coordinate): js.UndefOr[Coordinate] = js.native
  def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Double): js.UndefOr[Double] = js.native
  def resolution(p0: Double, p1: Double, p2: Double): js.UndefOr[Double] = js.native
  def rotation(p0: js.UndefOr[scala.Nothing], p1: Double): js.UndefOr[Double] = js.native
  def rotation(p0: Double, p1: Double): js.UndefOr[Double] = js.native
}


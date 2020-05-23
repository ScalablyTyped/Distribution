package typings.ol.viewMod

import typings.ol.centerconstraintMod.Type
import typings.ol.coordinateMod.Coordinate
import typings.ol.sizeMod.Size
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
  def center(p0: js.UndefOr[Coordinate], p1: Double, p2: Size): Coordinate = js.native
  def center(p0: js.UndefOr[Coordinate], p1: Double, p2: Size, p3: Boolean): Coordinate = js.native
  def resolution(p0: js.UndefOr[Double], p1: Double, p2: Size): Double = js.native
  def resolution(p0: js.UndefOr[Double], p1: Double, p2: Size, p3: Boolean): Double = js.native
  def rotation(): Double = js.native
  def rotation(p0: Double): Double = js.native
  def rotation(p0: Double, p1: Boolean): Double = js.native
}


package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraints extends js.Object {
  @JSName("center")
  var center_Original: olLib.centerconstraintMod.Type = js.native
  @JSName("resolution")
  var resolution_Original: olLib.resolutionconstraintMod.Type = js.native
  @JSName("rotation")
  var rotation_Original: olLib.rotationconstraintMod.Type = js.native
  def center(p0: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def resolution(p0: scala.Double, p1: scala.Double, p2: scala.Double): scala.Double = js.native
  def rotation(p0: scala.Double, p1: scala.Double): scala.Double = js.native
}


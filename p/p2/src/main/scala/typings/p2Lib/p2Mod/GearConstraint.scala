package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GearConstraint")
@js.native
class GearConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: GearConstraintOptions) = this()
  var angle: scala.Double = js.native
  var ratio: scala.Double = js.native
  def getMaxTorque(): scala.Double = js.native
  def setMaxTorque(torque: scala.Double): scala.Unit = js.native
}


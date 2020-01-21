package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GearConstraint")
@js.native
class GearConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: GearConstraintOptions) = this()
  var angle: Double = js.native
  var ratio: Double = js.native
  def getMaxTorque(): Double = js.native
  def setMaxTorque(torque: Double): Unit = js.native
}


package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RevoluteConstraint")
@js.native
class RevoluteConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double) = this()
  def this(bodyA: Body, bodyB: Body, `type`: scala.Double, options: RevoluteConstraintOptions) = this()
  var angle: scala.Double = js.native
  var lowerLimit: scala.Double = js.native
  var lowerLimitEnabled: scala.Boolean = js.native
  var motorEnabled: scala.Boolean = js.native
  var motorMaxForce: scala.Double = js.native
  var motorSpeed: scala.Double = js.native
  var upperLimit: scala.Double = js.native
  var upperLimitEnabled: scala.Boolean = js.native
  def disableMotor(): scala.Unit = js.native
  def enableMotor(): scala.Unit = js.native
  def getMotorSpeed(): scala.Double = js.native
  def motorIsEnabled(): scala.Boolean = js.native
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
  def setMotorSpeed(speed: scala.Double): scala.Unit = js.native
}


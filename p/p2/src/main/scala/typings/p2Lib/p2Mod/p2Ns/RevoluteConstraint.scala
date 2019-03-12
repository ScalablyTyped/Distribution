package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevoluteConstraint extends Constraint {
  var angle: scala.Double
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var motorEnabled: scala.Boolean
  var motorMaxForce: scala.Double
  var motorSpeed: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  def disableMotor(): scala.Unit
  def enableMotor(): scala.Unit
  def getMotorSpeed(): scala.Double
  def motorIsEnabled(): scala.Boolean
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit
  def setMotorSpeed(speed: scala.Double): scala.Unit
}

object RevoluteConstraint {
  @scala.inline
  def apply(
    angle: scala.Double,
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    disableMotor: () => scala.Unit,
    enableMotor: () => scala.Unit,
    equeations: js.Array[Equation],
    getMotorSpeed: () => scala.Double,
    lowerLimit: scala.Double,
    lowerLimitEnabled: scala.Boolean,
    motorEnabled: scala.Boolean,
    motorIsEnabled: () => scala.Boolean,
    motorMaxForce: scala.Double,
    motorSpeed: scala.Double,
    setLimits: (scala.Double, scala.Double) => scala.Unit,
    setMotorSpeed: scala.Double => scala.Unit,
    setRelaxation: scala.Double => scala.Unit,
    setStiffness: scala.Double => scala.Unit,
    `type`: scala.Double,
    update: () => scala.Unit,
    upperLimit: scala.Double,
    upperLimitEnabled: scala.Boolean
  ): RevoluteConstraint = {
    val __obj = js.Dynamic.literal(angle = angle, bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, disableMotor = js.Any.fromFunction0(disableMotor), enableMotor = js.Any.fromFunction0(enableMotor), equeations = equeations, getMotorSpeed = js.Any.fromFunction0(getMotorSpeed), lowerLimit = lowerLimit, lowerLimitEnabled = lowerLimitEnabled, motorEnabled = motorEnabled, motorIsEnabled = js.Any.fromFunction0(motorIsEnabled), motorMaxForce = motorMaxForce, motorSpeed = motorSpeed, setLimits = js.Any.fromFunction2(setLimits), setMotorSpeed = js.Any.fromFunction1(setMotorSpeed), setRelaxation = js.Any.fromFunction1(setRelaxation), setStiffness = js.Any.fromFunction1(setStiffness), update = js.Any.fromFunction0(update), upperLimit = upperLimit, upperLimitEnabled = upperLimitEnabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RevoluteConstraint]
  }
}


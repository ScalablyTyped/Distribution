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
    disableMotor: js.Function0[scala.Unit],
    enableMotor: js.Function0[scala.Unit],
    equeations: js.Array[Equation],
    getMotorSpeed: js.Function0[scala.Double],
    lowerLimit: scala.Double,
    lowerLimitEnabled: scala.Boolean,
    motorEnabled: scala.Boolean,
    motorIsEnabled: js.Function0[scala.Boolean],
    motorMaxForce: scala.Double,
    motorSpeed: scala.Double,
    setLimits: js.Function2[scala.Double, scala.Double, scala.Unit],
    setMotorSpeed: js.Function1[scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit],
    upperLimit: scala.Double,
    upperLimitEnabled: scala.Boolean
  ): RevoluteConstraint = {
    val __obj = js.Dynamic.literal(angle = angle, bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, disableMotor = disableMotor, enableMotor = enableMotor, equeations = equeations, getMotorSpeed = getMotorSpeed, lowerLimit = lowerLimit, lowerLimitEnabled = lowerLimitEnabled, motorEnabled = motorEnabled, motorIsEnabled = motorIsEnabled, motorMaxForce = motorMaxForce, motorSpeed = motorSpeed, setLimits = setLimits, setMotorSpeed = setMotorSpeed, setRelaxation = setRelaxation, setStiffness = setStiffness, update = update, upperLimit = upperLimit, upperLimitEnabled = upperLimitEnabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RevoluteConstraint]
  }
}


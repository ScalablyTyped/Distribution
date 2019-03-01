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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("disableMotor")(disableMotor)
    __obj.updateDynamic("enableMotor")(enableMotor)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("getMotorSpeed")(getMotorSpeed)
    __obj.updateDynamic("lowerLimit")(lowerLimit)
    __obj.updateDynamic("lowerLimitEnabled")(lowerLimitEnabled)
    __obj.updateDynamic("motorEnabled")(motorEnabled)
    __obj.updateDynamic("motorIsEnabled")(motorIsEnabled)
    __obj.updateDynamic("motorMaxForce")(motorMaxForce)
    __obj.updateDynamic("motorSpeed")(motorSpeed)
    __obj.updateDynamic("setLimits")(setLimits)
    __obj.updateDynamic("setMotorSpeed")(setMotorSpeed)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("upperLimit")(upperLimit)
    __obj.updateDynamic("upperLimitEnabled")(upperLimitEnabled)
    __obj.asInstanceOf[RevoluteConstraint]
  }
}


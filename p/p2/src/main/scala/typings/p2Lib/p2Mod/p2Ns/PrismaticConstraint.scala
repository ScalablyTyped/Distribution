package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismaticConstraint extends Constraint {
  var localAnchorA: js.Tuple2[scala.Double, scala.Double]
  var localAnchorB: js.Tuple2[scala.Double, scala.Double]
  var localAxisA: js.Tuple2[scala.Double, scala.Double]
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var lowerLimitEquation: ContactEquation
  var motorEnabled: scala.Boolean
  var motorEquation: Equation
  var motorSpeed: scala.Double
  var position: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  var upperLimitEquation: ContactEquation
  var velocity: scala.Double
  def disableMotor(): scala.Unit
  def enableMotor(): scala.Unit
  def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit
}

object PrismaticConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    disableMotor: () => scala.Unit,
    enableMotor: () => scala.Unit,
    equeations: js.Array[Equation],
    localAnchorA: js.Tuple2[scala.Double, scala.Double],
    localAnchorB: js.Tuple2[scala.Double, scala.Double],
    localAxisA: js.Tuple2[scala.Double, scala.Double],
    lowerLimit: scala.Double,
    lowerLimitEnabled: scala.Boolean,
    lowerLimitEquation: ContactEquation,
    motorEnabled: scala.Boolean,
    motorEquation: Equation,
    motorSpeed: scala.Double,
    position: scala.Double,
    setLimits: (scala.Double, scala.Double) => scala.Unit,
    setRelaxation: scala.Double => scala.Unit,
    setStiffness: scala.Double => scala.Unit,
    `type`: scala.Double,
    update: () => scala.Unit,
    upperLimit: scala.Double,
    upperLimitEnabled: scala.Boolean,
    upperLimitEquation: ContactEquation,
    velocity: scala.Double
  ): PrismaticConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, disableMotor = js.Any.fromFunction0(disableMotor), enableMotor = js.Any.fromFunction0(enableMotor), equeations = equeations, localAnchorA = localAnchorA, localAnchorB = localAnchorB, localAxisA = localAxisA, lowerLimit = lowerLimit, lowerLimitEnabled = lowerLimitEnabled, lowerLimitEquation = lowerLimitEquation, motorEnabled = motorEnabled, motorEquation = motorEquation, motorSpeed = motorSpeed, position = position, setLimits = js.Any.fromFunction2(setLimits), setRelaxation = js.Any.fromFunction1(setRelaxation), setStiffness = js.Any.fromFunction1(setStiffness), update = js.Any.fromFunction0(update), upperLimit = upperLimit, upperLimitEnabled = upperLimitEnabled, upperLimitEquation = upperLimitEquation, velocity = velocity)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PrismaticConstraint]
  }
}


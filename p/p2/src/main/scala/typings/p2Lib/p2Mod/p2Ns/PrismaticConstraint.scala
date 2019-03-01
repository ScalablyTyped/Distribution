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
    disableMotor: js.Function0[scala.Unit],
    enableMotor: js.Function0[scala.Unit],
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
    setLimits: js.Function2[scala.Double, scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit],
    upperLimit: scala.Double,
    upperLimitEnabled: scala.Boolean,
    upperLimitEquation: ContactEquation,
    velocity: scala.Double
  ): PrismaticConstraint = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("disableMotor")(disableMotor)
    __obj.updateDynamic("enableMotor")(enableMotor)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("localAnchorA")(localAnchorA)
    __obj.updateDynamic("localAnchorB")(localAnchorB)
    __obj.updateDynamic("localAxisA")(localAxisA)
    __obj.updateDynamic("lowerLimit")(lowerLimit)
    __obj.updateDynamic("lowerLimitEnabled")(lowerLimitEnabled)
    __obj.updateDynamic("lowerLimitEquation")(lowerLimitEquation)
    __obj.updateDynamic("motorEnabled")(motorEnabled)
    __obj.updateDynamic("motorEquation")(motorEquation)
    __obj.updateDynamic("motorSpeed")(motorSpeed)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("setLimits")(setLimits)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("upperLimit")(upperLimit)
    __obj.updateDynamic("upperLimitEnabled")(upperLimitEnabled)
    __obj.updateDynamic("upperLimitEquation")(upperLimitEquation)
    __obj.updateDynamic("velocity")(velocity)
    __obj.asInstanceOf[PrismaticConstraint]
  }
}


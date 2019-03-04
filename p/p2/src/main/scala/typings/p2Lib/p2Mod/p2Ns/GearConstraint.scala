package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GearConstraint extends Constraint {
  var angle: scala.Double
  var ratio: scala.Double
  def getMaxTorque(): scala.Double
  def setMaxTorque(torque: scala.Double): scala.Unit
}

object GearConstraint {
  @scala.inline
  def apply(
    angle: scala.Double,
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    equeations: js.Array[Equation],
    getMaxTorque: js.Function0[scala.Double],
    ratio: scala.Double,
    setMaxTorque: js.Function1[scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit]
  ): GearConstraint = {
    val __obj = js.Dynamic.literal(angle = angle, bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, equeations = equeations, getMaxTorque = getMaxTorque, ratio = ratio, setMaxTorque = setMaxTorque, setRelaxation = setRelaxation, setStiffness = setStiffness, update = update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GearConstraint]
  }
}


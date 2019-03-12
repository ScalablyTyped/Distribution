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
    getMaxTorque: () => scala.Double,
    ratio: scala.Double,
    setMaxTorque: scala.Double => scala.Unit,
    setRelaxation: scala.Double => scala.Unit,
    setStiffness: scala.Double => scala.Unit,
    `type`: scala.Double,
    update: () => scala.Unit
  ): GearConstraint = {
    val __obj = js.Dynamic.literal(angle = angle, bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, equeations = equeations, getMaxTorque = js.Any.fromFunction0(getMaxTorque), ratio = ratio, setMaxTorque = js.Any.fromFunction1(setMaxTorque), setRelaxation = js.Any.fromFunction1(setRelaxation), setStiffness = js.Any.fromFunction1(setStiffness), update = js.Any.fromFunction0(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GearConstraint]
  }
}


package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockConstraint extends Constraint {
  def getMaxForce(): scala.Double
  def setMaxForce(force: scala.Double): scala.Unit
}

object LockConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    equeations: js.Array[Equation],
    getMaxForce: () => scala.Double,
    setMaxForce: scala.Double => scala.Unit,
    setRelaxation: scala.Double => scala.Unit,
    setStiffness: scala.Double => scala.Unit,
    `type`: scala.Double,
    update: () => scala.Unit
  ): LockConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, equeations = equeations, getMaxForce = js.Any.fromFunction0(getMaxForce), setMaxForce = js.Any.fromFunction1(setMaxForce), setRelaxation = js.Any.fromFunction1(setRelaxation), setStiffness = js.Any.fromFunction1(setStiffness), update = js.Any.fromFunction0(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LockConstraint]
  }
}


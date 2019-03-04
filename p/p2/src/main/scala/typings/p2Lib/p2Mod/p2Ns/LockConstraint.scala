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
    getMaxForce: js.Function0[scala.Double],
    setMaxForce: js.Function1[scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit]
  ): LockConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, equeations = equeations, getMaxForce = getMaxForce, setMaxForce = setMaxForce, setRelaxation = setRelaxation, setStiffness = setStiffness, update = update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LockConstraint]
  }
}


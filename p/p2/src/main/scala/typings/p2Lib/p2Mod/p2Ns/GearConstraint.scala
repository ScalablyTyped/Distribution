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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("getMaxTorque")(getMaxTorque)
    __obj.updateDynamic("ratio")(ratio)
    __obj.updateDynamic("setMaxTorque")(setMaxTorque)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GearConstraint]
  }
}


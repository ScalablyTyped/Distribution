package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var collideConnected: scala.Boolean
  var equeations: js.Array[Equation]
  var `type`: scala.Double
  def setRelaxation(relaxation: scala.Double): scala.Unit
  def setStiffness(stiffness: scala.Double): scala.Unit
  def update(): scala.Unit
}

object Constraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    equeations: js.Array[Equation],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit]
  ): Constraint = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Constraint]
  }
}


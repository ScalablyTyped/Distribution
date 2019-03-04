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
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, equeations = equeations, setRelaxation = setRelaxation, setStiffness = setStiffness, update = update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Constraint]
  }
}


package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spring extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var damping: scala.Double
  var stiffness: scala.Double
  def applyForce(): scala.Unit
}

object Spring {
  @scala.inline
  def apply(
    applyForce: js.Function0[scala.Unit],
    bodyA: Body,
    bodyB: Body,
    damping: scala.Double,
    stiffness: scala.Double
  ): Spring = {
    val __obj = js.Dynamic.literal(applyForce = applyForce, bodyA = bodyA, bodyB = bodyB, damping = damping, stiffness = stiffness)
  
    __obj.asInstanceOf[Spring]
  }
}


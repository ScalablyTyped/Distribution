package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationalSpring extends Spring {
  var restAngle: scala.Double
}

object RotationalSpring {
  @scala.inline
  def apply(
    applyForce: () => scala.Unit,
    bodyA: Body,
    bodyB: Body,
    damping: scala.Double,
    restAngle: scala.Double,
    stiffness: scala.Double
  ): RotationalSpring = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction0(applyForce), bodyA = bodyA, bodyB = bodyB, damping = damping, restAngle = restAngle, stiffness = stiffness)
  
    __obj.asInstanceOf[RotationalSpring]
  }
}


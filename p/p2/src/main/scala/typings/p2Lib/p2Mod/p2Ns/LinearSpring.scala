package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearSpring extends Spring {
  var localAnchorA: js.Tuple2[scala.Double, scala.Double]
  var localAnchorB: js.Tuple2[scala.Double, scala.Double]
  var restLength: scala.Double
  def getWorldAnchorA(result: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double]
  def getWorldAnchorB(result: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double]
  def setWorldAnchorA(worldAnchorA: js.Tuple2[scala.Double, scala.Double]): scala.Unit
  def setWorldAnchorB(worldAnchorB: js.Tuple2[scala.Double, scala.Double]): scala.Unit
}

object LinearSpring {
  @scala.inline
  def apply(
    applyForce: js.Function0[scala.Unit],
    bodyA: Body,
    bodyB: Body,
    damping: scala.Double,
    getWorldAnchorA: js.Function1[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]],
    getWorldAnchorB: js.Function1[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]],
    localAnchorA: js.Tuple2[scala.Double, scala.Double],
    localAnchorB: js.Tuple2[scala.Double, scala.Double],
    restLength: scala.Double,
    setWorldAnchorA: js.Function1[js.Tuple2[scala.Double, scala.Double], scala.Unit],
    setWorldAnchorB: js.Function1[js.Tuple2[scala.Double, scala.Double], scala.Unit],
    stiffness: scala.Double
  ): LinearSpring = {
    val __obj = js.Dynamic.literal(applyForce = applyForce, bodyA = bodyA, bodyB = bodyB, damping = damping, getWorldAnchorA = getWorldAnchorA, getWorldAnchorB = getWorldAnchorB, localAnchorA = localAnchorA, localAnchorB = localAnchorB, restLength = restLength, setWorldAnchorA = setWorldAnchorA, setWorldAnchorB = setWorldAnchorB, stiffness = stiffness)
  
    __obj.asInstanceOf[LinearSpring]
  }
}


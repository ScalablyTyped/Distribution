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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyForce")(applyForce)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("damping")(damping)
    __obj.updateDynamic("getWorldAnchorA")(getWorldAnchorA)
    __obj.updateDynamic("getWorldAnchorB")(getWorldAnchorB)
    __obj.updateDynamic("localAnchorA")(localAnchorA)
    __obj.updateDynamic("localAnchorB")(localAnchorB)
    __obj.updateDynamic("restLength")(restLength)
    __obj.updateDynamic("setWorldAnchorA")(setWorldAnchorA)
    __obj.updateDynamic("setWorldAnchorB")(setWorldAnchorB)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.asInstanceOf[LinearSpring]
  }
}


package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LinearSpring")
@js.native
class LinearSpring ()
  extends p2Lib.p2Mod.p2Ns.LinearSpring {
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var damping: scala.Double = js.native
  /* CompleteClass */
  override var localAnchorA: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var localAnchorB: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var restLength: scala.Double = js.native
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /* CompleteClass */
  override def applyForce(): scala.Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorA(result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getWorldAnchorB(result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: js.Array[scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: js.Array[scala.Double]): scala.Unit = js.native
}


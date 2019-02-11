package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LinearSpring")
@js.native
class LinearSpring protected ()
  extends p2Lib.p2Mod.p2Ns.LinearSpring {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, options: p2Lib.p2Mod.p2Ns.LinearSpringOptions) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var damping: scala.Double = js.native
  /* CompleteClass */
  override var localAnchorA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var localAnchorB: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var restLength: scala.Double = js.native
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /* CompleteClass */
  override def applyForce(): scala.Unit = js.native
  /* CompleteClass */
  override def getWorldAnchorA(result: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override def getWorldAnchorB(result: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override def setWorldAnchorA(worldAnchorA: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def setWorldAnchorB(worldAnchorB: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
}


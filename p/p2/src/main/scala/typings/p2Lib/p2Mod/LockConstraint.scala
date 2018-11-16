package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "LockConstraint")
@js.native
class LockConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.LockConstraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, options: p2Lib.Anon_LocalAngleB) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def getMaxForce(): scala.Double = js.native
  /* CompleteClass */
  override def setMaxForce(force: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


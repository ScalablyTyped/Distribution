package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "GearConstraint")
@js.native
class GearConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.GearConstraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, options: p2Lib.Anon_Angle) = this()
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var ratio: scala.Double = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override def getMaxTorque(): scala.Double = js.native
  /* CompleteClass */
  override def setMaxTorque(torque: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


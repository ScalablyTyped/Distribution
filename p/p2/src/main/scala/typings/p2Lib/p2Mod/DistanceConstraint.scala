package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "DistanceConstraint")
@js.native
class DistanceConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.DistanceConstraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double, options: p2Lib.p2Mod.p2Ns.DistanceConstraintOptions) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var distance: scala.Double = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var localAnchorA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var localAnchorB: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var lowerLimit: scala.Double = js.native
  /* CompleteClass */
  override var lowerLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var maxForce: scala.Double = js.native
  /* CompleteClass */
  override var position: scala.Double = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var upperLimit: scala.Double = js.native
  /* CompleteClass */
  override var upperLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override def getMaxForce(): scala.Double = js.native
  /* CompleteClass */
  override def setMaxForce(maxForce: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


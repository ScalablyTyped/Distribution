package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "PrismaticConstraint")
@js.native
class PrismaticConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.PrismaticConstraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, options: p2Lib.p2Mod.p2Ns.PrismaticConstraintOptions) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var localAnchorA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var localAnchorB: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var localAxisA: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var lowerLimit: scala.Double = js.native
  /* CompleteClass */
  override var lowerLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var lowerLimitEquation: p2Lib.p2Mod.p2Ns.ContactEquation = js.native
  /* CompleteClass */
  override var motorEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var motorEquation: p2Lib.p2Mod.p2Ns.Equation = js.native
  /* CompleteClass */
  override var motorSpeed: scala.Double = js.native
  /* CompleteClass */
  override var position: scala.Double = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var upperLimit: scala.Double = js.native
  /* CompleteClass */
  override var upperLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var upperLimitEquation: p2Lib.p2Mod.p2Ns.ContactEquation = js.native
  /* CompleteClass */
  override var velocity: scala.Double = js.native
  /* CompleteClass */
  override def disableMotor(): scala.Unit = js.native
  /* CompleteClass */
  override def enableMotor(): scala.Unit = js.native
  /* CompleteClass */
  override def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


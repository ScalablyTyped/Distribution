package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RevoluteConstraint")
@js.native
class RevoluteConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.RevoluteConstraint {
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double) = this()
  def this(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body, `type`: scala.Double, options: p2Lib.p2Mod.p2Ns.RevoluteConstraintOptions) = this()
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
  override var lowerLimit: scala.Double = js.native
  /* CompleteClass */
  override var lowerLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var motorEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var motorMaxForce: scala.Double = js.native
  /* CompleteClass */
  override var motorSpeed: scala.Double = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var upperLimit: scala.Double = js.native
  /* CompleteClass */
  override var upperLimitEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override def disableMotor(): scala.Unit = js.native
  /* CompleteClass */
  override def enableMotor(): scala.Unit = js.native
  /* CompleteClass */
  override def getMotorSpeed(): scala.Double = js.native
  /* CompleteClass */
  override def motorIsEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def setLimits(lower: scala.Double, upper: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setMotorSpeed(speed: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


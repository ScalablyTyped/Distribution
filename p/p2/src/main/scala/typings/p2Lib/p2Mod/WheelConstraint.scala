package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "WheelConstraint")
@js.native
class WheelConstraint protected ()
  extends p2Lib.p2Mod.p2Ns.WheelConstraint {
  def this(vehicle: p2Lib.p2Mod.p2Ns.TopDownVehicle) = this()
  def this(vehicle: p2Lib.p2Mod.p2Ns.TopDownVehicle, options: p2Lib.p2Mod.p2Ns.WheelConstraintOptions) = this()
  /* CompleteClass */
  override var bodyA: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var bodyB: p2Lib.p2Mod.p2Ns.Body = js.native
  /* CompleteClass */
  override var collideConnected: scala.Boolean = js.native
  /* CompleteClass */
  override var engineForce: scala.Double = js.native
  /* CompleteClass */
  override var equeations: js.Array[p2Lib.p2Mod.p2Ns.Equation] = js.native
  /* CompleteClass */
  override var forwardEquation: p2Lib.p2Mod.p2Ns.FrictionEquation = js.native
  /* CompleteClass */
  override var localForwardVector: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var localPosition: js.Tuple2[scala.Double, scala.Double] = js.native
  /* CompleteClass */
  override var sideEquation: p2Lib.p2Mod.p2Ns.FrictionEquation = js.native
  /* CompleteClass */
  override var steerValue: scala.Double = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var vehicle: p2Lib.p2Mod.p2Ns.TopDownVehicle = js.native
  /* CompleteClass */
  override def getSpeed(): scala.Double = js.native
  /* CompleteClass */
  override def setBrakeForce(force: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setRelaxation(relaxation: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setSideFriction(force: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def setStiffness(stiffness: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}


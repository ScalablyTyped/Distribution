package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Scene")
@js.native
class Scene ()
  extends threeLib.threeMod.Scene {
  def this(param: SceneParameters) = this()
  def add(`object`: threeLib.threeMod.Object3D): this.type = js.native
  def addConstraint(constraint: Constraint): scala.Unit = js.native
  def addConstraint(constraint: Constraint, show_marker: scala.Boolean): scala.Unit = js.native
  def dispatchEvent(event_name: java.lang.String): scala.Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: physijsLib.Anon_Target): scala.Unit = js.native
  def execute(cmd: java.lang.String, params: js.Any): scala.Unit = js.native
  def onSimulationResume(): scala.Unit = js.native
  def remove(`object`: threeLib.threeMod.Object3D): this.type = js.native
  def removeConstraint(constraint: Constraint): scala.Unit = js.native
  def setFixedTimeStep(fixedTimeStep: scala.Double): scala.Unit = js.native
  def setGravity(gravity: threeLib.threeMod.Vector3): scala.Unit = js.native
  def simulate(): scala.Boolean = js.native
  def simulate(timeStep: scala.Double): scala.Boolean = js.native
  def simulate(timeStep: scala.Double, maxSubSteps: scala.Double): scala.Boolean = js.native
}


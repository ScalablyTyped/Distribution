package typings.physijs.Physijs

import typings.physijs.Anon_Target
import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Scene")
@js.native
class Scene ()
  extends typings.three.threeMod.Scene {
  def this(param: SceneParameters) = this()
  def add(`object`: Object3D): this.type = js.native
  def addConstraint(constraint: Constraint): Unit = js.native
  def addConstraint(constraint: Constraint, show_marker: Boolean): Unit = js.native
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: Anon_Target): Unit = js.native
  def execute(cmd: String, params: js.Any): Unit = js.native
  def onSimulationResume(): Unit = js.native
  def remove(`object`: Object3D): this.type = js.native
  def removeConstraint(constraint: Constraint): Unit = js.native
  def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
  def setGravity(gravity: Vector3): Unit = js.native
  def simulate(): Boolean = js.native
  def simulate(timeStep: Double): Boolean = js.native
  def simulate(timeStep: Double, maxSubSteps: Double): Boolean = js.native
}


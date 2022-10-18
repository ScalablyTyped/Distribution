package typings.physijs.mod

import typings.physijs.anon.Target
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "Scene")
@js.native
open class Scene ()
  extends typings.three.mod.Scene {
  def this(param: SceneParameters) = this()
  
  def add(`object`: Object3D[Event]): this.type = js.native
  
  def addConstraint(constraint: Constraint): Unit = js.native
  def addConstraint(constraint: Constraint, show_marker: Boolean): Unit = js.native
  
  // Eventable mixins
  def addEventListener(event_name: String, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: Target): Unit = js.native
  
  def execute(cmd: String, params: Any): Unit = js.native
  
  def onSimulationResume(): Unit = js.native
  
  def remove(`object`: Object3D[Event]): this.type = js.native
  
  def removeConstraint(constraint: Constraint): Unit = js.native
  
  def removeEventListener(event_name: String, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
  
  def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
  
  def setGravity(gravity: Vector3): Unit = js.native
  
  def simulate(): Boolean = js.native
  def simulate(timeStep: Double): Boolean = js.native
  def simulate(timeStep: Double, maxSubSteps: Double): Boolean = js.native
  def simulate(timeStep: Unit, maxSubSteps: Double): Boolean = js.native
}

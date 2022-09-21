package typings.physijs.mod

import typings.three.eventDispatcherMod.Event
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "DOFConstraint")
@js.native
open class DOFConstraint protected ()
  extends StObject
     with Constraint {
  def this(objecta: Object3D[Event], objectb: Object3D[Event]) = this()
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3) = this()
  
  def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
  
  def disableAngularMotor(which: Double): Unit = js.native
  
  def enableAngularMotor(which: Double): Unit = js.native
  
  /* CompleteClass */
  override def getDefinition(): Any = js.native
  
  def setAngularLowerLimit(limit: Vector3): Unit = js.native
  
  def setAngularUpperLimit(limit: Vector3): Unit = js.native
  
  def setLinearLowerLimit(limit: Vector3): Unit = js.native
  
  def setLinearUpperLimit(limit: Vector3): Unit = js.native
}

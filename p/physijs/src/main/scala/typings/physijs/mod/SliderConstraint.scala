package typings.physijs.mod

import typings.three.mod.Object3D
import typings.three.mod.Vector3
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "SliderConstraint")
@js.native
open class SliderConstraint protected ()
  extends StObject
     with Constraint {
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3) = this()
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3, axis: Vector3) = this()
  
  def disableAngularMotor(): Unit = js.native
  
  def disableLinearMotor(): Unit = js.native
  
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  /* CompleteClass */
  override def getDefinition(): Any = js.native
  
  def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
  
  def setRestitution(linear: Double, angular: Double): Unit = js.native
}

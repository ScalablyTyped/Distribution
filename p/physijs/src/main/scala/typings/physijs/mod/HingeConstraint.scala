package typings.physijs.mod

import typings.three.mod.Object3D
import typings.three.mod.Vector3
import typings.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "HingeConstraint")
@js.native
open class HingeConstraint protected ()
  extends StObject
     with Constraint {
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3) = this()
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3, axis: Vector3) = this()
  
  def disableMotor(): Unit = js.native
  
  def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
  
  /* CompleteClass */
  override def getDefinition(): Any = js.native
  
  def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit = js.native
}

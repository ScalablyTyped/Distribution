package typings.physijs.mod

import typings.three.eventDispatcherMod.Event
import typings.three.mod.Euler
import typings.three.mod.Matrix4
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "ConeTwistConstraint")
@js.native
open class ConeTwistConstraint protected ()
  extends StObject
     with Constraint {
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3) = this()
  
  def disableMotor(): Unit = js.native
  
  def enableMotor(): Unit = js.native
  
  /* CompleteClass */
  override def getDefinition(): Any = js.native
  
  def setLimit(x: Double, y: Double, z: Double): Unit = js.native
  
  def setMaxMotorImpulse(max_impulse: Double): Unit = js.native
  
  def setMotorTarget(target: Euler): Unit = js.native
  def setMotorTarget(target: Matrix4): Unit = js.native
  def setMotorTarget(target: Vector3): Unit = js.native
}

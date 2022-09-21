package typings.physijs.mod

import typings.three.eventDispatcherMod.Event
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("physijs", "PointConstraint")
@js.native
open class PointConstraint protected ()
  extends StObject
     with Constraint {
  def this(objecta: Object3D[Event], objectb: Object3D[Event]) = this()
  def this(objecta: Object3D[Event], objectb: Object3D[Event], position: Vector3) = this()
  
  /* CompleteClass */
  override def getDefinition(): Any = js.native
}

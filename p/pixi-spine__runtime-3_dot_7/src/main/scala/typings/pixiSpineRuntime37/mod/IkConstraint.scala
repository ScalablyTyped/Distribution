package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "IkConstraint")
@js.native
open class IkConstraint protected ()
  extends StObject
     with Constraint {
  def this(data: IkConstraintData, skeleton: Skeleton) = this()
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  /** Adjusts the bone rotation so the tip is as close to the target position as possible. The target is specified in the world
    * coordinate system. */
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  
  /** Adjusts the parent and child bone rotations so the tip of the child is as close to the target position as possible. The
    * target is specified in the world coordinate system.
    * @param child A direct descendant of the parent bone. */
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    alpha: Double
  ): Unit = js.native
  
  var bendDirection: Double = js.native
  
  var bones: js.Array[Bone] = js.native
  
  var compress: Boolean = js.native
  
  var data: IkConstraintData = js.native
  
  /* CompleteClass */
  override def getOrder(): Double = js.native
  
  var mix: Double = js.native
  
  var stretch: Boolean = js.native
  
  var target: Bone = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}

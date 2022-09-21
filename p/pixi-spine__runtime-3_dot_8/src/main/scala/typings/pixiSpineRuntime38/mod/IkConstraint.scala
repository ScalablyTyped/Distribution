package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.IIkConstraint
import typings.pixiSpineBase.mod.IIkConstraintData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "IkConstraint")
@js.native
open class IkConstraint protected ()
  extends StObject
     with IIkConstraint
     with Updatable {
  def this(data: IkConstraintData, skeleton: Skeleton) = this()
  
  var active: Boolean = js.native
  
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
    softness: Double,
    alpha: Double
  ): Unit = js.native
  
  /** -1 | 0 | 1 */
  /* CompleteClass */
  var bendDirection: Double = js.native
  
  var bones: js.Array[Bone] = js.native
  
  /* CompleteClass */
  var compress: Boolean = js.native
  
  /* CompleteClass */
  var data: IIkConstraintData = js.native
  @JSName("data")
  var data_IkConstraint: IkConstraintData = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /** A percentage (0-1) */
  /* CompleteClass */
  var mix: Double = js.native
  
  var softness: Double = js.native
  
  /* CompleteClass */
  var stretch: Boolean = js.native
  
  var target: Bone = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}

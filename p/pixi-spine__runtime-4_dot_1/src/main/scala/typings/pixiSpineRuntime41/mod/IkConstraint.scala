package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "IkConstraint")
@js.native
open class IkConstraint protected ()
  extends StObject
     with Updatable {
  def this(data: IkConstraintData, skeleton: Skeleton) = this()
  
  var active: Boolean = js.native
  
  /** Applies 1 bone IK. The target is specified in the world coordinate system. */
  def apply1(
    bone: Bone,
    targetX: Double,
    targetY: Double,
    compress: Boolean,
    stretch: Boolean,
    uniform: Boolean,
    alpha: Double
  ): Unit = js.native
  
  /** Applies 2 bone IK. The target is specified in the world coordinate system.
    * @param child A direct descendant of the parent bone. */
  def apply2(
    parent: Bone,
    child: Bone,
    targetX: Double,
    targetY: Double,
    bendDir: Double,
    stretch: Boolean,
    uniform: Boolean,
    softness: Double,
    alpha: Double
  ): Unit = js.native
  
  /** Controls the bend direction of the IK bones, either 1 or -1. */
  var bendDirection: Double = js.native
  
  /** The bones that will be modified by this IK constraint. */
  var bones: js.Array[Bone] = js.native
  
  /** When true and only a single bone is being constrained, if the target is too close, the bone is scaled to reach it. */
  var compress: Boolean = js.native
  
  /** The IK constraint's setup pose data. */
  var data: IkConstraintData = js.native
  
  /** Returns false when this item has not been updated because a skin is required and the {@link Skeleton#skin active skin}
    * does not contain this item.
    * @see Skin#getBones()
    * @see Skin#getConstraints() */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /** A percentage (0-1) that controls the mix between the constrained and unconstrained rotations. */
  var mix: Double = js.native
  
  /** For two bone IK, the distance from the maximum reach of the bones that rotation will slow. */
  var softness: Double = js.native
  
  /** When true, if the target is out of range, the parent bone is scaled to reach it. If more than one bone is being constrained
    * and the parent bone has local nonuniform scale, stretch is not applied. */
  var stretch: Boolean = js.native
  
  /** The bone that is the IK target. */
  var target: Bone = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}

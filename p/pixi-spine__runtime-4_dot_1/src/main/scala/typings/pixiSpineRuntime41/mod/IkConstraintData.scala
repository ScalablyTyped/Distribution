package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "IkConstraintData")
@js.native
open class IkConstraintData protected () extends ConstraintData {
  def this(name: String) = this()
  
  /** The bone that is the IK target. */
  /* private */ var _target: Any = js.native
  
  /** Controls the bend direction of the IK bones, either 1 or -1. */
  var bendDirection: Double = js.native
  
  /** The bones that are constrained by this IK constraint. */
  var bones: js.Array[BoneData] = js.native
  
  /** When true and only a single bone is being constrained, if the target is too close, the bone is scaled to reach it. */
  var compress: Boolean = js.native
  
  /** A percentage (0-1) that controls the mix between the constrained and unconstrained rotations. */
  var mix: Double = js.native
  
  /** For two bone IK, the distance from the maximum reach of the bones that rotation will slow. */
  var softness: Double = js.native
  
  /** When true, if the target is out of range, the parent bone is scaled to reach it. If more than one bone is being constrained
    * and the parent bone has local nonuniform scale, stretch is not applied. */
  var stretch: Boolean = js.native
  
  def target: BoneData = js.native
  def target_=(boneData: BoneData): Unit = js.native
  
  /** When true, only a single bone is being constrained, and {@link #getCompress()} or {@link #getStretch()} is used, the bone
    * is scaled on both the X and Y axes. */
  var uniform: Boolean = js.native
}

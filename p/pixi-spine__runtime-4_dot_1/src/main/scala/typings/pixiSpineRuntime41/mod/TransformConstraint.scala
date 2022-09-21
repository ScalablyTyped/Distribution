package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "TransformConstraint")
@js.native
open class TransformConstraint protected ()
  extends StObject
     with Updatable {
  def this(data: TransformConstraintData, skeleton: Skeleton) = this()
  
  var active: Boolean = js.native
  
  def applyAbsoluteLocal(): Unit = js.native
  
  def applyAbsoluteWorld(): Unit = js.native
  
  def applyRelativeLocal(): Unit = js.native
  
  def applyRelativeWorld(): Unit = js.native
  
  /** The bones that will be modified by this transform constraint. */
  var bones: js.Array[Bone] = js.native
  
  /** The transform constraint's setup pose data. */
  var data: TransformConstraintData = js.native
  
  /** Returns false when this item has not been updated because a skin is required and the {@link Skeleton#skin active skin}
    * does not contain this item.
    * @see Skin#getBones()
    * @see Skin#getConstraints() */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  var mixRotate: Double = js.native
  
  var mixScaleX: Double = js.native
  
  var mixScaleY: Double = js.native
  
  var mixShearY: Double = js.native
  
  var mixX: Double = js.native
  
  var mixY: Double = js.native
  
  /** The target bone whose world transform will be copied to the constrained bones. */
  var target: Bone = js.native
  
  var temp: Vector2 = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}

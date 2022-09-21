package typings.pixiSpineRuntime41.mod

import typings.pixiMath.mod.Matrix
import typings.pixiSpineBase.anon.Name
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Bone")
@js.native
open class Bone protected ()
  extends StObject
     with Updatable
     with IBone {
  /** @param parent May be null. */
  def this(data: BoneData, skeleton: Skeleton) = this()
  def this(data: BoneData, skeleton: Skeleton, parent: Bone) = this()
  
  var active: Boolean = js.native
  
  /** The applied local rotation in degrees, counter clockwise. */
  var arotation: Double = js.native
  
  /** The applied local scaleX. */
  var ascaleX: Double = js.native
  
  /** The applied local scaleY. */
  var ascaleY: Double = js.native
  
  /** The applied local shearX. */
  var ashearX: Double = js.native
  
  /** The applied local shearY. */
  var ashearY: Double = js.native
  
  /** The applied local x translation. */
  var ax: Double = js.native
  
  /** The applied local y translation. */
  var ay: Double = js.native
  
  /** The immediate children of this bone. */
  var children: js.Array[Bone] = js.native
  
  /* CompleteClass */
  var data: Name = js.native
  /** The bone's setup pose data. */
  @JSName("data")
  var data_Bone: BoneData = js.native
  
  /** The world rotation for the X axis, calculated using {@link #a} and {@link #c}. */
  def getWorldRotationX(): Double = js.native
  
  /** The world rotation for the Y axis, calculated using {@link #b} and {@link #d}. */
  def getWorldRotationY(): Double = js.native
  
  /** The magnitude (always positive) of the world scale X, calculated using {@link #a} and {@link #c}. */
  def getWorldScaleX(): Double = js.native
  
  /** The magnitude (always positive) of the world scale Y, calculated using {@link #b} and {@link #d}. */
  def getWorldScaleY(): Double = js.native
  
  /** Returns false when this item has not been updated because a skin is required and the {@link Skeleton#skin active skin}
    * does not contain this item.
    * @see Skin#getBones()
    * @see Skin#getConstraints() */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /** Transforms a point from the bone's local coordinates to world coordinates. */
  def localToWorld(local: Vector2): Vector2 = js.native
  
  /** Transforms a local rotation to a world rotation. */
  def localToWorldRotation(localRotation: Double): Double = js.native
  
  /* CompleteClass */
  var matrix: Matrix = js.native
  
  /** The parent bone, or null if this is the root bone. */
  var parent: Bone | Null = js.native
  
  /** Rotates the world transform the specified amount.
    * <p>
    * After changes are made to the world transform, {@link #updateAppliedTransform()} should be called and {@link #update()} will
    * need to be called on any child bones, recursively. */
  def rotateWorld(degrees: Double): Unit = js.native
  
  /** The local rotation in degrees, counter clockwise. */
  var rotation: Double = js.native
  
  /** The local scaleX. */
  var scaleX: Double = js.native
  
  /** The local scaleY. */
  var scaleY: Double = js.native
  
  /** Sets this bone's local transform to the setup pose. */
  def setToSetupPose(): Unit = js.native
  
  /** The local shearX. */
  var shearX: Double = js.native
  
  /** The local shearY. */
  var shearY: Double = js.native
  
  /** The skeleton this bone belongs to. */
  var skeleton: Skeleton = js.native
  
  var sorted: Boolean = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /** Computes the applied transform values from the world transform.
    *
    * If the world transform is modified (by a constraint, {@link #rotateWorld(float)}, etc) then this method should be called so
    * the applied transform matches the world transform. The applied transform may be needed by other code (eg to apply other
    * constraints).
    *
    * Some information is ambiguous in the world transform, such as -1,-1 scale versus 180 rotation. The applied transform after
    * calling this method is equivalent to the local transform used to compute the world transform, but may not be identical. */
  def updateAppliedTransform(): Unit = js.native
  
  /** Computes the world transform using the parent bone and this bone's local transform.
    *
    * See {@link #updateWorldTransformWith()}. */
  def updateWorldTransform(): Unit = js.native
  
  /** Computes the world transform using the parent bone and the specified local transform. The applied transform is set to the
    * specified local transform. Child bones are not updated.
    *
    * See [World transforms](http://esotericsoftware.com/spine-runtime-skeletons#World-transforms) in the Spine
    * Runtimes Guide. */
  def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  
  /** Transforms a point from world coordinates to the bone's local coordinates. */
  def worldToLocal(world: Vector2): Vector2 = js.native
  
  /** Transforms a world rotation to a local rotation. */
  def worldToLocalRotation(worldRotation: Double): Double = js.native
  
  def worldX: Double = js.native
  
  def worldY: Double = js.native
  
  /** The local x translation. */
  var x: Double = js.native
  
  /** The local y translation. */
  var y: Double = js.native
}

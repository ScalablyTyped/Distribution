package typings.pixiSpineRuntime38.mod

import typings.pixiMath.mod.Matrix
import typings.pixiSpineBase.anon.Name
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "Bone")
@js.native
open class Bone protected ()
  extends StObject
     with Updatable
     with IBone {
  /** @param parent May be null. */
  def this(data: BoneData, skeleton: Skeleton, parent: Bone) = this()
  
  var active: Boolean = js.native
  
  var appliedValid: Boolean = js.native
  
  var arotation: Double = js.native
  
  var ascaleX: Double = js.native
  
  var ascaleY: Double = js.native
  
  var ashearX: Double = js.native
  
  var ashearY: Double = js.native
  
  var ax: Double = js.native
  
  var ay: Double = js.native
  
  var children: js.Array[Bone] = js.native
  
  /* CompleteClass */
  var data: Name = js.native
  @JSName("data")
  var data_Bone: BoneData = js.native
  
  def getWorldRotationX(): Double = js.native
  
  def getWorldRotationY(): Double = js.native
  
  def getWorldScaleX(): Double = js.native
  
  def getWorldScaleY(): Double = js.native
  
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  def localToWorld(local: Vector2): Vector2 = js.native
  
  def localToWorldRotation(localRotation: Double): Double = js.native
  
  /* CompleteClass */
  var matrix: Matrix = js.native
  
  var parent: Bone = js.native
  
  def rotateWorld(degrees: Double): Unit = js.native
  
  var rotation: Double = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  def setToSetupPose(): Unit = js.native
  
  var shearX: Double = js.native
  
  var shearY: Double = js.native
  
  var skeleton: Skeleton = js.native
  
  var sorted: Boolean = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /** Computes the individual applied transform values from the world transform. This can be useful to perform processing using
    * the applied transform after the world transform has been modified directly (eg, by a constraint).
    * <p>
    * Some information is ambiguous in the world transform, such as -1,-1 scale versus 180 rotation. */
  def updateAppliedTransform(): Unit = js.native
  
  /** Computes the world transform using the parent bone and this bone's local transform. */
  def updateWorldTransform(): Unit = js.native
  
  /** Computes the world transform using the parent bone and the specified local transform. */
  def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  
  def worldToLocal(world: Vector2): Vector2 = js.native
  
  def worldToLocalRotation(worldRotation: Double): Double = js.native
  
  def worldX: Double = js.native
  
  def worldY: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}

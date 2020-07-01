package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bone extends Updatable {
  var active: Boolean
  var appliedValid: Boolean
  var arotation: Double
  var ascaleX: Double
  var ascaleY: Double
  var ashearX: Double
  var ashearY: Double
  var ax: Double
  var ay: Double
  var children: js.Array[Bone]
  var data: BoneData
  var matrix: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Matrix */ js.Any
  var parent: Bone
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var shearX: Double
  var shearY: Double
  var skeleton: Skeleton
  var sorted: Boolean
  var x: Double
  var y: Double
  def getWorldRotationX(): Double
  def getWorldRotationY(): Double
  def getWorldScaleX(): Double
  def getWorldScaleY(): Double
  def localToWorld(local: Vector2): Vector2
  def localToWorldRotation(localRotation: Double): Double
  def rotateWorld(degrees: Double): Unit
  def setToSetupPose(): Unit
  def updateAppliedTransform(): Unit
  def updateWorldTransform(): Unit
  def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit
  def worldToLocal(world: Vector2): Vector2
  def worldToLocalRotation(worldRotation: Double): Double
  def worldX: Double
  def worldY: Double
}

object Bone {
  @scala.inline
  def apply(
    active: Boolean,
    appliedValid: Boolean,
    arotation: Double,
    ascaleX: Double,
    ascaleY: Double,
    ashearX: Double,
    ashearY: Double,
    ax: Double,
    ay: Double,
    children: js.Array[Bone],
    data: BoneData,
    getWorldRotationX: () => Double,
    getWorldRotationY: () => Double,
    getWorldScaleX: () => Double,
    getWorldScaleY: () => Double,
    isActive: () => Boolean,
    localToWorld: Vector2 => Vector2,
    localToWorldRotation: Double => Double,
    matrix: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Matrix */ js.Any,
    parent: Bone,
    rotateWorld: Double => Unit,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    setToSetupPose: () => Unit,
    shearX: Double,
    shearY: Double,
    skeleton: Skeleton,
    sorted: Boolean,
    update: () => Unit,
    updateAppliedTransform: () => Unit,
    updateWorldTransform: () => Unit,
    updateWorldTransformWith: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    worldToLocal: Vector2 => Vector2,
    worldToLocalRotation: Double => Double,
    worldX: () => Double,
    worldY: () => Double,
    x: Double,
    y: Double
  ): Bone = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], appliedValid = appliedValid.asInstanceOf[js.Any], arotation = arotation.asInstanceOf[js.Any], ascaleX = ascaleX.asInstanceOf[js.Any], ascaleY = ascaleY.asInstanceOf[js.Any], ashearX = ashearX.asInstanceOf[js.Any], ashearY = ashearY.asInstanceOf[js.Any], ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getWorldRotationX = js.Any.fromFunction0(getWorldRotationX), getWorldRotationY = js.Any.fromFunction0(getWorldRotationY), getWorldScaleX = js.Any.fromFunction0(getWorldScaleX), getWorldScaleY = js.Any.fromFunction0(getWorldScaleY), isActive = js.Any.fromFunction0(isActive), localToWorld = js.Any.fromFunction1(localToWorld), localToWorldRotation = js.Any.fromFunction1(localToWorldRotation), matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotateWorld = js.Any.fromFunction1(rotateWorld), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setToSetupPose = js.Any.fromFunction0(setToSetupPose), shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), updateAppliedTransform = js.Any.fromFunction0(updateAppliedTransform), updateWorldTransform = js.Any.fromFunction0(updateWorldTransform), updateWorldTransformWith = js.Any.fromFunction7(updateWorldTransformWith), worldToLocal = js.Any.fromFunction1(worldToLocal), worldToLocalRotation = js.Any.fromFunction1(worldToLocalRotation), worldX = js.Any.fromFunction0(worldX), worldY = js.Any.fromFunction0(worldY), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bone]
  }
}


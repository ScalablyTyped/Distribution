package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bone
  extends StObject
     with Updatable {
  
  var a: Double
  
  var active: Boolean
  
  var appliedValid: Boolean
  
  var arotation: Double
  
  var ascaleX: Double
  
  var ascaleY: Double
  
  var ashearX: Double
  
  var ashearY: Double
  
  var ax: Double
  
  var ay: Double
  
  var b: Double
  
  var c: Double
  
  var children: js.Array[Bone]
  
  var d: Double
  
  var data: BoneData
  
  def getWorldRotationX(): Double
  
  def getWorldRotationY(): Double
  
  def getWorldScaleX(): Double
  
  def getWorldScaleY(): Double
  
  def localToWorld(local: Vector2): Vector2
  
  def localToWorldRotation(localRotation: Double): Double
  
  var parent: Bone
  
  def rotateWorld(degrees: Double): Unit
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  def setToSetupPose(): Unit
  
  var shearX: Double
  
  var shearY: Double
  
  var skeleton: Skeleton
  
  var sorted: Boolean
  
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
  
  var worldX: Double
  
  var worldY: Double
  
  var x: Double
  
  var y: Double
}
object Bone {
  
  @scala.inline
  def apply(
    a: Double,
    active: Boolean,
    appliedValid: Boolean,
    arotation: Double,
    ascaleX: Double,
    ascaleY: Double,
    ashearX: Double,
    ashearY: Double,
    ax: Double,
    ay: Double,
    b: Double,
    c: Double,
    children: js.Array[Bone],
    d: Double,
    data: BoneData,
    getWorldRotationX: () => Double,
    getWorldRotationY: () => Double,
    getWorldScaleX: () => Double,
    getWorldScaleY: () => Double,
    isActive: () => Boolean,
    localToWorld: Vector2 => Vector2,
    localToWorldRotation: Double => Double,
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
    worldX: Double,
    worldY: Double,
    x: Double,
    y: Double
  ): Bone = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], appliedValid = appliedValid.asInstanceOf[js.Any], arotation = arotation.asInstanceOf[js.Any], ascaleX = ascaleX.asInstanceOf[js.Any], ascaleY = ascaleY.asInstanceOf[js.Any], ashearX = ashearX.asInstanceOf[js.Any], ashearY = ashearY.asInstanceOf[js.Any], ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getWorldRotationX = js.Any.fromFunction0(getWorldRotationX), getWorldRotationY = js.Any.fromFunction0(getWorldRotationY), getWorldScaleX = js.Any.fromFunction0(getWorldScaleX), getWorldScaleY = js.Any.fromFunction0(getWorldScaleY), isActive = js.Any.fromFunction0(isActive), localToWorld = js.Any.fromFunction1(localToWorld), localToWorldRotation = js.Any.fromFunction1(localToWorldRotation), parent = parent.asInstanceOf[js.Any], rotateWorld = js.Any.fromFunction1(rotateWorld), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setToSetupPose = js.Any.fromFunction0(setToSetupPose), shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), updateAppliedTransform = js.Any.fromFunction0(updateAppliedTransform), updateWorldTransform = js.Any.fromFunction0(updateWorldTransform), updateWorldTransformWith = js.Any.fromFunction7(updateWorldTransformWith), worldToLocal = js.Any.fromFunction1(worldToLocal), worldToLocalRotation = js.Any.fromFunction1(worldToLocalRotation), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bone]
  }
  
  @scala.inline
  implicit class BoneMutableBuilder[Self <: Bone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedValid(value: Boolean): Self = StObject.set(x, "appliedValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArotation(value: Double): Self = StObject.set(x, "arotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscaleX(value: Double): Self = StObject.set(x, "ascaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscaleY(value: Double): Self = StObject.set(x, "ascaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAshearX(value: Double): Self = StObject.set(x, "ashearX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAshearY(value: Double): Self = StObject.set(x, "ashearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAx(value: Double): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAy(value: Double): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[Bone]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: Bone*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: BoneData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWorldRotationX(value: () => Double): Self = StObject.set(x, "getWorldRotationX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorldRotationY(value: () => Double): Self = StObject.set(x, "getWorldRotationY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorldScaleX(value: () => Double): Self = StObject.set(x, "getWorldScaleX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorldScaleY(value: () => Double): Self = StObject.set(x, "getWorldScaleY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalToWorld(value: Vector2 => Vector2): Self = StObject.set(x, "localToWorld", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalToWorldRotation(value: Double => Double): Self = StObject.set(x, "localToWorldRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: Bone): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateWorld(value: Double => Unit): Self = StObject.set(x, "rotateWorld", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetToSetupPose(value: () => Unit): Self = StObject.set(x, "setToSetupPose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeleton(value: Skeleton): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAppliedTransform(value: () => Unit): Self = StObject.set(x, "updateAppliedTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateWorldTransform(value: () => Unit): Self = StObject.set(x, "updateWorldTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateWorldTransformWith(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "updateWorldTransformWith", js.Any.fromFunction7(value))
    
    @scala.inline
    def setWorldToLocal(value: Vector2 => Vector2): Self = StObject.set(x, "worldToLocal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorldToLocalRotation(value: Double => Double): Self = StObject.set(x, "worldToLocalRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorldX(value: Double): Self = StObject.set(x, "worldX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldY(value: Double): Self = StObject.set(x, "worldY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

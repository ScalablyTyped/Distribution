package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Bone")
@js.native
class Bone protected () extends Updatable {
  def this(data: BoneData, skeleton: Skeleton, parent: Bone) = this()
  var a: Double = js.native
  var active: Boolean = js.native
  var appliedValid: Boolean = js.native
  var arotation: Double = js.native
  var ascaleX: Double = js.native
  var ascaleY: Double = js.native
  var ashearX: Double = js.native
  var ashearY: Double = js.native
  var ax: Double = js.native
  var ay: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var children: js.Array[Bone] = js.native
  var d: Double = js.native
  var data: BoneData = js.native
  var parent: Bone = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var shearX: Double = js.native
  var shearY: Double = js.native
  var skeleton: Skeleton = js.native
  var sorted: Boolean = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def getWorldRotationX(): Double = js.native
  def getWorldRotationY(): Double = js.native
  def getWorldScaleX(): Double = js.native
  def getWorldScaleY(): Double = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  def localToWorld(local: Vector2): Vector2 = js.native
  def localToWorldRotation(localRotation: Double): Double = js.native
  def rotateWorld(degrees: Double): Unit = js.native
  def setToSetupPose(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  def updateAppliedTransform(): Unit = js.native
  def updateWorldTransform(): Unit = js.native
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
}


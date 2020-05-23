package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Bone")
@js.native
class Bone protected ()
  extends typings.phaser.spine.Bone {
  def this(
    data: typings.phaser.spine.BoneData,
    skeleton: typings.phaser.spine.Skeleton,
    parent: typings.phaser.spine.Bone
  ) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var appliedValid: Boolean = js.native
  /* CompleteClass */
  override var arotation: Double = js.native
  /* CompleteClass */
  override var ascaleX: Double = js.native
  /* CompleteClass */
  override var ascaleY: Double = js.native
  /* CompleteClass */
  override var ashearX: Double = js.native
  /* CompleteClass */
  override var ashearY: Double = js.native
  /* CompleteClass */
  override var ax: Double = js.native
  /* CompleteClass */
  override var ay: Double = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var c: Double = js.native
  /* CompleteClass */
  override var children: js.Array[typings.phaser.spine.Bone] = js.native
  /* CompleteClass */
  override var d: Double = js.native
  /* CompleteClass */
  override var data: typings.phaser.spine.BoneData = js.native
  /* CompleteClass */
  override var parent: typings.phaser.spine.Bone = js.native
  /* CompleteClass */
  override var rotation: Double = js.native
  /* CompleteClass */
  override var scaleX: Double = js.native
  /* CompleteClass */
  override var scaleY: Double = js.native
  /* CompleteClass */
  override var shearX: Double = js.native
  /* CompleteClass */
  override var shearY: Double = js.native
  /* CompleteClass */
  override var skeleton: typings.phaser.spine.Skeleton = js.native
  /* CompleteClass */
  override var sorted: Boolean = js.native
  /* CompleteClass */
  override var worldX: Double = js.native
  /* CompleteClass */
  override var worldY: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def getWorldRotationX(): Double = js.native
  /* CompleteClass */
  override def getWorldRotationY(): Double = js.native
  /* CompleteClass */
  override def getWorldScaleX(): Double = js.native
  /* CompleteClass */
  override def getWorldScaleY(): Double = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def localToWorld(local: typings.phaser.spine.Vector2): typings.phaser.spine.Vector2 = js.native
  /* CompleteClass */
  override def localToWorldRotation(localRotation: Double): Double = js.native
  /* CompleteClass */
  override def rotateWorld(degrees: Double): Unit = js.native
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  /* CompleteClass */
  override def updateAppliedTransform(): Unit = js.native
  /* CompleteClass */
  override def updateWorldTransform(): Unit = js.native
  /* CompleteClass */
  override def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  /* CompleteClass */
  override def worldToLocal(world: typings.phaser.spine.Vector2): typings.phaser.spine.Vector2 = js.native
  /* CompleteClass */
  override def worldToLocalRotation(worldRotation: Double): Double = js.native
}


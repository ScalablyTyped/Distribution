package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skeleton extends js.Object {
  var _updateCache: js.Array[Updatable] = js.native
  var bones: js.Array[Bone] = js.native
  var color: Color = js.native
  var data: SkeletonData = js.native
  var drawOrder: js.Array[Slot] = js.native
  var ikConstraints: js.Array[IkConstraint] = js.native
  var pathConstraints: js.Array[PathConstraint] = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var skin: Skin = js.native
  var slots: js.Array[Slot] = js.native
  var time: Double = js.native
  var transformConstraints: js.Array[TransformConstraint] = js.native
  var updateCacheReset: js.Array[Updatable] = js.native
  var x: Double = js.native
  var y: Double = js.native
  def findBone(boneName: String): Bone = js.native
  def findBoneIndex(boneName: String): Double = js.native
  def findIkConstraint(constraintName: String): IkConstraint = js.native
  def findPathConstraint(constraintName: String): PathConstraint = js.native
  def findSlot(slotName: String): Slot = js.native
  def findSlotIndex(slotName: String): Double = js.native
  def findTransformConstraint(constraintName: String): TransformConstraint = js.native
  def flipX: Boolean = js.native
  def flipX(value: Boolean): js.Any = js.native
  def flipY: Boolean = js.native
  def flipY(value: Boolean): js.Any = js.native
  def getAttachment(slotIndex: Double, attachmentName: String): Attachment = js.native
  def getAttachmentByName(slotName: String, attachmentName: String): Attachment = js.native
  def getBounds(offset: Vector2, size: Vector2): Unit = js.native
  def getBounds(offset: Vector2, size: Vector2, temp: js.Array[Double]): Unit = js.native
  def getRootBone(): Bone = js.native
  def setAttachment(slotName: String, attachmentName: String): Unit = js.native
  def setBonesToSetupPose(): Unit = js.native
  def setSkin(newSkin: Skin): Unit = js.native
  def setSkinByName(skinName: String): Unit = js.native
  def setSlotsToSetupPose(): Unit = js.native
  def setToSetupPose(): Unit = js.native
  def sortBone(bone: Bone): Unit = js.native
  def sortIkConstraint(constraint: IkConstraint): Unit = js.native
  def sortPathConstraint(constraint: PathConstraint): Unit = js.native
  def sortPathConstraintAttachment(skin: Skin, slotIndex: Double, slotBone: Bone): Unit = js.native
  def sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone): Unit = js.native
  def sortReset(bones: js.Array[Bone]): Unit = js.native
  def sortTransformConstraint(constraint: TransformConstraint): Unit = js.native
  def update(delta: Double): Unit = js.native
  def updateCache(): Unit = js.native
  def updateWorldTransform(): Unit = js.native
}


package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Skeleton")
@js.native
class Skeleton protected () extends js.Object {
  def this(data: SkeletonData) = this()
  var _updateCache: js.Array[Updatable] = js.native
  var bones: js.Array[Bone] = js.native
  var color: Color = js.native
  var data: SkeletonData = js.native
  var drawOrder: js.Array[Slot] = js.native
  var flipX: scala.Boolean = js.native
  var flipY: scala.Boolean = js.native
  var ikConstraints: js.Array[IkConstraint] = js.native
  var pathConstraints: js.Array[PathConstraint] = js.native
  var skin: Skin = js.native
  var slots: js.Array[Slot] = js.native
  var time: scala.Double = js.native
  var transformConstraints: js.Array[TransformConstraint] = js.native
  var updateCacheReset: js.Array[Updatable] = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def findBone(boneName: java.lang.String): Bone = js.native
  def findBoneIndex(boneName: java.lang.String): scala.Double = js.native
  def findIkConstraint(constraintName: java.lang.String): IkConstraint = js.native
  def findPathConstraint(constraintName: java.lang.String): PathConstraint = js.native
  def findSlot(slotName: java.lang.String): Slot = js.native
  def findSlotIndex(slotName: java.lang.String): scala.Double = js.native
  def findTransformConstraint(constraintName: java.lang.String): TransformConstraint = js.native
  def getAttachment(slotIndex: scala.Double, attachmentName: java.lang.String): Attachment = js.native
  def getAttachmentByName(slotName: java.lang.String, attachmentName: java.lang.String): Attachment = js.native
  def getBounds(offset: Vector2, size: Vector2, temp: js.Array[scala.Double]): scala.Unit = js.native
  def getRootBone(): Bone = js.native
  def setAttachment(slotName: java.lang.String, attachmentName: java.lang.String): scala.Unit = js.native
  def setBonesToSetupPose(): scala.Unit = js.native
  def setSkin(newSkin: Skin): scala.Unit = js.native
  def setSkinByName(skinName: java.lang.String): scala.Unit = js.native
  def setSlotsToSetupPose(): scala.Unit = js.native
  def setToSetupPose(): scala.Unit = js.native
  def sortBone(bone: Bone): scala.Unit = js.native
  def sortIkConstraint(constraint: IkConstraint): scala.Unit = js.native
  def sortPathConstraint(constraint: PathConstraint): scala.Unit = js.native
  def sortPathConstraintAttachment(skin: Skin, slotIndex: scala.Double, slotBone: Bone): scala.Unit = js.native
  def sortPathConstraintAttachmentWith(attachment: Attachment, slotBone: Bone): scala.Unit = js.native
  def sortReset(bones: js.Array[Bone]): scala.Unit = js.native
  def sortTransformConstraint(constraint: TransformConstraint): scala.Unit = js.native
  def update(delta: scala.Double): scala.Unit = js.native
  def updateCache(): scala.Unit = js.native
  def updateWorldTransform(): scala.Unit = js.native
}


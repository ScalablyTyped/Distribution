package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skin extends js.Object {
  var attachments: js.Array[Map[Attachment]]
  var bones: js.Array[BoneData]
  var constraints: js.Array[ConstraintData]
  var name: String
  def addSkin(skin: Skin): Unit
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit
  def clear(): Unit
  def copySkin(skin: Skin): Unit
  def getAttachment(slotIndex: Double, name: String): Attachment
  def getAttachments(): js.Array[SkinEntry]
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit
  def removeAttachment(slotIndex: Double, name: String): Unit
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit
}

object Skin {
  @scala.inline
  def apply(
    addSkin: Skin => Unit,
    attachAll: (Skeleton, Skin) => Unit,
    attachments: js.Array[Map[Attachment]],
    bones: js.Array[BoneData],
    clear: () => Unit,
    constraints: js.Array[ConstraintData],
    copySkin: Skin => Unit,
    getAttachment: (Double, String) => Attachment,
    getAttachments: () => js.Array[SkinEntry],
    getAttachmentsForSlot: (Double, js.Array[SkinEntry]) => Unit,
    name: String,
    removeAttachment: (Double, String) => Unit,
    setAttachment: (Double, String, Attachment) => Unit
  ): Skin = {
    val __obj = js.Dynamic.literal(addSkin = js.Any.fromFunction1(addSkin), attachAll = js.Any.fromFunction2(attachAll), attachments = attachments.asInstanceOf[js.Any], bones = bones.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), constraints = constraints.asInstanceOf[js.Any], copySkin = js.Any.fromFunction1(copySkin), getAttachment = js.Any.fromFunction2(getAttachment), getAttachments = js.Any.fromFunction0(getAttachments), getAttachmentsForSlot = js.Any.fromFunction2(getAttachmentsForSlot), name = name.asInstanceOf[js.Any], removeAttachment = js.Any.fromFunction2(removeAttachment), setAttachment = js.Any.fromFunction3(setAttachment))
    __obj.asInstanceOf[Skin]
  }
}


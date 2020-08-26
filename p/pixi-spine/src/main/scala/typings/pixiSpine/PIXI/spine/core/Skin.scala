package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Skin extends js.Object {
  var attachments: js.Array[Map[Attachment]] = js.native
  var bones: js.Array[BoneData] = js.native
  var constraints: js.Array[ConstraintData] = js.native
  var name: String = js.native
  def addSkin(skin: Skin): Unit = js.native
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  def clear(): Unit = js.native
  def copySkin(skin: Skin): Unit = js.native
  def getAttachment(slotIndex: Double, name: String): Attachment = js.native
  def getAttachments(): js.Array[SkinEntry] = js.native
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit = js.native
  def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
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
  @scala.inline
  implicit class SkinOps[Self <: Skin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSkin(value: Skin => Unit): Self = this.set("addSkin", js.Any.fromFunction1(value))
    @scala.inline
    def setAttachAll(value: (Skeleton, Skin) => Unit): Self = this.set("attachAll", js.Any.fromFunction2(value))
    @scala.inline
    def setAttachmentsVarargs(value: Map[Attachment]*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Map[Attachment]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBonesVarargs(value: BoneData*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[BoneData]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setConstraintsVarargs(value: ConstraintData*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[ConstraintData]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopySkin(value: Skin => Unit): Self = this.set("copySkin", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAttachment(value: (Double, String) => Attachment): Self = this.set("getAttachment", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAttachments(value: () => js.Array[SkinEntry]): Self = this.set("getAttachments", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttachmentsForSlot(value: (Double, js.Array[SkinEntry]) => Unit): Self = this.set("getAttachmentsForSlot", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveAttachment(value: (Double, String) => Unit): Self = this.set("removeAttachment", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAttachment(value: (Double, String, Attachment) => Unit): Self = this.set("setAttachment", js.Any.fromFunction3(value))
  }
  
}


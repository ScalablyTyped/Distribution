package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends js.Object {
  var attachment: js.Any = js.native
  var attachmentTime: js.Any = js.native
  var bone: Bone = js.native
  var color: Color = js.native
  var darkColor: Color = js.native
  var data: SlotData = js.native
  var deform: js.Array[Double] = js.native
  def getAttachment(): Attachment = js.native
  def getAttachmentTime(): Double = js.native
  def setAttachment(attachment: Attachment): Unit = js.native
  def setAttachmentTime(time: Double): Unit = js.native
  def setToSetupPose(): Unit = js.native
}

object Slot {
  @scala.inline
  def apply(
    attachment: js.Any,
    attachmentTime: js.Any,
    bone: Bone,
    color: Color,
    darkColor: Color,
    data: SlotData,
    deform: js.Array[Double],
    getAttachment: () => Attachment,
    getAttachmentTime: () => Double,
    setAttachment: Attachment => Unit,
    setAttachmentTime: Double => Unit,
    setToSetupPose: () => Unit
  ): Slot = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], attachmentTime = attachmentTime.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], darkColor = darkColor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deform = deform.asInstanceOf[js.Any], getAttachment = js.Any.fromFunction0(getAttachment), getAttachmentTime = js.Any.fromFunction0(getAttachmentTime), setAttachment = js.Any.fromFunction1(setAttachment), setAttachmentTime = js.Any.fromFunction1(setAttachmentTime), setToSetupPose = js.Any.fromFunction0(setToSetupPose))
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
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
    def setAttachment(value: js.Any): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentTime(value: js.Any): Self = this.set("attachmentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBone(value: Bone): Self = this.set("bone", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkColor(value: Color): Self = this.set("darkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: SlotData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeformVarargs(value: Double*): Self = this.set("deform", js.Array(value :_*))
    @scala.inline
    def setDeform(value: js.Array[Double]): Self = this.set("deform", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAttachment(value: () => Attachment): Self = this.set("getAttachment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAttachmentTime(value: () => Double): Self = this.set("getAttachmentTime", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAttachment(value: Attachment => Unit): Self = this.set("setAttachment", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttachmentTime(value: Double => Unit): Self = this.set("setAttachmentTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetToSetupPose(value: () => Unit): Self = this.set("setToSetupPose", js.Any.fromFunction0(value))
  }
  
}


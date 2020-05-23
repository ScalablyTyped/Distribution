package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slot extends js.Object {
  var attachment: js.Any
  var attachmentTime: js.Any
  var bone: Bone
  var color: Color
  var darkColor: Color
  var data: SlotData
  var deform: js.Array[Double]
  def getAttachment(): Attachment
  def getAttachmentTime(): Double
  def setAttachment(attachment: Attachment): Unit
  def setAttachmentTime(time: Double): Unit
  def setToSetupPose(): Unit
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
}


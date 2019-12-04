package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Slot")
@js.native
class Slot protected () extends js.Object {
  def this(data: SlotData, bone: Bone) = this()
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


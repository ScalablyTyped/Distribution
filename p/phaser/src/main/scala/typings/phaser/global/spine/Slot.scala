package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Slot")
@js.native
class Slot protected ()
  extends typings.phaser.spine.Slot {
  def this(data: typings.phaser.spine.SlotData, bone: typings.phaser.spine.Bone) = this()
  /* CompleteClass */
  override var attachment: js.Any = js.native
  /* CompleteClass */
  override var attachmentTime: js.Any = js.native
  /* CompleteClass */
  override var bone: typings.phaser.spine.Bone = js.native
  /* CompleteClass */
  override var color: typings.phaser.spine.Color = js.native
  /* CompleteClass */
  override var darkColor: typings.phaser.spine.Color = js.native
  /* CompleteClass */
  override var data: typings.phaser.spine.SlotData = js.native
  /* CompleteClass */
  override var deform: js.Array[Double] = js.native
  /* CompleteClass */
  override def getAttachment(): typings.phaser.spine.Attachment = js.native
  /* CompleteClass */
  override def getAttachmentTime(): Double = js.native
  /* CompleteClass */
  override def setAttachment(attachment: typings.phaser.spine.Attachment): Unit = js.native
  /* CompleteClass */
  override def setAttachmentTime(time: Double): Unit = js.native
  /* CompleteClass */
  override def setToSetupPose(): Unit = js.native
}


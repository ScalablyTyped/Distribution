package typings.phaser.global.spine

import typings.phaser.spine.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Skin")
@js.native
class Skin protected ()
  extends typings.phaser.spine.Skin {
  def this(name: String) = this()
  /* CompleteClass */
  override var attachments: js.Array[Map[typings.phaser.spine.Attachment]] = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.phaser.spine.BoneData] = js.native
  /* CompleteClass */
  override var constraints: js.Array[typings.phaser.spine.ConstraintData] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def addSkin(skin: typings.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def attachAll(skeleton: typings.phaser.spine.Skeleton, oldSkin: typings.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def copySkin(skin: typings.phaser.spine.Skin): Unit = js.native
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): typings.phaser.spine.Attachment = js.native
  /* CompleteClass */
  override def getAttachments(): js.Array[typings.phaser.spine.SkinEntry] = js.native
  /* CompleteClass */
  override def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[typings.phaser.spine.SkinEntry]): Unit = js.native
  /* CompleteClass */
  override def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  /* CompleteClass */
  override def setAttachment(slotIndex: Double, name: String, attachment: typings.phaser.spine.Attachment): Unit = js.native
}


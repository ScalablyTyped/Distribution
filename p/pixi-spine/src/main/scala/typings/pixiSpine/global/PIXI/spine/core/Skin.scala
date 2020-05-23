package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Skin")
@js.native
class Skin protected ()
  extends typings.pixiSpine.PIXI.spine.core.Skin {
  def this(name: String) = this()
  /* CompleteClass */
  override var attachments: js.Array[Map[typings.pixiSpine.PIXI.spine.core.Attachment]] = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.pixiSpine.PIXI.spine.core.BoneData] = js.native
  /* CompleteClass */
  override var constraints: js.Array[typings.pixiSpine.PIXI.spine.core.ConstraintData] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def addSkin(skin: typings.pixiSpine.PIXI.spine.core.Skin): Unit = js.native
  /* CompleteClass */
  override def attachAll(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    oldSkin: typings.pixiSpine.PIXI.spine.core.Skin
  ): Unit = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def copySkin(skin: typings.pixiSpine.PIXI.spine.core.Skin): Unit = js.native
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): typings.pixiSpine.PIXI.spine.core.Attachment = js.native
  /* CompleteClass */
  override def getAttachments(): js.Array[typings.pixiSpine.PIXI.spine.core.SkinEntry] = js.native
  /* CompleteClass */
  override def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[typings.pixiSpine.PIXI.spine.core.SkinEntry]): Unit = js.native
  /* CompleteClass */
  override def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  /* CompleteClass */
  override def setAttachment(slotIndex: Double, name: String, attachment: typings.pixiSpine.PIXI.spine.core.Attachment): Unit = js.native
}


package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Skin")
@js.native
class Skin protected () extends js.Object {
  def this(name: String) = this()
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


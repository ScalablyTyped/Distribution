package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.Map2
import typings.pixiSpineBase.mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "Skin")
@js.native
open class Skin protected ()
  extends StObject
     with ISkin {
  def this(name: String) = this()
  
  /** Adds all attachments, bones, and constraints from the specified skin to this skin. */
  def addSkin(skin: Skin): Unit = js.native
  
  /** Attach each attachment in this skin if the corresponding attachment in the old skin is currently attached. */
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  
  /* CompleteClass */
  var attachments: js.Array[Map2[IAttachment]] = js.native
  @JSName("attachments")
  var attachments_Skin: js.Array[StringMap[Attachment]] = js.native
  
  var bones: js.Array[BoneData] = js.native
  
  /** Clears all attachments, bones, and constraints. */
  def clear(): Unit = js.native
  
  var constraints: js.Array[ConstraintData] = js.native
  
  /** Adds all bones and constraints and copies of all attachments from the specified skin to this skin. Mesh attachments are not
    * copied, instead a new linked mesh is created. The attachment copies can be modified without affecting the originals. */
  def copySkin(skin: Skin): Unit = js.native
  
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): IAttachment | Null = js.native
  
  /** Returns all attachments in this skin. */
  def getAttachments(): js.Array[SkinEntry] = js.native
  
  /** Returns all attachments in this skin for the specified slot index. */
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /** Removes the attachment in the skin for the specified slot index and name, if any. */
  def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  
  /** Adds an attachment to the skin for the specified slot index and name. */
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
}

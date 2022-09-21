package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.Map2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.8", "Skin")
@js.native
open class Skin protected ()
  extends StObject
     with ISkin {
  def this(name: String) = this()
  
  def addSkin(skin: Skin): Unit = js.native
  
  /** Attach each attachment in this skin if the corresponding attachment in the old skin is currently attached. */
  def attachAll(skeleton: Skeleton, oldSkin: Skin): Unit = js.native
  
  /* CompleteClass */
  var attachments: js.Array[Map2[IAttachment]] = js.native
  @JSName("attachments")
  var attachments_Skin: js.Array[Map2[Attachment]] = js.native
  
  var bones: js.Array[BoneData] = js.native
  
  def clear(): Unit = js.native
  
  var constraints: js.Array[ConstraintData] = js.native
  
  def copySkin(skin: Skin): Unit = js.native
  
  /* CompleteClass */
  override def getAttachment(slotIndex: Double, name: String): IAttachment | Null = js.native
  
  def getAttachments(): js.Array[SkinEntry] = js.native
  
  def getAttachmentsForSlot(slotIndex: Double, attachments: js.Array[SkinEntry]): Unit = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  def removeAttachment(slotIndex: Double, name: String): Unit = js.native
  
  def setAttachment(slotIndex: Double, name: String, attachment: Attachment): Unit = js.native
}

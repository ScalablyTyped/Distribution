package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.Color
import typings.pixiSpineBase.mod.IAttachment
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.ISlotData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "Slot")
@js.native
open class Slot protected ()
  extends StObject
     with ISlot {
  def this(data: SlotData, bone: Bone) = this()
  
  var attachment: Attachment = js.native
  
  /* private */ var attachmentTime: Any = js.native
  
  var attachmentVertices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var blendMode: Double = js.native
  
  /* CompleteClass */
  var bone: IBone = js.native
  @JSName("bone")
  var bone_Slot: Bone = js.native
  
  /* CompleteClass */
  var color: Color = js.native
  
  /* CompleteClass */
  var darkColor: Color = js.native
  
  /* CompleteClass */
  var data: ISlotData = js.native
  @JSName("data")
  var data_Slot: SlotData = js.native
  
  /* CompleteClass */
  override def getAttachment(): IAttachment = js.native
  
  /** Returns the time since the attachment was set. */
  def getAttachmentTime(): Double = js.native
  
  /** Sets the attachment and if it changed, resets {@link #getAttachmentTime()} and clears {@link #getAttachmentVertices()}.
    * @param attachment May be null. */
  def setAttachment(attachment: Attachment): Unit = js.native
  
  def setAttachmentTime(time: Double): Unit = js.native
  
  def setToSetupPose(): Unit = js.native
}

package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "AttachmentTimeline")
@js.native
open class AttachmentTimeline protected ()
  extends Timeline
     with SlotTimeline {
  def this(frameCount: Double, slotIndex: Double) = this()
  
  /** The attachment name for each key frame. May contain null values to clear the attachment. */
  var attachmentNames: js.Array[String | Null] = js.native
  
  def setAttachment(skeleton: Skeleton, slot: Slot): Unit = js.native
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: String): Unit = js.native
  
  /** Sets the time in seconds and the attachment name for the specified key frame. */
  def setFrame(frame: Double, time: Double): Unit = js.native
  def setFrame(frame: Double, time: Double, attachmentName: String): Unit = js.native
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  /* CompleteClass */
  var slotIndex: Double = js.native
}

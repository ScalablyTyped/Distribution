package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Slot")
@js.native
class Slot protected ()
  extends StObject
     with typings.phaser.spine.Slot {
  def this(data: typings.phaser.spine.SlotData, bone: typings.phaser.spine.Bone) = this()
  
  /* private */ /* CompleteClass */
  var attachment: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var attachmentTime: js.Any = js.native
  
  /* CompleteClass */
  var bone: typings.phaser.spine.Bone = js.native
  
  /* CompleteClass */
  var color: typings.phaser.spine.Color = js.native
  
  /* CompleteClass */
  var darkColor: typings.phaser.spine.Color = js.native
  
  /* CompleteClass */
  var data: typings.phaser.spine.SlotData = js.native
  
  /* CompleteClass */
  var deform: js.Array[Double] = js.native
  
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

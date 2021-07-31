package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.AttachmentTimeline")
@js.native
class AttachmentTimeline protected ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.AttachmentTimeline {
  def this(frameCount: Double) = this()
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typings.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  
  /* CompleteClass */
  var attachmentNames: js.Array[String] = js.native
  
  /* CompleteClass */
  var frames: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  
  /* CompleteClass */
  override def setAttachment(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    slot: typings.pixiSpine.PIXI.spine.core.Slot,
    attachmentName: String
  ): Unit = js.native
  
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
  
  /* CompleteClass */
  var slotIndex: Double = js.native
}

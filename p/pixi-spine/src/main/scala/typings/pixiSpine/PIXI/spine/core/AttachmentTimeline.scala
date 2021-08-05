package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentTimeline
  extends StObject
     with Timeline {
  
  var attachmentNames: js.Array[String]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: String): Unit
  
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit
  
  var slotIndex: Double
}
object AttachmentTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachmentNames: js.Array[String],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setAttachment: (Skeleton, Slot, String) => Unit,
    setFrame: (Double, Double, String) => Unit,
    slotIndex: Double
  ): AttachmentTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachmentNames = attachmentNames.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setAttachment = js.Any.fromFunction3(setAttachment), setFrame = js.Any.fromFunction3(setFrame), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentTimeline]
  }
  
  extension [Self <: AttachmentTimeline](x: Self) {
    
    inline def setAttachmentNames(value: js.Array[String]): Self = StObject.set(x, "attachmentNames", value.asInstanceOf[js.Any])
    
    inline def setAttachmentNamesVarargs(value: String*): Self = StObject.set(x, "attachmentNames", js.Array(value :_*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    inline def setSetAttachment(value: (Skeleton, Slot, String) => Unit): Self = StObject.set(x, "setAttachment", js.Any.fromFunction3(value))
    
    inline def setSetFrame(value: (Double, Double, String) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction3(value))
    
    inline def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}

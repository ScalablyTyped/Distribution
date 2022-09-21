package typings.pixiSpineRuntime41.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTimeline extends StObject {
  
  /** The index of the slot in {@link Skeleton#slots} that will be changed. */
  var slotIndex: Double
}
object SlotTimeline {
  
  inline def apply(slotIndex: Double): SlotTimeline = {
    val __obj = js.Dynamic.literal(slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTimeline]
  }
  
  extension [Self <: SlotTimeline](x: Self) {
    
    inline def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}

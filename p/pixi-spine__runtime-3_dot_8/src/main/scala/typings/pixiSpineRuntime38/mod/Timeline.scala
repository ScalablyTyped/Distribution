package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeline extends StObject {
  
  /** Applies this timeline to the skeleton.
    * @param skeleton The skeleton the timeline is being applied to. This provides access to the bones, slots, and other
    *           skeleton components the timeline may change.
    * @param lastTime The time this timeline was last applied. Timelines such as {@link EventTimeline}} trigger only at specific
    *           times rather than every frame. In that case, the timeline triggers everything between `lastTime`
    *           (exclusive) and `time` (inclusive).
    * @param time The time within the animation. Most timelines find the key before and the key after this time so they can
    *           interpolate between the keys.
    * @param events If any events are fired, they are added to this list. Can be null to ignore fired events or if the timeline
    *           does not fire events.
    * @param alpha 0 applies the current or setup value (depending on `blend`). 1 applies the timeline value.
    *           Between 0 and 1 applies a value between the current or setup value and the timeline value. By adjusting
    *           `alpha` over time, an animation can be mixed in or out. `alpha` can also be useful to
    *           apply animations on top of each other (layering).
    * @param blend Controls how mixing is applied when `alpha` < 1.
    * @param direction Indicates whether the timeline is mixing in or out. Used by timelines which perform instant transitions,
    *           such as {@link DrawOrderTimeline} or {@link AttachmentTimeline}. */
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  
  /** Uniquely encodes both the type of this timeline and the skeleton property that it affects. */
  def getPropertyId(): Double
}
object Timeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event2], Double, MixBlend, MixDirection) => Unit,
    getPropertyId: () => Double
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), getPropertyId = js.Any.fromFunction0(getPropertyId))
    __obj.asInstanceOf[Timeline]
  }
  
  extension [Self <: Timeline](x: Self) {
    
    inline def setApply(value: (Skeleton, Double, Double, js.Array[Event2], Double, MixBlend, MixDirection) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction7(value))
    
    inline def setGetPropertyId(value: () => Double): Self = StObject.set(x, "getPropertyId", js.Any.fromFunction0(value))
  }
}

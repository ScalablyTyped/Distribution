package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple container for a list of timelines and a name. */
/**
  * @public
  */
trait Animation2 extends StObject {
  
  /** Applies all the animation's timelines to the specified skeleton.
    *
    * See Timeline {@link Timeline#apply(Skeleton, float, float, Array, float, MixBlend, MixDirection)}.
    * @param loop If true, the animation repeats after {@link #getDuration()}.
    * @param events May be null to ignore fired events. */
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event2],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  
  /** The duration of the animation in seconds, which is the highest time of all keys in the timeline. */
  var duration: Double
  
  def hasTimeline(id: Double): Boolean
  
  /** The animation's name, which is unique across all animations in the skeleton. */
  var name: String
  
  var timelineIds: js.Array[Boolean]
  
  var timelines: js.Array[Timeline]
}
object Animation2 {
  
  inline def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    hasTimeline: Double => Boolean,
    name: String,
    timelineIds: js.Array[Boolean],
    timelines: js.Array[Timeline]
  ): Animation2 = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], hasTimeline = js.Any.fromFunction1(hasTimeline), name = name.asInstanceOf[js.Any], timelineIds = timelineIds.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation2]
  }
  
  extension [Self <: Animation2](x: Self) {
    
    inline def setApply(
      value: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction8(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHasTimeline(value: Double => Boolean): Self = StObject.set(x, "hasTimeline", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimelineIds(value: js.Array[Boolean]): Self = StObject.set(x, "timelineIds", value.asInstanceOf[js.Any])
    
    inline def setTimelineIdsVarargs(value: Boolean*): Self = StObject.set(x, "timelineIds", js.Array(value*))
    
    inline def setTimelines(value: js.Array[Timeline]): Self = StObject.set(x, "timelines", value.asInstanceOf[js.Any])
    
    inline def setTimelinesVarargs(value: Timeline*): Self = StObject.set(x, "timelines", js.Array(value*))
  }
}

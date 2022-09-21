package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.MixDirection
import typings.pixiSpineBase.mod.StringSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple container for a list of timelines and a name.
  * @public
  * */
trait Animation2
  extends StObject
     with IAnimation[Timeline] {
  
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
  
  def hasTimeline(ids: js.Array[String]): Boolean
  
  def setTimelines(timelines: js.Array[Timeline]): Unit
  
  var timelineIds: StringSet
}
object Animation2 {
  
  inline def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    hasTimeline: js.Array[String] => Boolean,
    name: String,
    setTimelines: js.Array[Timeline] => Unit,
    timelineIds: StringSet,
    timelines: js.Array[Timeline]
  ): Animation2 = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], hasTimeline = js.Any.fromFunction1(hasTimeline), name = name.asInstanceOf[js.Any], setTimelines = js.Any.fromFunction1(setTimelines), timelineIds = timelineIds.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation2]
  }
  
  extension [Self <: Animation2](x: Self) {
    
    inline def setApply(
      value: (Skeleton, Double, Double, Boolean, js.Array[Event2], Double, MixBlend, MixDirection) => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction8(value))
    
    inline def setHasTimeline(value: js.Array[String] => Boolean): Self = StObject.set(x, "hasTimeline", js.Any.fromFunction1(value))
    
    inline def setSetTimelines(value: js.Array[Timeline] => Unit): Self = StObject.set(x, "setTimelines", js.Any.fromFunction1(value))
    
    inline def setTimelineIds(value: StringSet): Self = StObject.set(x, "timelineIds", value.asInstanceOf[js.Any])
  }
}

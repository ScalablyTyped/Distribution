package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    loop: Boolean,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  
  var duration: Double
  
  def hasTimeline(id: Double): Boolean
  
  var name: String
  
  var timelineIds: js.Array[Boolean]
  
  var timelines: js.Array[Timeline]
}
object Animation {
  
  inline def apply(
    apply: (Skeleton, Double, Double, Boolean, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    duration: Double,
    hasTimeline: Double => Boolean,
    name: String,
    timelineIds: js.Array[Boolean],
    timelines: js.Array[Timeline]
  ): Animation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction8(apply), duration = duration.asInstanceOf[js.Any], hasTimeline = js.Any.fromFunction1(hasTimeline), name = name.asInstanceOf[js.Any], timelineIds = timelineIds.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setApply(
      value: (Skeleton, Double, Double, Boolean, js.Array[Event], Double, MixBlend, MixDirection) => Unit
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

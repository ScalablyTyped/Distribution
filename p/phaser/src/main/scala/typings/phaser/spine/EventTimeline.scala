package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTimeline
  extends StObject
     with Timeline {
  
  var events: js.Array[Event]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setFrame(frameIndex: Double, event: Event): Unit
}
object EventTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    events: js.Array[Event],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Event) => Unit
  ): EventTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), events = events.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction2(setFrame))
    __obj.asInstanceOf[EventTimeline]
  }
  
  @scala.inline
  implicit class EventTimelineMutableBuilder[Self <: EventTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFrame(value: (Double, Event) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction2(value))
  }
}

package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackEntry extends StObject {
  
  var alpha: Double
  
  var animation: Animation
  
  var animationEnd: Double
  
  var animationLast: Double
  
  var animationStart: Double
  
  var attachmentThreshold: Double
  
  var delay: Double
  
  var drawOrderThreshold: Double
  
  var eventThreshold: Double
  
  def getAnimationTime(): Double
  
  var holdPrevious: Boolean
  
  var interruptAlpha: Double
  
  def isComplete(): Boolean
  
  var listener: AnimationStateListener2
  
  var loop: Boolean
  
  var mixBlend: MixBlend
  
  var mixDuration: Double
  
  var mixTime: Double
  
  var mixingFrom: TrackEntry
  
  var mixingTo: TrackEntry
  
  var next: TrackEntry
  
  var nextAnimationLast: Double
  
  var nextTrackLast: Double
  
  def reset(): Unit
  
  def resetRotationDirections(): Unit
  
  def setAnimationLast(animationLast: Double): Unit
  
  var timeScale: Double
  
  var timelineHoldMix: js.Array[TrackEntry]
  
  var timelineMode: js.Array[Double]
  
  var timelinesRotation: js.Array[Double]
  
  var totalAlpha: Double
  
  var trackEnd: Double
  
  var trackIndex: Double
  
  var trackLast: Double
  
  var trackTime: Double
}
object TrackEntry {
  
  inline def apply(
    alpha: Double,
    animation: Animation,
    animationEnd: Double,
    animationLast: Double,
    animationStart: Double,
    attachmentThreshold: Double,
    delay: Double,
    drawOrderThreshold: Double,
    eventThreshold: Double,
    getAnimationTime: () => Double,
    holdPrevious: Boolean,
    interruptAlpha: Double,
    isComplete: () => Boolean,
    listener: AnimationStateListener2,
    loop: Boolean,
    mixBlend: MixBlend,
    mixDuration: Double,
    mixTime: Double,
    mixingFrom: TrackEntry,
    mixingTo: TrackEntry,
    next: TrackEntry,
    nextAnimationLast: Double,
    nextTrackLast: Double,
    reset: () => Unit,
    resetRotationDirections: () => Unit,
    setAnimationLast: Double => Unit,
    timeScale: Double,
    timelineHoldMix: js.Array[TrackEntry],
    timelineMode: js.Array[Double],
    timelinesRotation: js.Array[Double],
    totalAlpha: Double,
    trackEnd: Double,
    trackIndex: Double,
    trackLast: Double,
    trackTime: Double
  ): TrackEntry = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], animationEnd = animationEnd.asInstanceOf[js.Any], animationLast = animationLast.asInstanceOf[js.Any], animationStart = animationStart.asInstanceOf[js.Any], attachmentThreshold = attachmentThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], drawOrderThreshold = drawOrderThreshold.asInstanceOf[js.Any], eventThreshold = eventThreshold.asInstanceOf[js.Any], getAnimationTime = js.Any.fromFunction0(getAnimationTime), holdPrevious = holdPrevious.asInstanceOf[js.Any], interruptAlpha = interruptAlpha.asInstanceOf[js.Any], isComplete = js.Any.fromFunction0(isComplete), listener = listener.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], mixBlend = mixBlend.asInstanceOf[js.Any], mixDuration = mixDuration.asInstanceOf[js.Any], mixTime = mixTime.asInstanceOf[js.Any], mixingFrom = mixingFrom.asInstanceOf[js.Any], mixingTo = mixingTo.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextAnimationLast = nextAnimationLast.asInstanceOf[js.Any], nextTrackLast = nextTrackLast.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), resetRotationDirections = js.Any.fromFunction0(resetRotationDirections), setAnimationLast = js.Any.fromFunction1(setAnimationLast), timeScale = timeScale.asInstanceOf[js.Any], timelineHoldMix = timelineHoldMix.asInstanceOf[js.Any], timelineMode = timelineMode.asInstanceOf[js.Any], timelinesRotation = timelinesRotation.asInstanceOf[js.Any], totalAlpha = totalAlpha.asInstanceOf[js.Any], trackEnd = trackEnd.asInstanceOf[js.Any], trackIndex = trackIndex.asInstanceOf[js.Any], trackLast = trackLast.asInstanceOf[js.Any], trackTime = trackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackEntry] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnd(value: Double): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    inline def setAnimationLast(value: Double): Self = StObject.set(x, "animationLast", value.asInstanceOf[js.Any])
    
    inline def setAnimationStart(value: Double): Self = StObject.set(x, "animationStart", value.asInstanceOf[js.Any])
    
    inline def setAttachmentThreshold(value: Double): Self = StObject.set(x, "attachmentThreshold", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDrawOrderThreshold(value: Double): Self = StObject.set(x, "drawOrderThreshold", value.asInstanceOf[js.Any])
    
    inline def setEventThreshold(value: Double): Self = StObject.set(x, "eventThreshold", value.asInstanceOf[js.Any])
    
    inline def setGetAnimationTime(value: () => Double): Self = StObject.set(x, "getAnimationTime", js.Any.fromFunction0(value))
    
    inline def setHoldPrevious(value: Boolean): Self = StObject.set(x, "holdPrevious", value.asInstanceOf[js.Any])
    
    inline def setInterruptAlpha(value: Double): Self = StObject.set(x, "interruptAlpha", value.asInstanceOf[js.Any])
    
    inline def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
    
    inline def setListener(value: AnimationStateListener2): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMixBlend(value: MixBlend): Self = StObject.set(x, "mixBlend", value.asInstanceOf[js.Any])
    
    inline def setMixDuration(value: Double): Self = StObject.set(x, "mixDuration", value.asInstanceOf[js.Any])
    
    inline def setMixTime(value: Double): Self = StObject.set(x, "mixTime", value.asInstanceOf[js.Any])
    
    inline def setMixingFrom(value: TrackEntry): Self = StObject.set(x, "mixingFrom", value.asInstanceOf[js.Any])
    
    inline def setMixingTo(value: TrackEntry): Self = StObject.set(x, "mixingTo", value.asInstanceOf[js.Any])
    
    inline def setNext(value: TrackEntry): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextAnimationLast(value: Double): Self = StObject.set(x, "nextAnimationLast", value.asInstanceOf[js.Any])
    
    inline def setNextTrackLast(value: Double): Self = StObject.set(x, "nextTrackLast", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setResetRotationDirections(value: () => Unit): Self = StObject.set(x, "resetRotationDirections", js.Any.fromFunction0(value))
    
    inline def setSetAnimationLast(value: Double => Unit): Self = StObject.set(x, "setAnimationLast", js.Any.fromFunction1(value))
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTimelineHoldMix(value: js.Array[TrackEntry]): Self = StObject.set(x, "timelineHoldMix", value.asInstanceOf[js.Any])
    
    inline def setTimelineHoldMixVarargs(value: TrackEntry*): Self = StObject.set(x, "timelineHoldMix", js.Array(value*))
    
    inline def setTimelineMode(value: js.Array[Double]): Self = StObject.set(x, "timelineMode", value.asInstanceOf[js.Any])
    
    inline def setTimelineModeVarargs(value: Double*): Self = StObject.set(x, "timelineMode", js.Array(value*))
    
    inline def setTimelinesRotation(value: js.Array[Double]): Self = StObject.set(x, "timelinesRotation", value.asInstanceOf[js.Any])
    
    inline def setTimelinesRotationVarargs(value: Double*): Self = StObject.set(x, "timelinesRotation", js.Array(value*))
    
    inline def setTotalAlpha(value: Double): Self = StObject.set(x, "totalAlpha", value.asInstanceOf[js.Any])
    
    inline def setTrackEnd(value: Double): Self = StObject.set(x, "trackEnd", value.asInstanceOf[js.Any])
    
    inline def setTrackIndex(value: Double): Self = StObject.set(x, "trackIndex", value.asInstanceOf[js.Any])
    
    inline def setTrackLast(value: Double): Self = StObject.set(x, "trackLast", value.asInstanceOf[js.Any])
    
    inline def setTrackTime(value: Double): Self = StObject.set(x, "trackTime", value.asInstanceOf[js.Any])
  }
}

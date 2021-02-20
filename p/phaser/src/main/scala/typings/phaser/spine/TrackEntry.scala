package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackEntry extends StObject {
  
  var alpha: Double = js.native
  
  var animation: Animation = js.native
  
  var animationEnd: Double = js.native
  
  var animationLast: Double = js.native
  
  var animationStart: Double = js.native
  
  var attachmentThreshold: Double = js.native
  
  var delay: Double = js.native
  
  var drawOrderThreshold: Double = js.native
  
  var eventThreshold: Double = js.native
  
  def getAnimationTime(): Double = js.native
  
  var holdPrevious: Boolean = js.native
  
  var interruptAlpha: Double = js.native
  
  def isComplete(): Boolean = js.native
  
  var listener: AnimationStateListener2 = js.native
  
  var loop: Boolean = js.native
  
  var mixBlend: MixBlend = js.native
  
  var mixDuration: Double = js.native
  
  var mixTime: Double = js.native
  
  var mixingFrom: TrackEntry = js.native
  
  var mixingTo: TrackEntry = js.native
  
  var next: TrackEntry = js.native
  
  var nextAnimationLast: Double = js.native
  
  var nextTrackLast: Double = js.native
  
  def reset(): Unit = js.native
  
  def resetRotationDirections(): Unit = js.native
  
  def setAnimationLast(animationLast: Double): Unit = js.native
  
  var timeScale: Double = js.native
  
  var timelineHoldMix: js.Array[TrackEntry] = js.native
  
  var timelineMode: js.Array[Double] = js.native
  
  var timelinesRotation: js.Array[Double] = js.native
  
  var totalAlpha: Double = js.native
  
  var trackEnd: Double = js.native
  
  var trackIndex: Double = js.native
  
  var trackLast: Double = js.native
  
  var trackTime: Double = js.native
}
object TrackEntry {
  
  @scala.inline
  def apply(
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
  implicit class TrackEntryMutableBuilder[Self <: TrackEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnd(value: Double): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationLast(value: Double): Self = StObject.set(x, "animationLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStart(value: Double): Self = StObject.set(x, "animationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentThreshold(value: Double): Self = StObject.set(x, "attachmentThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawOrderThreshold(value: Double): Self = StObject.set(x, "drawOrderThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventThreshold(value: Double): Self = StObject.set(x, "eventThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnimationTime(value: () => Double): Self = StObject.set(x, "getAnimationTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoldPrevious(value: Boolean): Self = StObject.set(x, "holdPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptAlpha(value: Double): Self = StObject.set(x, "interruptAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListener(value: AnimationStateListener2): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixBlend(value: MixBlend): Self = StObject.set(x, "mixBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixDuration(value: Double): Self = StObject.set(x, "mixDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixTime(value: Double): Self = StObject.set(x, "mixTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixingFrom(value: TrackEntry): Self = StObject.set(x, "mixingFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixingTo(value: TrackEntry): Self = StObject.set(x, "mixingTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TrackEntry): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAnimationLast(value: Double): Self = StObject.set(x, "nextAnimationLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTrackLast(value: Double): Self = StObject.set(x, "nextTrackLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetRotationDirections(value: () => Unit): Self = StObject.set(x, "resetRotationDirections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAnimationLast(value: Double => Unit): Self = StObject.set(x, "setAnimationLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineHoldMix(value: js.Array[TrackEntry]): Self = StObject.set(x, "timelineHoldMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineHoldMixVarargs(value: TrackEntry*): Self = StObject.set(x, "timelineHoldMix", js.Array(value :_*))
    
    @scala.inline
    def setTimelineMode(value: js.Array[Double]): Self = StObject.set(x, "timelineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineModeVarargs(value: Double*): Self = StObject.set(x, "timelineMode", js.Array(value :_*))
    
    @scala.inline
    def setTimelinesRotation(value: js.Array[Double]): Self = StObject.set(x, "timelinesRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelinesRotationVarargs(value: Double*): Self = StObject.set(x, "timelinesRotation", js.Array(value :_*))
    
    @scala.inline
    def setTotalAlpha(value: Double): Self = StObject.set(x, "totalAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEnd(value: Double): Self = StObject.set(x, "trackEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIndex(value: Double): Self = StObject.set(x, "trackIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLast(value: Double): Self = StObject.set(x, "trackLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTime(value: Double): Self = StObject.set(x, "trackTime", value.asInstanceOf[js.Any])
  }
}

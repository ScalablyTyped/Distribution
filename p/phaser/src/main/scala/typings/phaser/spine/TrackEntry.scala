package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackEntry extends js.Object {
  
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
  implicit class TrackEntryOps[Self <: TrackEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEnd(value: Double): Self = this.set("animationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationLast(value: Double): Self = this.set("animationLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStart(value: Double): Self = this.set("animationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentThreshold(value: Double): Self = this.set("attachmentThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawOrderThreshold(value: Double): Self = this.set("drawOrderThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventThreshold(value: Double): Self = this.set("eventThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnimationTime(value: () => Double): Self = this.set("getAnimationTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoldPrevious(value: Boolean): Self = this.set("holdPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptAlpha(value: Double): Self = this.set("interruptAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = this.set("isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListener(value: AnimationStateListener2): Self = this.set("listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixBlend(value: MixBlend): Self = this.set("mixBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixDuration(value: Double): Self = this.set("mixDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixTime(value: Double): Self = this.set("mixTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixingFrom(value: TrackEntry): Self = this.set("mixingFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixingTo(value: TrackEntry): Self = this.set("mixingTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TrackEntry): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextAnimationLast(value: Double): Self = this.set("nextAnimationLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTrackLast(value: Double): Self = this.set("nextTrackLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetRotationDirections(value: () => Unit): Self = this.set("resetRotationDirections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAnimationLast(value: Double => Unit): Self = this.set("setAnimationLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineHoldMixVarargs(value: TrackEntry*): Self = this.set("timelineHoldMix", js.Array(value :_*))
    
    @scala.inline
    def setTimelineHoldMix(value: js.Array[TrackEntry]): Self = this.set("timelineHoldMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineModeVarargs(value: Double*): Self = this.set("timelineMode", js.Array(value :_*))
    
    @scala.inline
    def setTimelineMode(value: js.Array[Double]): Self = this.set("timelineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelinesRotationVarargs(value: Double*): Self = this.set("timelinesRotation", js.Array(value :_*))
    
    @scala.inline
    def setTimelinesRotation(value: js.Array[Double]): Self = this.set("timelinesRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAlpha(value: Double): Self = this.set("totalAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEnd(value: Double): Self = this.set("trackEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIndex(value: Double): Self = this.set("trackIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLast(value: Double): Self = this.set("trackLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTime(value: Double): Self = this.set("trackTime", value.asInstanceOf[js.Any])
  }
}

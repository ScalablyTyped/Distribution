package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackEntry extends js.Object {
  var alpha: Double
  var animation: Animation
  var animationEnd: Double
  var animationLast: Double
  var animationStart: Double
  var attachmentThreshold: Double
  var delay: Double
  var drawOrderThreshold: Double
  var endTime: Double
  var eventThreshold: Double
  var holdPrevious: Boolean
  var interruptAlpha: Double
  var listener: AnimationStateListener
  var loop: Boolean
  var mixBlend: MixBlend
  var mixDuration: Double
  var mixTime: Double
  var mixingFrom: TrackEntry
  var mixingTo: TrackEntry
  var next: TrackEntry
  var nextAnimationLast: Double
  var nextTrackLast: Double
  var time: Double
  var timeScale: Double
  var timelineHoldMix: js.Array[TrackEntry]
  var timelineMode: js.Array[Double]
  var timelinesRotation: js.Array[Double]
  var totalAlpha: Double
  var trackEnd: Double
  var trackIndex: Double
  var trackLast: Double
  var trackTime: Double
  def getAnimationTime(): Double
  def isComplete(): Boolean
  def loopsCount(): Double
  def onComplete(trackIndex: Double, loopCount: Double): js.Any
  def onEnd(trackIndex: Double): js.Any
  def onEvent(trackIndex: Double, event: Event): js.Any
  def onStart(trackIndex: Double): js.Any
  def reset(): Unit
  def resetRotationDirections(): Unit
  def setAnimationLast(animationLast: Double): Unit
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
    endTime: Double,
    eventThreshold: Double,
    getAnimationTime: () => Double,
    holdPrevious: Boolean,
    interruptAlpha: Double,
    isComplete: () => Boolean,
    listener: AnimationStateListener,
    loop: Boolean,
    loopsCount: () => Double,
    mixBlend: MixBlend,
    mixDuration: Double,
    mixTime: Double,
    mixingFrom: TrackEntry,
    mixingTo: TrackEntry,
    next: TrackEntry,
    nextAnimationLast: Double,
    nextTrackLast: Double,
    onComplete: (Double, Double) => js.Any,
    onEnd: Double => js.Any,
    onEvent: (Double, Event) => js.Any,
    onStart: Double => js.Any,
    reset: () => Unit,
    resetRotationDirections: () => Unit,
    setAnimationLast: Double => Unit,
    time: Double,
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
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], animationEnd = animationEnd.asInstanceOf[js.Any], animationLast = animationLast.asInstanceOf[js.Any], animationStart = animationStart.asInstanceOf[js.Any], attachmentThreshold = attachmentThreshold.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], drawOrderThreshold = drawOrderThreshold.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], eventThreshold = eventThreshold.asInstanceOf[js.Any], getAnimationTime = js.Any.fromFunction0(getAnimationTime), holdPrevious = holdPrevious.asInstanceOf[js.Any], interruptAlpha = interruptAlpha.asInstanceOf[js.Any], isComplete = js.Any.fromFunction0(isComplete), listener = listener.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], loopsCount = js.Any.fromFunction0(loopsCount), mixBlend = mixBlend.asInstanceOf[js.Any], mixDuration = mixDuration.asInstanceOf[js.Any], mixTime = mixTime.asInstanceOf[js.Any], mixingFrom = mixingFrom.asInstanceOf[js.Any], mixingTo = mixingTo.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextAnimationLast = nextAnimationLast.asInstanceOf[js.Any], nextTrackLast = nextTrackLast.asInstanceOf[js.Any], onComplete = js.Any.fromFunction2(onComplete), onEnd = js.Any.fromFunction1(onEnd), onEvent = js.Any.fromFunction2(onEvent), onStart = js.Any.fromFunction1(onStart), reset = js.Any.fromFunction0(reset), resetRotationDirections = js.Any.fromFunction0(resetRotationDirections), setAnimationLast = js.Any.fromFunction1(setAnimationLast), time = time.asInstanceOf[js.Any], timeScale = timeScale.asInstanceOf[js.Any], timelineHoldMix = timelineHoldMix.asInstanceOf[js.Any], timelineMode = timelineMode.asInstanceOf[js.Any], timelinesRotation = timelinesRotation.asInstanceOf[js.Any], totalAlpha = totalAlpha.asInstanceOf[js.Any], trackEnd = trackEnd.asInstanceOf[js.Any], trackIndex = trackIndex.asInstanceOf[js.Any], trackLast = trackLast.asInstanceOf[js.Any], trackTime = trackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackEntry]
  }
}


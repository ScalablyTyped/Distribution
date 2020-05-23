package typings.phaser.spine

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
  var eventThreshold: Double
  var holdPrevious: Boolean
  var interruptAlpha: Double
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
}


package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
class TrackEntry () extends js.Object {
  var alpha: Double = js.native
  var animation: Animation = js.native
  var animationEnd: Double = js.native
  var animationLast: Double = js.native
  var animationStart: Double = js.native
  var attachmentThreshold: Double = js.native
  var delay: Double = js.native
  var drawOrderThreshold: Double = js.native
  var endTime: Double = js.native
  var eventThreshold: Double = js.native
  var holdPrevious: Boolean = js.native
  var interruptAlpha: Double = js.native
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
  var time: Double = js.native
  var timeScale: Double = js.native
  var timelineHoldMix: js.Array[TrackEntry] = js.native
  var timelineMode: js.Array[Double] = js.native
  var timelinesRotation: js.Array[Double] = js.native
  var totalAlpha: Double = js.native
  var trackEnd: Double = js.native
  var trackIndex: Double = js.native
  var trackLast: Double = js.native
  var trackTime: Double = js.native
  def getAnimationTime(): Double = js.native
  def isComplete(): Boolean = js.native
  def loopsCount(): Double = js.native
  def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  def onEnd(trackIndex: Double): js.Any = js.native
  def onEvent(trackIndex: Double, event: Event): js.Any = js.native
  def onStart(trackIndex: Double): js.Any = js.native
  def reset(): Unit = js.native
  def resetRotationDirections(): Unit = js.native
  def setAnimationLast(animationLast: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
object TrackEntry extends js.Object {
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
}


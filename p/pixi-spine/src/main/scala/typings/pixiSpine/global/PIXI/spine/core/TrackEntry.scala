package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AnimationStateListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
class TrackEntry ()
  extends typings.pixiSpine.PIXI.spine.core.TrackEntry {
  /* CompleteClass */
  override var alpha: Double = js.native
  /* CompleteClass */
  override var animation: typings.pixiSpine.PIXI.spine.core.Animation = js.native
  /* CompleteClass */
  override var animationEnd: Double = js.native
  /* CompleteClass */
  override var animationLast: Double = js.native
  /* CompleteClass */
  override var animationStart: Double = js.native
  /* CompleteClass */
  override var attachmentThreshold: Double = js.native
  /* CompleteClass */
  override var delay: Double = js.native
  /* CompleteClass */
  override var drawOrderThreshold: Double = js.native
  /* CompleteClass */
  override var endTime: Double = js.native
  /* CompleteClass */
  override var eventThreshold: Double = js.native
  /* CompleteClass */
  override var holdPrevious: Boolean = js.native
  /* CompleteClass */
  override var interruptAlpha: Double = js.native
  /* CompleteClass */
  override var listener: AnimationStateListener = js.native
  /* CompleteClass */
  override var loop: Boolean = js.native
  /* CompleteClass */
  override var mixBlend: typings.pixiSpine.PIXI.spine.core.MixBlend = js.native
  /* CompleteClass */
  override var mixDuration: Double = js.native
  /* CompleteClass */
  override var mixTime: Double = js.native
  /* CompleteClass */
  override var mixingFrom: typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override var mixingTo: typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override var next: typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override var nextAnimationLast: Double = js.native
  /* CompleteClass */
  override var nextTrackLast: Double = js.native
  /* CompleteClass */
  override var time: Double = js.native
  /* CompleteClass */
  override var timeScale: Double = js.native
  /* CompleteClass */
  override var timelineHoldMix: js.Array[typings.pixiSpine.PIXI.spine.core.TrackEntry] = js.native
  /* CompleteClass */
  override var timelineMode: js.Array[Double] = js.native
  /* CompleteClass */
  override var timelinesRotation: js.Array[Double] = js.native
  /* CompleteClass */
  override var totalAlpha: Double = js.native
  /* CompleteClass */
  override var trackEnd: Double = js.native
  /* CompleteClass */
  override var trackIndex: Double = js.native
  /* CompleteClass */
  override var trackLast: Double = js.native
  /* CompleteClass */
  override var trackTime: Double = js.native
  /* CompleteClass */
  override def getAnimationTime(): Double = js.native
  /* CompleteClass */
  override def isComplete(): Boolean = js.native
  /* CompleteClass */
  override def loopsCount(): Double = js.native
  /* CompleteClass */
  override def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  /* CompleteClass */
  override def onEnd(trackIndex: Double): js.Any = js.native
  /* CompleteClass */
  override def onEvent(trackIndex: Double, event: typings.pixiSpine.PIXI.spine.core.Event): js.Any = js.native
  /* CompleteClass */
  override def onStart(trackIndex: Double): js.Any = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def resetRotationDirections(): Unit = js.native
  /* CompleteClass */
  override def setAnimationLast(animationLast: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
object TrackEntry extends js.Object {
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
}


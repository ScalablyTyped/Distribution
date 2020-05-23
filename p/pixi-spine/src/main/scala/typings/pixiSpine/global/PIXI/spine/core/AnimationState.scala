package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AnimationStateListener
import typings.pixiSpine.PIXI.spine.core.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
class AnimationState protected ()
  extends typings.pixiSpine.PIXI.spine.core.AnimationState {
  def this(data: typings.pixiSpine.PIXI.spine.core.AnimationStateData) = this()
  /* CompleteClass */
  override var animationsChanged: Boolean = js.native
  /* CompleteClass */
  override var data: typings.pixiSpine.PIXI.spine.core.AnimationStateData = js.native
  /* CompleteClass */
  override var events: js.Array[typings.pixiSpine.PIXI.spine.core.Event] = js.native
  /* CompleteClass */
  override var listeners: js.Array[AnimationStateListener] = js.native
  /* CompleteClass */
  override var propertyIDs: typings.pixiSpine.PIXI.spine.core.IntSet = js.native
  /* CompleteClass */
  override var queue: typings.pixiSpine.PIXI.spine.core.EventQueue = js.native
  /* CompleteClass */
  override var timeScale: Double = js.native
  /* CompleteClass */
  override var trackEntryPool: typings.pixiSpine.PIXI.spine.core.Pool[typings.pixiSpine.PIXI.spine.core.TrackEntry] = js.native
  /* CompleteClass */
  override var tracks: js.Array[typings.pixiSpine.PIXI.spine.core.TrackEntry] = js.native
  /* CompleteClass */
  override def _animationsChanged(): Unit = js.native
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  /* CompleteClass */
  override def addAnimationWith(
    trackIndex: Double,
    animation: typings.pixiSpine.PIXI.spine.core.Animation,
    loop: Boolean,
    delay: Double
  ): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def addListener(listener: AnimationStateListener): Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton): Boolean = js.native
  /* CompleteClass */
  override def applyMixingFrom(
    to: typings.pixiSpine.PIXI.spine.core.TrackEntry,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend
  ): Double = js.native
  /* CompleteClass */
  override def applyRotateTimeline(
    timeline: Timeline,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    time: Double,
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def clearListenerNotifications(): Unit = js.native
  /* CompleteClass */
  override def clearListeners(): Unit = js.native
  /* CompleteClass */
  override def clearTrack(trackIndex: Double): Unit = js.native
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  /* CompleteClass */
  override def computeHold(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def computeNotLast(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def disposeNext(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def expandToIndex(index: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def getCurrent(trackIndex: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def hasAnimation(animationName: String): Boolean = js.native
  /* CompleteClass */
  override def hasAnimationByName(animationName: String): Boolean = js.native
  /* CompleteClass */
  override def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  /* CompleteClass */
  override def onEnd(trackIndex: Double): js.Any = js.native
  /* CompleteClass */
  override def onEvent(trackIndex: Double, event: typings.pixiSpine.PIXI.spine.core.Event): js.Any = js.native
  /* CompleteClass */
  override def onStart(trackIndex: Double): js.Any = js.native
  /* CompleteClass */
  override def queueEvents(entry: typings.pixiSpine.PIXI.spine.core.TrackEntry, animationTime: Double): Unit = js.native
  /* CompleteClass */
  override def removeListener(listener: AnimationStateListener): Unit = js.native
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  /* CompleteClass */
  override def setAnimationWith(trackIndex: Double, animation: typings.pixiSpine.PIXI.spine.core.Animation, loop: Boolean): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def setCurrent(index: Double, current: typings.pixiSpine.PIXI.spine.core.TrackEntry, interrupt: Boolean): Unit = js.native
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  /* CompleteClass */
  override def trackEntry(
    trackIndex: Double,
    animation: typings.pixiSpine.PIXI.spine.core.Animation,
    loop: Boolean,
    last: typings.pixiSpine.PIXI.spine.core.TrackEntry
  ): typings.pixiSpine.PIXI.spine.core.TrackEntry = js.native
  /* CompleteClass */
  override def update(delta: Double): Unit = js.native
  /* CompleteClass */
  override def updateMixingFrom(to: typings.pixiSpine.PIXI.spine.core.TrackEntry, delta: Double): Boolean = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
object AnimationState extends js.Object {
  var FIRST: Double = js.native
  var HOLD: Double = js.native
  var HOLD_MIX: Double = js.native
  var NOT_LAST: Double = js.native
  var SUBSEQUENT: Double = js.native
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
  var deprecatedWarning3: js.Any = js.native
  var emptyAnimation: typings.pixiSpine.PIXI.spine.core.Animation = js.native
}


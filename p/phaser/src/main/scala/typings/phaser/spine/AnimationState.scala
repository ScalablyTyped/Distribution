package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationState extends js.Object {
  var animationsChanged: Boolean
  var data: AnimationStateData
  var events: js.Array[Event]
  var listeners: js.Array[AnimationStateListener2]
  var propertyIDs: IntSet
  var queue: EventQueue
  var timeScale: Double
  var trackEntryPool: Pool[TrackEntry]
  var tracks: js.Array[TrackEntry]
  def _animationsChanged(): Unit
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry
  def addListener(listener: AnimationStateListener2): Unit
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Double
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: Double,
    alpha: Double,
    blend: MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit
  def clearListenerNotifications(): Unit
  def clearListeners(): Unit
  def clearTrack(trackIndex: Double): Unit
  def clearTracks(): Unit
  def computeHold(entry: TrackEntry): Unit
  def computeNotLast(entry: TrackEntry): Unit
  def disposeNext(entry: TrackEntry): Unit
  def expandToIndex(index: Double): TrackEntry
  def getCurrent(trackIndex: Double): TrackEntry
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit
  def removeListener(listener: AnimationStateListener2): Unit
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry
  def setEmptyAnimations(mixDuration: Double): Unit
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
  def update(delta: Double): Unit
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean
}

object AnimationState {
  @scala.inline
  def apply(
    _animationsChanged: () => Unit,
    addAnimation: (Double, String, Boolean, Double) => TrackEntry,
    addAnimationWith: (Double, Animation, Boolean, Double) => TrackEntry,
    addEmptyAnimation: (Double, Double, Double) => TrackEntry,
    addListener: AnimationStateListener2 => Unit,
    animationsChanged: Boolean,
    apply: Skeleton => Boolean,
    applyMixingFrom: (TrackEntry, Skeleton, MixBlend) => Double,
    applyRotateTimeline: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Unit,
    clearListenerNotifications: () => Unit,
    clearListeners: () => Unit,
    clearTrack: Double => Unit,
    clearTracks: () => Unit,
    computeHold: TrackEntry => Unit,
    computeNotLast: TrackEntry => Unit,
    data: AnimationStateData,
    disposeNext: TrackEntry => Unit,
    events: js.Array[Event],
    expandToIndex: Double => TrackEntry,
    getCurrent: Double => TrackEntry,
    listeners: js.Array[AnimationStateListener2],
    propertyIDs: IntSet,
    queue: EventQueue,
    queueEvents: (TrackEntry, Double) => Unit,
    removeListener: AnimationStateListener2 => Unit,
    setAnimation: (Double, String, Boolean) => TrackEntry,
    setAnimationWith: (Double, Animation, Boolean) => TrackEntry,
    setCurrent: (Double, TrackEntry, Boolean) => Unit,
    setEmptyAnimation: (Double, Double) => TrackEntry,
    setEmptyAnimations: Double => Unit,
    timeScale: Double,
    trackEntry: (Double, Animation, Boolean, TrackEntry) => TrackEntry,
    trackEntryPool: Pool[TrackEntry],
    tracks: js.Array[TrackEntry],
    update: Double => Unit,
    updateMixingFrom: (TrackEntry, Double) => Boolean
  ): AnimationState = {
    val __obj = js.Dynamic.literal(_animationsChanged = js.Any.fromFunction0(_animationsChanged), addAnimation = js.Any.fromFunction4(addAnimation), addAnimationWith = js.Any.fromFunction4(addAnimationWith), addEmptyAnimation = js.Any.fromFunction3(addEmptyAnimation), addListener = js.Any.fromFunction1(addListener), animationsChanged = animationsChanged.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), applyMixingFrom = js.Any.fromFunction3(applyMixingFrom), applyRotateTimeline = js.Any.fromFunction8(applyRotateTimeline), clearListenerNotifications = js.Any.fromFunction0(clearListenerNotifications), clearListeners = js.Any.fromFunction0(clearListeners), clearTrack = js.Any.fromFunction1(clearTrack), clearTracks = js.Any.fromFunction0(clearTracks), computeHold = js.Any.fromFunction1(computeHold), computeNotLast = js.Any.fromFunction1(computeNotLast), data = data.asInstanceOf[js.Any], disposeNext = js.Any.fromFunction1(disposeNext), events = events.asInstanceOf[js.Any], expandToIndex = js.Any.fromFunction1(expandToIndex), getCurrent = js.Any.fromFunction1(getCurrent), listeners = listeners.asInstanceOf[js.Any], propertyIDs = propertyIDs.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueEvents = js.Any.fromFunction2(queueEvents), removeListener = js.Any.fromFunction1(removeListener), setAnimation = js.Any.fromFunction3(setAnimation), setAnimationWith = js.Any.fromFunction3(setAnimationWith), setCurrent = js.Any.fromFunction3(setCurrent), setEmptyAnimation = js.Any.fromFunction2(setEmptyAnimation), setEmptyAnimations = js.Any.fromFunction1(setEmptyAnimations), timeScale = timeScale.asInstanceOf[js.Any], trackEntry = js.Any.fromFunction4(trackEntry), trackEntryPool = trackEntryPool.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), updateMixingFrom = js.Any.fromFunction2(updateMixingFrom))
    __obj.asInstanceOf[AnimationState]
  }
}


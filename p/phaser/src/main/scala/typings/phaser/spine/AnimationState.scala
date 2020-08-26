package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationState extends js.Object {
  var animationsChanged: Boolean = js.native
  var data: AnimationStateData = js.native
  var events: js.Array[Event] = js.native
  var listeners: js.Array[AnimationStateListener2] = js.native
  var propertyIDs: IntSet = js.native
  var queue: EventQueue = js.native
  var timeScale: Double = js.native
  var trackEntryPool: Pool[TrackEntry] = js.native
  var tracks: js.Array[TrackEntry] = js.native
  def _animationsChanged(): Unit = js.native
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry = js.native
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry = js.native
  def addListener(listener: AnimationStateListener2): Unit = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean = js.native
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Double = js.native
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: Double,
    alpha: Double,
    blend: MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  def clearListenerNotifications(): Unit = js.native
  def clearListeners(): Unit = js.native
  def clearTrack(trackIndex: Double): Unit = js.native
  def clearTracks(): Unit = js.native
  def computeHold(entry: TrackEntry): Unit = js.native
  def computeNotLast(entry: TrackEntry): Unit = js.native
  def disposeNext(entry: TrackEntry): Unit = js.native
  def expandToIndex(index: Double): TrackEntry = js.native
  def getCurrent(trackIndex: Double): TrackEntry = js.native
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit = js.native
  def removeListener(listener: AnimationStateListener2): Unit = js.native
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry = js.native
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry = js.native
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry = js.native
  def setEmptyAnimations(mixDuration: Double): Unit = js.native
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry = js.native
  def update(delta: Double): Unit = js.native
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean = js.native
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
  @scala.inline
  implicit class AnimationStateOps[Self <: AnimationState] (val x: Self) extends AnyVal {
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
    def set_animationsChanged(value: () => Unit): Self = this.set("_animationsChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setAddAnimation(value: (Double, String, Boolean, Double) => TrackEntry): Self = this.set("addAnimation", js.Any.fromFunction4(value))
    @scala.inline
    def setAddAnimationWith(value: (Double, Animation, Boolean, Double) => TrackEntry): Self = this.set("addAnimationWith", js.Any.fromFunction4(value))
    @scala.inline
    def setAddEmptyAnimation(value: (Double, Double, Double) => TrackEntry): Self = this.set("addEmptyAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def setAddListener(value: AnimationStateListener2 => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimationsChanged(value: Boolean): Self = this.set("animationsChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: Skeleton => Boolean): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setApplyMixingFrom(value: (TrackEntry, Skeleton, MixBlend) => Double): Self = this.set("applyMixingFrom", js.Any.fromFunction3(value))
    @scala.inline
    def setApplyRotateTimeline(value: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Unit): Self = this.set("applyRotateTimeline", js.Any.fromFunction8(value))
    @scala.inline
    def setClearListenerNotifications(value: () => Unit): Self = this.set("clearListenerNotifications", js.Any.fromFunction0(value))
    @scala.inline
    def setClearListeners(value: () => Unit): Self = this.set("clearListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setClearTrack(value: Double => Unit): Self = this.set("clearTrack", js.Any.fromFunction1(value))
    @scala.inline
    def setClearTracks(value: () => Unit): Self = this.set("clearTracks", js.Any.fromFunction0(value))
    @scala.inline
    def setComputeHold(value: TrackEntry => Unit): Self = this.set("computeHold", js.Any.fromFunction1(value))
    @scala.inline
    def setComputeNotLast(value: TrackEntry => Unit): Self = this.set("computeNotLast", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: AnimationStateData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposeNext(value: TrackEntry => Unit): Self = this.set("disposeNext", js.Any.fromFunction1(value))
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandToIndex(value: Double => TrackEntry): Self = this.set("expandToIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrent(value: Double => TrackEntry): Self = this.set("getCurrent", js.Any.fromFunction1(value))
    @scala.inline
    def setListenersVarargs(value: AnimationStateListener2*): Self = this.set("listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: js.Array[AnimationStateListener2]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyIDs(value: IntSet): Self = this.set("propertyIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: EventQueue): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueEvents(value: (TrackEntry, Double) => Unit): Self = this.set("queueEvents", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveListener(value: AnimationStateListener2 => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAnimation(value: (Double, String, Boolean) => TrackEntry): Self = this.set("setAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def setSetAnimationWith(value: (Double, Animation, Boolean) => TrackEntry): Self = this.set("setAnimationWith", js.Any.fromFunction3(value))
    @scala.inline
    def setSetCurrent(value: (Double, TrackEntry, Boolean) => Unit): Self = this.set("setCurrent", js.Any.fromFunction3(value))
    @scala.inline
    def setSetEmptyAnimation(value: (Double, Double) => TrackEntry): Self = this.set("setEmptyAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def setSetEmptyAnimations(value: Double => Unit): Self = this.set("setEmptyAnimations", js.Any.fromFunction1(value))
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackEntry(value: (Double, Animation, Boolean, TrackEntry) => TrackEntry): Self = this.set("trackEntry", js.Any.fromFunction4(value))
    @scala.inline
    def setTrackEntryPool(value: Pool[TrackEntry]): Self = this.set("trackEntryPool", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracksVarargs(value: TrackEntry*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[TrackEntry]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Double => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMixingFrom(value: (TrackEntry, Double) => Boolean): Self = this.set("updateMixingFrom", js.Any.fromFunction2(value))
  }
  
}


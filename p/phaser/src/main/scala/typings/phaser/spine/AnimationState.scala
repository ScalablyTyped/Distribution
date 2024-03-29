package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  def _animationsChanged(): Unit
  
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry
  
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry
  
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry
  
  def addListener(listener: AnimationStateListener2): Unit
  
  var animationsChanged: Boolean
  
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
  
  var data: AnimationStateData
  
  def disposeNext(entry: TrackEntry): Unit
  
  var events: js.Array[Event]
  
  def expandToIndex(index: Double): TrackEntry
  
  def getCurrent(trackIndex: Double): TrackEntry
  
  var listeners: js.Array[AnimationStateListener2]
  
  var propertyIDs: IntSet
  
  var queue: EventQueue
  
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit
  
  def removeListener(listener: AnimationStateListener2): Unit
  
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry
  
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry
  
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit
  
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry
  
  def setEmptyAnimations(mixDuration: Double): Unit
  
  var timeScale: Double
  
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
  
  var trackEntryPool: Pool[TrackEntry]
  
  var tracks: js.Array[TrackEntry]
  
  def update(delta: Double): Unit
  
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean
}
object AnimationState {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
    
    inline def setAddAnimation(value: (Double, String, Boolean, Double) => TrackEntry): Self = StObject.set(x, "addAnimation", js.Any.fromFunction4(value))
    
    inline def setAddAnimationWith(value: (Double, Animation, Boolean, Double) => TrackEntry): Self = StObject.set(x, "addAnimationWith", js.Any.fromFunction4(value))
    
    inline def setAddEmptyAnimation(value: (Double, Double, Double) => TrackEntry): Self = StObject.set(x, "addEmptyAnimation", js.Any.fromFunction3(value))
    
    inline def setAddListener(value: AnimationStateListener2 => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setAnimationsChanged(value: Boolean): Self = StObject.set(x, "animationsChanged", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Skeleton => Boolean): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyMixingFrom(value: (TrackEntry, Skeleton, MixBlend) => Double): Self = StObject.set(x, "applyMixingFrom", js.Any.fromFunction3(value))
    
    inline def setApplyRotateTimeline(value: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Unit): Self = StObject.set(x, "applyRotateTimeline", js.Any.fromFunction8(value))
    
    inline def setClearListenerNotifications(value: () => Unit): Self = StObject.set(x, "clearListenerNotifications", js.Any.fromFunction0(value))
    
    inline def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    inline def setClearTrack(value: Double => Unit): Self = StObject.set(x, "clearTrack", js.Any.fromFunction1(value))
    
    inline def setClearTracks(value: () => Unit): Self = StObject.set(x, "clearTracks", js.Any.fromFunction0(value))
    
    inline def setComputeHold(value: TrackEntry => Unit): Self = StObject.set(x, "computeHold", js.Any.fromFunction1(value))
    
    inline def setComputeNotLast(value: TrackEntry => Unit): Self = StObject.set(x, "computeNotLast", js.Any.fromFunction1(value))
    
    inline def setData(value: AnimationStateData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDisposeNext(value: TrackEntry => Unit): Self = StObject.set(x, "disposeNext", js.Any.fromFunction1(value))
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExpandToIndex(value: Double => TrackEntry): Self = StObject.set(x, "expandToIndex", js.Any.fromFunction1(value))
    
    inline def setGetCurrent(value: Double => TrackEntry): Self = StObject.set(x, "getCurrent", js.Any.fromFunction1(value))
    
    inline def setListeners(value: js.Array[AnimationStateListener2]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: AnimationStateListener2*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setPropertyIDs(value: IntSet): Self = StObject.set(x, "propertyIDs", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: EventQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueEvents(value: (TrackEntry, Double) => Unit): Self = StObject.set(x, "queueEvents", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(value: AnimationStateListener2 => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    
    inline def setSetAnimation(value: (Double, String, Boolean) => TrackEntry): Self = StObject.set(x, "setAnimation", js.Any.fromFunction3(value))
    
    inline def setSetAnimationWith(value: (Double, Animation, Boolean) => TrackEntry): Self = StObject.set(x, "setAnimationWith", js.Any.fromFunction3(value))
    
    inline def setSetCurrent(value: (Double, TrackEntry, Boolean) => Unit): Self = StObject.set(x, "setCurrent", js.Any.fromFunction3(value))
    
    inline def setSetEmptyAnimation(value: (Double, Double) => TrackEntry): Self = StObject.set(x, "setEmptyAnimation", js.Any.fromFunction2(value))
    
    inline def setSetEmptyAnimations(value: Double => Unit): Self = StObject.set(x, "setEmptyAnimations", js.Any.fromFunction1(value))
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTrackEntry(value: (Double, Animation, Boolean, TrackEntry) => TrackEntry): Self = StObject.set(x, "trackEntry", js.Any.fromFunction4(value))
    
    inline def setTrackEntryPool(value: Pool[TrackEntry]): Self = StObject.set(x, "trackEntryPool", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[TrackEntry]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: TrackEntry*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setUpdateMixingFrom(value: (TrackEntry, Double) => Boolean): Self = StObject.set(x, "updateMixingFrom", js.Any.fromFunction2(value))
    
    inline def set_animationsChanged(value: () => Unit): Self = StObject.set(x, "_animationsChanged", js.Any.fromFunction0(value))
  }
}

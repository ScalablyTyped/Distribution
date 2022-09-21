package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IAnimation
import typings.pixiSpineBase.mod.IAnimationState
import typings.pixiSpineBase.mod.IAnimationStateListener
import typings.pixiSpineBase.mod.IBone
import typings.pixiSpineBase.mod.IBoneData
import typings.pixiSpineBase.mod.IEventData
import typings.pixiSpineBase.mod.IIkConstraintData
import typings.pixiSpineBase.mod.IPathConstraintData
import typings.pixiSpineBase.mod.ISkeleton
import typings.pixiSpineBase.mod.ISkeletonData
import typings.pixiSpineBase.mod.ISkin
import typings.pixiSpineBase.mod.ISlot
import typings.pixiSpineBase.mod.ISlotData
import typings.pixiSpineBase.mod.ITimeline
import typings.pixiSpineBase.mod.ITrackEntry
import typings.pixiSpineBase.mod.ITransformConstraintData
import typings.pixiSpineBase.mod.IntSet
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.Pool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "AnimationState")
@js.native
open class AnimationState protected ()
  extends StObject
     with IAnimationState[AnimationStateData] {
  def this(data: AnimationStateData) = this()
  
  def _animationsChanged(): Unit = js.native
  
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): ITrackEntry = js.native
  
  def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  
  def addAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean, delay: Double): TrackEntry = js.native
  
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): ITrackEntry = js.native
  
  /* CompleteClass */
  override def addListener(listener: IAnimationStateListener): Unit = js.native
  def addListener(listener: AnimationStateListener): Unit = js.native
  
  var animationsChanged: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: ISkeleton[
      ISkeletonData[
        IBoneData, 
        ISlotData, 
        ISkin, 
        IAnimation[ITimeline], 
        IEventData, 
        IIkConstraintData, 
        ITransformConstraintData, 
        IPathConstraintData
      ], 
      IBone, 
      ISlot, 
      ISkin
    ]
  ): Boolean = js.native
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
  
  /* CompleteClass */
  override def clearListeners(): Unit = js.native
  
  /* CompleteClass */
  override def clearTrack(index: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  
  /* CompleteClass */
  var data: AnimationStateData = js.native
  
  def disposeNext(entry: TrackEntry): Unit = js.native
  
  var events: js.Array[Event2] = js.native
  
  def expandToIndex(index: Double): TrackEntry = js.native
  
  def getCurrent(trackIndex: Double): TrackEntry = js.native
  
  /* CompleteClass */
  override def hasAnimation(animationName: String): Boolean = js.native
  
  def hasAnimationByName(animationName: String): Boolean = js.native
  
  def hasTimeline(entry: TrackEntry, id: Double): Boolean = js.native
  
  /* CompleteClass */
  var listeners: js.Array[IAnimationStateListener] = js.native
  @JSName("listeners")
  var listeners_AnimationState: js.Array[AnimationStateListener] = js.native
  
  def onComplete(trackIndex: Double, loopCount: Double): Any = js.native
  
  def onEnd(trackIndex: Double): Any = js.native
  
  def onEvent(trackIndex: Double, event: Event2): Any = js.native
  
  def onStart(trackIndex: Double): Any = js.native
  
  var propertyIDs: IntSet = js.native
  
  var queue: EventQueue = js.native
  
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit = js.native
  
  /* CompleteClass */
  override def removeListener(listener: IAnimationStateListener): Unit = js.native
  /** Removes the listener added with {@link #addListener(AnimationStateListener)}. */
  def removeListener(listener: AnimationStateListener): Unit = js.native
  
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): ITrackEntry = js.native
  
  def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  
  def setAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean): TrackEntry = js.native
  
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): ITrackEntry = js.native
  
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  
  def setTimelineModes(entry: TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  def trackEntry(trackIndex: Double, animation: Animation2, loop: Boolean, last: TrackEntry): TrackEntry = js.native
  
  var trackEntryPool: Pool[TrackEntry] = js.native
  
  /* CompleteClass */
  var tracks: js.Array[ITrackEntry] = js.native
  @JSName("tracks")
  var tracks_AnimationState: js.Array[TrackEntry] = js.native
  
  /* CompleteClass */
  override def update(dt: Double): Unit = js.native
  
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean = js.native
}
/* static members */
object AnimationState {
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.FIRST")
  @js.native
  def FIRST: Double = js.native
  inline def FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.HOLD")
  @js.native
  def HOLD: Double = js.native
  inline def HOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.HOLD_MIX")
  @js.native
  def HOLD_MIX: Double = js.native
  inline def HOLD_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_MIX")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.SUBSEQUENT")
  @js.native
  def SUBSEQUENT: Double = js.native
  inline def SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.deprecatedWarning2")
  @js.native
  def deprecatedWarning2: Any = js.native
  inline def deprecatedWarning2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.deprecatedWarning3")
  @js.native
  def deprecatedWarning3: Any = js.native
  inline def deprecatedWarning3_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "AnimationState.emptyAnimation")
  @js.native
  def emptyAnimation: Animation2 = js.native
  inline def emptyAnimation_=(x: Animation2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyAnimation")(x.asInstanceOf[js.Any])
}

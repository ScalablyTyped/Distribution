package typings.pixiSpineRuntime38.mod

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

@JSImport("@pixi-spine/runtime-3.8", "AnimationState")
@js.native
open class AnimationState protected ()
  extends StObject
     with IAnimationState[AnimationStateData] {
  def this(data: AnimationStateData) = this()
  
  def _animationsChanged(): Unit = js.native
  
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): ITrackEntry = js.native
  
  def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  
  /** Adds an animation to be played after the current or last queued animation for a track. If the track is empty, it is
    * equivalent to calling {@link #setAnimationWith()}.
    * @param delay If > 0, sets {@link TrackEntry#delay}. If <= 0, the delay set is the duration of the previous track entry
    *           minus any mix duration (from the {@link AnimationStateData}) plus the specified `delay` (ie the mix
    *           ends at (`delay` = 0) or before (`delay` < 0) the previous track entry duration). If the
    *           previous entry is looping, its next loop completion is used instead of its duration.
    * @returns A track entry to allow further customization of animation playback. References to the track entry must not be kept
    *         after the {@link AnimationStateListener#dispose()} event occurs. */
  def addAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean, delay: Double): TrackEntry = js.native
  
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): ITrackEntry = js.native
  
  /* CompleteClass */
  override def addListener(listener: IAnimationStateListener): Unit = js.native
  /** Adds a listener to receive events for all track entries. */
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
  /** Poses the skeleton using the track entry animations. There are no side effects other than invoking listeners, so the
    * animation state can be applied to multiple skeletons to pose them identically.
    * @returns True if any animations were applied. */
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean = js.native
  
  def applyAttachmentTimeline(
    timeline: AttachmentTimeline,
    skeleton: Skeleton,
    time: Double,
    blend: MixBlend,
    attachments: Boolean
  ): Unit = js.native
  
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
  
  /** Discards all listener notifications that have not yet been delivered. This can be useful to call from an
    * {@link AnimationStateListener} when it is known that further notifications that may have been already queued for delivery
    * are not wanted because new animations are being set. */
  def clearListenerNotifications(): Unit = js.native
  
  /* CompleteClass */
  override def clearListeners(): Unit = js.native
  
  /* CompleteClass */
  override def clearTrack(index: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  
  def computeHold(entry: TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var data: AnimationStateData = js.native
  
  def disposeNext(entry: TrackEntry): Unit = js.native
  
  var events: js.Array[Event2] = js.native
  
  def expandToIndex(index: Double): TrackEntry = js.native
  
  /** Returns the track entry for the animation currently playing on the track, or null if no animation is currently playing. */
  def getCurrent(trackIndex: Double): TrackEntry = js.native
  
  /* CompleteClass */
  override def hasAnimation(animationName: String): Boolean = js.native
  
  def hasAnimationByName(animationName: String): Boolean = js.native
  
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
  /** Removes the listener added with {@link #addListener()}. */
  def removeListener(listener: AnimationStateListener): Unit = js.native
  
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): ITrackEntry = js.native
  
  def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  
  /** Sets the current animation for a track, discarding any queued animations. If the formerly current track entry was never
    * applied to a skeleton, it is replaced (not mixed from).
    * @param loop If true, the animation will repeat. If false it will not, instead its last frame is applied if played beyond its
    *           duration. In either case {@link TrackEntry#trackEnd} determines when the track is cleared.
    * @returns A track entry to allow further customization of animation playback. References to the track entry must not be kept
    *         after the {@link AnimationStateListener#dispose()} event occurs. */
  def setAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean): TrackEntry = js.native
  
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: String, attachments: Boolean): Unit = js.native
  
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): ITrackEntry = js.native
  
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  /** @param last May be null. */
  def trackEntry(trackIndex: Double, animation: Animation2, loop: Boolean, last: TrackEntry): TrackEntry = js.native
  
  var trackEntryPool: Pool[TrackEntry] = js.native
  
  /* CompleteClass */
  var tracks: js.Array[ITrackEntry] = js.native
  /** The list of tracks that currently have animations, which may contain null entries. */
  @JSName("tracks")
  var tracks_AnimationState: js.Array[TrackEntry] = js.native
  
  var unkeyedState: Double = js.native
  
  /* CompleteClass */
  override def update(dt: Double): Unit = js.native
  
  /** Returns true when all mixing from entries are complete. */
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean = js.native
}
/* static members */
object AnimationState {
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.CURRENT")
  @js.native
  def CURRENT: Double = js.native
  inline def CURRENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CURRENT")(x.asInstanceOf[js.Any])
  
  /** 1. This is the first timeline to set this property.
    * 2. The next track entry applied after this one does not have a timeline to set this property.
    *
    * Result: Mix from the setup pose to the timeline pose. */
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.FIRST")
  @js.native
  def FIRST: Double = js.native
  inline def FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST")(x.asInstanceOf[js.Any])
  
  /** 1) This is the first timeline to set this property.<br>
    * 2) The next track entry to be applied does have a timeline to set this property.<br>
    * 3) The next track entry after that one does not have a timeline to set this property.<br>
    * Result: Mix from the setup pose to the timeline pose, but do not mix out. This avoids "dipping" when crossfading animations
    * that key the same property. A subsequent timeline will set this property using a mix. */
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.HOLD_FIRST")
  @js.native
  def HOLD_FIRST: Double = js.native
  inline def HOLD_FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_FIRST")(x.asInstanceOf[js.Any])
  
  /** 1. This is the first timeline to set this property.
    * 2. The next track entry to be applied does have a timeline to set this property.
    * 3. The next track entry after that one does have a timeline to set this property.
    * 4. timelineHoldMix stores the first subsequent track entry that does not have a timeline to set this property.
    *
    * Result: The same as HOLD except the mix percentage from the timelineHoldMix track entry is used. This handles when more than
    * 2 track entries in a row have a timeline that sets the same property.
    *
    * Eg, A -> B -> C -> D where A, B, and C have a timeline setting same property, but D does not. When A is applied, to avoid
    * "dipping" A is not mixed out, however D (the first entry that doesn't set the property) mixing in is used to mix out A
    * (which affects B and C). Without using D to mix out, A would be applied fully until mixing completes, then snap into
    * place. */
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.HOLD_MIX")
  @js.native
  def HOLD_MIX: Double = js.native
  inline def HOLD_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_MIX")(x.asInstanceOf[js.Any])
  
  /** 1) A previously applied timeline has set this property.<br>
    * 2) The next track entry to be applied does have a timeline to set this property.<br>
    * 3) The next track entry after that one does not have a timeline to set this property.<br>
    * Result: Mix from the current pose to the timeline pose, but do not mix out. This avoids "dipping" when crossfading
    * animations that key the same property. A subsequent timeline will set this property using a mix. */
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.HOLD_SUBSEQUENT")
  @js.native
  def HOLD_SUBSEQUENT: Double = js.native
  inline def HOLD_SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.SETUP")
  @js.native
  def SETUP: Double = js.native
  inline def SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SETUP")(x.asInstanceOf[js.Any])
  
  /** 1. A previously applied timeline has set this property.
    *
    * Result: Mix from the current pose to the timeline pose. */
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.SUBSEQUENT")
  @js.native
  def SUBSEQUENT: Double = js.native
  inline def SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.deprecatedWarning2")
  @js.native
  def deprecatedWarning2: Any = js.native
  inline def deprecatedWarning2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.deprecatedWarning3")
  @js.native
  def deprecatedWarning3: Any = js.native
  inline def deprecatedWarning3_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.8", "AnimationState.emptyAnimation")
  @js.native
  def emptyAnimation: Animation2 = js.native
  inline def emptyAnimation_=(x: Animation2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyAnimation")(x.asInstanceOf[js.Any])
}

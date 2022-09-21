package typings.pixiSpineRuntime41.mod

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
import typings.pixiSpineBase.mod.MixBlend
import typings.pixiSpineBase.mod.Pool
import typings.pixiSpineBase.mod.StringSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-4.1", "AnimationState")
@js.native
open class AnimationState protected ()
  extends StObject
     with IAnimationState[AnimationStateData] {
  def this(data: AnimationStateData) = this()
  
  def _animationsChanged(): Unit = js.native
  
  /** Queues an animation by name.
    *
    * See {@link #addAnimationWith()}. */
  def addAnimation(trackIndex: Double, animationName: String): TrackEntry = js.native
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry = js.native
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): ITrackEntry = js.native
  def addAnimation(trackIndex: Double, animationName: String, loop: Unit, delay: Double): TrackEntry = js.native
  
  def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  
  /** Adds an animation to be played after the current or last queued animation for a track. If the track is empty, it is
    * equivalent to calling {@link #setAnimationWith()}.
    * @param delay If > 0, sets {@link TrackEntry#delay}. If <= 0, the delay set is the duration of the previous track entry
    *           minus any mix duration (from the {@link AnimationStateData}) plus the specified `delay` (ie the mix
    *           ends at (`delay` = 0) or before (`delay` < 0) the previous track entry duration). If the
    *           previous entry is looping, its next loop completion is used instead of its duration.
    * @returns A track entry to allow further customization of animation playback. References to the track entry must not be kept
    *         after the {@link AnimationStateListener#dispose()} event occurs. */
  def addAnimationWith(trackIndex: Double, animation: Animation2): TrackEntry = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean): TrackEntry = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean, delay: Double): TrackEntry = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation2, loop: Unit, delay: Double): TrackEntry = js.native
  
  /** Adds an empty animation to be played after the current or last queued animation for a track, and sets the track entry's
    * {@link TrackEntry#mixDuration}. If the track is empty, it is equivalent to calling
    * {@link #setEmptyAnimation()}.
    *
    * See {@link #setEmptyAnimation()}.
    * @param delay If > 0, sets {@link TrackEntry#delay}. If <= 0, the delay set is the duration of the previous track entry
    *           minus any mix duration plus the specified `delay` (ie the mix ends at (`delay` = 0) or
    *           before (`delay` < 0) the previous track entry duration). If the previous entry is looping, its next
    *           loop completion is used instead of its duration.
    * @return A track entry to allow further customization of animation playback. References to the track entry must not be kept
    *         after the {@link AnimationStateListener#dispose()} event occurs. */
  def addEmptyAnimation(trackIndex: Double): TrackEntry = js.native
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry = js.native
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): ITrackEntry = js.native
  def addEmptyAnimation(trackIndex: Double, mixDuration: Unit, delay: Double): TrackEntry = js.native
  
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
    timeline: RotateTimeline,
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
  
  /** Removes the {@link TrackEntry#getNext() next entry} and all entries after it for the specified entry. */
  def clearNext(entry: TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def clearTrack(index: Double): Unit = js.native
  
  /* CompleteClass */
  override def clearTracks(): Unit = js.native
  
  def computeHold(entry: TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var data: AnimationStateData = js.native
  
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
  
  var propertyIDs: StringSet = js.native
  
  var queue: EventQueue = js.native
  
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit = js.native
  
  /* CompleteClass */
  override def removeListener(listener: IAnimationStateListener): Unit = js.native
  /** Removes the listener added with {@link #addListener()}. */
  def removeListener(listener: AnimationStateListener): Unit = js.native
  
  /** Sets an animation by name.
    *
    * See {@link #setAnimationWith()}. */
  def setAnimation(trackIndex: Double, animationName: String): TrackEntry = js.native
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): ITrackEntry = js.native
  
  def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  
  /** Sets the current animation for a track, discarding any queued animations. If the formerly current track entry was never
    * applied to a skeleton, it is replaced (not mixed from).
    * @param loop If true, the animation will repeat. If false it will not, instead its last frame is applied if played beyond its
    *           duration. In either case {@link TrackEntry#trackEnd} determines when the track is cleared.
    * @returns A track entry to allow further customization of animation playback. References to the track entry must not be kept
    *         after the {@link AnimationStateListener#dispose()} event occurs. */
  def setAnimationWith(trackIndex: Double, animation: Animation2): TrackEntry = js.native
  def setAnimationWith(trackIndex: Double, animation: Animation2, loop: Boolean): TrackEntry = js.native
  
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: String, attachments: Boolean): Unit = js.native
  def setAttachment(skeleton: Skeleton, slot: Slot, attachmentName: Null, attachments: Boolean): Unit = js.native
  
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  
  /** Sets an empty animation for a track, discarding any queued animations, and sets the track entry's
    * {@link TrackEntry#mixduration}. An empty animation has no timelines and serves as a placeholder for mixing in or out.
    *
    * Mixing out is done by setting an empty animation with a mix duration using either {@link #setEmptyAnimation()},
    * {@link #setEmptyAnimations()}, or {@link #addEmptyAnimation()}. Mixing to an empty animation causes
    * the previous animation to be applied less and less over the mix duration. Properties keyed in the previous animation
    * transition to the value from lower tracks or to the setup pose value if no lower tracks key the property. A mix duration of
    * 0 still mixes out over one frame.
    *
    * Mixing in is done by first setting an empty animation, then adding an animation using
    * {@link #addAnimation()} and on the returned track entry, set the
    * {@link TrackEntry#setMixDuration()}. Mixing from an empty animation causes the new animation to be applied more and
    * more over the mix duration. Properties keyed in the new animation transition from the value from lower tracks or from the
    * setup pose value if no lower tracks key the property to the value keyed in the new animation. */
  def setEmptyAnimation(trackIndex: Double): TrackEntry = js.native
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): ITrackEntry = js.native
  
  /** Sets an empty animation for every track, discarding any queued animations, and mixes to it over the specified mix
    * duration. */
  def setEmptyAnimations(): Unit = js.native
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  /** @param last May be null. */
  def trackEntry(trackIndex: Double, animation: Animation2, loop: Boolean): TrackEntry = js.native
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
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState._emptyAnimation")
  @js.native
  def _emptyAnimation: Animation2 = js.native
  inline def _emptyAnimation_=(x: Animation2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_emptyAnimation")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState.deprecatedWarning2")
  @js.native
  def deprecatedWarning2: Any = js.native
  inline def deprecatedWarning2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning2")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState.deprecatedWarning3")
  @js.native
  def deprecatedWarning3: Any = js.native
  inline def deprecatedWarning3_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning3")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-4.1", "AnimationState.emptyAnimation")
  @js.native
  def emptyAnimation: Any = js.native
  inline def emptyAnimation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyAnimation")(x.asInstanceOf[js.Any])
}

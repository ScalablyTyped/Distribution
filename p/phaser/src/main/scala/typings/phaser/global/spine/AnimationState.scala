package typings.phaser.global.spine

import typings.phaser.spine.AnimationStateListener2
import typings.phaser.spine.Timeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.AnimationState")
@js.native
open class AnimationState protected ()
  extends StObject
     with typings.phaser.spine.AnimationState {
  def this(data: typings.phaser.spine.AnimationStateData) = this()
  
  /* CompleteClass */
  override def _animationsChanged(): Unit = js.native
  
  /* CompleteClass */
  override def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def addAnimationWith(trackIndex: Double, animation: typings.phaser.spine.Animation, loop: Boolean, delay: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def addListener(listener: AnimationStateListener2): Unit = js.native
  
  /* CompleteClass */
  var animationsChanged: Boolean = js.native
  
  /* CompleteClass */
  @JSName("apply")
  override def apply(skeleton: typings.phaser.spine.Skeleton): Boolean = js.native
  
  /* CompleteClass */
  override def applyMixingFrom(
    to: typings.phaser.spine.TrackEntry,
    skeleton: typings.phaser.spine.Skeleton,
    blend: typings.phaser.spine.MixBlend
  ): Double = js.native
  
  /* CompleteClass */
  override def applyRotateTimeline(
    timeline: Timeline,
    skeleton: typings.phaser.spine.Skeleton,
    time: Double,
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
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
  override def computeHold(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def computeNotLast(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var data: typings.phaser.spine.AnimationStateData = js.native
  
  /* CompleteClass */
  override def disposeNext(entry: typings.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var events: js.Array[typings.phaser.spine.Event] = js.native
  
  /* CompleteClass */
  override def expandToIndex(index: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def getCurrent(trackIndex: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  var listeners: js.Array[AnimationStateListener2] = js.native
  
  /* CompleteClass */
  var propertyIDs: typings.phaser.spine.IntSet = js.native
  
  /* CompleteClass */
  var queue: typings.phaser.spine.EventQueue = js.native
  
  /* CompleteClass */
  override def queueEvents(entry: typings.phaser.spine.TrackEntry, animationTime: Double): Unit = js.native
  
  /* CompleteClass */
  override def removeListener(listener: AnimationStateListener2): Unit = js.native
  
  /* CompleteClass */
  override def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def setAnimationWith(trackIndex: Double, animation: typings.phaser.spine.Animation, loop: Boolean): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def setCurrent(index: Double, current: typings.phaser.spine.TrackEntry, interrupt: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setEmptyAnimation(trackIndex: Double, mixDuration: Double): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  override def setEmptyAnimations(mixDuration: Double): Unit = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  /* CompleteClass */
  override def trackEntry(
    trackIndex: Double,
    animation: typings.phaser.spine.Animation,
    loop: Boolean,
    last: typings.phaser.spine.TrackEntry
  ): typings.phaser.spine.TrackEntry = js.native
  
  /* CompleteClass */
  var trackEntryPool: typings.phaser.spine.Pool[typings.phaser.spine.TrackEntry] = js.native
  
  /* CompleteClass */
  var tracks: js.Array[typings.phaser.spine.TrackEntry] = js.native
  
  /* CompleteClass */
  override def update(delta: Double): Unit = js.native
  
  /* CompleteClass */
  override def updateMixingFrom(to: typings.phaser.spine.TrackEntry, delta: Double): Boolean = js.native
}
object AnimationState {
  
  @JSGlobal("spine.AnimationState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.AnimationState.FIRST")
  @js.native
  def FIRST: Double = js.native
  inline def FIRST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AnimationState.HOLD")
  @js.native
  def HOLD: Double = js.native
  inline def HOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AnimationState.HOLD_MIX")
  @js.native
  def HOLD_MIX: Double = js.native
  inline def HOLD_MIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOLD_MIX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AnimationState.NOT_LAST")
  @js.native
  def NOT_LAST: Double = js.native
  inline def NOT_LAST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_LAST")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AnimationState.SUBSEQUENT")
  @js.native
  def SUBSEQUENT: Double = js.native
  inline def SUBSEQUENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSEQUENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.AnimationState.emptyAnimation")
  @js.native
  def emptyAnimation: typings.phaser.spine.Animation = js.native
  inline def emptyAnimation_=(x: typings.phaser.spine.Animation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyAnimation")(x.asInstanceOf[js.Any])
}

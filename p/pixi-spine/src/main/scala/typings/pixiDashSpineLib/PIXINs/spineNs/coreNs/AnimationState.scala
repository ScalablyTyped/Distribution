package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
class AnimationState protected () extends js.Object {
  def this(data: AnimationStateData) = this()
  var animationsChanged: scala.Boolean = js.native
  var data: AnimationStateData = js.native
  var events: js.Array[Event] = js.native
  var listeners: js.Array[AnimationStateListener2] = js.native
  var mixingTo: js.Array[TrackEntry] = js.native
  var propertyIDs: IntSet = js.native
  var queue: EventQueue = js.native
  var timeScale: scala.Double = js.native
  var trackEntryPool: Pool[TrackEntry] = js.native
  var tracks: js.Array[TrackEntry] = js.native
  def _animationsChanged(): scala.Unit = js.native
  def addAnimation(trackIndex: scala.Double, animationName: java.lang.String, loop: scala.Boolean): TrackEntry = js.native
  def addAnimation(
    trackIndex: scala.Double,
    animationName: java.lang.String,
    loop: scala.Boolean,
    delay: scala.Double
  ): TrackEntry = js.native
  def addAnimationByName(
    trackIndex: scala.Double,
    animationName: java.lang.String,
    loop: scala.Boolean,
    delay: scala.Double
  ): scala.Unit = js.native
  def addAnimationWith(trackIndex: scala.Double, animation: Animation, loop: scala.Boolean): TrackEntry = js.native
  def addAnimationWith(trackIndex: scala.Double, animation: Animation, loop: scala.Boolean, delay: scala.Double): TrackEntry = js.native
  def addEmptyAnimation(trackIndex: scala.Double, mixDuration: scala.Double, delay: scala.Double): TrackEntry = js.native
  def addListener(listener: AnimationStateListener2): scala.Unit = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton): scala.Boolean = js.native
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, currentPose: MixPose): scala.Double = js.native
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: scala.Double,
    alpha: scala.Double,
    pose: MixPose,
    timelinesRotation: js.Array[scala.Double],
    i: scala.Double,
    firstFrame: scala.Boolean
  ): scala.Unit = js.native
  def clearListenerNotifications(): scala.Unit = js.native
  def clearListeners(): scala.Unit = js.native
  def clearTrack(trackIndex: scala.Double): scala.Unit = js.native
  def clearTracks(): scala.Unit = js.native
  def disposeNext(entry: TrackEntry): scala.Unit = js.native
  def expandToIndex(index: scala.Double): TrackEntry = js.native
  def getCurrent(trackIndex: scala.Double): TrackEntry = js.native
  def hasAnimation(animationName: java.lang.String): scala.Boolean = js.native
  def hasAnimationByName(animationName: java.lang.String): scala.Boolean = js.native
  def onComplete(trackIndex: scala.Double, loopCount: scala.Double): js.Any = js.native
  def onEnd(trackIndex: scala.Double): js.Any = js.native
  def onEvent(trackIndex: scala.Double, event: Event): js.Any = js.native
  def onStart(trackIndex: scala.Double): js.Any = js.native
  def queueEvents(entry: TrackEntry, animationTime: scala.Double): scala.Unit = js.native
  def removeListener(listener: AnimationStateListener2): scala.Unit = js.native
  def setAnimation(trackIndex: scala.Double, animationName: java.lang.String, loop: scala.Boolean): TrackEntry = js.native
  def setAnimationByName(trackIndex: scala.Double, animationName: java.lang.String, loop: scala.Boolean): scala.Unit = js.native
  def setAnimationWith(trackIndex: scala.Double, animation: Animation, loop: scala.Boolean): TrackEntry = js.native
  def setCurrent(index: scala.Double, current: TrackEntry, interrupt: scala.Boolean): scala.Unit = js.native
  def setEmptyAnimation(trackIndex: scala.Double, mixDuration: scala.Double): TrackEntry = js.native
  def setEmptyAnimations(mixDuration: scala.Double): scala.Unit = js.native
  def trackEntry(trackIndex: scala.Double, animation: Animation, loop: scala.Boolean, last: TrackEntry): TrackEntry = js.native
  def update(delta: scala.Double): scala.Unit = js.native
  def updateMixingFrom(to: TrackEntry, delta: scala.Double): scala.Boolean = js.native
}

@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
object AnimationState extends js.Object {
  var DIP: scala.Double = js.native
  var DIP_MIX: scala.Double = js.native
  var FIRST: scala.Double = js.native
  var SUBSEQUENT: scala.Double = js.native
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
  var deprecatedWarning3: js.Any = js.native
  var emptyAnimation: pixiDashSpineLib.PIXINs.spineNs.coreNs.Animation = js.native
}


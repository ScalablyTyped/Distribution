package typings.pixiSpineRuntime37.mod

import typings.pixiSpineBase.mod.IAnimationStateListener
import typings.pixiSpineBase.mod.ITrackEntry
import typings.pixiSpineBase.mod.MixBlend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/runtime-3.7", "TrackEntry")
@js.native
open class TrackEntry ()
  extends StObject
     with ITrackEntry {
  
  /* CompleteClass */
  var alpha: Double = js.native
  
  var animation: Animation2 = js.native
  
  /* CompleteClass */
  var animationEnd: Double = js.native
  
  var animationLast: Double = js.native
  
  var animationStart: Double = js.native
  
  var attachmentThreshold: Double = js.native
  
  /* CompleteClass */
  var delay: Double = js.native
  
  var drawOrderThreshold: Double = js.native
  
  def endTime: Double = js.native
  def endTime_=(value: Double): Unit = js.native
  
  var eventThreshold: Double = js.native
  
  def getAnimationTime(): Double = js.native
  
  var holdPrevious: Boolean = js.native
  
  /* CompleteClass */
  var interruptAlpha: Double = js.native
  
  def isComplete(): Boolean = js.native
  
  /* CompleteClass */
  var listener: IAnimationStateListener = js.native
  @JSName("listener")
  var listener_TrackEntry: AnimationStateListener = js.native
  
  /* CompleteClass */
  var loop: Boolean = js.native
  
  def loopsCount(): Double = js.native
  
  var mixBlend: MixBlend = js.native
  
  /* CompleteClass */
  var mixDuration: Double = js.native
  
  /* CompleteClass */
  var mixTime: Double = js.native
  
  var mixingFrom: TrackEntry = js.native
  
  var mixingTo: TrackEntry = js.native
  
  var next: TrackEntry = js.native
  
  var nextAnimationLast: Double = js.native
  
  /* CompleteClass */
  var nextTrackLast: Double = js.native
  
  def onComplete(trackIndex: Double, loopCount: Double): Any = js.native
  
  def onEnd(trackIndex: Double): Any = js.native
  
  def onEvent(trackIndex: Double, event: Event2): Any = js.native
  
  def onStart(trackIndex: Double): Any = js.native
  
  def reset(): Unit = js.native
  
  def resetRotationDirections(): Unit = js.native
  
  def setAnimationLast(animationLast: Double): Unit = js.native
  
  def time: Double = js.native
  
  /* CompleteClass */
  var timeScale: Double = js.native
  
  def time_=(value: Double): Unit = js.native
  
  var timelineHoldMix: js.Array[TrackEntry] = js.native
  
  var timelineMode: js.Array[Double] = js.native
  
  var timelinesRotation: js.Array[Double] = js.native
  
  /* CompleteClass */
  var totalAlpha: Double = js.native
  
  /* CompleteClass */
  var trackEnd: Double = js.native
  
  /* CompleteClass */
  var trackIndex: Double = js.native
  
  /* CompleteClass */
  var trackLast: Double = js.native
  
  /* CompleteClass */
  var trackTime: Double = js.native
}
/* static members */
object TrackEntry {
  
  @JSImport("@pixi-spine/runtime-3.7", "TrackEntry")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/runtime-3.7", "TrackEntry.deprecatedWarning1")
  @js.native
  def deprecatedWarning1: Any = js.native
  inline def deprecatedWarning1_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning1")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/runtime-3.7", "TrackEntry.deprecatedWarning2")
  @js.native
  def deprecatedWarning2: Any = js.native
  inline def deprecatedWarning2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deprecatedWarning2")(x.asInstanceOf[js.Any])
}

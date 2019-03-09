package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
class TrackEntry () extends js.Object {
  var alpha: scala.Double = js.native
  var animation: Animation = js.native
  var animationEnd: scala.Double = js.native
  var animationLast: scala.Double = js.native
  var animationStart: scala.Double = js.native
  var attachmentThreshold: scala.Double = js.native
  var delay: scala.Double = js.native
  var drawOrderThreshold: scala.Double = js.native
  var endTime: scala.Double = js.native
  var eventThreshold: scala.Double = js.native
  var holdPrevious: scala.Boolean = js.native
  var interruptAlpha: scala.Double = js.native
  var listener: AnimationStateListener2 = js.native
  var loop: scala.Boolean = js.native
  var mixBlend: MixBlend = js.native
  var mixDuration: scala.Double = js.native
  var mixTime: scala.Double = js.native
  var mixingFrom: TrackEntry = js.native
  var mixingTo: TrackEntry = js.native
  var next: TrackEntry = js.native
  var nextAnimationLast: scala.Double = js.native
  var nextTrackLast: scala.Double = js.native
  var time: scala.Double = js.native
  var timeScale: scala.Double = js.native
  var timelineHoldMix: js.Array[TrackEntry] = js.native
  var timelineMode: js.Array[scala.Double] = js.native
  var timelinesRotation: js.Array[scala.Double] = js.native
  var totalAlpha: scala.Double = js.native
  var trackEnd: scala.Double = js.native
  var trackIndex: scala.Double = js.native
  var trackLast: scala.Double = js.native
  var trackTime: scala.Double = js.native
  def getAnimationTime(): scala.Double = js.native
  def isComplete(): scala.Boolean = js.native
  def loopsCount(): scala.Double = js.native
  def onComplete(trackIndex: scala.Double, loopCount: scala.Double): js.Any = js.native
  def onEnd(trackIndex: scala.Double): js.Any = js.native
  def onEvent(trackIndex: scala.Double, event: Event): js.Any = js.native
  def onStart(trackIndex: scala.Double): js.Any = js.native
  def reset(): scala.Unit = js.native
  def resetRotationDirections(): scala.Unit = js.native
  def setAnimationLast(animationLast: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TrackEntry")
@js.native
object TrackEntry extends js.Object {
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
}


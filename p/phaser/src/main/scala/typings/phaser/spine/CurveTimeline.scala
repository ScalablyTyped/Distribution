package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.CurveTimeline")
@js.native
abstract class CurveTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  var curves: js.Any = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  def getCurveType(frameIndex: Double): Double = js.native
  def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  def setLinear(frameIndex: Double): Unit = js.native
  def setStepped(frameIndex: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.CurveTimeline")
@js.native
object CurveTimeline extends js.Object {
  var BEZIER: Double = js.native
  var BEZIER_SIZE: Double = js.native
  var LINEAR: Double = js.native
  var STEPPED: Double = js.native
}


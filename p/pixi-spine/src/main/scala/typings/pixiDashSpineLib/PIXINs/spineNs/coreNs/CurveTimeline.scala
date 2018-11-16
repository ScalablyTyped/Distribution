package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.CurveTimeline")
@js.native
abstract class CurveTimeline protected () extends Timeline {
  def this(frameCount: scala.Double) = this()
  var curves: js.Any = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: scala.Double,
    time: scala.Double,
    events: js.Array[Event],
    alpha: scala.Double,
    pose: MixPose,
    direction: MixDirection
  ): scala.Unit = js.native
  def getCurvePercent(frameIndex: scala.Double, percent: scala.Double): scala.Double = js.native
  def getCurveType(frameIndex: scala.Double): scala.Double = js.native
  def getFrameCount(): scala.Double = js.native
  /* CompleteClass */
  override def getPropertyId(): scala.Double = js.native
  def setCurve(
    frameIndex: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double
  ): scala.Unit = js.native
  def setLinear(frameIndex: scala.Double): scala.Unit = js.native
  def setStepped(frameIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("PIXI.spine.core.CurveTimeline")
@js.native
object CurveTimeline extends js.Object {
  var BEZIER: scala.Double = js.native
  var BEZIER_SIZE: scala.Double = js.native
  var LINEAR: scala.Double = js.native
  var STEPPED: scala.Double = js.native
}


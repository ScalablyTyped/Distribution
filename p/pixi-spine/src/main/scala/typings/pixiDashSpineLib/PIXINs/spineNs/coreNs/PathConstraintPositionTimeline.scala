package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline")
@js.native
class PathConstraintPositionTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var frames: ArrayLike[scala.Double] = js.native
  var pathConstraintIndex: scala.Double = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, value: scala.Double): scala.Unit = js.native
}

@JSGlobal("PIXI.spine.core.PathConstraintPositionTimeline")
@js.native
object PathConstraintPositionTimeline extends js.Object {
  var ENTRIES: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var PREV_VALUE: scala.Double = js.native
  var VALUE: scala.Double = js.native
}


package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraintMixTimeline")
@js.native
class PathConstraintMixTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var frames: ArrayLike[scala.Double] = js.native
  var pathConstraintIndex: scala.Double = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, rotateMix: scala.Double, translateMix: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.PathConstraintMixTimeline")
@js.native
object PathConstraintMixTimeline extends js.Object {
  var ENTRIES: scala.Double = js.native
  var PREV_ROTATE: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var PREV_TRANSLATE: scala.Double = js.native
  var ROTATE: scala.Double = js.native
  var TRANSLATE: scala.Double = js.native
}


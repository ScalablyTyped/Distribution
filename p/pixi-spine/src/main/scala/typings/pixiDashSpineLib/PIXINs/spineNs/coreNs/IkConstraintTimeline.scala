package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.IkConstraintTimeline")
@js.native
class IkConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var frames: ArrayLike[scala.Double] = js.native
  var ikConstraintIndex: scala.Double = js.native
  def setFrame(
    frameIndex: scala.Double,
    time: scala.Double,
    mix: scala.Double,
    bendDirection: scala.Double,
    compress: scala.Boolean,
    stretch: scala.Boolean
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.IkConstraintTimeline")
@js.native
object IkConstraintTimeline extends js.Object {
  var BEND_DIRECTION: scala.Double = js.native
  var COMPRESS: scala.Double = js.native
  var ENTRIES: scala.Double = js.native
  var MIX: scala.Double = js.native
  var PREV_BEND_DIRECTION: scala.Double = js.native
  var PREV_COMPRESS: scala.Double = js.native
  var PREV_MIX: scala.Double = js.native
  var PREV_STRETCH: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var STRETCH: scala.Double = js.native
}


package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TranslateTimeline")
@js.native
class TranslateTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var boneIndex: scala.Double = js.native
  var frames: ArrayLike[scala.Double] = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
}

@JSGlobal("PIXI.spine.core.TranslateTimeline")
@js.native
object TranslateTimeline extends js.Object {
  var ENTRIES: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var PREV_X: scala.Double = js.native
  var PREV_Y: scala.Double = js.native
  var X: scala.Double = js.native
  var Y: scala.Double = js.native
}


package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.DeformTimeline")
@js.native
class DeformTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var attachment: VertexAttachment = js.native
  var frameVertices: js.Array[ArrayLike[Double]] = js.native
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit = js.native
}


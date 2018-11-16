package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.DeformTimeline")
@js.native
class DeformTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var attachment: VertexAttachment = js.native
  var frameVertices: js.Array[ArrayLike[scala.Double]] = js.native
  var frames: ArrayLike[scala.Double] = js.native
  var slotIndex: scala.Double = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, vertices: ArrayLike[scala.Double]): scala.Unit = js.native
}


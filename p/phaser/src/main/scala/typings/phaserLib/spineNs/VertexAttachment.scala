package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.VertexAttachment")
@js.native
abstract class VertexAttachment protected () extends Attachment {
  def this(name: java.lang.String) = this()
  var bones: js.Array[scala.Double] = js.native
  var id: scala.Double = js.native
  var vertices: ArrayLike[scala.Double] = js.native
  var worldVerticesLength: scala.Double = js.native
  def applyDeform(sourceAttachment: VertexAttachment): scala.Boolean = js.native
  def computeWorldVertices(
    slot: Slot,
    start: scala.Double,
    count: scala.Double,
    worldVertices: ArrayLike[scala.Double],
    offset: scala.Double,
    stride: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("spine.VertexAttachment")
@js.native
object VertexAttachment extends js.Object {
  var nextID: js.Any = js.native
}


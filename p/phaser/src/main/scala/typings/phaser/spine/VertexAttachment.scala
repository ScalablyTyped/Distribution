package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttachment extends Attachment {
  var bones: js.Array[Double]
  var deformAttachment: VertexAttachment
  var id: Double
  var vertices: ArrayLike[Double]
  var worldVerticesLength: Double
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit
  def copyTo(attachment: VertexAttachment): Unit
}

object VertexAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): VertexAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttachment]
  }
}


package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathAttachment extends VertexAttachment {
  var closed: Boolean
  var color: Color
  var constantSpeed: Boolean
  var lengths: js.Array[Double]
}

object PathAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    closed: Boolean,
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    constantSpeed: Boolean,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    lengths: js.Array[Double],
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): PathAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), constantSpeed = constantSpeed.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttachment]
  }
}


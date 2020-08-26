package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBoxAttachment extends VertexAttachment {
  var color: Color = js.native
}

object BoundingBoxAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): BoundingBoxAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxAttachment]
  }
  @scala.inline
  implicit class BoundingBoxAttachmentOps[Self <: BoundingBoxAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}


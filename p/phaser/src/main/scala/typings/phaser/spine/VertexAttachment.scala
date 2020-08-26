package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexAttachment extends Attachment {
  var bones: js.Array[Double] = js.native
  var deformAttachment: VertexAttachment = js.native
  var id: Double = js.native
  var vertices: ArrayLike[Double] = js.native
  var worldVerticesLength: Double = js.native
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  def copyTo(attachment: VertexAttachment): Unit = js.native
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
  @scala.inline
  implicit class VertexAttachmentOps[Self <: VertexAttachment] (val x: Self) extends AnyVal {
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
    def setBonesVarargs(value: Double*): Self = this.set("bones", js.Array(value :_*))
    @scala.inline
    def setBones(value: js.Array[Double]): Self = this.set("bones", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit): Self = this.set("computeWorldVertices", js.Any.fromFunction6(value))
    @scala.inline
    def setCopyTo(value: VertexAttachment => Unit): Self = this.set("copyTo", js.Any.fromFunction1(value))
    @scala.inline
    def setDeformAttachment(value: VertexAttachment): Self = this.set("deformAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertices(value: ArrayLike[Double]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorldVerticesLength(value: Double): Self = this.set("worldVerticesLength", value.asInstanceOf[js.Any])
  }
  
}


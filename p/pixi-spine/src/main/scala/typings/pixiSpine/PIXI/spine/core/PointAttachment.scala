package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointAttachment extends VertexAttachment {
  var color: Color
  var rotation: Double
  var x: Double
  var y: Double
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2
  def computeWorldRotation(bone: Bone): Double
}

object PointAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldPosition: (Bone, Vector2) => Vector2,
    computeWorldRotation: Bone => Double,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    rotation: Double,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double,
    x: Double,
    y: Double
  ): PointAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldPosition = js.Any.fromFunction2(computeWorldPosition), computeWorldRotation = js.Any.fromFunction1(computeWorldRotation), computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAttachment]
  }
}


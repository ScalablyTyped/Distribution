package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointAttachment
  extends StObject
     with VertexAttachment {
  
  var color: Color
  
  def computeWorldPosition(bone: Bone, point: Vector2): Vector2
  
  def computeWorldRotation(bone: Bone): Double
  
  var rotation: Double
  
  var x: Double
  
  var y: Double
}
object PointAttachment {
  
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldPosition: (Bone, Vector2) => Vector2,
    computeWorldRotation: Bone => Double,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
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
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldPosition = js.Any.fromFunction2(computeWorldPosition), computeWorldRotation = js.Any.fromFunction1(computeWorldRotation), computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointAttachment]
  }
  
  @scala.inline
  implicit class PointAttachmentMutableBuilder[Self <: PointAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeWorldPosition(value: (Bone, Vector2) => Vector2): Self = StObject.set(x, "computeWorldPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComputeWorldRotation(value: Bone => Double): Self = StObject.set(x, "computeWorldRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

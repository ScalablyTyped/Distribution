package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAttachment
  extends StObject
     with Attachment {
  
  var bones: js.Array[Double]
  
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit
  
  def copyTo(attachment: VertexAttachment): Unit
  
  var deformAttachment: VertexAttachment
  
  var id: Double
  
  var vertices: ArrayLike[Double]
  
  var worldVerticesLength: Double
}
object VertexAttachment {
  
  inline def apply(
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
  
  extension [Self <: VertexAttachment](x: Self) {
    
    inline def setBones(value: js.Array[Double]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Double*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction6(value))
    
    inline def setCopyTo(value: VertexAttachment => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDeformAttachment(value: VertexAttachment): Self = StObject.set(x, "deformAttachment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: ArrayLike[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setWorldVerticesLength(value: Double): Self = StObject.set(x, "worldVerticesLength", value.asInstanceOf[js.Any])
  }
}

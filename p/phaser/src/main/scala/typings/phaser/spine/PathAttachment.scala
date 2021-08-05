package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttachment
  extends StObject
     with VertexAttachment {
  
  var closed: Boolean
  
  var color: Color
  
  var constantSpeed: Boolean
  
  var lengths: js.Array[Double]
}
object PathAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    closed: Boolean,
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
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
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), constantSpeed = constantSpeed.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttachment]
  }
  
  extension [Self <: PathAttachment](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setConstantSpeed(value: Boolean): Self = StObject.set(x, "constantSpeed", value.asInstanceOf[js.Any])
    
    inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value :_*))
  }
}

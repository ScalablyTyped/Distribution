package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexAttachment extends Attachment {
  
  var bones: js.Array[Double] = js.native
  
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  
  def computeWorldVerticesOld(slot: Slot, worldVertices: ArrayLike[Double]): Unit = js.native
  
  def copyTo(attachment: VertexAttachment): Unit = js.native
  
  var deformAttachment: VertexAttachment = js.native
  
  var id: Double = js.native
  
  var vertices: ArrayLike[Double] = js.native
  
  var worldVerticesLength: Double = js.native
}
object VertexAttachment {
  
  @scala.inline
  def apply(
    bones: js.Array[Double],
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): VertexAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttachment]
  }
  
  @scala.inline
  implicit class VertexAttachmentMutableBuilder[Self <: VertexAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBones(value: js.Array[Double]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: Double*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction6(value))
    
    @scala.inline
    def setComputeWorldVerticesOld(value: (Slot, ArrayLike[Double]) => Unit): Self = StObject.set(x, "computeWorldVerticesOld", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyTo(value: VertexAttachment => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeformAttachment(value: VertexAttachment): Self = StObject.set(x, "deformAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: ArrayLike[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldVerticesLength(value: Double): Self = StObject.set(x, "worldVerticesLength", value.asInstanceOf[js.Any])
  }
}

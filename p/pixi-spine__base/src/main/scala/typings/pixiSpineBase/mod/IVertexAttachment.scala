package typings.pixiSpineBase.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVertexAttachment[Slot /* <: ISlot */]
  extends StObject
     with IAttachment {
  
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit
  
  def computeWorldVerticesOld(slot: Slot, worldVertices: ArrayLike[Double]): Unit
  
  var id: Double
  
  var worldVerticesLength: Double
}
object IVertexAttachment {
  
  inline def apply[Slot /* <: ISlot */](
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    id: Double,
    name: String,
    `type`: AttachmentType,
    worldVerticesLength: Double
  ): IVertexAttachment[Slot] = {
    val __obj = js.Dynamic.literal(computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVertexAttachment[Slot]]
  }
  
  extension [Self <: IVertexAttachment[?], Slot /* <: ISlot */](x: Self & IVertexAttachment[Slot]) {
    
    inline def setComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction6(value))
    
    inline def setComputeWorldVerticesOld(value: (Slot, ArrayLike[Double]) => Unit): Self = StObject.set(x, "computeWorldVerticesOld", js.Any.fromFunction2(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setWorldVerticesLength(value: Double): Self = StObject.set(x, "worldVerticesLength", value.asInstanceOf[js.Any])
  }
}

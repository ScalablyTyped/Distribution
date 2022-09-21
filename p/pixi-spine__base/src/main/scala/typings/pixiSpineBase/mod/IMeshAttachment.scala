package typings.pixiSpineBase.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMeshAttachment
  extends StObject
     with IVertexAttachment[ISlot] {
  
  var color: Color
  
  var region: TextureRegion
  
  var regionUVs: js.typedarray.Float32Array
  
  var triangles: js.Array[Double]
}
object IMeshAttachment {
  
  inline def apply(
    color: Color,
    computeWorldVertices: (ISlot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (ISlot, ArrayLike[Double]) => Unit,
    id: Double,
    name: String,
    region: TextureRegion,
    regionUVs: js.typedarray.Float32Array,
    triangles: js.Array[Double],
    `type`: AttachmentType,
    worldVerticesLength: Double
  ): IMeshAttachment = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionUVs = regionUVs.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeshAttachment]
  }
  
  extension [Self <: IMeshAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUVs(value: js.typedarray.Float32Array): Self = StObject.set(x, "regionUVs", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: js.Array[Double]): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    inline def setTrianglesVarargs(value: Double*): Self = StObject.set(x, "triangles", js.Array(value*))
  }
}

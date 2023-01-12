package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeledVolume extends StObject {
  
  /** The triangle strips present in this mesh. */
  var strips: js.UndefOr[js.Array[TriangleStrip]] = js.undefined
  
  /** The vertices present in the mesh defining the modeled volume. */
  var vertexOffsets: js.UndefOr[Vertex3DList] = js.undefined
}
object ModeledVolume {
  
  inline def apply(): ModeledVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeledVolume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModeledVolume] (val x: Self) extends AnyVal {
    
    inline def setStrips(value: js.Array[TriangleStrip]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: TriangleStrip*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setVertexOffsets(value: Vertex3DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    inline def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
  }
}

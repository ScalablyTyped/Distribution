package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriangleStrip extends StObject {
  
  /** Index into the vertex_offset array representing the next vertex in the triangle strip. */
  var vertexIndices: js.UndefOr[js.Array[Double]] = js.undefined
}
object TriangleStrip {
  
  inline def apply(): TriangleStrip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangleStrip]
  }
  
  extension [Self <: TriangleStrip](x: Self) {
    
    inline def setVertexIndices(value: js.Array[Double]): Self = StObject.set(x, "vertexIndices", value.asInstanceOf[js.Any])
    
    inline def setVertexIndicesUndefined: Self = StObject.set(x, "vertexIndices", js.undefined)
    
    inline def setVertexIndicesVarargs(value: Double*): Self = StObject.set(x, "vertexIndices", js.Array(value*))
  }
}

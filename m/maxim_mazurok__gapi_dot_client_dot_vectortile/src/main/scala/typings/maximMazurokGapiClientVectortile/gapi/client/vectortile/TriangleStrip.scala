package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriangleStrip extends StObject {
  
  /** Index into the vertex_offset array representing the next vertex in the triangle strip. */
  var vertexIndices: js.UndefOr[js.Array[Double]] = js.native
}
object TriangleStrip {
  
  @scala.inline
  def apply(): TriangleStrip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriangleStrip]
  }
  
  @scala.inline
  implicit class TriangleStripMutableBuilder[Self <: TriangleStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertexIndices(value: js.Array[Double]): Self = StObject.set(x, "vertexIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexIndicesUndefined: Self = StObject.set(x, "vertexIndices", js.undefined)
    
    @scala.inline
    def setVertexIndicesVarargs(value: Double*): Self = StObject.set(x, "vertexIndices", js.Array(value :_*))
  }
}

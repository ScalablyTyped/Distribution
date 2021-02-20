package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeledVolume extends StObject {
  
  /** The triangle strips present in this mesh. */
  var strips: js.UndefOr[js.Array[TriangleStrip]] = js.native
  
  /** The vertices present in the mesh defining the modeled volume. */
  var vertexOffsets: js.UndefOr[Vertex3DList] = js.native
}
object ModeledVolume {
  
  @scala.inline
  def apply(): ModeledVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeledVolume]
  }
  
  @scala.inline
  implicit class ModeledVolumeMutableBuilder[Self <: ModeledVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrips(value: js.Array[TriangleStrip]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    @scala.inline
    def setStripsVarargs(value: TriangleStrip*): Self = StObject.set(x, "strips", js.Array(value :_*))
    
    @scala.inline
    def setVertexOffsets(value: Vertex3DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
  }
}

package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeledVolume extends js.Object {
  
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
  implicit class ModeledVolumeOps[Self <: ModeledVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStripsVarargs(value: TriangleStrip*): Self = this.set("strips", js.Array(value :_*))
    
    @scala.inline
    def setStrips(value: js.Array[TriangleStrip]): Self = this.set("strips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrips: Self = this.set("strips", js.undefined)
    
    @scala.inline
    def setVertexOffsets(value: Vertex3DList): Self = this.set("vertexOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexOffsets: Self = this.set("vertexOffsets", js.undefined)
  }
}

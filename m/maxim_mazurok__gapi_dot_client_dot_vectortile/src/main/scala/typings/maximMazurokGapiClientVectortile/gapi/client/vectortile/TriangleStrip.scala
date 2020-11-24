package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriangleStrip extends js.Object {
  
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
  implicit class TriangleStripOps[Self <: TriangleStrip] (val x: Self) extends AnyVal {
    
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
    def setVertexIndicesVarargs(value: Double*): Self = this.set("vertexIndices", js.Array(value :_*))
    
    @scala.inline
    def setVertexIndices(value: js.Array[Double]): Self = this.set("vertexIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexIndices: Self = this.set("vertexIndices", js.undefined)
  }
}

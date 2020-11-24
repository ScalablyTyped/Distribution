package typings.openjscad.anon

import typings.std.Float64Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideVertexIndices extends js.Object {
  
  var `class`: String = js.native
  
  var sideVertexIndices: Uint32Array = js.native
  
  var vertexData: Float64Array = js.native
}
object SideVertexIndices {
  
  @scala.inline
  def apply(`class`: String, sideVertexIndices: Uint32Array, vertexData: Float64Array): SideVertexIndices = {
    val __obj = js.Dynamic.literal(sideVertexIndices = sideVertexIndices.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideVertexIndices]
  }
  
  @scala.inline
  implicit class SideVertexIndicesOps[Self <: SideVertexIndices] (val x: Self) extends AnyVal {
    
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideVertexIndices(value: Uint32Array): Self = this.set("sideVertexIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexData(value: Float64Array): Self = this.set("vertexData", value.asInstanceOf[js.Any])
  }
}

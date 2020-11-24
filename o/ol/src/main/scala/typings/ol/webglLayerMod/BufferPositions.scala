package typings.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferPositions extends js.Object {
  
  var indexPosition: Double = js.native
  
  var vertexPosition: Double = js.native
}
object BufferPositions {
  
  @scala.inline
  def apply(indexPosition: Double, vertexPosition: Double): BufferPositions = {
    val __obj = js.Dynamic.literal(indexPosition = indexPosition.asInstanceOf[js.Any], vertexPosition = vertexPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferPositions]
  }
  
  @scala.inline
  implicit class BufferPositionsOps[Self <: BufferPositions] (val x: Self) extends AnyVal {
    
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
    def setIndexPosition(value: Double): Self = this.set("indexPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexPosition(value: Double): Self = this.set("vertexPosition", value.asInstanceOf[js.Any])
  }
}

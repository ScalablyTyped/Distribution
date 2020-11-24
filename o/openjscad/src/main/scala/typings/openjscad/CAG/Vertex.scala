package typings.openjscad.CAG

import typings.openjscad.CSG.Vector2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vertex extends js.Object {
  
  def getTag(): Double = js.native
  
  var pos: Vector2D = js.native
  
  var tag: Double = js.native
}
object Vertex {
  
  @scala.inline
  def apply(getTag: () => Double, pos: Vector2D, tag: Double): Vertex = {
    val __obj = js.Dynamic.literal(getTag = js.Any.fromFunction0(getTag), pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
  
  @scala.inline
  implicit class VertexOps[Self <: Vertex] (val x: Self) extends AnyVal {
    
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
    def setGetTag(value: () => Double): Self = this.set("getTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPos(value: Vector2D): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Double): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}

package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends js.Object {
  
  var position: js.UndefOr[Boolean] = js.native
  
  var rotation: js.UndefOr[Boolean] = js.native
  
  var tint: js.UndefOr[Boolean] = js.native
  
  var uvs: js.UndefOr[Boolean] = js.native
  
  var vertices: js.UndefOr[Boolean] = js.native
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRotation(value: Boolean): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setTint(value: Boolean): Self = this.set("tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
    
    @scala.inline
    def setUvs(value: Boolean): Self = this.set("uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvs: Self = this.set("uvs", js.undefined)
    
    @scala.inline
    def setVertices(value: Boolean): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}

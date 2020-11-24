package typings.playcanvas.anon

import typings.playcanvas.pc.Vec2
import typings.playcanvas.pc.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends js.Object {
  
  var border: Vec4 = js.native
  
  var pivot: Vec2 = js.native
  
  var rect: Vec4 = js.native
}
object Border {
  
  @scala.inline
  def apply(border: Vec4, pivot: Vec2, rect: Vec4): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: Vec4): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivot(value: Vec2): Self = this.set("pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Vec4): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
}

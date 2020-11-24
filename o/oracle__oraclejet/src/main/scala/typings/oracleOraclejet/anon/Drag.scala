package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends js.Object {
  
  var drag: Groups = js.native
  
  var drop: Legend = js.native
}
object Drag {
  
  @scala.inline
  def apply(drag: Groups, drop: Legend): Drag = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drag]
  }
  
  @scala.inline
  implicit class DragOps[Self <: Drag] (val x: Self) extends AnyVal {
    
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
    def setDrag(value: Groups): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: Legend): Self = this.set("drop", value.asInstanceOf[js.Any])
  }
}

package typings.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskBar extends DipScaleRects {
  
  var edge: String = js.native
  
  var rect: Rect = js.native
}
object TaskBar {
  
  @scala.inline
  def apply(dipRect: Rect, edge: String, rect: Rect, scaledRect: Rect): TaskBar = {
    val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBar]
  }
  
  @scala.inline
  implicit class TaskBarOps[Self <: TaskBar] (val x: Self) extends AnyVal {
    
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
    def setEdge(value: String): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Rect): Self = this.set("rect", value.asInstanceOf[js.Any])
  }
}

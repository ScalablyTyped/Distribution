package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableDraggableColumns extends js.Object {
  
  var enabled: Boolean = js.native
  
  var transitionTime: js.UndefOr[Double] = js.native
}
object MUIDataTableDraggableColumns {
  
  @scala.inline
  def apply(enabled: Boolean): MUIDataTableDraggableColumns = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableDraggableColumns]
  }
  
  @scala.inline
  implicit class MUIDataTableDraggableColumnsOps[Self <: MUIDataTableDraggableColumns] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTime(value: Double): Self = this.set("transitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionTime: Self = this.set("transitionTime", js.undefined)
  }
}

package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsViewColumns extends js.Object {
  
  var title: String = js.native
  
  var titleAria: String = js.native
}
object MUIDataTableTextLabelsViewColumns {
  
  @scala.inline
  def apply(title: String, titleAria: String): MUIDataTableTextLabelsViewColumns = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleAria = titleAria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsViewColumns]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsViewColumnsOps[Self <: MUIDataTableTextLabelsViewColumns] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAria(value: String): Self = this.set("titleAria", value.asInstanceOf[js.Any])
  }
}

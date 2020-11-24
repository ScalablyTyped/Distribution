package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideMenusOptions extends js.Object {
  
  var hideEdit: Boolean = js.native
  
  var hideWindow: Boolean = js.native
}
object HideMenusOptions {
  
  @scala.inline
  def apply(hideEdit: Boolean, hideWindow: Boolean): HideMenusOptions = {
    val __obj = js.Dynamic.literal(hideEdit = hideEdit.asInstanceOf[js.Any], hideWindow = hideWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideMenusOptions]
  }
  
  @scala.inline
  implicit class HideMenusOptionsOps[Self <: HideMenusOptions] (val x: Self) extends AnyVal {
    
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
    def setHideEdit(value: Boolean): Self = this.set("hideEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWindow(value: Boolean): Self = this.set("hideWindow", value.asInstanceOf[js.Any])
  }
}
